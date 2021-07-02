import java.util.*;

class DiceGame{
    public static void main(String args[]){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int a = rand.nextInt(6) + 1;
        int b = rand.nextInt(6) + 1;
        int sum = a + b;
        String name;

        System.out.print("What is your name?\n> ");
        name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Rolling the dice...");
        System.out.println("Die 1: " + a);
        System.out.println("Die 2: " + b);
        System.out.println("Total value: " + sum);
        
    }
}