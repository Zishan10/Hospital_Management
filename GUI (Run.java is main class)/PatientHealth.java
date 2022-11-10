import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class PatientHealth extends JFrame implements ActionListener
{

    private JLabel l1;
    private JPanel p1,p2;
	private PosButton b1,b2;
	private String id;
    JTextPane tp = new JTextPane();
    public PatientHealth(String id)
	
	{
		super(" Hospital Patient's Health Checkup and Information Checking System ");
		this.setSize(1615,940);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(900,900));
		p1.setBackground(Color.white);
		p1.setLayout(null);
		
		p2 = new JPanel();
		p2.setSize(new Dimension(1600,200));
		p2.setBackground(new Color(109, 109, 238));
		p2.setLayout(null);
		
		Font font = new Font("",Font.BOLD,20);
        tp.setFont(font);
		
		tp.setForeground(Color.BLACK);
        tp.setBackground(new Color(55, 230, 222));
		
		JScrollPane jp = new JScrollPane(tp); 
		p1.setLayout(new BorderLayout());
		p1.add(jp);
        p1.add(jp,BorderLayout.CENTER);
		
		
		b1 = new PosButton("Logout",  new Color(250, 160, 0), new Color(238, 63, 15));
		b1.setForeground(Color.black);
		b1.setFont(new Font("Calibri",Font.PLAIN,25));
		b1.setBounds(1000,730,150,50);
		b1.addActionListener(this);
        p2.add(b1);
		
		b2 = new PosButton("EXIT",  new Color(250, 160, 0), new Color(238, 63, 15));
		b2.setForeground(Color.black);
		b2.setFont(new Font("Calibri",Font.PLAIN,30));
		b2.setBounds(1400,730,100,50);
		b2.addActionListener(this);
        p2.add(b2);
		
		this.id=id;
		this.add(p1);
		this.add(p2);
		
		
		   try{
            File file = new File(id+".txt");
            FileReader fr = new FileReader(file);
            while(fr.read() != -1){
             tp.read(fr,null);
            }
			
            fr.close();
        } catch(Exception ex){
          ex.printStackTrace();
        }
			
    }
	
	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{	
				
			    image main = new image();
				this.setVisible(false);
				main.setVisible(true);
			}			
			else if(ae.getSource()==b2)
			{
				System.exit(0);
			}
		}
}