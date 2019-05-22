import javax.swing.JOptionPane;

public class CondicionIF {
	
	public static void main (String args[]){
		
		int Num= Integer.parseInt(JOptionPane.showInputDialog("Introduzca un valor entero: "));
	
		if(Num%2==0)
		{
			JOptionPane.showMessageDialog(null, + Num + " Es un número PAR.");
		
		}
		else
		{
			JOptionPane.showMessageDialog(null, + Num + " Es un número IMPAR." );
			
		}
	}

}
