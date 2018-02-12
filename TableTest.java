import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

class TableTest  implements ActionListener
{
	JTable table;
	JScrollPane pane;
	JTextField tf1,tf2,tf3,tf4;
	JButton b1,b2, sort, remove;

	DefaultTableModel model;
	
	JFrame fr1,fr2;

	TableTest()
	{
		fr1=new JFrame();
		fr2=new JFrame();
		fr1.setLayout(new FlowLayout());	
		fr2.setLayout(new FlowLayout());

		tf1=new JTextField(10);	
		tf2=new JTextField(10);
		tf3=new JTextField(10);
		tf4=new JTextField(10);

		b1=new JButton("Add Record");
		b2=new JButton("Show");
		sort=new JButton("Sort");
		remove=new JButton("Remove");
			
		fr1.add(tf1);fr1.add(tf2);fr1.add(tf3);
		fr1.add(tf4);
		fr1.add(b1);fr1.add(b2);
			
		model=new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Rollno");
		model.addColumn("Marks");	
		model.addColumn("Grade");
	
		table=new JTable(model);
		pane = new JScrollPane(table);
		pane.setPreferredSize(new Dimension(200,250));
					 //  W , H

		b2.setPreferredSize(new Dimension(100,50));		
		fr2.add(pane);
		fr2.add(sort);
		fr2.add(remove);

		fr1.setSize(300,300);
		fr2.setSize(300,300);
		fr1.setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		remove.addActionListener(this);
		sort.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String str[]=new String[4];
			str[0]=tf1.getText();
			str[1]=tf2.getText();
			str[2]=tf3.getText();
			str[3]=tf4.getText();
			model.addRow(str);

			tf1.setText("");tf2.setText("");
			tf3.setText("");tf4.setText("");	
		}
		if(e.getSource()==b2)
			fr2.setVisible(true);
		if(e.getSource()==remove)
		{
			model.removeRow(table.getSelectedRow());
		}
		if(e.getSource()==sort)
		{
			for(int i=0; i<model.getRowCount(); i++)
			{
				for(int j=i+1; j<model.getRowCount(); j++)
				{
					Object ob1 = model.getValueAt(j,4);
					Object ob2 = model.getValueAt(i,4);
					int o1 = (int)ob1;
					int o2 = (int)ob2;
					if(o1<o2)
					{
						model.moveRow(i , j-1 , i+1);
					}
				}
			}
		}
	}
	public static void main(String s[])
	{
		new TableTest();
	}
	
}
