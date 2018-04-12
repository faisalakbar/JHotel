
/**
 * Write a description of class Administrasi here.
 *
 * @author Faisal Akbar
 * @version March-09-2018
 */
public class Administrasi
{
    // instance variables - replace the example below with your own
    
    public Administrasi()
    {
        
    }


    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
        roomAmbilPesanan(pesan, kamar);
    }
    
    public static void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.BOOKED);
        kamar.setPesanan(pesan);
    }
    
    public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.VACANT);
        kamar.setPesanan(null);
    }
    
        public static void pesananDibatalkan(Room kamar)
    {
        kamar.getPesanan().setStatusAktif(false);
        kamar.getPesanan().setStatusSelesai(false);
        kamar.getPesanan().setStatusDiproses(false);
        kamar.getPesanan().setRoom(null);
        roomLepasPesanan(kamar);
    }
    
    public static void pesananSelesai(Room kamar)
    {
        kamar.getPesanan().setStatusAktif(false);
        kamar.getPesanan().setStatusSelesai(true);
        kamar.getPesanan().setStatusDiproses(false);
        kamar.getPesanan().setRoom(null);
        roomLepasPesanan(kamar);
    }
    
    public static void pesananDibatalkan(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
    
    public static void pesananSelesai(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
}
