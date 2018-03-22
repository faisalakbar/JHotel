
/**
 * Enumeration class StatusKamar - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum StatusKamar
{
        Booked("Booked"), Processed("Processed"), Vacant("Vacant");
   
    public final String deskripsi;

    StatusKamar (String deskripsi) {
        this.deskripsi = deskripsi;
    
    }
    
    public String status() {
        return deskripsi;
    }
}
