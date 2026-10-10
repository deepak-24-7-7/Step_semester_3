import java.util.*;

abstract class Ticket {
    static final double FEE = 20;
    abstract double getPrice();
}

class Regular extends Ticket {
    double getPrice() { return 150; }
}

class Premium extends Ticket {
    double getPrice() { return 250; }
}

class Recliner extends Ticket {
    double getPrice() { return 400; }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String seat = sc.next();
            int count = sc.nextInt();
            Ticket t = seat.equals("REGULAR") ? new Regular() :
                       seat.equals("PREMIUM") ? new Premium() : new Recliner();
            double amount = (t.getPrice() + Ticket.FEE) * count;
            System.out.printf("%s: %.2f%n", seat, amount);
            total += amount;
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
