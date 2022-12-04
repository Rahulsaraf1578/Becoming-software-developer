import java.util.Scanner;

public class CodingChallange {
    public static void main(String[] args) {

        String firstChoice = "1. Rahul";
        String secondChoice = "2. Aditya";
        String thirdChoice = "3. Murali";

        System.out.println("What is my name:");
        System.out.println(firstChoice);
        System.out.println(secondChoice);
        System.out.println(thirdChoice);

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        if(choice == 1 ){
            System.out.println("You are correct");
        }else{
            System.out.println("You are incorrect");
        }
    }
}
