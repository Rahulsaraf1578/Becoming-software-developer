import java.util.Scanner;

public class Functions {
    public static void AnnounceDeveloperTeaTime(){
        System.out.println("Waiting for developer tea time..");
        System.out.println("Type a random word and press enter to start developer tea time");

        Scanner input = new Scanner(System.in);
        input.next();

        System.out.println("It's developer tea time");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to your new job");
        AnnounceDeveloperTeaTime();

        System.out.println("Write code");
        System.out.println("Review code");

        AnnounceDeveloperTeaTime();

        System.out.println("Get promoted");
    }
}
