//mouse listner motion listener key listeners window listners
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JRadioButton;
import javax.swing.JFrame;

import javax.swing.JTextField;



public class Radio extends JFrame implements ActionListener{

JFrame myframe;

JRadioButton button1 , button2 ;

JTextField myfield;



public Radio(){




       myframe = new JFrame("Calc");
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
myframe.setLayout(null);
        myframe.setVisible(true);
        myframe.setSize(800, 800);



     
        
     button1 = new JRadioButton("Mphil");
button1.setBounds(400,80,50,30);
        myframe.add(button1);
        
         button2 = new JRadioButton("MCS");
 button2.setBounds(450,80,50,30);
        myframe.add(button2);

myfield = new JTextField(20);
myfield.setBounds(130,100,100,30);
myframe.add(myfield); 
        
        

}

public void actionPerformed(ActionEvent e){






if(e.getSource() == button1){


myfield.setText("Mphil is selected");

}


else if(e.getSource() == button2){

myfield.setText("MCS is selected");

}


}

    


public static void main(String[] args) {

Radio c = new Radio();

//c.Cal();
       
       


    }
}
