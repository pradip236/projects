import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AS_4_A_2 extends JFrame
{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,ln,ld1,ld2,lv;

JRadioButton r1,r2,r3;
JCheckBox c1,c2;
JTextField t1;
ButtonGroup b1;
JPanel p1,p2,p3;
static int cnt;
private StringBuffer s1=new StringBuffer();

AS_4_A_2()
{
b1=new ButtonGroup();
p1=new JPanel();
p2=new JPanel();
p3=new JPanel();
r1=new JRadioButton("Covidshield");
r2=new JRadioButton("Covaxin");
r3=new JRadioButton("Sputnik");

b1.add(r1);
b1.add(r2);
b1.add(r3);

c1=new JCheckBox("1st Dose");
c2=new JCheckBox("2st Dose");

l1=new JLabel("Your Name:");
l2=new JLabel("Dose:");
l3=new JLabel("Vaccine:");
l4=new JLabel("Vaccination Details:");
JLabel lb=new JLabel();
t1=new JTextField();
p1.add(l4);
p2.setLayout(new GridLayout(5,2));
p2.add(l1);p2.add(t1);
p2.add(l2);p2.add(l3);
p2.add(c1);p2.add(r1);
p2.add(c2);p2.add(r2);
p2.add(lb);p2.add(r3);
p3.setLayout(new FlowLayout());
l5=new JLabel("Name:  ");
ln=new JLabel();
l6=new JLabel("1st Dose:  ");
ld1=new JLabel();
l7=new JLabel("2nd Dose:  ");
ld2=new JLabel();
l8=new JLabel("Vaccine:  ");
lv=new JLabel();
p3.add(l5);p3.add(ln);
p3.add(l6);p3.add(ld1);
p3.add(l7);p3.add(ld2);
p3.add(l8);p3.add(lv);
setLayout(new BorderLayout());
add(p1,BorderLayout.NORTH);
add(p2,BorderLayout.CENTER);
add(p3,BorderLayout.SOUTH);

setSize(400,400);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[])
{
AS_4_A_2 s=new AS_4_A_2();
}
}
