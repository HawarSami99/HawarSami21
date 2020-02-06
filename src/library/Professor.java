
package library;

public class Professor extends Person {
    Professor(String Firstname,String Lastname,String ID,String Takebook){
        super(Firstname,Lastname, ID,Takebook);
    }
    public void show(){
        System.out.println("professors Detail:");
 
        super.show();
    }
    
    public static void main(String[] args) {
        Professor p=new Professor("Peter","Galiton","1","10 Books");
        p.show();
    }
    
}
