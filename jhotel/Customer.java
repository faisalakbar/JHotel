/**
 * Program JHotel untuk bisnis perhotelan.
 *
 * @author Faisal Akbar
 * @version March-01-2018
 */
import java.util.*;

public class Customer
{
    // instance variables - replace the example below with your own
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;
    
    
    /**
     * Constructor for objects of class Customer
     * 
     * @param id
     * @param nama
     */
    public Customer(int id, String nama, int tanggal, int bulan, int tahun)
    {
        //instance variable
        this.id = id;
        this.nama = nama;
    }
    
    public Customer(int id, String nama, Date dob)
    {
        //instance variable
        this.id = id;
        this.nama = nama;;
    }

    /**
     * Accessor for objects of class Customer
     * untuk mendapatkan nilai id
     * 
     * @return id
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * Accessor for objects of class Customer
     * untuk mendapatkan nilai nama
     * 
     * @return nama
     */
    public String getNama()
    {
        return nama;
    }
    
        /**
     * Accessor for objects of class Customer
     * untuk mendapatkan nilai email
     * 
     * @return email
     */
    public String getEmail()
    {
        return email;
    }
    
        /**
     * Accessor for objects of class Customer
     * untuk mendapatkan nilai DOB
     * 
     * @return DOB
     */
    public Date getDOB()
    {
        return dob;
    }
    
    /**
     * Mutator for objects of class Customer
     * untuk menentukan nilai id
     * 
     * @param id
     */
    public void setID(int id)
    {
       this.id = id;
    }
    
    /**
     * Mutator for objects of class Customer
     * untuk menentukan nilai nama
     * 
     * @param nama
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    /**
     * Mutator for objects of class Customer
     * untuk menentukan nilai email
     * 
     * @param email
     */
    public void setEmail(String email)
    {
if (email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            System.out.println("Email valid");
            this.email = email;
        }
        else {
            System.out.println("Email tidak valid");
    }
}

    /**
     * Mutator for objects of class Customer
     * untuk menentukan nilai id
     * 
     * @param nama
     */
    public void setDOB(Date dob)
    {
        this.dob = dob;
    }
    
    public void printData()
    {
        System.out.println("Customer");
        System.out.println("Nama Customer:  "+ nama);
        System.out.println("Id:  "+ id);
    }
}
