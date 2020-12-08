package Kadisami;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


class Start extends JFrame {
	
	private JButton salir;
	private JButton empezar;
	
	public Start () {
		setLayout(null);
		
		ImageIcon exit = new ImageIcon("src/buttons/salir.png");
		salir = new JButton(exit);
		salir.setBorderPainted(false);
		salir.setBounds(600,55,140,61);
		
		ImageIcon start= new ImageIcon("src/buttons/siguiente.png");
		empezar = new JButton(start);
		empezar.setBorderPainted(false);
		empezar.setBounds(510,807,218,95);
		
		Action action = new Action ();
		salir.addActionListener(action);
		empezar.addActionListener(action);
		
		add(salir);
		add(empezar);	
	}
	
	private class Action implements ActionListener{
		 
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == salir) {
				dispose();
			}
			
			if(e.getSource() == empezar) {
				dispose();
				
				ImageIcon level = new ImageIcon("src/background/2.png");
				JLabel bgrd = new JLabel(level);
				bgrd.setBounds(0, 0, 770, 1000);
				
				Levels levels = new Levels();
				levels.add(bgrd);
				levels.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				levels.setSize(770,1000);
				levels.setLocationRelativeTo(null);
				ImageIcon icon = new ImageIcon("src/background/kadi.jpg");
				levels.setIconImage(icon.getImage());
				levels.setUndecorated(true);
				levels.setVisible(true);
				levels.setResizable(false);
			}
			
		}
	}

}
