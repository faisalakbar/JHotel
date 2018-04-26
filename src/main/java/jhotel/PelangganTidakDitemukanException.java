package jhotel;

public class PelangganTidakDitemukanException extends Exception {
    private int pelanggan_error;

    public PelangganTidakDitemukanException (int pelanggan_input){
        super ("\n Pelanggan dengan data :");
        pelanggan_error = pelanggan_input;

    }

    public String getPesan(){
        return super.getMessage() + pelanggan_error + "\ntidak ditemukan.";
    }
}
