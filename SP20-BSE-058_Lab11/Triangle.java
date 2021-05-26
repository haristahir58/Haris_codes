public class Triangle implements Shape {
    public double base;
    public double height;

    public Triangle(){
        base = 0;
        height = 0;
    }

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double area(){
        return 0.5 * base * height;
    }


}
