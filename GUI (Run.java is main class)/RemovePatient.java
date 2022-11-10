import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;


public class RemovePatient extends JFrame implements ActionListener
{

    private JLabel l1;
    private JPanel p1,p2;
	private PosButton b1,b2,b3;
	JTextField t1;
    JTextPane tp = new JTextPane();
    public RemovePatient()
	
	{
		super(" Hospital Patient's Health Checkup and Information Checking System ");
		this.setSize(1615,940);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1600,650));
		p1.setBackground(Color.white);
		p1.setLayout(null);
		
		p2 = new JPanel();
		p2.setSize(new Dimension(1600,250));
		p2.setBackground(new Color(157, 209, 232));
		p2.setLayout(null);
		
		Font font = new Font("",Font.BOLD,20);
        tp.setFont(font);
		
		tp.setForeground(Color.WHITE);
        tp.setBackground(Color.BLACK  );
		
		JScrollPane jp = new JScrollPane(tp); 
		p1.setLayout(new BorderLayout());
		p1.add(jp);
        p1.add(jp,BorderLayout.CENTER);
		
		l1 = new JLabel("Patient ID :");
		l1.setFont(new Font("Calibri",Font.PLAIN,30));
		l1.setForeground(Color.black);
		l1.setBounds(450,730,150,30);
		p2.add(l1); 
		
		t1 = new JTextField();
		t1.setBounds(600,720,150,50);
		t1.setFont(new Font("Calibri",Font.PLAIN,25));
		p2.add(t1);
		
		b1 = new PosButton("Back",  new Color(156, 232, 55), new Color(11, 190, 77));
		b1.setForeground(Color.black);
		b1.setFont(new Font("Calibri",Font.PLAIN,25));
		b1.setBounds(1100,720,100,50);
		b1.addActionListener(this);
        p2.add(b1);
		
		b2 = new PosButton("EXIT",  new Color(250, 160, 0), new Color(238, 63, 15));
		b2.setForeground(Color.black);
		b2.setFont(new Font("Calibri",Font.PLAIN,30));
		b2.setBounds(1400,720,100,50);
		b2.addActionListener(this);
        p2.add(b2);
		
		b3 = new PosButton("Remove Patient", new Color(250, 160, 0), new Color(238, 63, 15));
		b3.setForeground(Color.black);
		b3.setFont(new Font("Calibri",Font.PLAIN,25));
		b3.setBounds(750,720,200,50);
		b3.addActionListener(this);
        p2.add(b3);
		
		this.add(p1);
		this.add(p2);
		
		
		   try{
            String path = "PatientID.txt";
            File file = new File(path);
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
				
			    AdminMenu am = new AdminMenu();
				this.setVisible(false);
				am.setVisible(true);
			}			
			else if(ae.getSource()==b2)
			{
				System.exit(0);
			}
			else if(ae.getSource()==b3)
			{
				try  
                 {         
                File f= new File(t1.getText()+".txt");  //file to be delete  
                if(f.delete())     //returns Boolean value  
                {  
                JOptionPane.showMessageDialog(null,"Delete successful");
                //getting and printing the file name  
                }  
                else  
                {  
                JOptionPane.showMessageDialog(null, "Patient Not Found");
                }  
                }  
                catch(Exception e)  
                {  
                e.printStackTrace();  
                }  
            }
		}
}
