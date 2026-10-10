import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String rev = new StringBuilder(s).reverse().toString();

        System.out.println(rev + " - " +
            (s.equals(rev) ? "palindrome" : "not a palindrome"));
    }
}
