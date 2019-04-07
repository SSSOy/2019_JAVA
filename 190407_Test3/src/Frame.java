import javax.swing.*;
import java.awt.*;

public class Frame {

	public static void main(String[] args) {
		JFrame j = new JFrame();
		JPanel p = new JPanel();
		JLabel l = new JLabel("집에 가고싶어");
		JButton b = new JButton("Click me");
		JTextArea t = new JTextArea();
		
		p.setLayout(new BorderLayout());
		p.add(l, BorderLayout.NORTH);
		p.add(b, BorderLayout.EAST);
		p.add(t, BorderLayout.CENTER);
		
		j.add(p);
		
		j.setResizable(false);
		j.setTitle("java swing");
		j.setVisible(true);
		j.setSize(400, 400);
		j.setLocationRelativeTo(null); 
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
