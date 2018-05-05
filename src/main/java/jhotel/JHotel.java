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
        } catch (HotelSudahAdaException e) {
            System.out.println("Hotel Sudah ada");
            System.out.println(e.getPesan());
        }

        try {
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "A111"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(1), "B222"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(1), "C333"));
        } catch (RoomSudahAdaException e) {
            System.out.println("Room sudah ada");
            System.out.println(e.getPesan());
        }

    }
}



