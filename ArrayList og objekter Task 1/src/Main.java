import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> customers = new ArrayList<>();
        customers.add(new Customer("Ferdinand","Amstrup Vestergaard"+"\n", "R3N0LC"));
        customers.add(new Customer("Claus","Jørgensen"+"\n", "RubyRex"));
        printCustomers(customers);

    }
    public static void printCustomers(ArrayList<Object> customers){
        for (Object customer : customers){
            System.out.println(customer);
        }
    }
}




