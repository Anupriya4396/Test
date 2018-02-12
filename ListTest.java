import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

class ListTest extends MouseAdapter implements ListSelectionListener , ActionListener
{
	JFrame fr1,fr2;
	JList list1,list2;
	JScrollPane pane1,pane2;
	DefaultListModel model1,model2;
	JButton badd,bget;
	JLabel lb1,lb2,lb3;
	int price[]={1500,800,4500,5000};
	String values[];	
	ListTest()
	{
		fr1=new JFrame();
		fr2=new JFrame();
		fr1.setLayout(new FlowLayout());
		fr2.setLayout(new FlowLayout());

		values=new String[]{"Keyboard","Mouse","HD","Monitor"};	
		model1=new DefaultListModel();
		for(int i=0 ; i<values.length ; i++)
			model1.addElement(values[i]);			
		list1=new JList(model1);
		pane1=new JScrollPane(list1);

		model2=new DefaultListModel();
		list2 = new JList(model2);
		pane2=new JScrollPane(list2);		
					   // W   H
		pane1.setPreferredSize(new Dimension(100,250));
		pane2.setPreferredSize(new Dimension(100,250));

		badd=new JButton("Add");
		bget=new JButton("Get Bill");
			
		lb1=new JLabel("double click to remove");
		lb2=new JLabel();
		lb3=new JLabel();
		
		lb2.setPreferredSize(new Dimension(300,50));
		lb3.setPreferredSize(new Dimension(300,50));

		fr1.add(pane1);
		fr1.add(badd);
		fr1.add(pane2);
		fr1.add(lb1);
		fr1.add(lb2);
		fr1.add(bget);
		
		badd.addActionListener(this);
		bget.addActionListener(this);

		list1.addListSelectionListener(this);
		list2.addMouseListener(this);
	
		fr2.add(lb3);
		fr1.setSize(400,400);
		fr1.setVisible(true);
		fr2.setSize(300,300);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==badd)
		{
			Object values[]=list1.getSelectedValues();
			for(int i=0 ; i<values.length ;i++ )	
			{
				model2.addElement(values[i]);
			}
		}
		if(e.getSource()==bget)
		{
			int i=0,bill=0;
			while(true)
			{
				try
				{
				String str=(String)model2.getElementAt(i);			
				int index=model1.indexOf(str);
				bill=bill + price[index];
				i++;
				}
				catch(ArrayIndexOutOfBoundsException ee)
				{
					break; // to break the loop
				}
			}
			lb3.setText("Total Paybale amount:  "+bill);
			fr2.setVisible(true);
		}
	}
	public void valueChanged(ListSelectionEvent e)
	{
		int i=list1.getSelectedIndex();
		lb2.setText("Price of Selected Item:  "+price[i]);
	}	
	public void mouseClicked(MouseEvent e)
	{
		if(e.getSource()==list2)
		{
		System.out.println("mouse clicked");
			if(e.getClickCount()==2)
			{
	model2.removeElement(list2.getSelectedValue());
			}
		}
	}		
	public static void main(String s[])
	{
		new ListTest();
	}
}			
	