package jhotel;

public class PesananTidakDitemukanException extends Exception {
    private Customer pelanggan_error;

    public PesananTidakDitemukanException (Customer pelanggan_input){
        super ("\n Pelanggan dengan data :");
        pelanggan_error = pelanggan_input;

    }

    public String getPesan(){
        return super.getMessage() + pelanggan_error.getNama() + "\n tidak ditemukan.";
    }
}
