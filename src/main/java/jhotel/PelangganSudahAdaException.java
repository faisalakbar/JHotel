package jhotel;

public class PelangganSudahAdaException extends Exception {
    private Customer pelanggan_error;

    public PelangganSudahAdaException (Customer pelanggan_input){
        super ("\n Pelanggan dengan data :");
        pelanggan_error = pelanggan_input;

    }

    public String getPesan(){
        return super.getMessage() + pelanggan_error + "\n sudah terdaftar.";
    }

}





