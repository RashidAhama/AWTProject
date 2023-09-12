package p1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class AWTDemo extends JFrame 
{
	JLabel l;
	public AWTDemo()
	{
		l=new JLabel("Nmmu Nmmu");
		l.setBounds(100, 100, 100, 50);
		add(l);
		setLayout(null);
		addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me)
			{
				int a=me.getX();
				int b=me.getY();
				l.setText(a+", "+b);
			}
		});
	}
}