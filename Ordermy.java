import java.util.Scanner;

class Ordermy {
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

public static void main(String [] args)
{
  Scanner sc=new Scanner(System.in);
  Ordermy[] order=new Ordermy[3];
  for(int i=0; i<3;i++)
   {
       System.out.println("\nEnter details for Order " + (i+1));
       order[i]=new Ordermy();
       order[i].accept(sc);
   
  }  
        System.out.println("\n--- Order Summary ---"); 
  for(Ordermy o :order){
        o.display();
    
   }
   double max=order[0].totalPrice;
   for(int i=1;i<3;i++){
    if(order[i].totalPrice > max){ max=order[i].totalPrice;}
  }
   System.out.println("\nHighest Total Price = ₹" + max);
}



}
