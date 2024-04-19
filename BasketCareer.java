import java.util.Scanner;

public class BasketCareer{
    //Calculate basket career longevity

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("What is your name ? ");
        String name = input.next();

        System.out.print("When did you start playing basketball ? ");

        int year = input.nextInt();

        int result = 2023 - year;

        System.out.println(name + " you have been playing basketball for " + result + " years!");

        String Category = result > 20 ? "You are a veteran!" : "Your are a rookie!";

        System.out.println(Category);





    }
}
