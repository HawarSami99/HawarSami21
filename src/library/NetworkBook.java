
package library;

public class NetworkBook implements Book1{
    String IssueDate;
    String Author;
    String Title;
    String edition;
    int doi;
   public NetworkBook(String IssueDate,String Author,String Title,String edition,int doi){
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
        NetworkBook n=new NetworkBook("","","","",2);
        n.issueDate("England");
        n.author("Wendell Odom");
        n.title("CCENT and CCNA");
        n.Edition("third edition");
        n.DOI(2);
       n.show();
    }



}
