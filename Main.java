package OOP;

class Student {
	int id;
    String name;

    void Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Main {
    public static void main(String args[]) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.display();
        s2.display();
    }

	
}