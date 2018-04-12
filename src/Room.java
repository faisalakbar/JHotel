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
    private Pesanan pesan;
    
     /**
     * Constructor for objects of class Room
     * 
     * @param hotel
     * @param nomor_kamar
     * @param customer
     * @param dailyTariff
     * @param status_kamar
     */
    public Room(Hotel hotel, String nomor_kamar, StatusKamar status_kamar)
    {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.status_kamar = status_kamar;
        
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
    
        public Pesanan getPesanan()
    {
        return pesan;
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
    
        public void setPesanan (Pesanan pesan)
    {
        this.pesan = pesan;
    }
    
    public String toString()
    {
            return "\nNama Hotel \t\t:" + getHotel().getNama() 
                + "\nTipe Kamar \t\t:" + getTipeKamar()
                + "\nHarga \t\t:" + getDailyTariff()
                + "\nStatus Kamar \t\t:" + getStatusKamar().toString()
                + "Pelanggan \t\t:" + getPesanan().getPelanggan().getNama();
    }
}
