import java.awt.*;
class myFrame
{
	Frame fr;
	myFrame()
	{
		fr = new Frame("Test Frame");
		fr.setSize(400 , 300);
		fr.setVisible(true);
	}
	public static void main(String s[])
	{
		new myFrame();
	}
}