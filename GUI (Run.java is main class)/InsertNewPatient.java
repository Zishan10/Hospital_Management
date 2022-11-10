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

public class InsertNewPatient extends JFrame implements ActionListener
{
    private JLabel l1,l2,l3,l4,l5,l6,l7,l9;
    private JPanel p1;
	private JTextField t1 = new JTextField();
	private JTextField t2 = new JTextField();
	private JTextField t3,t4,t5,t6,t7,t8,t9,t10;
	private JComboBox combo;
	private JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11;
	private ButtonGroup bg1,bg2;
	private PosButton b1,b2,b3,b4,b5;
	private JList jList1;
	String selected;
	float bmi,weight,height,h2;
	String ws,hw;
	FileWriter fw = null; 
    BufferedWriter bw = null;
    PrintWriter pw = null;
    InsertNewPatient()
    {
		super(" Hospital Patient's Health Checkup and Information Checking System ");
		this.setSize(1615,940);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(3840,2160));
		p1.setBackground(new Color(157, 209, 232));
		p1.setLayout(null);
		
		ImageIcon image = new ImageIcon("PatientInsert.png");
		l1 = new JLabel(image);
		l1.setBounds(0,0,1600,900);		
		p1.add(l1);
		
		t1.setBounds(1145,99,400,50);
		t1.setFont(new Font("Calibri",Font.PLAIN,25));
		p1.add(t1);

		t2.setBounds(1145,159,400,50);
		t2.setFont(new Font("Calibri",Font.PLAIN,25));
		p1.add(t2);
		
		t3 = new JTextField();
		t3.setBounds(1145,220,400,50);
		t3.setFont(new Font("Calibri",Font.PLAIN,25));
		p1.add(t3);
		
		t4 = new JTextField();
		t4.setBounds(1145,341,200,50);
		t4.setFont(new Font("Calibri",Font.PLAIN,25));
		p1.add(t4);
		
		t5 = new JTextField();
		t5.setBounds(1145,402,200,50);
		t5.setFont(new Font("Calibri",Font.PLAIN,25));
		p1.add(t5);
		
		t6 = new JTextField();
		t6.setBounds(1145,463,200,50);
		t6.setFont(new Font("Calibri",Font.PLAIN,25));
		p1.add(t6);
		
		t7 = new JTextField();
		t7.setBounds(1145,524,400,50);
		t7.setFont(new Font("Calibri",Font.PLAIN,25));
		p1.add(t7);
		
		String[] bloodGroup = new String [ ]{"A+", "A-", "B+", "B-","AB+","AB-","O+","O-"};
        jList1 = new JList(bloodGroup);
		jList1.setBackground(new Color(193,230,252));
		jList1.setFont(new Font("Calibri",Font.PLAIN,25));
        jList1.setBounds(1145,583,80,200);
        p1.add(jList1);
		
		
		r1 = new JRadioButton("Male");
        r1.setBounds(1145,281,100,50);
		r1.setBackground(new Color(193,230,252));
		r1.setFont(new Font("Calibri",Font.PLAIN,25));
        p1.add(r1);

        r2 = new JRadioButton("Female");
        r2.setBounds(1255,281,100,50);
		r2.setBackground(new Color(193,230,252));
		r2.setFont(new Font("Calibri",Font.PLAIN,25));
        p1.add(r2);
		
		r3 = new JRadioButton("Other");
        r3.setBounds(1365,281,100,50);
		r3.setBackground(new Color(193,230,252));
		r3.setFont(new Font("Calibri",Font.PLAIN,25));
        p1.add(r3);
        
		
		bg1= new ButtonGroup( );
        bg1.add(r1);
        bg1.add(r2);
		bg1.add(r3);
		
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
		
    }
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
	    {
		    PatientID m = new PatientID(t1.getText(),t3.getText());
		    if(r1.isSelected())
		    {
				selected = "Male";
			}
			else if(r2.isSelected())
			{
				selected = "Female";
			}
			else if(r3.isSelected())
			{
				selected = "Other";
			}
			else{selected="";}
				
			String a = t1.getText();
			String b = t2.getText();
			
			try {
	        String fileName = t1.getText();
            fileName = a + ".txt";
            File file = new File(fileName);
            file.createNewFile();
	        } catch (IOException i) {i.printStackTrace();}
						
			try {
	        fw = new FileWriter("pass.txt", true);
	        bw = new BufferedWriter(fw); 
	        pw = new PrintWriter(bw);
	        pw.println(a+":"+b);
	        pw.flush();
	        pw.close();
	        bw.close();
	        fw.close();
	        } catch (IOException i) {i.printStackTrace();}
			
			try {
			String fileName = t1.getText();
            fileName = a + ".txt";
			Object contents = jList1.getSelectedValue();
			ws = t6.getText();
			hw = t5.getText();
			weight = Float.parseFloat(ws);
			height = Float.parseFloat(hw);
			h2 = (height*height);
			bmi = weight/h2;
	        fw = new FileWriter(fileName, true);
	        bw = new BufferedWriter(fw); 
	        pw = new PrintWriter(bw);
	        pw.println(" ID          : "+t1.getText());
			pw.println("Name        : "+t3.getText());
			pw.println("Gender      : "+selected);
			pw.println("Age         : "+t4.getText());
			pw.println("Height(m)   : "+t5.getText());
			pw.println("Weight(kg)  : "+t6.getText());
			pw.println("Address     : "+t7.getText());
			pw.println("Blood Group : "+contents);
			pw.println("BMI                         : "+ bmi);
	        pw.flush();
	        pw.close();
	        bw.close();
	        fw.close();
	        } catch (IOException i) {i.printStackTrace();}
	 	    
			
			AdminMenu f = new AdminMenu();
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

