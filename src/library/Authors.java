
package library;

public class Authors {
    public static void main(String[] args) {
         Book bk[]=new Book[4]; 
         bk[0]= new Book("java","Bruce Tate","USA");
         bk[1]= new Book("Network","Wendell Odom","England");
         bk[2]= new Book("Web Design","Jon Duckett","USA");
         bk[3]= new Book("Physic","John Holland ","USA");
         Author a=new Author(bk);
         System.out.println("Book of Author");
         a.getBook();
   
    }
}
