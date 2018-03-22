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
    private boolean isAvailable;
    private StatusKamar status_kamar;
    private Pesanan pesan;
    protected double dailyTariff;
    
     /**
     * Constructor for objects of class Room
     * 
     * @param hotel
     * @param nomor_kamar
     * @param isAvailable
     * @param customer
     * @param dailyTariff
     * @param status_kamar
     */
    public Room(Hotel hotel, String nomor_kamar, boolean isAvailable, StatusKamar status_kamar)
    {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.isAvailable = isAvailable;
        this.dailyTariff = dailyTariff;
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
    
        public boolean getStatusAvailable()
    {
        return isAvailable;
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
    
        public void setStatusAvailable(boolean isAvailable)
    {
        this.isAvailable = isAvailable;
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
        return ("Room" 
        + "\nNama hotel: "+ getHotel().getNama()
        + "\nNomor Kamar:  "+ nomor_kamar
        + "\nStatus ketersediaan:  "+ isAvailable
        + "\nHarga:  "+ dailyTariff
        + "\nStatus Kamar: " + status_kamar.toString()
        + "Tipe Kamar:  "+ getTipeKamar());
    }
}
