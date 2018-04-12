
/**
 * Enumeration class StatusKamar - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum StatusKamar
{
    BOOKED("Booked"),PROCESSED("Processed"),VACANT("Vacant");
    
    private final String status;
    
    /**
     * Constructor StatusKamar
     * 
     * @param type merupakan status dalam string
     */
    StatusKamar(String status)
    {
        this.status=status;
    }
    
    /**
     * toString() - Method pengambilan String
     * 
     * @return type mengembalikkan status kamar sebagai string
     */
    public String toString()
    {
        return this.status;
    }
}
