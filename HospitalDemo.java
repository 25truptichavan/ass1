import java.util.Scanner;

class Patient {
    int patientId, age, daysAdmitted;
    String name, disease;
    double dailyCharge, totalBill;

    void accept(Scanner sc) {
        // Patient ID
        while (true) {
            try {
                System.out.print("Enter Patient ID: ");
                patientId = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer for Patient ID.");
            }
        }

        // Name
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        // Age
        while (true) {
            try {
                System.out.print("Enter Age: ");
                age = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer for Age.");
            }
        }

        // Disease
        System.out.print("Enter Disease: ");
        disease = sc.nextLine();

        // Days Admitted
        while (true) {
            try {
                System.out.print("Enter Days Admitted: ");
                daysAdmitted = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer for Days Admitted.");
            }
        }

        // Daily Charge
        while (true) {
            try {
                System.out.print("Enter Daily Charge: ");
                dailyCharge = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for Daily Charge.");
            }
        }

        totalBill = daysAdmitted * dailyCharge;
    }

    void display() {
        System.out.println("Patient ID    : " + patientId);
        System.out.println("Name          : " + name);
        System.out.println("Age           : " + age);
        System.out.println("Disease       : " + disease);
        System.out.println("Days Admitted : " + daysAdmitted);
        System.out.println("Daily Charge  : ₹" + dailyCharge);
        System.out.println("Total Bill    : ₹" + totalBill);
        System.out.println("-----------------------------");
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient[] p = new Patient[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for Patient " + (i + 1));
            p[i] = new Patient();
            p[i].accept(sc);
        }

        System.out.println("\n--- All Patient Summary ---");
        for (Patient pat : p) {
            pat.display();
        }

        // Find longest stay and highest bill
        int index = 0;
        for (int i = 1; i < 5; i++) {
            if (p[i].daysAdmitted > p[index].daysAdmitted || p[i].totalBill > p[index].totalBill) {
                index = i;
            }
        }

        System.out.println("\n--- Patient with Longest Stay / Highest Bill ---");
        p[index].display();

        sc.close();
    }
}

