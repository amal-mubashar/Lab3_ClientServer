/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;
import java.io.*;
import java.util.*;
import java.net.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;


/**
 *
 * @author amubashar.bscs13seec
 */

public class Server implements java.io.Serializable{
    
    

   public static void main(String[] arg) {

      Employee employee = null;
      Student student = null;
      byte[] buffer = new byte[1024];

      

      try {

         Socket socket = null;
         ServerSocket socketConnection = new ServerSocket(220);
         //socket = ServerSocket.accept();	
         System.out.println("Connected");
         System.out.println("Server Waiting");
         

         Socket pipe = socketConnection.accept();

         ObjectInputStream serverInputStream = new ObjectInputStream(pipe.getInputStream());

         ObjectOutputStream serverOutputStream = new ObjectOutputStream(pipe.getOutputStream());

         employee = (Employee )serverInputStream.readObject();
         student = (Student )serverInputStream.readObject();

         employee .setEmployeeNotes("Notes");
         employee .setEmployeeName("Amal");
         
         student .setName("Amal Mubashar");
         student .setNotes("Notes from client\"Amal\"");

         serverOutputStream.writeObject(employee);

         serverInputStream.close();
         serverOutputStream.close();


      }  catch(Exception e) {System.out.println(e); 
      }
   }

}
