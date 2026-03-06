package Buffered;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputExample1 {
	public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Name: ");
        String name = br.readLine();

        System.out.println("Name: " + name);
    }
}

