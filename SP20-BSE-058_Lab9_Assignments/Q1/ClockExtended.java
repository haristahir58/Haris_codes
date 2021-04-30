public class ClockExtended extends Clock {

    public ClockExtended(String hours, String minutes, String seconds){
        super(hours, minutes, seconds);
    }

    @Override
    public void display(){
        System.out.println("Format of 24 hours is:");
        super.display();

        System.out.println("Format of 12 hours is:");
        //converting 24 hour format to 12 hour format and printing it
        int hour_1 = hours.charAt(0) - '0';
        int hour_2 = hours.charAt(1)- '0';
        int TotalHours = hour_1 * 10 + hour_2;

        String time;

        if(TotalHours <= 11)
            time = "AM";
        else
            time = "PM";
        TotalHours %= 12;

        if(TotalHours == 0) {
            System.out.print("12 hrs");
            System.out.print(" : "+minutes+" min : "+seconds+" secs");
        }
        else{
            System.out.print(TotalHours);
            System.out.print(" : "+minutes+" min : "+seconds+" secs");
        }
        System.out.println(" "+time);
    }
}
