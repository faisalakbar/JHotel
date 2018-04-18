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

    /**
     * 
     * @return false
     */
    public static boolean addCustomer(Customer baru)
    {
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if(cust.getID() == baru.getID()) return false;
        }
        CUSTOMER_DATABASE.add(baru);
        LAST_CUSTOMER_ID = baru.getID();
        return true;
    }
    
    /**
     * 
     * @return false
     */
    public static boolean removeCustomer(int id)
    {
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if(cust.getID()==id){
                for (Pesanan pesan :
                        DatabasePesanan.getPesananDatabase()) {
                    if(pesan.getPelanggan().equals(cust)) DatabasePesanan.removePesanan(pesan);
                }
                CUSTOMER_DATABASE.remove(cust);
                return true;
            }
        }
        return false;
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
}
