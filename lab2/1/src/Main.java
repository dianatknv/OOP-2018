class Student {
    private int id;
    private String name;
    private int yearOfStudy = 1;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getYearOfStudy(){
        return yearOfStudy;
    }

    public void incrYearOfStudy(){
        yearOfStudy++;
    }
}

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(1, "Diana");
        System.out.println(student1.getId() + " " + student1.getName() + " " + student1.getYearOfStudy());
        student1.incrYearOfStudy();
        System.out.println(student1.getYearOfStudy());

        System.out.println("_________");

        Student student2 = new Student(2, "Muha");
        System.out.println(student2.getId() + " " + student2.getName() + " " + student2.getYearOfStudy());
        student2.incrYearOfStudy();
        student2.incrYearOfStudy();
        System.out.println(student2.getYearOfStudy());

    }
}
