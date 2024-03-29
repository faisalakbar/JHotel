package jhotel;
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
    public static boolean addPesanan(Pesanan baru) throws PesananSudahAdaException
    {
        if(getPesananAktif(baru.getPelanggan()) == null){
            PESANAN_DATABASE.add(baru);
            LAST_PESANAN_ID = baru.getID();
            return true;
        }
        else {
            throw new PesananSudahAdaException(baru);
        }
    }

    /**
     *
     * @return null
     * @param id
     */
    public static Pesanan getPesanan(int id)
    {
        for (Pesanan pesan :
                PESANAN_DATABASE) {
            if(pesan.getID() == id){
                return pesan;
            }
        }
        return null;
    }

    /**
     *
     * @return null
     */
    public static Pesanan getPesananAktif(Room kamar)
    {
        for (Pesanan pesan :
                PESANAN_DATABASE) {
            if(kamar.equals(pesan.getRoom())==true){
                return pesan;
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
        for (Pesanan pesan :
                PESANAN_DATABASE) {
            if (pesan.getStatusAktif() == true && pesan.getPelanggan().equals(pelanggan) == true){
                return pesan;
            }
        }
        return null;
    }


    /**
     *
     * @return false
     */
    public static boolean removePesanan(Pesanan pesan) throws PesananTidakDitemukanException
    {
        for (Pesanan pesan2 :
                PESANAN_DATABASE) {
            if(pesan.equals(pesan2)){
                if(pesan.getRoom() != null) Administrasi.pesananDibatalkan(pesan);
                else if(pesan.getStatusAktif() == true) pesan.setStatusAktif(false);
                PESANAN_DATABASE.remove(pesan2);
                return true;
            }
        }
        throw new PesananTidakDitemukanException(pesan.getPelanggan());

    }

}
