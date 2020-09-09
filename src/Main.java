import com.zuitt.app.User;
import com.zuitt.app.Account;
import com.zuitt.app.Customer;
import com.zuitt.app.Staff;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Staff staff = new Staff();

        customer.register();
        staff.register();
        System.out.println("======= End of user registrations =======");

        customer.login();
        customer.logout();
        System.out.println("======= End of customer login/logout =======");

        staff.login();
        staff.logout();
        System.out.println("======= End of staff login/logout =======");

        customer.order();
        customer.pay();
        customer.viewTransactions();
        System.out.println("======= End of customer actions =======");

        staff.manageCustomers();
        staff.manageProducts();
        System.out.println("======= End of staff actions =======");
    }
}
