import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Stream;


public class PatientLogin extends JFrame implements ActionListener
{
    
    private JLabel l1,l2;
    private JPanel p1,p2;
	JTextField t1;
	private JPasswordField t2;
	private PosButton b1,b2,b3,b4,b5;
    PatientLogin()
    {
		super(" Hospital Patient's Health Checkup and Information Checking System ");
		this.setSize(1615,940);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p1 = new JPanel();
		p1.setSize(new Dimension(3840,2160));
		p1.setBackground(new Color(157, 209, 232));
		p1.setLayout(null);
		
		ImageIcon image = new ImageIcon("Login.png");
		l1 = new JLabel(image);
		l1.setBounds(0,0,1600,900);
		p1.add(l1);
		
		t1 = new JTextField();
		t1.setBounds(1220,200,200,50);
		t1.setFont(new Font("Calibri",Font.PLAIN,25));
		p1.add(t1);

		t2 = new JPasswordField();
		t2.setBounds(1220,267,200,50);
		t2.setFont(new Font("Calibri",Font.PLAIN,25));
		p1.add(t2);
		
		b1 = new PosButton("Login", new Color(156, 232, 55), new Color(11, 190, 77));
		b1.setForeground(Color.black);
		b1.setFont(new Font("Calibri",Font.PLAIN,25));
		b1.setBounds(1150,400,150,50);
		b1.addActionListener(this);
        p1.add(b1);
		
		
		b3 = new PosButton("Back",  new Color(156, 232, 55), new Color(11, 190, 77));
		b3.setForeground(Color.black);
		b3.setFont(new Font("Calibri",Font.PLAIN,25));
		b3.setBounds(1100,700,100,50);
		b3.addActionListener(this);
        p1.add(b3);
		
		b2 = new PosButton("EXIT",  new Color(250, 160, 0), new Color(238, 63, 15));
		b2.setForeground(Color.black);
		b2.setFont(new Font("Calibri",Font.PLAIN,30));
		b2.setBounds(1400,700,100,50);
		b2.addActionListener(this);
        p1.add(b2);
		
		this.add(p1);
    }
	
	public void actionPerformed(ActionEvent ae)
	{
		   if(ae.getSource()==b1)
			{
			String delimiter = ":";
        Map<String, String> map = new HashMap<>();

        try(Stream<String> lines = Files.lines(Paths.get("pass.txt"))){
            lines.filter(line -> line.contains(delimiter)).forEach(
                line -> map.putIfAbsent(line.split(delimiter)[0], line.split(delimiter)[1])
            );
        }catch (IOException i) {i.printStackTrace();}
			String userID = t1.getText();
			String password = String.valueOf(t2.getPassword());
			
			if(map.containsKey(userID)) {
				if(map.get(userID).equals(password)) {
					
					String id = t1.getText();
					
					PatientHealth Pm = new PatientHealth(id);
				    this.setVisible(false);
				    Pm.setVisible(true);
				
				}
			
				
			}
			}
			
			else if(ae.getSource()==b3)
			{
				image f = new image();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				System.exit(0);
			}
		
    }
}