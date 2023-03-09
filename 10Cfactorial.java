import java.awt.*;
import java.awt.event.*;
class AwtFactorials extends Frame implements ActionListener
{
Button btn;
TextField tf1;
Label n,lb1,r;
AwtFactorials()
{
	n= new Label("Awt factorial program");
	lb1= new Label("Enter the number");
	r= new Label();
	tf1= new TextField();
	btn= new Button("Factorial");

	n.setBounds(50,40,200,20);
	lb1.setBounds(50,70,180,20);
	tf1.setBounds(50,100,160,20);
	btn.setBounds(50,130,140,20);
	r.setBounds(50,160,120,20);

	add(n);
	add(lb1);
	add(tf1);
	add(btn);
	add(r);
	setSize(300,250);
	setLayout(null);
	setVisible(true);

	btn.addActionListener(this);
	addWindowListener(new WindowAdapter()
	{
	public void windowClosing(WindowEvent e)
	{
	dispose();
	}
	});
	}
	public void actionPerformed(ActionEvent e)
	{
	int num1 = Integer.valueOf(tf1.getText());

	int fact=1;
	while(num1>0)
	{
	fact=fact*num1;
	num1--;
	}
	r.setText("factorial is"+fact);
	}
	public static void main(String [] args)
	{
	 new AwtFactorials();
	}


	}
