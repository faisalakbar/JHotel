
/**
 * Program JHotel untuk bisnis perhotelan.
 *
 * @author Faisal Akbar
 * @version March-01-2018
 */

public class Pesanan
{
    // instance variables - replace the example below with your own
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private String jenis_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    
    public Pesanan(double biaya, Customer pelanggan)
    {
        this.biaya = biaya;
        this.pelanggan = pelanggan;
    }

    public double getBiaya()
    {
        return biaya;
    }
    
    public Customer getPelanggan()
    {
        return pelanggan;
    }
    
        public boolean getStatusDiproses()
    {
        return isDiproses;
    }
    
        public boolean getStatusSelesai()
    {
        return isSelesai;
    }
    
        public void setBiaya(double biaya)
    {
        this.biaya = biaya;
    }
    
        public void setPelanggan(Customer baru)
    {
        this.pelanggan = baru;
    }
    
        public void setStatusDiproses(boolean diproses)
    {
        this.isDiproses = diproses;
    }
    
        public void setStatusSelesai(boolean diproses)
    {
        this.isSelesai = diproses;
    }
    
    public void printData()
    {
    
    }
}