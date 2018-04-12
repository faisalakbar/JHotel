
/**
 * Program JHotel untuk bisnis perhotelan.
 *
 * @author Faisal Akbar
 * @version March-01-2018
 * @param biaya
 * @param pelanggan
 */
import java.util.*;
import java.text.*;
public class Pesanan
{
    private int id;
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isAktif;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;
    
     /**
     * Constructor for objects of class Pesanan
     * 
     * @param biaya
     * @param pelanggan
     */
    public Pesanan(double jumlahHari, Customer pelanggan, int date, int month, int year)
    {
        
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        this.biaya= kamar.getDailyTariff()*jumlahHari;
        this.isAktif = true;
        this.tanggalPesan = new Date();
    }


    /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai biaya
     *
     * @return biaya
     */
    public int getID()
    {
        return id;
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
     * untuk mendapatkan nilai biaya
     * 
     * @return biaya
     */
    public double getJumlahHari()
    {
        return jumlahHari;
    }

    /**
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai biaya
     *
     * @return isAktif
     */
    public boolean getStatusAktif()
    {
        return isAktif;
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
     * Accessor for objects of class Pesanan
     * untuk mendapatkan nilai status kamar
     * 
     * @return kamar
     */
    public Date getTanggalPesan()
    {
        return tanggalPesan;
    }

    /**
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai biaya
     *
     * @param biaya
     */
    public void setID(int id)
    {
        this.id = id;
    }

    /**
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai biaya
     *
     * @param biaya
     */
    public void setBiaya()
    {
        biaya = kamar.getDailyTariff()*jumlahHari;
    }
    
        /**
     * Mutator for objects of class Pesanan
     * untuk menenetukan nilai pelanggan
     * 
     * @param baru
     */
    public void setPelanggan(Customer baru)
    {
        pelanggan = baru;
    }
   
    /**
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai biaya
     * 
     * @param biaya
     */
    public void setJumlahHari(double jumlahHari)
    {
        this.jumlahHari = jumlahHari;
    }

    /**
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai status diproses
     *
     * @param diproses
     */
    public void setStatusAktif(boolean aktif)
    {
        isAktif = aktif;
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
    public void setStatusSelesai(boolean selesai)
    {
        isSelesai = selesai;
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
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai status kamar
     * 
     * @param kamar
     */
    public void setTanggalPesan (Date tanggalPesan)
    {
        this.tanggalPesan = tanggalPesan;
    }
    
    /**
     * Method untuk print data
     */
    public String toString()
    {
        String final_status = "KOSONG";
        if(isDiproses == true && isSelesai == false) final_status = "DIPROSES";
        else if(isDiproses == false && isSelesai == false) final_status = "KOSONG";
        else if(isDiproses == false && isSelesai == true) final_status = "SELESAI";
        
        return "Dibuat oleh " + getPelanggan().getNama() 
            + ". Proses booking untuk " + getRoom().getHotel().getNama() 
            + "kamar nomor " + getRoom().getNomorKamar() 
            + "dengan tipe kamar yang diinginkan " + getRoom().getTipeKamar().toString() 
            + ". Status: " + final_status + ".";
    }
}