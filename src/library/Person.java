
package library;


public class Person {
 private String Firstname;
 private String Lastname;
    private String ID;
    private String Takebook;
  
    public Person(String Firstname,String Lastname, String ID,String Takebook){
        this.Firstname=Firstname;
        this.Lastname=Lastname;
        this.ID=ID;
        this.Takebook=Takebook;
    
       
    }

 
    public void show(){
        System.out.println("First name is:"+Firstname);
        System.out.println("Last name is:"+Lastname);
        System.out.println("ID is:"+ID);
        System.out.println("Can take book:"+Takebook);

    
        
    }
    
}

