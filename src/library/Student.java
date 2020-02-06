
package library;

public class Student extends Person{
    Student(String Firstname,String Lastname,String ID,String Takebook){
        super(Firstname,Lastname,ID,Takebook);
    
       }
    public void show(){
        
        System.out.println("Student Detail:");
        super.show();
}
    public static void main(String[] args) {
        Student s=new Student("Hawar","Sami","3","4 books");
       
        s.show();
                
    }
    
}
