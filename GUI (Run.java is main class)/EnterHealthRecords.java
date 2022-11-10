import java.lang.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedWriter; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.io.PrintWriter; 
import java.util.Scanner;
import java.io.*;
import java.util.Scanner;
import java.io.File;

public class EnterHealthRecords extends JFrame implements ActionListener
{
    private JLabel l1,l2,l3,l4,l5,l6,l7,l9;
    private JPanel p1;
	private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	//private JPasswordField t2;
	private JComboBox combo;
	private JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11;
	private ButtonGroup bg1,bg2;
	private PosButton b1,b2,b3,b4,b5;
	String selected;
	float bmi,weight,height,h2;
	String ws,hw;
	FileWriter fw = null; 
    BufferedWriter bw = null;
    PrintWriter pw = null;
	
	private String id;
	
    EnterHealthRecords(String id)
    {
		
		super(" Hospital Patient's Health Checkup and Information Checking System ");
		
		this.setSize(1615,940);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(3840,2160));
		p1.setBackground(new Color(157, 209, 232));
		p1.setLayout(null);
		
		ImageIcon image = new ImageIcon("EnterHealthRecord.png");
		l1 = new JLabel(image);
		l1.setBounds(0,0,1600,900);		
		p1.add(l1);
		
		t1 = new JTextField();
		t1.setBounds(1351,99,200,50);
		t1.setFont(new Font("Calibri",Font.PLAIN,25));
		p1.add(t1);

		t2 = new JTextField();
		t2.setBounds(1351,159,200,50);
		t2.setFont(new Font("Calibri",Font.PLAIN,25));
		p1.add(t2);
		
		t3 = new JTextField();
		t3.setBounds(1351,220,200,50);
		t3.setFont(new Font("Calibri",Font.PLAIN,25));
		p1.add(t3);
		
		t4 = new JTextField();
		t4.setBounds(1351,279,200,50);
		t4.setFont(new Font("Calibri",Font.PLAIN,25));
		p1.add(t4);
		
		t5 = new JTextField();
		t5.setBounds(1351,342 ,200,50);
		t5.setFont(new Font("Calibri",Font.PLAIN,25));
		p1.add(t5);
		
		t6 = new JTextField();
		t6.setBounds(1351,402 ,200,50);
		t6.setFont(new Font("Calibri",Font.PLAIN,25));
		p1.add(t6);
		
		t7 = new JTextField();
		t7.setBounds(1351, 462,200,50);
		t7.setFont(new Font("Calibri",Font.PLAIN,25));
		p1.add(t7);
		
		t8 = new JTextField();
		t8.setBounds(1351, 523,200,50);
		t8.setFont(new Font("Calibri",Font.PLAIN,25));
		p1.add(t8);
		
		t9 = new JTextField();
		t9.setBounds(1351, 583,200,50);
		t9.setFont(new Font("Calibri",Font.PLAIN,25));
		p1.add(t9);
		
		t10 = new JTextField();
		t10.setBounds(1351, 643,200,50);
		t10.setFont(new Font("Calibri",Font.PLAIN,25));
		p1.add(t10);

		
		b1 = new PosButton("Save", new Color(156, 232, 55), new Color(11, 190, 77));
		b1.setForeground(Color.black);
		b1.setFont(new Font("Calibri",Font.PLAIN,25));
		b1.setBounds(1445,750,100,50);
		b1.addActionListener(this);
        p1.add(b1);
		
		b2 = new PosButton("Back",  new Color(250, 160, 0), new Color(238, 63, 15));
		b2.setForeground(Color.black);
		b2.setFont(new Font("Calibri",Font.PLAIN,30));
		b2.setBounds(945,750,100,50);
		b2.addActionListener(this);
        p1.add(b2);
		
		this.add(p1);
		this.id = id;
		
    }
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
	    {			
			try {
			
	        fw = new FileWriter(id+".txt", true);
	        bw = new BufferedWriter(fw);
	        pw = new PrintWriter(bw);
			pw.println("------------------------------------------");
			pw.println("------------------------------------------");
	        pw.println("Heart Rate                  : "+t1.getText());
			pw.println("Respiratory Rate(breaths/m) : "+t2.getText());
			pw.println("Body Temperature            : "+t3.getText());
			pw.println("Blood Pressure (systolic)   : "+t4.getText());
			pw.println("Blood Pressure (diastolic)  : "+t5.getText());
			pw.println("Cholesterol (mg/dL)         : "+t6.getText());
			pw.println("RBC (millon/mcL)            : "+t7.getText());
			pw.println("WBC (thousand/mcL)          : "+t8.getText());
			pw.println("Platelet (lac/mcL)          : "+t9.getText());
			pw.println("Blood Sugar (mg/DL)         : "+t10.getText());
	        pw.flush();
	        pw.close();
	        bw.close();
	        fw.close();
	        }catch (IOException i) {
				JOptionPane.showMessageDialog(this,"Patient Not Found");
				i.printStackTrace();
				}
	 	    
			
			IDforAddPatientHealthRecord f = new IDforAddPatientHealthRecord();
		    this.setVisible(false);
		    f.setVisible(true);
			
		}			
		else if(ae.getSource()==b2)
		{
			
			AdminMenu f = new AdminMenu();
			this.setVisible(false);
			f.setVisible(true);
		}
	}
}

