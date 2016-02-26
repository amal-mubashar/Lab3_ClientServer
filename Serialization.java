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
public class Serialization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

      try
      {
         FileOutputStream fileOut = new FileOutputStream("employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         //out.writeObject(e);
         
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in employee.ser");
      }catch(IOException i)
      {
          i.printStackTrace();
      }

    }
}
