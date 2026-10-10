import java.util.*;

abstract class Booking {
    static final double FEE = 50;
    double distance;
    Booking(double d) { distance = d; }
    abstract double fare();

    double total() { return fare() + FEE; }
}

class Bus extends Booking {
    Bus(double d) { super(d); }
    double fare() { return distance * 2; }
}

class Train extends Booking {
    Train(double d) { super(d); }
    double fare() { return distance * 1.5; }
}

class Flight extends Booking {
    Flight(double d) { super(d); }
    double fare() { return 2500 + distance * 4; }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double distance = sc.nextDouble();
            Booking b;

            switch (type) {
                case "BUS":
                    b = new Bus(distance);
                    break;
                case "TRAIN":
                    b = new Train(distance);
                    break;
                default:
                    b = new Flight(distance);
            }

            System.out.printf("%s: %.2f%n", type, b.total());
        }
    }
}
