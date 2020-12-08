package Kadisami;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


class Game extends JFrame {

	private ArrayList<ArrayList<Carta>> mazo = new ArrayList<>();
	private ArrayList<Carta> deck = new ArrayList<>();
	private JButton back;
	private JButton die;
	
		public Game () {
			setLayout(null);
			
			Action action = new Action ();
			
			pintarCartas(deck);
			Collections.shuffle(deck);
			agregarCartas(mazo,action);
			
			
		}
		
	private void pintarCartas(ArrayList<Carta> deck) {
		
		int id=0;
		
		for (int c = 0; c < ((Levels.horizontal * Levels.vertical) / 2); c++) {
			
			ImageIcon imagen = Levels.cartas.peek();
			
			Carta temp = new Carta(imagen, id);
			deck.add(temp);

			Levels.cartas.pop();
			
			ImageIcon imagen1 = Levels.cartas.peek();
			
			Carta temp1 = new Carta (imagen1, id);
			deck.add(temp1);
			
			Levels.cartas.pop();

			id++;
		}
	}

	private void agregarCartas(ArrayList<ArrayList<Carta>> cartas, ActionListener action) {
		int contador = 0;
		for (int i = 0; i < Levels.vertical; i++) {
			ArrayList<Carta> fila = new ArrayList<>();
			for (int j = 0; j < Levels.horizontal; j++) {
				if(contador<deck.size()) {
				deck.get(contador).cardNum = contador;
				deck.get(contador).click.setBounds(50 + (j * 140), 150 + (i * 200), 112, 180);
				deck.get(contador).click.addActionListener(action);
				add(deck.get(contador).click);
				contador++;
				}
			}
			cartas.add(fila);
		}
	}
	
	static Carta voltear = null;
	static Carta voltear1 = null;
	
	static Queue<Integer> repetidos = new PriorityQueue<Integer>();
	static ArrayList<Carta> revisar = new ArrayList<Carta>();
	
	static int pares = 0;
	static int cont = 0;
	
		private class Action implements ActionListener{
	
			public void actionPerformed(ActionEvent e) {
		
				for (int c = 0; c < deck.size(); c++) {
					
					if (e.getSource() == deck.get(c).click) {
						
						if (!(repetidos.contains(deck.get(c).cardNum)) && cont < 3) {
							
							repetidos.add(deck.get(c).cardNum);
							revisar.add(deck.get(c));
							
							ImageIcon temp= deck.get(c).image;
							deck.get(c).setIcon(temp);
							cont++;
							
						}
					}		
				}
				
			boolean esPar = false;
			
			if(cont == 2) {
				if(revisar.get(0).number == revisar.get(1).number) {
					
					revisar.get(0).click.setEnabled(false);
					revisar.get(1).click.setEnabled(false);
					
					esPar=true;
					pares++;
					
					cont=0;
					
					if(pares == (Levels.horizontal * Levels.vertical)/2) {
						
						dispose();
					}
				}
				
				if(!esPar) {
					voltear = revisar.get(0);
					voltear1= revisar.get(1);
				}
			
				revisar.removeAll(revisar);
				repetidos.clear();	
			}
			
			if(cont == 3 && !esPar && voltear != null && voltear1 != null) {
				
				ImageIcon temp= revisar.get(0).volteada;
				voltear.setIcon(temp);
				voltear1.setIcon(temp);
				cont=1;
		
			}
		}
	}
}

