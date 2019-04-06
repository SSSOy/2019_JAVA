import java.awt.*;
import javax.swing.*;

public class test1 {
	public static void main(String[] args) {
		JFrame f = new JFrame("Test");
		f.setLocation(500, 400);
		f.setPreferredSize(new Dimension(500, 500));
		
		Container contentPane = f.getContentPane();
		JLabel label = new JLabel("Test Program", SwingConstants.CENTER);
		
		contentPane.add(label);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
	}

}

