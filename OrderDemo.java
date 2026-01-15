import java.util.Scanner;

class Order {
    String customerName;
    String productName;
    int quantity;
    double unitPrice;
    double totalPrice;

    void accept(Scanner sc) {
        System.out.print("Enter customer name: ");
        customerName = sc.next();

        System.out.print("Enter product name: ");
        productName = sc.next();

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        System.out.print("Enter unit price: ");
        unitPrice = sc.nextDouble();

        totalPrice = quantity * unitPrice;
    }

    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Product Name : " + productName);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Unit Price   : ₹" + unitPrice);
        System.out.println("Total Price  : ₹" + totalPrice);
        System.out.println("---------------------------");
    }
}

public class OrderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Order[] orders = new Order[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Order " + (i + 1));
            orders[i] = new Order();
 orders[i].accept(sc);
        }

        System.out.println("\n--- Order Summary ---");
        for (Order o : orders) {
            o.display();
        }

        // Find order with highest totalPrice
        double max = orders[0].totalPrice;
        int index = 0;
        for (int i = 1; i < 3; i++) {
            if (orders[i].totalPrice > max) {
                max = orders[i].totalPrice;
                index = i;
            }
        }

        System.out.println("\n--- Order with Highest Total Price ---");
        orders[index].display();

        sc.close();
    }
}

