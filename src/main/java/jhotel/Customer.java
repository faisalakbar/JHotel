package jhotel;

import sun.security.util.Password;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Customer
{
    // instance variables - replace the example below with your own
    private int id;
    private String nama;
    private String email;
    private Date dob;
    private String password;

    SimpleDateFormat dobformat = new SimpleDateFormat("dd MMMMMMMMM yyyy");

    public Customer(String nama,int date, int month, int year, String email, String password)
    {
        this.id = DatabaseCustomer.getLastCustomerID()+1;
        this.nama = nama;
        this.email = email;
        this.dob = new GregorianCalendar(year,month-1,date).getTime();
        this.password = password;
    }

    public Customer(String nama, Date dob, String email, String password)
    {
        //instance variable
        this.id = DatabaseCustomer.getLastCustomerID()+1;
        this.nama = nama;
        this.email = email;
        this.dob = dob;
        this.password = password;
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
        //System.out.printf("DOB: %te %<tB %<tY", dob);
        //SimpleDateFormat ft = new SimpleDateFormat ("dd MMMMMMMMM yyyy");
        //System.out.println("DOB: " + ft.format(dob)); 
        return dob;
    }

    /**
     * Accessor for objects of class Customer
     * untuk mendapatkan nilai password
     *
     * @return password
     */
    public String getPassword()
    {
        return password;
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
    public void setEmail(String email) {
        if (email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
            System.out.println("Email valid");
            this.email = email;
        } else {
            System.out.println("Email tidak valid");
        }
    }

    /**
     * Mutator for objects of class Customer
     * untuk menentukan nilai password
     *
     * @param password
     */
    public void setPassword(String password)
    {
        this.password = password;
    }


    public void setDOB(Date dob)
    {
        this.dob = dob;
    }
    
    public String toString()
    {
        if(DatabasePesanan.getPesananAktif(this)==null)
        {
            return "\nCustomer ID \t:" + getID() 
                + "\nName \t\t:" + getNama()
                + "\nE-Mail \t\t:" + getEmail()
                + "\nDate of Birth \t:" + dobformat.format(getDOB());
        }
        else 
        {
            return "\nCustomer ID \t:" + getID() 
                + "\nName \t\t:" + getNama()
                + "\nE-Mail \t\t:" + getEmail()
                + "\nDate of Birth \t:" + dobformat.format(getDOB())
                + "\nBooking Order is in progress";
        }
        
    }
}
