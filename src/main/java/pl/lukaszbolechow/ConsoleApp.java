package pl.lukbole;
import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("String do dodawania:\n");
        System.out.println(Calculator.add(input.nextLine()));

    }
}
