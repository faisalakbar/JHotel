package jhotel;


import java.util.Date;

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

    public Pesanan(double jumlahHari, Customer pelanggan)
    {
        
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        this.isAktif = true;
        this.tanggalPesan = new Date();
        this.id = DatabasePesanan.getLastPesananId()+1;
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
     * @return isDiproses
     */
        public boolean getStatusDiproses()
    {
        return isDiproses;
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
     * @return date
     */
    public Date getTanggalPesan()
    {
        return tanggalPesan;
    }

    /**
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai biaya
     *
     * @param id
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
     * @param jumlahHari
     */
    public void setJumlahHari(double jumlahHari)
    {
        this.jumlahHari = jumlahHari;
    }

    /**
     * Mutator for objects of class Pesanan
     * untuk menentukan nilai status diproses
     *
     * @param aktif
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
     * @param isSelesai
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
     * @param tanngalpesan
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

        else if (kamar != null) {
            return "\n Pesanan" +
                    "\n pelanggan=" + pelanggan.getNama() +
                    "\n jumlah hari =" + jumlahHari +
                    "\n hotel=" + kamar.getHotel().getNama() +
                    "\n kamar=" + kamar.getNomorKamar() +
                    "\n tipeKamar=" + kamar.getTipeKamar() +
                    "\n status='" + final_status;
        }
        return "\n Pesanan" +
                "\n pelanggan=" + pelanggan.getNama() +
                "\n jumlah hari=" + jumlahHari +
                "\n hotel=null" +
                "\n kamar=null" +
                "\n tipeKamar=" +
                "\n status='" + final_status;

        }
    }
