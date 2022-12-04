public class Triangle {
    double base;
    double height;
    double sideLenOne;
    double sideLenSecond;
    double sideLenThird;

    public Triangle(double base, double height,
                    double sideLenOne, double sideLenSecond, double sideLenThird){
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenSecond = sideLenSecond;
        this.sideLenThird = sideLenThird;
    }

    public double findArea(){
        return (this.base*this.height)/2;
    }
}
