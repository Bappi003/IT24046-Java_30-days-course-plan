class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Bappi";
        s1.age = 22;

        s1.display();
    }
}
