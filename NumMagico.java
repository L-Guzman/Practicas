package NumMagico;

import javax.swing.JOptionPane;

public class NumMagico {
	public static void main(String args[]){
		
	
	int max=100;
	int min=1;
	int numag=(int)Math.random()*(max-min)+ min;

	
	JOptionPane.showMessageDialog(null, "El valor m�gico es: " +numag);

	while(true){
		
		int numingreso=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un n�mero para adivinar el n�mero m�gico, si presiona cero se saldr� del juego"));
		if(numingreso==numag){
			JOptionPane.showMessageDialog(null, "FELICIDADES");
			break;
			}
		else if(numingreso == 0){
			break;
		}
		else if(numingreso > numag){
			JOptionPane.showMessageDialog(null, "El n�mero que ingresaste es mayor al n�mero m�gico, por favor intenta de nuevo");
		}
		else if(numingreso < numag){
			JOptionPane.showMessageDialog(null, "El n�mero que ingresaste es menor al n�mero m�gico, por favor intenta de nuevo");
		}
	}
}
}
