import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class image extends JFrame implements ActionListener
{
    
    private JLabel l1;
    private JPanel p1;
	private PosButton b1,b2,b3,b4,b5;
    image()
    {
		super(" Hospital Patient's Health Checkup and Information Checking System ");
		this.setSize(1615,940);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		p1 = new JPanel();
		p1.setSize(new Dimension(3840,2160));
		p1.setBackground(new Color(157, 209, 232));
		p1.setLayout(null);
		
		ImageIcon image = new ImageIcon("Main.png");
		l1 = new JLabel(image);
		l1.setBounds(0,0,1600,900);
		p1.add(l1);
		
		b1 = new PosButton("Admin", new Color(156, 232, 55), new Color(11, 190, 77));
		b1.setForeground(Color.black);
		b1.setFont(new Font("Calibri",Font.PLAIN,25));
		b1.setBounds(1200,300,150,50);
		b1.addActionListener(this);
        p1.add(b1);
		
		b2 = new PosButton("Doctor",  new Color(156, 232, 55), new Color(11, 190, 77));
		b2.setForeground(Color.black);
		b2.setFont(new Font("Calibri",Font.PLAIN,25));
		b2.setBounds(1200,370,150,50);
		b2.addActionListener(this);
        p1.add(b2);
		
		b3 = new PosButton("Patient",  new Color(156, 232, 55), new Color(11, 190, 77));
		b3.setForeground(Color.black);
		b3.setFont(new Font("Calibri",Font.PLAIN,25));
		b3.setBounds(1200,440,150,50);
		b3.addActionListener(this);
        p1.add(b3);
		
		b4 = new PosButton("EXIT",  new Color(250, 160, 0), new Color(238, 63, 15));
		b4.setForeground(Color.black);
		b4.setFont(new Font("Calibri",Font.PLAIN,30));
		b4.setBounds(1400,700,100,50);
		b4.addActionListener(this);
        p1.add(b4);
		
		this.add(p1);
    }
	
	public void actionPerformed(ActionEvent ae)
		{
			
			if(ae.getSource()==b1)
			{
				b1.setBackground(new Color(250,0,0));
			    AdminLogin Al = new AdminLogin();
				this.setVisible(false);
				Al.setVisible(true);
			}
			
			else if(ae.getSource()==b2)
			{
				DoctorLogin Dl = new DoctorLogin();
				this.setVisible(false);
				Dl.setVisible(true);
			}
			else if(ae.getSource()==b3)
			{
				
				PatientLogin Pl = new PatientLogin();
				this.setVisible(false);
				Pl.setVisible(true);
				
			}
			else if(ae.getSource()==b4)
			{
				System.exit(0);
			}
		}
}

