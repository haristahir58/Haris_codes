public class Rectangle implements Shape{

    public double length;
    public double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length * width;
    }


}
