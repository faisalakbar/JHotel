
/**
 * Write a description of class SingleRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoubleRoom extends Room
{
    // instance variables - replace the example below with your own
    private Customer customer2;
    private static TipeKamar TIPE_KAMAR = TipeKamar.Double;

    /**
     * Constructor for objects of class SingleRoom
     */
    public DoubleRoom(Hotel hotel, String nomor_kamar, boolean isAvailable, StatusKamar status_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar, status_kamar);
        
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public TipeKamar getTipeKamar()
    {
        // put your code here
        return TIPE_KAMAR;
    }
    
        /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Customer getCustomer2()
    {
        // put your code here
        return customer2;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai status kamar
     * 
     * @param kamar
     */
    public void setCustomer2 (Customer customer2)
    {
        this.customer2 = customer2;
        
    }
}
