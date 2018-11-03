import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class Cal extends JFrame implements ActionListener{

JFrame myframe;

JButton button1 , button2 , button3 , button4 , button5 ;

JTextField myfield , myfield1 , myfield2;

public Cal(){




       myframe = new JFrame("Calc");
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
myframe.setLayout(null);
        myframe.setVisible(true);
        myframe.setSize(800, 800);



      
myfield = new JTextField(20);
myfield.setBounds(130,100,100,30);
myframe.add(myfield); 
     
myfield1 = new JTextField(20);
myfield1.setBounds(130,130,100,30);
myframe.add(myfield1);

myfield2 = new JTextField(20);
myfield2.setBounds(130,160,100,30);
myfield2.setEditable(false);
myframe.add(myfield2);  
      
        
     button1 = new JButton("+");
button1.setBounds(400,80,50,30);
        myframe.add(button1);
        
         button2 = new JButton("-");
 button2.setBounds(450,80,50,30);
        myframe.add(button2);
        
         button3 = new JButton("*");
button3.setBounds(500,80,50,30);
        myframe.add(button3);
        
         button4 = new JButton("/");
button4.setBounds(550,80,50,30);
        myframe.add(button4);
        
      button5 = new JButton("%");
button5.setBounds(600,80,50,30);
        myframe.add(button5);
        
        

}

public void actionPerformed(ActionEvent e){

int c=0;

String s1 = myfield.getText();

String s2 = myfield1.getText();

int a = Integer.parseInt(s1);

int b = Integer.parseInt(s2);


if(e.getSource() == button1){


c= a+b;

}


else if(e.getSource() == button2){

c= a-b;

}

else if(e.getSource() == button3){

c= a*b;

}

else if(e.getSource() == button4){

c= a/b;

}

else if(e.getSource() == button5){

c= a%b;

}


String result = String.valueOf(c);

myfield2.setText(result);

}

    


public static void main(String[] args) {

Cal c = new Cal();

//c.Cal();
       
       


    }
}
