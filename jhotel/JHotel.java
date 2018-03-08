

public class JHotel
{

    public JHotel()
    {

    }

    public void main(String[] args)
    {
       Customer customer = new Customer(1, "Faisal");
       Lokasi lokasi = new Lokasi(12, 21, "Dago");
       Hotel hotel = new Hotel("Anugrah", lokasi, 3);
       Pesanan pesanan = new Pesanan (160000, customer);
       
       customer.printData();
       hotel.printData();
       pesanan.printData();
       
       customer.setNama("Kiel");
       customer.printData();
       hotel.printData();
       pesanan.printData();
       
    }

}


