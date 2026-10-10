import java.util.*;

abstract class Student {
    String name;
    static final double TRANSPORT = 12000;

    Student(String name) { this.name = name; }
    abstract double tuition();
    double hostelFee() { return 0; }
    boolean usesBus() { return false; }

    double fee() {
        return tuition() + hostelFee() + (usesBus() ? TRANSPORT : 0);
    }
}

class DayScholar extends Student {
    DayScholar(String n) { super(n); }
    double tuition() { return 40000; }
    boolean usesBus() { return true; }
}

class Hosteller extends Student {
    Hosteller(String n) { super(n); }
    double tuition() { return 40000; }
    double hostelFee() { return 60000; }
}

class Scholar extends Student {
    Scholar(String n) { super(n); }
    double tuition() { return 20000; }
    boolean usesBus() { return true; }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next(), name = sc.next();
            Student s = type.equals("DAY_SCHOLAR") ? new DayScholar(name) :
                        type.equals("HOSTELLER") ? new Hosteller(name) :
                        new Scholar(name);

            double fee = s.fee();
            System.out.printf("%s: %.2f%n", name, fee);
            total += fee;
        }
        System.out.printf("Total Collected: %.2f%n", total);
    }
}
