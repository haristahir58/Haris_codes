public class Circle implements Shape {
    public double radius;


    public Circle(){
        radius = 0;
    }
    public Circle(double radius)
    {
        this.radius = radius;
    }


    public double area()
    {
        return radius * radius * Math.PI;
    }


}