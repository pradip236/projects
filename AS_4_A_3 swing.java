import java.awt.*;
import java.awt.event.*;
public class AS_4_A_3 extends KeyAdapter
{
Frame f;
Label l;
TextArea t;
AS_4_A_3()
{
f=new Frame("Count words and characters");
l=new Label();
l.setBounds(20,50,200,20);
t=new TextArea();
t.setBounds(20,80,300,300);
t.addKeyListener(this);
f.add(l);f.add(t);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
public void keyReleased(KeyEvent e)
{
String text=t.getText();
String words[]=text.split("\\s");
l.setText("Words: "+words.length+ "characters: "+text.length());
}
public static void main(String args[])
{
new AS_4_A_3();
}
}
