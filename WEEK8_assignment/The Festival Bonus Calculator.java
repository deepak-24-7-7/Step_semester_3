import java.util.Scanner;

abstract class Employee {
    String name;
    double sal;

    Employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    abstract double calc();
}

class FullTime extends Employee {
    FullTime(String name, double sal) {
        super(name, sal);
    }

    double calc() {
        return sal * 0.10;
    }
}

class PartTime extends Employee {
    PartTime(String name, double sal) {
        super(name, sal);
    }

    double calc() {
        return sal * 0.05;
    }
}

class Intern extends Employee {
    Intern(String name, double sal) {
        super(name, sal);
    }

    double calc() {
        return 2000;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            double sal = sc.nextDouble();

            Employee e;

            if (type.equals("FULLTIME")) {
                e = new FullTime(name, sal);
            } else if (type.equals("PARTTIME")) {
                e = new PartTime(name, sal);
            } else {
                e = new Intern(name, sal);
            }

            double bonus = e.calc();

            System.out.printf("%s: %.2f%n", name, bonus);
            total += bonus;
        }

        System.out.printf("Total Bonus: %.2f%n", total);
        sc.close();
    }
}
