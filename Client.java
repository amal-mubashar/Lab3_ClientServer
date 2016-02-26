/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;
import java.io.*;
import java.util.*;
import java.net.*;
import java.io.IOException;	
import java.io.ObjectInputStream;	
import java.io.ObjectOutputStream;	
import java.net.Socket;	
import java.net.SocketException;

/**
 *
 * @author amubashar.bscs13seec
 */


public class Client implements java.io.Serializable {

   public static void main(String[] arg) {
      try {
         Employee amal = new Employee("Notes from client", "Amal");
         
         System.out.println("employeeName= "
                            + amal .getEmployeeNotes());
         System.out.println("employeeName= "
                            + amal .getEmployeeName());

         Socket socketConnection = new Socket("localhost", 220);


         ObjectOutputStream clientOutputStream = new
            ObjectOutputStream(socketConnection.getOutputStream());
         ObjectInputStream clientInputStream = new 
            ObjectInputStream(socketConnection.getInputStream());

         clientOutputStream.writeObject(amal); //Writing the Employee Object to the Network

         amal= (Employee)clientInputStream.readObject();

         System.out.println("employeeNumber= "
                            + amal .getEmployeeNotes());
         System.out.println("employeeName= "
                            + amal .getEmployeeName());

         clientOutputStream.close();
         clientInputStream.close();

      } catch (Exception e) {System.out.println(e); }
   }
}
