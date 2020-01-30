
package homework_gui_a;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class HomeWork_GUI_A {
   public void ShowData(){
     
 HomeWork_GUI_A g=new HomeWork_GUI_A();
 g.ShowData();
        String input=JOptionPane.showInputDialog("please input a number"+JOptionPane.QUESTION_MESSAGE);
int aa=Integer.parseInt(input);
if (aa%2==0){
JOptionPane.showMessageDialog(null,"The number is Even"+JOptionPane.INFORMATION_MESSAGE);
} else{
JOptionPane.showMessageDialog(null,"The number is Odd"+JOptionPane.INFORMATION_MESSAGE);
}
   JFrame f=new JFrame();  
 
 int a=JOptionPane.showConfirmDialog(f,"Try Again?");  
if(a==JOptionPane.YES_OPTION)

g.ShowData();


else{
    JOptionPane.showMessageDialog(f,JOptionPane.NO_OPTION);
      
    System.exit(0);       
       }
   }
}

    

