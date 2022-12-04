public class Classes {
    public static void main(String[] args) {
        Triangle TriangleA = new Triangle(6,8,6,8,10);
        Triangle TriangleB = new Triangle(3,2.598,3,3,3);

        double TriangleAArea = TriangleA.findArea();
        System.out.println(TriangleAArea);

        double TriangleBArea = TriangleB.findArea();
        System.out.println(TriangleBArea);
    }
}
