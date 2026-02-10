public class Student {

    public enum StudyMode {
        FULL_TIME, PART_TIME
    }

    private static int counter = 0;

    private final int id;

    private final String name;

    private int year;
    private StudyMode mode;

    {
        year = 1;
    }

    public Student(String name, StudyMode mode) {
        this.name = name;
        this.mode = mode;
        this.id = ++counter;
    }

    public void incrementYear() {
        this.year++;
    }

    public void incrementYear(int years) {
        this.year += years;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public StudyMode getMode() {
        return mode;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Year of Study: " + year);
        System.out.println("Mode: " + mode);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Aleka", StudyMode.FULL_TIME);
        Student s2 = new Student("Kama", StudyMode.PART_TIME);

        s1.displayDetails();
        System.out.println();

        s1.incrementYear();
        s1.incrementYear(2);

        System.out.println("After increment:");
        s1.displayDetails();

        System.out.println();
        System.out.println("Total students created: " + counter);
    }
}
