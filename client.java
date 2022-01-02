//client.java

import java.lang.*;
import java.rmi.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;


public class client extends JFrame {
	TextField t1 = new TextField(5000); //defaul = 1800
	TextField t2 = new TextField(5000); //defaul = 1800
	Label rs = new Label("HASIL = ");
	JButton b = new JButton("TAMBAH");
	JButton c = new JButton("KALi");
	JButton d = new JButton("BAGI");
	JButton e = new JButton("KURANGI");
	JButton f = new JButton("MODULUS");
	JButton g = new JButton("PANGKAT");
	 
	Panel p = new Panel(new GridLayout(4,1,5,5));
RemoteInterface s;

public client() {
super("Client Side");
setSize(700, 400); //width, height
setLocation(300, 300);
setPreferredSize(new Dimension(520,500));
getContentPane().setBackground(Color.BLUE);
getContentPane().setForeground(Color.BLACK);
getContentPane().add(p, "North");
b.setBackground(Color.BLACK);
b.setForeground(Color.WHITE);
c.setBackground(Color.BLACK);
c.setForeground(Color.WHITE);
t1.setBackground(Color.WHITE);
rs.setForeground(Color.WHITE);

p.add(t1);
p.add(t2);
p.add(rs);
p.add(b);
p.add(c);
p.add(d);
p.add(e);
p.add(f);
p.add(g);
 

try {
	String ipp = JOptionPane.showInputDialog("Masukan Ip Address server");
	String ip = "rmi://" + ipp + "/RMIAPPLICATION";
s= (RemoteInterface) Naming.lookup(ip);
		} catch(Exception Exp)
	{ JOptionPane.showMessageDialog(null, Exp.getMessage());
}


b.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent evt) {
	int a = Integer.parseInt(t1.getText());
	int b = Integer.parseInt(t2.getText());
 
	try {
		int r = s.add(a,b);
		 
	 
		 
	 
rs.setText("Sum of two no= " + r);
 
} 	catch(Exception epx){
	
}
}
});
c.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent evt) {
	int a = Integer.parseInt(t1.getText());
	int b = Integer.parseInt(t2.getText());
 
	try {
	 
		int r = s.kali(a,b);
	 
		 
	 
 
		rs.setText("Sum of two no= " + r);
 
} 	catch(Exception epx){

}
}
});
d.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent evt) {
	int a = Integer.parseInt(t1.getText());
	int b = Integer.parseInt(t2.getText());
 
	try {
	 
		int r = s.bagi(a,b);
	 
		 
	 
 
		rs.setText("Sum of two no= " + r);
 
} 	catch(Exception epx){

}
}
});
e.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent evt) {
	int a = Integer.parseInt(t1.getText());
	int b = Integer.parseInt(t2.getText());
 
	try {
	 
		int r = s.kurang(a,b);
	 
		 
	 
 
		rs.setText("Sum of two no= " + r);
 
} 	catch(Exception epx){

}
}
});
f.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent evt) {
	int a = Integer.parseInt(t1.getText());
	int b = Integer.parseInt(t2.getText());
 
	try {
	 
		int r = s.kurang(a,b);
	 
		 
	 
 
		rs.setText("Sum of two no= " + r);
 
} 	catch(Exception epx){

}
}
});
g.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent evt) {
	int a = Integer.parseInt(t1.getText());
	int b = Integer.parseInt(t2.getText());
 
	try {
	 
		int r = s.pangkat(a,b);
	 
		 
	 
 
		rs.setText("Sum of two no= " + r);
 
} 	catch(Exception epx){

}
}
});
}


public static void main(String args[])
{ 	client c = new client();
c.setDefaultCloseOperation(EXIT_ON_CLOSE);
c.setVisible(true);
}

}
