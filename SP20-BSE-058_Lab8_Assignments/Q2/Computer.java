public class Computer {
    protected int wordSize;
    protected int memorySize;
    protected int storageSize;
    protected double speed;

    public Computer(){

    }

    public Computer(int wordSize, int memorySize, int storageSize, double speed){
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.speed = speed;
    }

    public void display(){
        System.out.println("Computer"+"\nWord Size(in bits): "+wordSize+"\nMemory Size(in megabytes): "+memorySize+
                "\nStorage Size(in megabytes): "+storageSize+ "\nSpeed(in megahertz): "+speed);
    }


}
