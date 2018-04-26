package jhotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JHotel {

    public JHotel() {

    }

    public static void main(String[] args) {
        SpringApplication.run(JHotel.class, args);

        try {
            DatabaseHotel.addHotel(new Hotel("Alexis", new Lokasi(342, 798, "Kering nan Keras"), 5));
            DatabaseHotel.addHotel(new Hotel("Sultan", new Lokasi(343, 743, "Dingin nan Ramai"), 4));
        } catch (HotelSudahAdaException e) {
            System.out.println("Hotel Sudah ada");
            System.out.println(e.getPesan());
        }

        try {
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "A111"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2), "B222"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(1), "C333"));
        } catch (RoomSudahAdaException e) {
            System.out.println("Room sudah ada");
            System.out.println(e.getPesan());
        }


/*
        try {
            DatabaseCustomer.addCustomer(new Customer("Abay", 12, 1, 1995, "Abay@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Budiman", 23, 2, 1996, "budiman@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Cinta", 16, 3, 1997, "cinta@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Cinta", 16, 3, 1997, "cinta@gmail.com"));
        } catch (PelangganSudahAdaException e) {
            System.out.println("---TES PELANGGAN SUDAH ADA BERHASIL---");
            System.out.println(e.getPesan());
        }

        try {
            Lokasi a = new Lokasi(123, 213, "Panas nan Sejuk");
            DatabaseHotel.addHotel(new Hotel("Alexis", new Lokasi(342, 798, "Kering nan Keras"), 5));
            DatabaseHotel.addHotel(new Hotel("Sultan", new Lokasi(343, 743, "Dingin nan Ramai"), 4));
            DatabaseHotel.addHotel(new Hotel("Margo Hotel", a, 5));
            DatabaseHotel.addHotel(new Hotel("Margo Hotel", a, 5));
        } catch (HotelSudahAdaException e) {
            System.out.println("---TES HOTEL SUDAH ADA BERHASIL---");
            System.out.println(e.getPesan());
        }

        try {
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "A111"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2), "B222"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3), "C333"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(1), "D444"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(1), "D444"));

        } catch (RoomSudahAdaException e) {
            System.out.println("---TES ROOM SUDAH ADA BERHASIL---");
            System.out.println(e.getPesan());
        }

        try {
            DatabasePesanan.addPesanan(new Pesanan(4, DatabaseCustomer.getCustomer(1)));
            DatabasePesanan.addPesanan(new Pesanan(5, DatabaseCustomer.getCustomer(2)));
            DatabasePesanan.addPesanan(new Pesanan(6, DatabaseCustomer.getCustomer(3)));
            DatabasePesanan.addPesanan(new Pesanan(6, DatabaseCustomer.getCustomer(3)));
        } catch (PesananSudahAdaException e) {
            System.out.println("---TES PESANAN SUDAH ADA BERHASIL---");
            System.out.println(e.getPesan());
        }

        try {
            DatabaseCustomer.removeCustomer(11);
        } catch (PelangganTidakDitemukanException e) {
            System.out.println("---TES PELANGGAN TIDAK DITEMUKAN BERHASIL---");
            System.out.println(e.getPesan());
        }
        Customer me = new Customer("Faisal Akbar", 2017, 3, 2, "faisal@gmail.com");
        Pesanan pesan = new Pesanan(78, me);
        try {
            DatabasePesanan.removePesanan(pesan);
        } catch (PesananTidakDitemukanException e) {
            System.out.println("---TES PESANAN TIDAK DITEMUKAN BERHASIL---");
            System.out.println(e.getPesan());
        }

        try {
            DatabaseHotel.removeHotel(78);
        } catch (HotelTidakDitemukanException e) {
            System.out.println("---TES HOTEL TIDAK DITEMUKAN BERHASIL---");
            System.out.println(e.getPesan());
        }

        try {
            DatabaseRoom.removeRoom(DatabaseHotel.getHotel(2), "ASOY");
        } catch (RoomTidakDitemukanException e) {
            System.out.println("---TES ROOM TIDAK DITEMUKAN BERHASIL---");
            System.out.println(e.getPesan());
        }

        System.out.println("===========HASIL==========");

        System.out.println(DatabaseCustomer.getCustomerDatabase());
        System.out.println(DatabaseHotel.getHotelDatabase());
        System.out.println(DatabaseRoom.getRoomDatabase());
        System.out.println(DatabasePesanan.getPesananDatabase());
*/
    }
}



