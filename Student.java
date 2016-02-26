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
public class Student implements java.io.Serializable {


    private static final long serialVersionUID = 123L;
    private int id;
    private String name;
    private String notes;

   public Student(int id, String name , String note) {
        this.id = id;
        this.name = name;
        this.notes = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getNotes() {
        return name;
    }

    public void setNotes(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;

        return true;
    }

    public int hashCode() {
        return id;
    }

   
    public String toString() {
        return "Id = " + getId() + " ; Name = " + getName() + " ; Notes = " + getNotes();
    }
}

