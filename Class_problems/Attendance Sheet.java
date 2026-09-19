class AttendanceSheet {
    private String[] students;
    private int count = 0;

    AttendanceSheet(int size) {
        students = new String[size];
    }

    void markPresent(String name) {
        if (!isPresent(name)) {
            students[count] = name;
            count++;
        }
    }

    int getPresentCount() {
        return count;
    }

    boolean isPresent(String name) {
        for (int i = 0; i < count; i++)
            if (students[i].equals(name))
                return true;

        return false;
    }
}

class Main {
    public static void main(String[] args) {
        AttendanceSheet sheet = new AttendanceSheet(30);

        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");

        System.out.println(sheet.getPresentCount());
        System.out.println(sheet.isPresent("Ben"));
        System.out.println(sheet.isPresent("Chen"));
    }
}
