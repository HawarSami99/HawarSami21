
package hw1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HW1 {
public void show(){
     HW1 h = new HW1();
             String input=JOptionPane.showInputDialog("please input a number"+JOptionPane.QUESTION_MESSAGE);
int aa=Integer.parseInt(input);
if (aa%2==0)
JOptionPane.showMessageDialog(null,"The number is Even"+JOptionPane.INFORMATION_MESSAGE);
 else{
JOptionPane.showMessageDialog(null,"The number is Odd"+JOptionPane.INFORMATION_MESSAGE);
}
        JFrame frame = new JFrame();
    String message = "Try another Number?";
    int answer = JOptionPane.showConfirmDialog(frame, message);
    while (answer == JOptionPane.YES_OPTION) {
h.show();

}
       while (answer == JOptionPane.NO_OPTION) {
    System.exit(0);       
    } 
}
    public static void main(String[] args) {
  HW1 h=new HW1();
  h.show();
  
    }
    
}
