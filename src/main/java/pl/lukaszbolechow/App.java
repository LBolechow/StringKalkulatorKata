package pl.lukbole;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("String do dodawania:\n");
        String liczby = input.nextLine();
        System.out.println(Calculator.add(liczby));

    }
}
