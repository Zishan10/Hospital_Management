import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedWriter; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.io.PrintWriter; 


public class DoctorComment extends JFrame implements ActionListener
{

    private JLabel l1,l2,l3,l4;
    private JPanel p1,p2;
	private PosButton b1,b2,b3;
	private JTextField t1,t2,t3,t4;
	private String id;
	FileWriter fw = null; 
    BufferedWriter bw = null;
    PrintWriter pw = null;
    JTextPane tp = new JTextPane();
    public DoctorComment(String id)
	
	{
		super(" Hospital Patient's Health Checkup and Information Checking System ");
		this.setSize(1615,940);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(900,600));
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
		
		l1 = new JLabel("Doctors Advice :");
		l1.setFont(new Font("Calibri",Font.PLAIN,25));
		l1.setForeground(Color.black);
		l1.setBounds(0,615,200,40);
		p2.add(l1);
		
		l2 = new JLabel("Date :");
		l2.setFont(new Font("Calibri",Font.PLAIN,25));
		l2.setForeground(Color.black);
		l2.setBounds(300,610,100,40);
		p2.add(l2);
		
		l3 = new JLabel("Next Appointment Date :");
		l3.setFont(new Font("Calibri",Font.PLAIN,25));
		l3.setForeground(Color.black);
		l3.setBounds(600,610,300,40);
		p2.add(l3);
		
		l4 = new JLabel("Doctor's Name :");
		l4.setFont(new Font("Calibri",Font.PLAIN,25));
		l4.setForeground(Color.black);
		l4.setBounds(600,660,300,40);
		p2.add(l4);
		
		t1 = new JTextField();
		t1.setBounds(0,650,520,260);
		t1.setFont(new Font("Calibri",Font.PLAIN,25));
		p2.add(t1);
		
		t2 = new JTextField();
		t2.setBounds(370,610,150,40);
		t2.setFont(new Font("Calibri",Font.PLAIN,25));
		p2.add(t2);
		
		t3 = new JTextField();
		t3.setBounds(860,610,150,40);
		t3.setFont(new Font("Calibri",Font.PLAIN,25));
		p2.add(t3);
		
		t4 = new JTextField();
		t4.setBounds(860,650,350,40);
		t4.setFont(new Font("Calibri",Font.PLAIN,25));
		p2.add(t4);
		
		b1 = new PosButton("Back",  new Color(156, 232, 55), new Color(11, 190, 77));
		b1.setForeground(Color.black);
		b1.setFont(new Font("Calibri",Font.PLAIN,25));
		b1.setBounds(1000,730,150,50);
		b1.addActionListener(this);
        p2.add(b1);
		
		b2 = new PosButton("Save", new Color(156, 232, 55), new Color(11, 190, 77));
		b2.setForeground(Color.black);
		b2.setFont(new Font("Calibri",Font.PLAIN,25));
		b2.setBounds(1400,730,100,50);
		b2.addActionListener(this);
        p2.add(b2);
		
		this.id=id;
		this.add(p1);
		this.add(p2);
		
		
		try{
            File file = new File(id+".txt");
            FileReader fr = new FileReader(file);
            while(fr.read() != -1)
			{
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
				
			    IDtoSeeHealthRecordForDoctor id = new IDtoSeeHealthRecordForDoctor();
				this.setVisible(false);
				id.setVisible(true);
			}			
			else if(ae.getSource()==b2)
			{
				
				try {
			
	        fw = new FileWriter(id+".txt", true);
	        bw = new BufferedWriter(fw);
	        pw = new PrintWriter(bw);
			pw.println("------------------------------------------");
			pw.println("------------------------------------------");
	        pw.println("Date                  : "+t2.getText());
			pw.println("Doctor's Name         : "+t4.getText());
			pw.println("Doctor's Advice       : "+t1.getText());
			pw.println("Next Appointment Date : "+t3.getText());
			pw.println("------------------------------------------");
			pw.println("------------------------------------------");
	        pw.flush();
	        pw.close();
	        bw.close();
	        fw.close();
	        }catch (IOException i) {
				JOptionPane.showMessageDialog(this,"Patient Not Found");
				i.printStackTrace();
				}
				
			IDtoSeeHealthRecordForDoctor id2 = new IDtoSeeHealthRecordForDoctor();
			this.setVisible(false);
			id2.setVisible(true);
				
			}
		}
}