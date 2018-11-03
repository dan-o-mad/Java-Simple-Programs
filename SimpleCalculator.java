import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class SimpleCalculator {


static int a=0;
static int c=0;


    


public static void main(String[] args) {


       
       int sub;
      int sum;
       JFrame myframe = new JFrame("CalcuLator");
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);
        myframe.setSize(340, 240);
// myframe.setLayout(new GridLayout(5, 3, 2, 2));

        myframe.setLayout(new FlowLayout());
        final JTextField myfield = new JTextField(20);
        myframe.add(myfield);
        
        JButton button0 = new JButton("0");
        myframe.add(button0);
        
        JButton button1 = new JButton("1");
        myframe.add(button1);
        
        JButton button2 = new JButton("2");
        myframe.add(button2);
        
        JButton button3 = new JButton("3");
        myframe.add(button3);
        
        JButton button4 = new JButton("4");
        myframe.add(button4);
        
        JButton button5 = new JButton("5");
        myframe.add(button5);
        
        JButton button6 = new JButton("6");
        myframe.add(button6);
        
        JButton button7 = new JButton("7");
        myframe.add(button7);
        
        JButton button8 = new JButton("8");
        myframe.add(button8);
        
        JButton button9 = new JButton("9");
        myframe.add(button9);

        JButton button10 = new JButton("Clear");
        myframe.add(button10);

        JButton button11 = new JButton("+");
        myframe.add(button11);

        JButton button12 = new JButton("-");
        myframe.add(button12);

        JButton button13 = new JButton("x");
        myframe.add(button13);

        JButton button14 = new JButton("/");
        myframe.add(button14);



        JButton button15 = new JButton("=");
        myframe.add(button15);

        button0.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                //       JOptionPane.showMessageDialog( null, "HELLO" );
                myfield.setText(myfield.getText()+"0");
            }
        });


        button1.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
                //       JOptionPane.showMessageDialog( null, "HELLO" );
                myfield.setText(myfield.getText()+"1");
            }
        });


        button2.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                //       JOptionPane.showMessageDialog( null, "HELLO" );
                myfield.setText(myfield.getText()+"2");
            }
        });


        button3.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                //       JOptionPane.showMessageDialog( null, "HELLO" );
                myfield.setText(myfield.getText()+"3");
            }
        });


        button4.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                //       JOptionPane.showMessageDialog( null, "HELLO" );
                myfield.setText(myfield.getText()+"4");
            }
        });


        button5.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                //       JOptionPane.showMessageDialog( null, "HELLO" );
                myfield.setText(myfield.getText()+"5");
            }
        });


        button6.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                //       JOptionPane.showMessageDialog( null, "HELLO" );
                myfield.setText(myfield.getText()+"6");
            }
        });


        button7.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                //       JOptionPane.showMessageDialog( null, "HELLO" );
                myfield.setText(myfield.getText()+"7");
            }
        });


        button8.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                //       JOptionPane.showMessageDialog( null, "HELLO" );
                myfield.setText(myfield.getText()+"8");
            }
        });


        button9.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                //       JOptionPane.showMessageDialog( null, "HELLO" );
                myfield.setText(myfield.getText()+"9");
            }
        });

button10.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                //       JOptionPane.showMessageDialog( null, "HELLO" );
                myfield.setText("");
            
            }
        });


        button11.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                int sum = Integer.parseInt(myfield.getText());
                c=1;
                a = sum;
                //       JOptionPane.showMessageDialog( null, "HELLO" );
                //      sum += Integer.parseInt(myfield.getText());
                       myfield.setText("");
            }
        });
        
        
         
   
        
        
        button12.addActionListener(new ActionListener()
        {
            
            public void actionPerformed(ActionEvent e)
            {
                int sub=Integer.parseInt(myfield.getText());
                c=2;
                a=sub;
                myfield.setText("");
   }});
         button13.addActionListener(new ActionListener()
        {
            
            public void actionPerformed(ActionEvent e)
            {
                int mul=Integer.parseInt(myfield.getText());
                c=3;
                a=mul;
                myfield.setText("");
   }});
          button14.addActionListener(new ActionListener()
        {
            
            public void actionPerformed(ActionEvent e)
            {
                int div=Integer.parseInt(myfield.getText());
                c=4;
                a=div;
                myfield.setText("");
   }});
       
         button15.addActionListener(
                new ActionListener(){

            
            public void actionPerformed(ActionEvent e) {
                if(c==1){
                int b=Integer.parseInt(myfield.getText());
              int sum;
                sum=a+b;
                myfield.setText(""+sum);
                }
                if(c==2){
                     int x=Integer.parseInt(myfield.getText());
                int sub;
                sub=a-x;
                myfield.setText(""+sub);
                }
                if(c==3){
                     int x=Integer.parseInt(myfield.getText());
                int mul;
                mul=a*x;
                myfield.setText(""+mul);
                }
                if(c==4){
                     int x=Integer.parseInt(myfield.getText());
                int div;
                div=a/x;
                myfield.setText(""+div);
                }
            }});    }
}
