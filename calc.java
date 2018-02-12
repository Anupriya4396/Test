import java.awt.*;
class calc
{
	Frame fr;
	TextField tf;
	calc()
	{
	fr = new Frame("Calculator");
	fr.setLayout(null);
	Button b[] = new Button[16];
	String str[] = {"1","2","3","+","4","5","6","-","7","8","9","*",".","0","=","/"};
	tf = new TextField();
	tf.setBounds(20, 40, 110, 60);
	for(int i=0; i<b.length; i++)
	{
		b[i] = new Button(str[i]);
	}
	int count=0, x=20, y=110;
	for(int i=0; i<4; i++)
	{
		x = 20;
		for(int j=0; j<4; j++)
		{
			b[count].setBounds(x, y , 20, 20);
			x = x + 30;
			count = count + 1; 
		}
		y = y + 30;
	}
	for(int i=0; i<b.length; i++)
	{
		fr.add(b[i]);
	}
	fr.add(tf);
	fr.setSize(150, 230);
	fr.setVisible(true);
	}
	public static void main(String s[])
	{
		new calc();
	}
}