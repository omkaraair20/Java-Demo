package OOP;

public class Student {
	private int id;
    private String name;

    public void setData(int i, String n) {
        id = i;
        name = n;
    }

    public void showData() {
        System.out.println(id + " " + name);
    }
}

