public class Runner16 {
    public static void main(String[] args) {
        // Displaying Computer

        Computer comp = new Computer(64,1,1,1800);
        comp.display();

        // Displaying Laptop

        Laptop lap = new Laptop(32,2,2,3500,14,11,7,2);
        lap.display();
    }
}
