

public class JHotel
{

    public JHotel()
    {

    }

    public static void main(String[] args)
    {
       System.out.println("Welcome to JHotel");
       Customer Ical = new Customer(1, "Ical");
       Lokasi Dago = new Lokasi(12, 21, "Dago");
       Hotel Sakura = new Hotel ("Hotel Sakura",Dago,5);
       Room room = new Room (Sakura, "12B", true, Ical, 100000, StatusKamar.Vacant);
       Pesanan pesanan = new Pesanan (16000, Ical);
       
       Dago.printData();
       Ical.printData();
       Sakura.printData();
       
       System.out.println("==========method1===========");
       Administrasi.pesananDitugaskan(pesanan, room);
       room.printData();
       pesanan.printData();
       
       System.out.println("==========method2===========");
       Administrasi.pesananDibatalkan(room);
       room.printData();
       pesanan.printData();
       
       System.out.println("==========method3===========");
       Administrasi.pesananDitugaskan(pesanan, room);
       Administrasi.pesananSelesai(room);
       room.printData();
       pesanan.printData();
       
       System.out.println("==========method4===========");
       Administrasi.pesananDitugaskan(pesanan, room);
       Administrasi.pesananDibatalkan(pesanan);
       room.printData();
       pesanan.printData();
       
       System.out.println("==========method5===========");
       Administrasi.pesananDitugaskan(pesanan, room);
       Administrasi.pesananSelesai(pesanan);
       room.printData();
       pesanan.printData();
  
     
    }

}


