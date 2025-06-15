import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Zouzou!");
        System.out.print("Hi Zou!\n");
        System.out.println("Hi Zou #2!");

        int zouAge;
        // System.out.println(age); // this will crash the program

        zouAge = 11;
        System.out.println(zouAge);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Queen's name: ");
        String queen = scanner.nextLine();
        System.out.print("How old is she? ");
        int age = scanner.nextInt();

        if (queen.equals("Zouzou") || queen.equals("Zou")) {
            System.out.println("Correct, she is indeed the queen.");
            System.out.println("Long live The " + queen + "!");
        } else {
            System.out.println("Incorrect, shame on you and your lineage.");
            System.out.println("Take your '" + queen + "' guess out of here.");
        }
        System.out.println("She's " + age + " glorious years old.");

        scanner.close();
    }
// 36:20
}