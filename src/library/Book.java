
package library;

public class Book {
 protected String bookname;
 protected String bookID;
  protected String bookPrice;
private String name;

Book(String bookname,String bookID,String bookPrice){
   this.bookname= bookname;
   this.bookID=bookID;
   this.bookPrice=bookPrice;
   
}
  public void setname(String n){
       this.name=n;
    }
  public String getname(){
      return name;
  }
  public String getbookname(){
      return bookname;
      

  }
   public String getbookID(){
       return bookID;
   }
    public String getbookPrice(){
        return bookPrice;

                 }
     public void setbookname(String bookname){
    
      this.bookname=bookname;
     }
     
     public void setbookID(String bookID){
      this.bookID=bookID;
     }
     public void setbookPrice(String bookPrice){
               this.bookPrice=bookPrice;
     }
        
    public static void main(String[] args) {
Book B=new Book("","","");
        B.setbookname("Java");
        B.setbookID("1");
        B.setbookPrice("25$");
  System.out.println("Book name is:"+B.getbookname());
      System.out.println("Book ID is:"+B.getbookID());
      System.out.println("Book Price is:"+ B.getbookPrice());

       
    }
}

