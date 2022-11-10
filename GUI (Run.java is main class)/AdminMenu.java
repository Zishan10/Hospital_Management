import java.lang.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class AdminMenu extends JFrame implements ActionListener
{
    private JLabel l1;
    private JPanel p1;
	private PosButton b1,b2,b3,b4,b9,b10;
	
    AdminMenu()
    {
		super(" Hospital Patient's Health Checkup and Information Checking System ");
		this.setSize(1615,940);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		p1 = new JPanel();
		p1.setSize(new Dimension(3840,2160));
		p1.setBackground(new Color(157, 209, 232));
		p1.setLayout(null);
		
		ImageIcon image = new ImageIcon("AdminMenu.png");
		l1 = new JLabel(image);
		l1.setBounds(0,0,1600,900);
		p1.add(l1);
        		
		b1 = new PosButton("Insert New Patient", new Color(156, 232, 55), new Color(11, 190, 77));
		b1.setForeground(Color.black);
		b1.setFont(new Font("Calibri",Font.PLAIN,25));
		b1.setBounds(1100,100,400,50);
		b1.addActionListener(this);
        p1.add(b1);
		
		b2 = new PosButton("Remove Patient",  new Color(156, 232, 55), new Color(11, 190, 77));
		b2.setForeground(Color.black);
		b2.setFont(new Font("Calibri",Font.PLAIN,25));
		b2.setBounds(1100,160,400,50);
		b2.addActionListener(this);
        p1.add(b2);
		
		b3 = new PosButton("Insert New Doctor",  new Color(156, 232, 55), new Color(11, 190, 77));
		b3.setForeground(Color.black);
		b3.setFont(new Font("Calibri",Font.PLAIN,25));
		b3.setBounds(1100,220,400,50);
		b3.addActionListener(this);
        p1.add(b3);
		
		b4 = new PosButton("Add Patient's Health Records", new Color(156, 232, 55), new Color(11, 190, 77));
		b4.setForeground(Color.black);
		b4.setFont(new Font("Calibri",Font.PLAIN,25));
		b4.setBounds(1100,280,400,50);
		b4.addActionListener(this);
        p1.add(b4);
		
		b9 = new PosButton("Logout",  new Color(250, 160, 0), new Color(238, 63, 15));
		b9.setForeground(Color.black);
		b9.setFont(new Font("Calibri",Font.PLAIN,25));
		b9.setBounds(1100,700,150,50);
		b9.addActionListener(this);
        p1.add(b9);
		
		b10 = new PosButton("EXIT",  new Color(250, 160, 0), new Color(238, 63, 15));
		b10.setForeground(Color.black);
		b10.setFont(new Font("Calibri",Font.PLAIN,30));
		b10.setBounds(1400,700,100,50);
		b10.addActionListener(this);
        p1.add(b10);
		
		this.add(p1);
    }
	
	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b9)
			{
			    image f = new image();
				this.setVisible(false);
				f.setVisible(true);
			}			
			else if(ae.getSource()==b1)
			{
				InsertNewPatient f2 = new InsertNewPatient();
				this.setVisible(false);
				f2.setVisible(true);
			}
			
			else if(ae.getSource()==b3)
			{
				InsertNewDoctor nD = new InsertNewDoctor();
				this.setVisible(false);
				nD.setVisible(true);
			}
			
			else if(ae.getSource()==b4)
			{
				IDforAddPatientHealthRecord iaphr = new IDforAddPatientHealthRecord();
				this.setVisible(false);
				iaphr.setVisible(true);
			}
			
			else if(ae.getSource()==b2)
			
			{
				RemovePatient Rp = new RemovePatient();
				this.setVisible(false);
				Rp.setVisible(true);
			}
			
			else if(ae.getSource()==b10)
			{
				System.exit(0);
			}
			
		}
}

