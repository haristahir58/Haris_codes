public class Laptop extends Computer {
    private int length;
    private int width;
    private int height;
    private int weight;

    public Laptop(){
        super();
    }

    public Laptop(int wordSize, int memorySize, int storageSize, double speed, int length, int width, int height, int weight){
        super(wordSize,memorySize,storageSize,speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public void setLength(int length){ this.length = length; }
    public int getLength(){ return length; }

    public void setWidth(int width){ this.width = width; }
    public int getWidth(){ return width; }

    public void setHeight(int height){ this.height = height;}
    public int getHeight(){ return height;}

    public void setWeight(int weight){ this.weight = weight;}
    public int getWeight(){ return weight;}



    public void display(){
        System.out.println("\nLaptop"+"\nWord Size(in bits): "+wordSize+"\nMemory Size(in megabytes): "+memorySize+
                "\nStorage Size(in megabytes): "+storageSize+ "\nSpeed(in megahertz): "+speed+
               "Length: "+length+"\nWidth: "+width+"\nHeight: "+height+ "\nWeight: "+weight);
    }



}
