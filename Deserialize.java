/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;
import java.io.*;
/**
 *
 * @author amubashar.bscs13seec
 */
public class Deserialize  {
    
    public static void main(String [] args){
      Employee e = null;

      try{
         FileInputStream fileIn = new FileInputStream("employee.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (Employee) in.readObject();

         
         in.close();
         fileIn.close();
}catch(IOException i){
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c)
      {
         System.out.println("Employee class not found");
         c.printStackTrace();
         return;
      }
      
      System.out.println("Deserialized Employee...");
      System.out.println("Name: " + e.name);
      System.out.println("SSN: " + e.SSN);
      System.out.println("Notes: " + e.notes);
      
  
    }
}
