import java.util.*;

abstract class Appliance {
    double hours;
    static final double RATE = 8;

    Appliance(double h) { hours = h; }
    abstract double power();

    double units() {
        return power() * hours / 1000;
    }

    double cost() {
        return units() * RATE;
    }
}

interface Saver {
    double savedUnits();
}

class Fridge extends Appliance {
    Fridge(double h) { super(h); }
    double power() { return 150; }
}

class AC extends Appliance implements Saver {
    AC(double h) { super(h); }
    double power() { return 1500; }
    public double savedUnits() { return units() * 0.75; }
}

class TV extends Appliance {
    TV(double h) { super(h); }
    double power() { return 100; }
}

class Washer extends Appliance implements Saver {
    Washer(double h) { super(h); }
    double power() { return 500; }
    public double savedUnits() { return units() * 0.75; }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double hours = sc.nextDouble();
            boolean saver = sc.hasNext("SAVER");
            if (saver) sc.next();

            Appliance a = type.equals("FRIDGE") ? new Fridge(hours) :
                          type.equals("AC") ? new AC(hours) :
                          type.equals("TV") ? new TV(hours) : new Washer(hours);

            if (saver && !(a instanceof Saver)) {
                System.out.println(type + ": saver mode not supported");
                continue;
            }

            double units = saver ? ((Saver) a).savedUnits() : a.units();
            double cost = units * Appliance.RATE;

            System.out.printf("%s: Units=%.2f Cost=%.2f%n", type, units, cost);
            total += cost;
        }
        System.out.printf("Total Cost: %.2f%n", total);
    }
}
