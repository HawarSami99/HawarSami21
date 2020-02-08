
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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;






public class LB  extends JFrame{
    //ImageIcon bo danani rasm bakardet bo sar Button w Label
ImageIcon icon1 = new ImageIcon("D:\\white.png"); ImageIcon icon2 = new ImageIcon("D:\\icon-256x256.png");
ImageIcon icon3 = new ImageIcon("D:\\library-png-1.png"); ImageIcon icon4 = new ImageIcon("D:\\search.png");
  ImageIcon icon5 = new ImageIcon("D:\\book-shop-bookstore-book-store-icon-4.jpg"); ImageIcon icon6 = new ImageIcon("D:\\Capture.jpg");
//Buttons part
JButton b1=new JButton(icon1); JButton b2=new JButton(icon2);JButton b3=new JButton(icon3);  
 JButton b4=new JButton(icon4); JButton b5=new JButton(icon5);JButton b6=new JButton(icon6);



//Labels Part
JLabel L1=new JLabel("New Books");JLabel L2=new JLabel("Authors");JLabel L3=new JLabel("Last Books");
JLabel L4=new JLabel("Search");JLabel L5=new JLabel("$tore");JLabel L6=new JLabel("Facebook");
JLabel L7=new JLabel("Library Management of University"); 

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
                   


M1.setBounds(0,0, 40, 20);M2.setBounds(40,0, 40, 20);M3.setBounds(80,0, 80, 20);
//setBounds for (Labels)
L1.setBounds(100,400,220,200);L2.setBounds(450,400,220,200);L3.setBounds(770,400,220,200);
L4.setBounds(100,750,220,200);L5.setBounds(450,750,220,200);L6.setBounds(790,750,220,200);
L7.setBounds(220,0,600,200);



Font f=new Font("Arial",Font.BOLD,24);
L1.setFont(f);L2.setFont(f);L3.setFont(f);L4.setFont(f);L5.setFont(f);L6.setFont(f);L7.setFont(f);
Font fo=new Font("Arial",Font.BOLD,32);
L7.setFont(fo);



setLayout(null);

     
 //add buttons
c.add(b1); c.add(b2); c.add(b3); c.add(b4);c.add(b5); c.add(b6);
//add Menu Item
c.add(M1);c.add(M2);c.add(M3);
//add Label
c.add(L1);c.add(L2);c.add(L3);c.add(L4);c.add(L5);c.add(L6);c.add(L7);

      

b1.addActionListener(new LB2());b2.addActionListener(new LB2());b3.addActionListener(new LB2());
b4.addActionListener(new LB2());b5.addActionListener(new LB2());


   }

    public static void main(String[] args) {
       LB L= new LB();
             L.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
             
 L.setVisible(true);

    }

      //am Class LB2 bkardet bo te krdni nrxakani bo naw class LB
 //ba static da  aneyn bo away btwanin nrxakan share akayn la newan buttoni tr
    static public class LB2 extends JFrame implements ActionListener{
       
         public void actionPerformed(ActionEvent e){
           
 setTitle("Library");         
 setVisible(true);
  setBounds(500,500,1020,900);
          
 Container c=getContentPane();
 setLayout(null);
 //JButton bo dwam JPanel=Or=>Container
JButton b1=new JButton("Get in"); JButton b2=new JButton("Get in");JButton b3=new JButton("Get in");  
 JButton b4=new JButton("Get in"); JButton b5=new JButton("Get in");JButton b6=new JButton("Get in");
 JButton b7=new JButton("Get in");JButton b8=new JButton("Get in");JButton b9=new JButton("Get in"); 
 JButton b10=new JButton("Get  in");JButton b11=new JButton("Exit");JButton b12=new JButton("Cancel");
JButton b13=new JButton("Get in");JButton b14=new JButton("Get in");

//SetBound bo dwam JPanel=Or=>Container
b1.setBounds(40,200,100,40); b2.setBounds(270,200,100,40);b3.setBounds(550,200,100,40);
b4.setBounds(40, 400, 100, 40);b5.setBounds(270, 400, 100, 40);b6.setBounds(550,400,100,40);
b7.setBounds(40, 650, 100,40);b8.setBounds(270, 650, 100, 40);b9.setBounds(800,400, 100, 40);
b10.setBounds(800, 200, 100, 40);b11.setBounds(700,790,100,30);b12.setBounds(830,790,100,30);
b13.setBounds(550,650,100,40);b14.setBounds(800,650,100,40);
//te krdni buttons bo naw Container
 c.add(b1); c.add(b2); c.add(b3); c.add(b4); c.add(b5); c.add(b6);c.add(b7);c.add(b8);c.add(b9);
 c.add(b10); c.add(b11);c.add(b12);c.add(b13);c.add(b14);

 //JLable Parts bonaw Containera dwam
 
   
 ;
 JLabel L1=new JLabel("Hi"); JLabel L2=new JLabel("HI"); JLabel L3=new JLabel("HI"); JLabel L4=new JLabel("HI");
 JLabel L5=new JLabel("HI"); JLabel L6=new JLabel("HI"); JLabel L7=new JLabel("HI"); JLabel L8=new JLabel("HI");
 JLabel L9=new JLabel("HI"); JLabel L10=new JLabel("HI"); JLabel L13=new JLabel("HI");JLabel L14=new JLabel("HI");
 L1.setBounds(40,40,100,40); L2.setBounds(270,40,100,40);L3.setBounds(550,40,100,40);
L4.setBounds(800, 40, 100, 40);L5.setBounds(40,300, 100, 40);L6.setBounds(550,40,100,40);
L7.setBounds(550, 300, 100,40);L8.setBounds(800, 300, 100, 40);L9.setBounds(40,500, 100, 40);
 L10.setBounds(270, 500, 100, 40);L13.setBounds(550,500,100,40);L14.setBounds(800,500,100,40);
 
 c.add(L1); c.add(L2); c.add(L3); c.add(L4); c.add(L5); c.add(L6);c.add(L7);c.add(L8);c.add(L9);
  c.add(L10); c.add(L13); c.add(L14);
  b1.addActionListener(new LB3());  b2.addActionListener(new LB3()); b3.addActionListener(new LB3());
   b4.addActionListener(new LB3()); b5.addActionListener(new LB3()); b6.addActionListener(new LB3());
 b7.addActionListener(new LB3());b8.addActionListener(new LB3());b9.addActionListener(new LB3());
 b10.addActionListener(new LB3());b13.addActionListener(new LB3());b14.addActionListener(new LB3());
        }

     
       
    }
 //am Class LB3 bkardet bo te krdni nrxakani bo naw class LB2
 //ba static da  aneyn bo away btwanin nrxakan share akayn la newan buttoni tr
 static public class LB3 extends JFrame implements ActionListener{
 public void actionPerformed(ActionEvent H){
 setTitle("Welcome");          
 setVisible(true);
  setBounds(500,500,1020,900);
            
 Container c=getContentPane();
 setLayout(null);
JTextField T=new JTextField(20);
  T.setBounds(0,0,1000,900);
  Font f2=new Font("Arial",Font.BOLD,24);
  T.setFont(f2);
 c.add(T);

    }
     }
 
}


  

