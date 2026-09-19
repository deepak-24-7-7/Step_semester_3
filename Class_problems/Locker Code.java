class Locker {
    private String code;
    private final int number;

    Locker(int number, String code) {
        this.number = number;
        this.code = code;
    }

    void changeCode(String oldCode, String newCode) {
        if (code.equals(oldCode))
            code = newCode;
    }
}

class Main {
    public static void main(String[] args) {
        Locker l = new Locker(101, "1234");

        l.changeCode("1234", "5678");
        System.out.println("Code changed");

        l.changeCode("0000", "9999");
        System.out.println("Wrong code rejected");
    }
}
