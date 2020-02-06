
package library.GUI;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;







public class LB  extends JFrame{
//Buttons part
JButton b1=new JButton("New Books"); JButton b2=new JButton("Author");JButton b3=new JButton("Last Books");  
 JButton b4=new JButton("Search"); JButton b5=new JButton("$tore");JButton b6=new JButton("About");
 JButton b7=new JButton("Exit");JButton b8=new JButton("Cancel");


//Labels Part
JLabel L1=new JLabel("New Books");JLabel L2=new JLabel("Authors");JLabel L3=new JLabel("Last Books");
JLabel L4=new JLabel("Search");JLabel L5=new JLabel("$tore");JLabel L6=new JLabel("About");
JLabel L7=new JLabel("University Library Management"); 
//JPassword 
     //JMenuItem
    JMenuItem M1=new  JMenuItem("File"); JMenuItem M2=new JMenuItem("Edit"); 
   JMenuItem M3=new JMenuItem("Views"); 
  
 
    LB(){   

    //Title for GUI
  setTitle("Library Management");
  //Container 
 Container c=getContentPane();

 // setBounds 
 setBounds(500,500,1020,990);
    
 //setBounds for(Buttons)
 //b1 for New Books            //b2 for Author                b3 for Last Books
 b1.setBounds(40,250,220,200); b2.setBounds(370,250,220,200);b3.setBounds(700,250,220,200);
 //b4 for Search                //b5 for Store                   //b6 for About
b4.setBounds(40, 600, 220, 200);b5.setBounds(370, 600, 220, 200);b6.setBounds(700,600,220,200);
//b7 for Sign in           //b8 for sign Up                          //b9 for Exit
b7.setBounds(800,900,90,30);
//b10 for Cancel
b8.setBounds(900,900,90,30);

M1.setBounds(0,0, 40, 20);M2.setBounds(40,0, 40, 20);M3.setBounds(80,0, 80, 20);
//setBounds for (Labels)
L1.setBounds(100,400,220,200);L2.setBounds(450,400,220,200);L3.setBounds(770,400,220,200);
L4.setBounds(100,750,220,200);L5.setBounds(450,750,220,200);L6.setBounds(790,750,220,200);
L7.setBounds(220,0,500,200);



Font f=new Font("Arial",Font.BOLD,24);
L1.setFont(f);L2.setFont(f);L3.setFont(f);L4.setFont(f);L5.setFont(f);L6.setFont(f);L7.setFont(f);
Font fo=new Font("Arial",Font.BOLD,32);
L7.setFont(fo);



setLayout(null);

     
 //add buttons
c.add(b1); c.add(b2); c.add(b3); c.add(b4);c.add(b5); c.add(b6);c.add(b7);c.add(b8);
//add Menu Item
c.add(M1);c.add(M2);c.add(M3);
//add Label
c.add(L1);c.add(L2);c.add(L3);c.add(L4);c.add(L5);c.add(L6);c.add(L7);

      

b1.addActionListener(new LB2());b2.addActionListener(new LB2());b3.addActionListener(new LB2());
b4.addActionListener(new LB2());b5.addActionListener(new LB2());b6.addActionListener(new LB2());
b7.addActionListener(new LB2());

   }

    public static void main(String[] args) {
       LB L= new LB();
             L.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
             
 L.setVisible(true);

    }

      //am Class LB2 bkardet bo te krdni nrxakani bo naw class LB
    static public class LB2 extends JFrame implements ActionListener{
       
         public void actionPerformed(ActionEvent e){
                   setTitle("Library");
                
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
             
 setVisible(true);
  setBounds(500,500,1020,900);
            
 Container c=getContentPane();
 setLayout(null);
 
JButton b1=new JButton(""); JButton b2=new JButton("");JButton b3=new JButton("");  
 JButton b4=new JButton(""); JButton b5=new JButton("");JButton b6=new JButton("");
 JButton b7=new JButton("");JButton b8=new JButton("");JButton b9=new JButton("");

 b1.setBounds(40,40,220,200); b2.setBounds(370,40,220,200);b3.setBounds(700,40,220,200);

b4.setBounds(40, 300, 220, 200);b5.setBounds(370, 300, 220, 200);b6.setBounds(700,300,220,200);

b7.setBounds(40, 550, 220, 200);b8.setBounds(370, 550, 220, 200);b9.setBounds(700, 550, 220, 200);

 c.add(b1); c.add(b2); c.add(b3); c.add(b4); c.add(b5); c.add(b6);c.add(b7);c.add(b8);c.add(b9);

  b1.addActionListener(new LB3());  b2.addActionListener(new LB3()); b3.addActionListener(new LB3());
   b4.addActionListener(new LB3()); b5.addActionListener(new LB3()); b6.addActionListener(new LB3());
 
        }

     
       
    }
    //am Class LB3 bkardet bo te krdni nrxakani bo naw class LB2
     static public class LB3 extends JFrame implements ActionListener{
       
         public void actionPerformed(ActionEvent H){
                   setTitle("Library");
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
             
 setVisible(true);
  setBounds(500,500,1020,900);
            
 Container c=getContentPane();
 setLayout(null);
JTextField T=new JTextField(20);
  T.setBounds(0,0,1000,900);
 c.add(T);

    }
     }
 
}


  

