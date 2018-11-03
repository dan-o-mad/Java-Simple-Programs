import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.*;


public class AllControls{



public static void main( String args[] ){



JFrame f = new JFrame("ABC");
f.setSize(500,500);
f.setLayout(null);
f.setVisible(true);

f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



JLabel a = new JLabel("LABEL");
a.setBounds(50,20,100,150);
f.add(a);

JTextField b = new JTextField("TEXT FIELD");
b.setBounds(130,80,100,30);
f.add(b);

JLabel m = new JLabel("PASS");
m.setBounds(50,80,100,150);
f.add(m);


JPasswordField k = new JPasswordField(250);
k.setBounds(130,140,100,30);
f.add(k);

JCheckBox p = new JCheckBox("CheckBOX ");
p.setBounds(50,120,150,200);
f.add(p);

JRadioButton x = new JRadioButton();
x.setBounds(250,160,200,130);
f.add(x);


JCheckBoxMenuItem y = new JCheckBoxMenuItem("CHECK MENU");
y.setBounds(400,400,100,40);
f.add(y);

JToggleButton z = new JToggleButton("Toggle Button");
z.setBounds(300,300,100,40);
f.add(z);

JComboBox o = new JComboBox();
o.setBounds(350,250,100,40);
f.add(o);

List l = new List();
l.setBounds(350,250,100,40);
f.add(l);

Choice c = new Choice();
c.setBounds(350,250,100,40);
f.add(c);

y.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){


b.setText("TEXT FIELD");





//assignment :simple cal
//name doesnt match
//form design with all buttons and controls

}

}

 );

}



}