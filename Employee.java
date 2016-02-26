/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;
import java.io.*;
import java.util.*;

/**
 *
 * @author amubashar.bscs13seec
 */
public class Employee implements java.io.Serializable
{
   public String name;
   public String notes;
   
   public transient int SSN;
   public int number;
   
   private String employeeNotes;
   private String employeeName;
   
   Employee(String notes, String name) {
      employeeNotes = notes;
      employeeName= name;
   }

    public String getEmployeeNotes() {
      return employeeNotes ;
   }

   public void setEmployeeNotes(String notes) {
      employeeNotes = notes;
   }

   public String getEmployeeName() {
      return employeeName ;
   }

   public void setEmployeeName(String name) {
      employeeName = name;
   }
   
   public void mailCheck()
   {
      System.out.println("Name " + name + " " + "Notes " + notes  );
   }
   
}
