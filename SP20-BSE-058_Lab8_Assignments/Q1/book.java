public class book extends publication {
    private int pageCount;

    public book(float price, String title, int pageCount){
        super(price, title);
        this.pageCount = pageCount;
    }

    public void setPageCount(int pageCount){
        this.pageCount = pageCount;
    }
    public int getPageCount(){
        return pageCount;
    }

    public void display(){
        System.out.println("Book Publication\n"+"Title of book: "+title + "\nPrice of book: "+price + "\nPage Number: "+pageCount);
    }

}
