import javax.swing.*;
import java.awt.event.*;
import java.io.*;
//import java.awt.event.ActionListener;

public class NameMatch{



public static void main( String args[] ){



JFrame f = new JFrame("Easy Tracking");
f.setSize(500,500);
f.setLayout(null);
f.setVisible(true);

f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



JLabel a = new JLabel("Enter Name: ");
a.setBounds(50,20,100,150);
f.add(a);

JTextField b = new JTextField(250);
b.setBounds(130,80,100,30);
f.add(b);

JLabel p = new JLabel("Password: ");
p.setBounds(50,30,150,200);
f.add(p);

JPasswordField x = new JPasswordField(250);
x.setBounds(130,120,100,30);
f.add(x);


JButton y = new JButton("Login");
y.setBounds(130,160,100,40);
f.add(y);

y.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){

 String name = b.getText();

        char[] pa = x.getPassword();

        String pass = new String(pa);




if(name.equals(name) ){

f.setVisible(false);
JFrame f1 = new JFrame("WELCOME");
f1.setSize(500,500);
f1.setLayout(null);
f1.setVisible(true);

f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JLabel p1 = new JLabel("Welcome to your Portal");
p1.setBounds(5,1,150,200);
f1.add(p1);


JButton y1 = new JButton("Add New Order");
y1.setBounds(130,120,140,40);
f1.add(y1);

y1.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){


}


}


 );




JButton y2 = new JButton("Track Order");
y2.setBounds(130,170,140,40);
f1.add(y2);

y2.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){

f1.setVisible(false);
JFrame f2 = new JFrame("Track Order");
f2.setSize(500,500);
f2.setLayout(null);
f2.setVisible(true);

f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


JLabel log1 = new JLabel("Enter Details:");
log1.setBounds(100,90,170,250);
f2.add(log1);



}


}


 );


JButton y3 = new JButton("Pending Payments");
y3.setBounds(130,220,140,40);
f1.add(y3);

y3.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){


}


}


 );


JButton y4 = new JButton("Received Payments");
y4.setBounds(130,270,140,40);
f1.add(y4);

y4.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){


}


}


 );
JButton y5 = new JButton("Track by Image");
y5.setBounds(130,320,140,40);
f1.add(y5);

y5.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){




}
}
);

JButton y6 = new JButton("Logout");
y6.setBounds(130,370,140,40);
f1.add(y6);

y6.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){

//System.exit(1);
f1.setVisible(false);

f.setVisible(true);

}


}


 );
}

else

{

JLabel log1 = new JLabel("Enter correct name");
log1.setBounds(100,90,170,250);
f.add(log1);


}

}
}


);

}



}