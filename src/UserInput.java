import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        double studentGPA = 4.34;
        String studentFirstName = "Rahul";
        String studentLastName = "Saraf";
        System.out.println(studentFirstName+" "+studentLastName+ " current GPA is: "+studentGPA);

        System.out.println("What do you want to update it to?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(studentFirstName+" "+studentLastName+ " current GPA is: "+studentGPA);
    }
}
