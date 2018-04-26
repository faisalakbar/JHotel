package jhotel;
public class HotelTidakDitemukanException extends Exception {
    private int hotel_error;

    public HotelTidakDitemukanException (int hotel_input){
        super ("\n Hotel dengan ID :");
        hotel_error = hotel_input;

    }

    public String getPesan(){
        return super.getMessage() + hotel_error + "\n tidak ditemukan.";
    }
}
