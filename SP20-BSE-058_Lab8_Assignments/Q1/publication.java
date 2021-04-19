public class publication {
    protected float price;
    protected String title;

    public publication(){

    }
    public publication(float price, String title) {
        this.price = price;
        this.title = title;
    }

    public void setPrice(float price){
        this.price = price;
    }
    public float getPrice(){
        return price;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }



}
