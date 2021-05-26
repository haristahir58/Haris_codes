public class Runner_lab11 {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        // Displaying Rectangle
        shapes[0] = new Rectangle(3.2, 4.1);

        // Displaying Triangle
        shapes[1] = new Triangle(2.4, 2.8);

        // Displaying Circle
        shapes[2] = new Circle(6.6);


        double areas[] = CalculateAreas.func(shapes);

        for (double a : areas) {
            if(a>1)
            System.out.println("Rectangle\nArea of Rectangle = "+areas[0]);
            break;
        }

        for (double a : areas) {
            if(a>2)
                System.out.println("\nTriangle\nArea of Triangle = "+areas[1]);
            break;
        }

        for (double a : areas) {
            if(a>3)
                System.out.println("\nCircle\nArea of Circle = "+areas[2]);
            break;
        }
    }
}

