public class DataTypes {
    public static void main(String[] args) {
//        Primitive data type
        int studentAge = 15;
        double studentGPA = 4.23;
//        char studentFirstInitial = 'R';
//        char studentLastInitial = 'S';
        boolean hasPerfectAttendence = true;

//        Refrence data type
        String studentFirstName = "Rahul";
        String studentLastName = "Saraf";

//        System.out.println(studentAge);
//        System.out.println(studentGPA);
//        System.out.println(studentFirstInitial);
//        System.out.println(studentLastInitial);
//        System.out.println(hasPerfectAttendence);
//        System.out.println(studentFirstName);
//        System.out.println(studentLastName);

//        charAT :- Extracting a specific char at a specific position
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);


    }
}
