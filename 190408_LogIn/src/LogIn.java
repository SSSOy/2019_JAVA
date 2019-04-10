import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
 
public class LogIn extends JFrame implements ActionListener {
	JPanel p;
	JTextField ID;
	JPasswordField PW;
	JLabel l1, l2;
	JButton b;
	
	public LogIn() {
		p = new JPanel();
		ID = new JTextField(10);
		l1 = new JLabel("ID : ");
		l2 = new JLabel("Password : ");
		PW = new JPasswordField(10);
		b = new JButton("Log In");
		
		p.add(l1);	p.add(ID);
		p.add(l2);	p.add(PW);
		p.add(b);
		
		b.addActionListener(this);
		add(p);
		
		setTitle("Log In");
		setVisible(true);
		setSize(600, 200);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		String id = "SSSo";
		String pw = "1234";
		
		if(id.equals(ID.getText()) && pw.equals(PW.getText())) 
			JOptionPane.showMessageDialog(null, "Success");
		else 
			JOptionPane.showMessageDialog(null, "Fail");
	}
	
	public static void main(String[] args) {
		new LogIn();
	}
}
