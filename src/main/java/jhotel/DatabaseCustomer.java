package jhotel;

import java.util.ArrayList;

/**
 * Program JHotel untuk bisnis perhotelan.
 *
 * @author Faisal Akbar
 * @version March-01-2018
 */

public class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int LAST_CUSTOMER_ID = 0;

    public static ArrayList<Customer> getCustomerDatabase(){
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerID() {
        return LAST_CUSTOMER_ID;
    }


    public static boolean addCustomer(Customer baru) throws PelangganSudahAdaException
    {
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if(cust.getID() == baru.getID() || cust.getEmail().compareTo(baru.getEmail()) == 0){
                throw new PelangganSudahAdaException(baru);
            }
        }
        CUSTOMER_DATABASE.add(baru);
        LAST_CUSTOMER_ID = baru.getID();
        return true;
    }


    public static boolean removeCustomer(int id) throws PelangganTidakDitemukanException
    {
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if(cust.getID()==id){
                for (Pesanan pesan :
                        DatabasePesanan.getPesananDatabase()) {
                    if(pesan.getPelanggan().equals(cust)) {
                        try{
                            DatabasePesanan.removePesanan(pesan);
                        }
                        catch(PesananTidakDitemukanException e){

                        }
                    }
                }
                CUSTOMER_DATABASE.remove(cust);
                return true;
            }
        }
        throw new PelangganTidakDitemukanException(id);
    }

    /**
     *
     * @return null
     */
    public static Customer getCustomer(int id)
    {
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if (cust.getID() == id) return cust;
        }
        return null;
    }

    public static Customer getCustomerLogin(String email, String password)
    {
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if (cust.getEmail().equals(email) && cust.getPassword().equals(password)) return cust;
        }
        return null;
    }
}
