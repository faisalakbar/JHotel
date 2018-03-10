
/**
 * Program JHotel untuk bisnis perhotelan.
 *
 * @author Faisal Akbar
 * @version March-01-2018
 * @param biaya
 * @param pelanggan
 */

public class Pesanan
{
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private TipeKamar tipe_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    
     /**
     * Constructor for objects of class Pesanan
     * 
     * @param biaya
     * @param pelanggan
     */
    public Pesanan(double biaya, Customer pelanggan)
    {
        this.biaya = biaya;
        this.pelanggan = pelanggan;
    }
    
     /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai biaya
     * 
     * @return biaya
     */
    public double getBiaya()
    {
        return biaya;
    }
    
     /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai biaya
     * 
     * @return pelanggan
     */
    public Customer getPelanggan()
    {
        return pelanggan;
    }
    
     /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai nama_pelanggan
     * 
     * @return nama_pelanggan
     */
    public String getNamaPelanggan()
    {
        return nama_pelanggan;
    }
    
    /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai tipe_kamar
     * 
     * @return tipe_kamar
     */
    public TipeKamar getTipeKamar()
    {
        return tipe_kamar;
    }
    
     /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai biaya
     * 
     * @return isDiproses
     */
        public boolean getStatusDiproses()
    {
        return isDiproses;
    }
    
    /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai status selesai
     * 
     * @return isSelesai
     */
    public boolean getStatusSelesai()
    {
        return isSelesai;
    }
    
    /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai status kamar
     * 
     * @return kamar
     */
    public Room getRoom()
    {
        return kamar;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai biaya
     * 
     * @param biaya
     */
    public void setBiaya(double biaya)
    {
        this.biaya = biaya;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk menenetukan nilai pelanggan
     * 
     * @param baru
     */
    public void setPelanggan(Customer pelanggan)
    {
        this.pelanggan = pelanggan;
    }
    
     /**
     * Mutator for objects of class Pesanan
     * untuk menenetukan nilai nama_pelanggan
     * 
     * @param nama_pelanggan
     */
    public void setNamaPelanggan(String nama_pelanggan)
    {
        this.nama_pelanggan = nama_pelanggan;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai tipe_kamar
     * 
     * @param tipe_kamar
     */
    public void setTipeKamar(TipeKamar tipe_kamar)
    {
        this.tipe_kamar = tipe_kamar;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai status diproses
     * 
     * @param diproses
     */
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses = diproses;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai status selesai
     * 
     * @param diproses
     */
    public void setStatusSelesai(boolean diproses)
    {
        isSelesai = diproses;
    }
    
    /**
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai status kamar
     * 
     * @param kamar
     */
    public void setRoom (Room kamar)
    {
        this.kamar = kamar;
        
    }
    
    /**
     * Method untuk print data
     */
    public void printData()
    {
       System.out.println("Pesanan"); 
       System.out.println("Nama Pelanggan: " + getPelanggan().getNama());
       System.out.println("Tipe kamar: " + tipe_kamar);
       System.out.println("Kondisi Proses:  " + isDiproses);
       System.out.println("Kondisi Selesai: " + isSelesai);
    }
}