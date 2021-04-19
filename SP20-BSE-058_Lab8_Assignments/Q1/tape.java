public class tape extends publication {
    private int time;

    public tape(float price, String title, int time){
        super(price, title);
        this.time = time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    public int getTime(){
        return time;
    }

    public void display(){
        System.out.println("\nTape Publication" + "\nTitle of Tape ="+title + "\nprice = "+price + "\ntime = "+time);
    }


}
