package jhotel;
/**
 * Program JHotel untuk bisnis perhotelan.
 *
 * @author Faisal Akbar
 * @version March-01-2018
 */

public abstract class Room
{
    private Hotel hotel;
    private String nomor_kamar;
    protected double dailyTariff;
    private StatusKamar status_kamar;
    
     /**
     * Constructor for objects of class Room
     *
     */
    public Room(Hotel hotel, String nomor_kamar)
    {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        status_kamar = StatusKamar.VACANT;
    }

        public Hotel getHotel()
    {
        return hotel;
    }
    
        public String getNomorKamar()
    {
        return nomor_kamar;
    }
        
        public double getDailyTariff()
    {
        return dailyTariff;
    }
    
        public StatusKamar getStatusKamar()
    {
        return status_kamar;
    }
    
        public abstract TipeKamar getTipeKamar();
    
        public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }
    
    
        public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar = nomor_kamar;
    }
    
        public void setDailyTariff(double dailytariff)
    {
        this.dailyTariff = dailytariff;
    }
    
        public void setStatusKamar(StatusKamar status_kamar)
    {
        this.status_kamar=status_kamar;
    }
    
    public String toString()
    {
        if(DatabasePesanan.getPesananAktif(this) == null)
        {
            return "\nNama Hotel \t\t:" + getHotel().getNama()
                    + "\nTipe Kamar \t\t:" + getTipeKamar()
                    + "\nHarga \t\t:" + getDailyTariff()
                    + "\nStatus Kamar \t\t:" + getStatusKamar();
        }
        else
        {
            return "\nNama Hotel \t\t:" + getHotel().getNama()
                    + "\nTipe Kamar \t\t:" + getTipeKamar()
                    + "\nHarga \t\t:" + getDailyTariff()
                    + "\nStatus Kamar \t\t:" + getStatusKamar()
                    + "Pelanggan \t\t:" + DatabasePesanan.getPesananAktif(this).getPelanggan().getNama();
        }
    }
}
