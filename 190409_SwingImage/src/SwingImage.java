import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;


public class SwingImage extends JFrame{
	ImageIcon img;
	Image i, i2;
	JLabel l;
	
	public SwingImage() {
		
		img = new ImageIcon("./Image/½£.jpg");
		i = img.getImage(); 

		i2 = i.getScaledInstance(i.getWidth(null), i.getHeight(null), Image.SCALE_DEFAULT);
		ImageIcon icon2 = new ImageIcon(i2);

		l = new JLabel(icon2);

		add(l);
		
		setSize(new Dimension(i.getWidth(null), i.getHeight(null)));
		setPreferredSize(new Dimension(i.getWidth(null), i.getHeight(null)));
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new SwingImage();
	}

}
