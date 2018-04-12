import java.util.ArrayList;

/**
 * Program JHotel untuk bisnis perhotelan.
 *
 * @author Faisal Akbar
 * @version March-01-2018
 */

public class DatabasePesanan
{
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<Pesanan>();
    private static int LAST_PESANAN_ID = 0;

    /**
     *
     * @return PESAMAN_DATABASE
     */
    public static ArrayList<Pesanan> getPesananDatabase()
    {
        return PESANAN_DATABASE;
    }

    /**
     *
     * @return LAST_PESANAN_ID
     */
    public static int getLastPesananId()
    {
        return LAST_PESANAN_ID;
    }

    /**
     * 
     * @return false
     */
    public static boolean addPesanan(Pesanan baru)
    {
        if(baru.getStatusAktif()) {
            return false;
        } else{
            PESANAN_DATABASE.add(baru);
            return true;
        }
    }

    /**
     *
     * @return null
     */
    public static Pesanan getPesanan(int id)
    {
        for(Pesanan cari : PESANAN_DATABASE){
            if(cari.getID() == id){
                return cari;
            }
        }
        return null;
    }

    /**
     *
     * @return null
     */
    public static Pesanan getPesanan(Room kamar)
    {
        for(Pesanan cari : PESANAN_DATABASE){
            if(cari.getRoom() == kamar){
                return cari;
            }
        }
        return null;
    }

    /**
     * 
     * @return null
     */
    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for(Pesanan cari : PESANAN_DATABASE){
            if(cari.getStatusAktif() == true){
                return cari;
            }
        }
        return null;
    }


    /**
     *
     * @return false
     */
    public static boolean removePesanan(Pesanan pesan)
    {
        return false;
    }

}
