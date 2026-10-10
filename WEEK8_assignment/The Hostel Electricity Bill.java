import java.util.Scanner;

abstract class Room {
    int units;

    Room(int units) {
        this.units = units;
    }

    abstract double calc();
}

class Single extends Room {
    Single(int units) {
        super(units);
    }

    double calc() {
        return units * 8.0;
    }
}

class Shared extends Room {
    int occ;

    Shared(int units, int occ) {
        super(units);
        this.occ = occ;
    }

    double calc() {
        return units * 6.0 / occ;
    }
}

class AC extends Room {
    AC(int units) {
        super(units);
    }

    double calc() {
        return units * 10.0 + 200;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int units = sc.nextInt();

            Room r;

            if (type.equals("SINGLE")) {
                r = new Single(units);
            } else if (type.equals("SHARED")) {
                int occ = sc.nextInt();
                r = new Shared(units, occ);
            } else {
                r = new AC(units);
            }

            double ans = r.calc();

            System.out.printf("%s: %.2f%n", type, ans);
            total += ans;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
