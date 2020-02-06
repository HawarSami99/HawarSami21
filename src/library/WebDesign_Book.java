
package library;

public class WebDesign_Book implements Book1{
       String IssueDate;
    String Author;
    String Title;
    String edition;
    int doi;
    public WebDesign_Book(String IssueDate,String Author,String Title,String edition,int doi){
        this.IssueDate=IssueDate;
        this.Author=Author;
        this.Title=Title;
        this.edition=edition;
        this.doi=doi;
       
     
    }
    
       public void issueDate(String issueDate){
    IssueDate=issueDate;
}
  public void author(String author){
        Author=author;
    }
     public void title(String title){
        Title=title;
    }
    public void Edition(String Edition){
        edition=Edition;
    }
    public void DOI(int DOI){
        doi=DOI;
    }
     public void show(){
         System.out.println("Book Takeout place:"+IssueDate);
         System.out.println("Book writter is:"+Author);
         System.out.println("About of Book:"+Title);
         System.out.println("Book Edition:"+edition);
         System.out.println("Book DOI:"+doi);
     
        
    }
      public static void main(String[] args) {
       WebDesign_Book w=new WebDesign_Book("","","","",3);
        w.issueDate("USA");
        w.author("Jon Duckett");
        w.title("HTML and CSS");
        w.Edition("fifth Edition");
        w.DOI(3);
       w.show();
    }

}
