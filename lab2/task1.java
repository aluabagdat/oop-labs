public class Student {

    private String name;
    private int id;
    private int year;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.year = 1; 
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

    public void incrementYear() {
        year++;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("id: " + id);
        System.out.println("Year of Study: " + year);
    }

    public static void main(String[] args) {
        Student stud = new Student("Aleka", 1);

        stud.displayDetails();
        stud.incrementYear();
        System.out.println("After increment:");
        stud.displayDetails();
    }
}
