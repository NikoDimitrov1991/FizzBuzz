import java.util.Scanner;

public class FizzBuzzGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter challenge length:  ");
        double fizBuzzFinalNumber =sc.nextDouble();
        System.out.println("The  FizzBuzz starts: ");

        for (int i = 1; i <= fizBuzzFinalNumber; i++) {
            if (i%3==0 &&i%5==0){
                System.out.println("FizzBuzz");
            }
            else if (i%3==0){
                System.out.println("Fizz");
            }
            else if (i%5==0){
                System.out.println("Buzz");
            }else  {
                System.out.println(i);
            }
        }
        System.out.println(" ");
        System.out.println("Challenge completed!");
    }
}
