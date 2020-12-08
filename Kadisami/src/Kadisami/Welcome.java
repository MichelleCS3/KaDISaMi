package Kadisami;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Welcome {

	public static void main(String[] args) {
		
		ImageIcon background = new ImageIcon("src/background/1.png");
		JLabel bgrd = new JLabel(background);
		bgrd.setBounds(0, 0, 770, 1000);
		
		Start start = new Start();
		start.add(bgrd);
		start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start.setSize(770,1000);
		start.setLocationRelativeTo(null);
		ImageIcon icon = new ImageIcon("src/background/kadi.jpg");
		start.setIconImage(icon.getImage());
		start.setUndecorated(true);
		start.setVisible(true);
		start.setResizable(false);

	}

}
