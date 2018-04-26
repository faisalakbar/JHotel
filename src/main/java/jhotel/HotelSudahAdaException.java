package jhotel;

public class HotelSudahAdaException extends Exception {
    private Hotel hotel_error;

    public HotelSudahAdaException (Hotel hotel_input){
        super ("\n Hotel Dengan Nama :");
        hotel_error = hotel_input;

    }

    public String getPesan(){
        return super.getMessage() + hotel_error.getNama() + "\n sudah terdaftar.";
    }
}
