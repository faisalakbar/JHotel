

public class JHotel
{

    public JHotel()
    {

    }

    public static void main(String[] args)
    {
       System.out.println("Welcome to JHotel");
       //Customer Ical = new Customer(1, "Ical");
       Lokasi Dago = new Lokasi(12, 21, "Dago");
       Hotel Sakura = new Hotel ("Hotel Sakura",Dago,5);
       Room single1 = new SingleRoom (Sakura, "12B", true, StatusKamar.Vacant);
       //Pesanan pesanan = new Pesanan (5, Ical, single1);
       single1.setDailyTariff(9999999);
       Room kamar2 = new DoubleRoom(Sakura,"69",true, StatusKamar.Vacant);
       //Pesanan pesanan2 = new Pesanan(21, Ical, single1);
       //kamar2.setDailyTariff(2000000);
       //Administrasi.pesananDitugaskan(pesanan2, kamar2);
       //pesanan.setBiaya();
       //kamar2.printData();
       //pesanan2.printData();
       //Dago.printData();
       //Ical.printData();
       //Sakura.printData();
       
       //Administrasi.pesananDitugaskan(pesanan, single1);
       //pesanan.printData();
       //single1.printData();
       
       if (single1 instanceof DoubleRoom)
       {
           System.out.println("Benar double Room");
        }
        else
            System.out.println("Bukan double Room");
        }
        
        
        
        
       
       

  
     
    }



