


import java.awt.*;

import javax.swing.*;

public class AS_4_A_1

{

JFrame f=new JFrame("Login window");

AS_4_A_1()

{

JLabel l1=new JLabel("User name");

JLabel l2=new JLabel("Password");

JTextField t1=new JTextField(20);

JTextField t2=new JPasswordField(20);

JButton login=new JButton("LOGIN");

JButton end=new JButton("REGISTER");


f.setLayout(new GridLayout(3,2));

f.add(l1);
f.add(t1);
f.add(l1);

f.add(t2);
f.add(login);
f.add(end);

f.setSize(400,150);

f.setVisible(true);

}

public static void main(String args[])

{

AS_4_A_1 a=new AS_4_A_1();
}
}
