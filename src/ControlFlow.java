import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {

        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number<5){
            System.out.println("Enjoy the good luck a friend brings you.");
        }else{
            System.out.println("Your shoe selection will make you happy today.");
        }
    }
}
