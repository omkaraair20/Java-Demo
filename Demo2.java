package NonStatic;

public class Demo2 {
	{
        System.out.println("Instance block executed");
    }

    Demo2() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        Demo2 obj = new Demo2();
    }
}