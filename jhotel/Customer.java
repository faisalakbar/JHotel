/**
 * Program JHotel untuk bisnis perhotelan.
 *
 * @author Faisal Akbar
 * @version March-01-2018
 */

public class Customer
{
    // instance variables - replace the example below with your own
    protected int id;
    protected String nama;
    
    /**
     * Constructor for objects of class Customer
     * 
     * @param id
     * @param nama
     */
    public Customer(int id, String nama)
    {
        //instance variable
        this.id = id;
        this.nama = nama;
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
     * untuk menentukan nilai id
     * 
     * @param nama
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    public void printData()
    {
        System.out.println("Customer");
        System.out.println("Nama Customer:  "+ nama);
        System.out.println("Id:  "+ id);
    }
}
