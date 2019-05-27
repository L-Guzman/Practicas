package NumMagico;

import javax.swing.JOptionPane;

public class NumMagico {
	public static void main(String args[]){
		
	
	int max=100;
	int min=1;
	int numag=(int)Math.random()*(max-min)+ min;

	
	JOptionPane.showMessageDialog(null, "El valor mágico es: " +numag);

	while(true){
		
		int numingreso=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número para adivinar el número mágico, si presiona cero se saldrá del juego"));
		if(numingreso==numag){
			JOptionPane.showMessageDialog(null, "FELICIDADES");
			break;
			}
		else if(numingreso == 0){
			break;
		}
		else if(numingreso > numag){
			JOptionPane.showMessageDialog(null, "El número que ingresaste es mayor al número mágico, por favor intenta de nuevo");
		}
		else if(numingreso < numag){
			JOptionPane.showMessageDialog(null, "El número que ingresaste es menor al número mágico, por favor intenta de nuevo");
		}
	}
}
}
