/**
 * Program JHotel untuk bisnis perhotelan.
 *
 * @author Faisal Akbar
 * @version March-01-2018
 */

public class Customer
{
    
    protected int id;
    protected String nama;
    
    public void Customer(int id, String nama)
    {
        this.id = id;
        this.nama=nama;
    }

    public int getID()
    {
      return id;
    }
    
    public String getNama()
    {
      return nama;
    }
    
    public void setID(int id)
    {
        this.id = id;
    }
    
    public void setNama(String nama)
    {
        this.nama = nama; 
    }
    
    public void printData()
    {
       
    }
}
