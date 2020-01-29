
package homework_gui_a;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class HomeWork_GUI_A {
   public void checkEO(){
     
 HomeWork_GUI_A g=new HomeWork_GUI_A();
 g.checkEO();
        String input=JOptionPane.showInputDialog("please input a number");
int aa=Integer.parseInt(input);
if (aa%2==0){
JOptionPane.showMessageDialog(null,"The number is Even"+JOptionPane.INFORMATION_MESSAGE);
} else{
JOptionPane.showMessageDialog(null,"The number is Odd"+JOptionPane.INFORMATION_MESSAGE);


    JFrame frame = new JFrame();
    String message = "Try another Number?";
    int answer = JOptionPane.showConfirmDialog(frame, message);
    while (answer == JOptionPane.YES_OPTION) {
g.checkEO();


}
       while (answer == JOptionPane.NO_OPTION) {
    System.exit(0);       
       }
   }
}
}
    

