import model.*;

public class Main {

    public static void main(String[] args) {

        // Create a customer
        Customer customer = new Customer("John Doe");

        // Create accounts
        Account savings = new SavingsAccount("ACC101", 2500, 5);
        Account current = new CurrentAccount("ACC102", 3000, 1000);

        // Add accounts to customer
        customer.addAccount(savings);
        customer.addAccount(current);

        // Deposit and withdraw some money (optional test)
        savings.deposit(500);
        savings.withdraw(200);

        current.withdraw(3500);

        // Print account statements
        System.out.println("=== ACCOUNT STATEMENTS ===");
        System.out.println(savings.generateStatement());
        System.out.println();
        System.out.println(current.generateStatement());

        // Print total worth
        System.out.println();
        System.out.println("=== CUSTOMER SUMMARY ===");
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Total Worth: " + customer.totalWorth());
    }
}