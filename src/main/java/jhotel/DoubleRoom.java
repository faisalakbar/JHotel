package jhotel;

/**
 * Write a description of class SingleRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoubleRoom extends Room
{
    private Customer customer2;
    private static TipeKamar TIPE_KAMAR = TipeKamar.Double;

    /**
     * Constructor for objects of class SingleRoom
     */
    public DoubleRoom(Hotel hotel, String nomor_kamar)
    {
        super(hotel, nomor_kamar);
    }
    

    public TipeKamar getTipeKamar()
    {
        // put your code here
        return TIPE_KAMAR;
    }
    

    public Customer getCustomer2()
    {
        // put your code here
        return customer2;
    }


    public void setCustomer2 (Customer customer2)
    {
        this.customer2 = customer2;
        
    }
}
