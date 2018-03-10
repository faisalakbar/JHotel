/**
 * Program JHotel untuk bisnis perhotelan.
 *
 * @author Faisal Akbar
 * @version March-01-2018
 */

public class Room
{
    private Hotel hotel;
    private int id;
    private String nomor_kamar;
    private boolean isAvailable;
    private Customer customer;
    private double dailyTariff;
    private StatusKamar status_kamar;
    private Pesanan pesan;
    
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
    public Room(Hotel hotel, String nomor_kamar, boolean isAvailable, Customer customer, double dailyTariff, StatusKamar status_kamar)
    {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.isAvailable = isAvailable;
        this.customer = customer;
        this.dailyTariff = dailyTariff;
        this.status_kamar = status_kamar;
        
    }

    public Hotel getHotel()
    {
        return hotel;
    }
    
    public int getID()
    {
        return id;
    }
    
        public String getNomorKamar()
    {
        return nomor_kamar;
    }
    
        public boolean getStatusAvailable()
    {
        return isAvailable;
    }
    
        public Customer getCustomer()
    {
        return customer;
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
    
        public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }
    
        public void setID(int id)
    {
        this.id = id;
    }
    
        public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar = nomor_kamar;
    }
    
        public void setStatusAvailable(boolean isAvailable)
    {
        this.isAvailable = isAvailable;
    }
    
        public void setCustomer(Customer customer)
    {
        this.customer = customer;
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
    
    public void printData()
    {
        System.out.println("Room");
        System.out.println("Nama hotel: "+ getHotel().getNama());
        System.out.println("Nomor Kamar:  "+ nomor_kamar);
        System.out.println("Status ketersediaan:  "+ isAvailable);
        customer.printData();
        System.out.println("Harga:  "+ dailyTariff);
        System.out.println("Status Kamar: " + status_kamar.toString());
    }
}
