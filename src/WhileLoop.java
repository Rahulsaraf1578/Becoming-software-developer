import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        while (isOnRepeat){
            System.out.println("Current song is playing");
            System.out.println("Would you like to take it off repeat?");
            String userInput = input.next();

            if(userInput.equals("yes") || userInput.equals("Yes")){
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song");
    }
}
