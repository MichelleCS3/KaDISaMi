package Kadisami;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Levels extends JFrame {
	
	private JButton numbers;
	private JButton words;
	private JButton menu;
	
	public Levels () {
		setLayout(null);
		
		ImageIcon uno = new ImageIcon ("src/buttons/1.png");
		numbers = new JButton(uno);
		numbers.setBorderPainted(false);
		numbers.setBounds(177,606,95,218);
		
		ImageIcon dos = new ImageIcon ("src/buttons/2 (2).png");
		words = new JButton(dos);
		words.setBorderPainted(false);
		words.setBounds(495,606,95,218);
		
		ImageIcon back= new ImageIcon ("src/buttons/Menu.png");
		menu = new JButton (back);
		menu.setBorderPainted(false);
		menu.setBounds(33,862,218,95);
		
		Action action = new Action ();
		numbers.addActionListener(action);
		words.addActionListener(action);
		menu.addActionListener(action);
		
		add(numbers);
		add(words);
		add(menu);
	}
	
	static int vertical = 0;
	static int horizontal = 0;
	static Stack <ImageIcon> cartas = new Stack ();
	private class Action implements ActionListener{
		
		public void actionPerformed (ActionEvent e) {
		
			if(e.getSource() == numbers) {
				vertical = 2;
				horizontal = 5;
				
				cartas.add(new ImageIcon ("src/numbers/2.png"));
				cartas.add(new ImageIcon ("src/numbers/3.png"));
				cartas.add(new ImageIcon ("src/numbers/4.png"));
				cartas.add(new ImageIcon ("src/numbers/5.png"));
				cartas.add(new ImageIcon ("src/numbers/6.png"));
				cartas.add(new ImageIcon ("src/numbers/7.png"));
				cartas.add(new ImageIcon ("src/numbers/8.png"));
				cartas.add(new ImageIcon ("src/numbers/9.png"));
				cartas.add(new ImageIcon ("src/numbers/10.png"));
				cartas.add(new ImageIcon ("src/numbers/11.png"));
				
				dispose();
				
				ImageIcon background = new ImageIcon("src/background/3.png");
				JLabel bgrd = new JLabel(background);
				bgrd.setBounds(0, 0, 770, 1000);
				
				Game game = new Game();
				game.add(bgrd);
				game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				game.setSize(770,1000);
				game.setLocationRelativeTo(null);
				ImageIcon icon = new ImageIcon("src/background/kadi.jpg");
				game.setIconImage(icon.getImage());
				game.setUndecorated(true);
				game.setVisible(true);
				game.setResizable(false);
			}
			
			if(e.getSource() == words) {
				vertical=3;
				horizontal=5;
				
				cartas.add(new ImageIcon ("src/words/12.png"));
				cartas.add(new ImageIcon ("src/words/13.png"));
				cartas.add(new ImageIcon ("src/words/14.png"));
				cartas.add(new ImageIcon ("src/words/15.png"));
				cartas.add(new ImageIcon ("src/words/16.png"));
				cartas.add(new ImageIcon ("src/words/17.png"));
				cartas.add(new ImageIcon ("src/words/18.png"));
				cartas.add(new ImageIcon ("src/words/19.png"));
				cartas.add(new ImageIcon ("src/words/20.png"));
				cartas.add(new ImageIcon ("src/words/21.png"));
				cartas.add(new ImageIcon ("src/words/22.png"));
				cartas.add(new ImageIcon ("src/words/23.png"));
				cartas.add(new ImageIcon ("src/words/24.png"));
				cartas.add(new ImageIcon ("src/words/25.png"));
				cartas.add(new ImageIcon ("src/words/26.png"));
				cartas.add(new ImageIcon ("src/words/27.png"));
				
				
				dispose();
				
				ImageIcon background = new ImageIcon("src/background/4.png");
				JLabel bgrd = new JLabel(background);
				bgrd.setBounds(0, 0, 770, 1000);
				
				Game game = new Game();
				game.add(bgrd);
				game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				game.setSize(770,1000);
				game.setLocationRelativeTo(null);
				ImageIcon icon = new ImageIcon("src/background/kadi.jpg");
				game.setIconImage(icon.getImage());
				game.setUndecorated(true);
				game.setVisible(true);
				game.setResizable(false);
				
				
			}
			
			if(e.getSource() == menu) {
				
				dispose();
				
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
	}

}
