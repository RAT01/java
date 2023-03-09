import java.awt.*;
import java.awt.event.*;
class AwtMaths extends Frame implements ActionListener
{
	TextField tf1, tf2;
	Button btnAdd, btnSub,btnMul,btnDiv,btnClear; 
	Label n,l1,l2,r;
	AwtMaths()
	{
	n = new Label("AWT Basic Maths Calculator Program");
	l1 = new Label ("Enter First number");
	l2 = new Label ("Enter Second number");
	r = new Label();
	tf1 = new TextField(); 
	tf2 = new TextField();
	btnAdd=new Button("Add");
	btnSub = new Button("Sub");
	btnMul = new Button("Mult");
	btnDiv = new Button("Div");
	btnClear = new Button("Clear");
	n.setBounds(50, 40, 250, 20);
	l1.setBounds(50, 70, 150, 20); 
	tf1.setBounds (50, 90, 190, 30);
	l2.setBounds(50, 120, 150, 20);
	tf2.setBounds(50, 140, 190, 30); 
	btnAdd.setBounds(50, 180, 50, 30);
	btnSub.setBounds (100, 180, 50, 30);
	btnMul.setBounds (150, 180, 50, 30);
	btnDiv.setBounds (200, 180, 50, 30);
	btnClear.setBounds (250, 180, 50, 30);
	r.setBounds(50, 220, 200, 20);
	add(n);
	add(l1);
	add(tf1);
	add (l2);
	add(tf2);
	add(btnAdd);
	add(btnSub);
	add(btnMul);
	add(btnDiv);
	add (btnClear);
	add(r);
	setSize(350,280);
	setLayout(null);//no layout manager
	setVisible(true);//now frame will be visible, by default not visible
	btnAdd.addActionListener(this); btnSub.addActionListener(this);
	btnMul.addActionListener(this); btnDiv.addActionListener(this);
	btnClear.addActionListener(this);
	addWindowListener(new WindowAdapter()
{
	public  void windowClosing(WindowEvent e)
{
	dispose();
}
});
}
	public void actionPerformed (ActionEvent e)
{
int num1 = Integer.parseInt(tf1.getText());
int num2 = Integer.parseInt(tf2.getText());
int result;
if(e.getSource() ==btnAdd)
{
	result=num1+num2;
	r.setText("Addition is "+result);
}
if(e.getSource() ==btnSub)
{
	result=num1-num2;
	r.setText("Subtraction is "+result);
}
if(e.getSource() ==btnMul)
{
result=num1* num2;
r.setText("Multiplication is "+result);
}
if(e.getSource() ==btnDiv)
{
result=num1/num2;
r.setText("Division is "+result);
}
if(e.getSource() ==btnClear)
{
r.setText("");
tf1.setText("");
tf2.setText("");
}
}
	public static void main(String[] args) 
	{ 
	   new AwtMaths();
	} 
}
