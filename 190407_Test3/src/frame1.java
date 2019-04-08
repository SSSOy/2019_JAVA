import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.*;

class frame1 extends JFrame implements ActionListener {
	JFrame j;
	JPanel p, bp;
	JLabel l;
	JButton b1, b2;
	JTextArea t;
	
	frame1() {
		j = new JFrame();
		p = new JPanel();
		l = new JLabel("버튼을 누르면 색깔이 바뀝니당^^");
		b1 = new JButton("Yellow");
		b2 = new JButton("Blue");
		t = new JTextArea();
		bp = new JPanel();
		
		p.setLayout(new BorderLayout());
		p.add(l, BorderLayout.NORTH);
		p.add(bp, BorderLayout.EAST);
		p.add(t, BorderLayout.CENTER);
		bp.add(b1); 
		bp.add(b2);
		
		j.add(p);
		
		b2.addActionListener(this);
		b1.addActionListener(this);
		
		j.setResizable(false);
		j.setTitle("java swing");
		j.setVisible(true);
		j.setSize(800, 800);
		j.setLocationRelativeTo(null); 
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == b1) 
			t.setBackground(Color.yellow);
		else if(obj == b2) 
			t.setBackground(Color.blue);
	}
	
	public static void main(String ar[]) {
		new frame1();
	}
}

