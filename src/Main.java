import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<Customer>();

        Business b1 = new Business(182,25000, 14000, "b666", "Kofi LLC");
        customers.add(b1);
        Business b2 = new Business(150,3000, 1500, "b678", "AduKuopio");
        customers.add(b2);
        InternalCustomer i1 = new InternalCustomer(140, 6000, 3000, 8765, true);
        customers.add(i1);
        InternalCustomer i2 = new InternalCustomer(6,76800,6500,546,false);
        customers.add(i2);
        for (Customer c1:
                customers) {
            System.out.println( c1.toString());

        }

    }
}
