
package library;

public class Author {
  private Book[] author=new Book[10];
  Author(Book [] a){
      this.author=a;
  }
  public void getBook(){
      for (int i = 0; i < author.length; i++) {
          System.out.println("Author is:"+author[i].getname());
          
      }
  }
}
