import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Zouzou!");
        System.out.print("Hi Zou!\n");
        System.out.println("Hi Zou #2!");

        int age;
        // System.out.println(age); // this will crash the program

        age = 11;
        System.out.println(age);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Queen's name: ");
        scanner.nextLine();

        scanner.close();
    }

}

// 21:20