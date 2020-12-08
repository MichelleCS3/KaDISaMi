package Kadisami;

import javax.swing.ImageIcon;
import javax.swing.JButton;

class Carta {

	ImageIcon image;
	ImageIcon volteada= new ImageIcon("src/words/1.png");
	
	JButton click = new JButton(volteada);
	
	int number;
	int cardNum;
	
	Carta(ImageIcon image, int number) {
		this.image = image;
		this.number = number;
	}
	
	public void setIcon(ImageIcon m) {
		click.setIcon(m);
	}
}
