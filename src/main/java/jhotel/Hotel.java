package jhotel;

/**
 * Program JHotel untuk bisnis perhotelan.
 *
 * @author Faisal Akbar
 * @version March-01-2018
 */

public class Hotel
{
    // instance variables - replace the example below with your own
    private int id;
    private String nama;
    private Lokasi lokasi;
    private int bintang;

    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        //instance variable
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
        this.id = DatabaseHotel.getLastHotelId()+1;
    }

    public int getID() {
        return id;
    }

    /**
     * Accessor for objects of class Hotel
     * untuk mendapatkan nilai nama
     * 
     * @return nama
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * Accessor for objects of class Hotel
     * untuk mendapatkan nilai lokasi
     * 
     * @return lokasi
     */
    public Lokasi getLokasi()
    {
        return lokasi;
    }
    
        /**
     * Accessor for objects of class Hotel
     * untuk mendapatkan nilai binatang
     * 
     * @return bintang
     */
    public int getBintang()
    {
        return bintang;
    }
    
    /**
     * Mutator for objects of class Hotel
     * untuk menentukan nilai nama
     * 
     * @param nama
     */

    public void setID(int id) {
        this.id = id;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    /**
     * Mutator for objects of class Hotel
     * untuk menentukan nilai lokasi
     * 
     * @param lokasi
     */
    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }
    
    /**
     * Mutator for objects of class Hotel
     * untuk menentukan nilai bintang
     * 
     * @param bintang
     */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }
    
    public String toString()
    {
      return "\nNama Hotel \t\t:" + getNama()
            +"\nBintang Hotel \t\t:" + getBintang() 
            + "\nLokasi Hotel \t\t:" + getLokasi().getDeskripsi();
    }
}
