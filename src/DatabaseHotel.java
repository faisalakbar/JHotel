import java.util.ArrayList;
/**
 * Program JHotel untuk bisnis perhotelan.
 *
 * @author Faisal Akbar
 * @version March-01-2018
 */

public class DatabaseHotel
{
    // instance variables - replace the example below with your own
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<>();
    private static int LAST_HOTEL_ID = 0;

    /**
     * 
     * @return false
     */
    public static ArrayList<Hotel> getHotelDatabase() {
        return HOTEL_DATABASE;
    }

    public static int getLastHotelId() {
        return LAST_HOTEL_ID;
    }

    public static boolean addHotel(Hotel baru)
    {
        for (Hotel hotel :
                HOTEL_DATABASE) {
            if(hotel.getID() == baru.getID()) return false;
        }
        HOTEL_DATABASE.add(baru);
        LAST_HOTEL_ID = baru.getID();
        return true;
    }
    
    /**
     * 
     * @return false
     */
    public static boolean removeHotel(int id)
    {
        for (Hotel hotel :
                HOTEL_DATABASE) {
            if(hotel.getID()==id){
                for (Room kamar :
                        DatabaseRoom.getRoomsFromHotel(hotel)) {
                    DatabaseRoom.removeRoom(hotel, kamar.getNomorKamar());
                }
                HOTEL_DATABASE.remove(hotel);
                return true;
            }
        }
        return false;
    }
    
    /**
     * 
     * @return null
     */
    public static Hotel getHotel(int id)
    {
        for (Hotel hotel :
                HOTEL_DATABASE) {
            if (hotel.getID() == id) return hotel;
        }
        return null;
    }
    
}
