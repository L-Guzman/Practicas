import javax.swing.JOptionPane;


public class EntradaDatosPanel {
	public static void main (String args[])
	{
		String nom;
		int ed, nac;
		
		nom=JOptionPane.showInputDialog("Ingrese su nombre: ");
		
		nac=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su a�o de nacimiento: "));
		
		ed=2019-nac;
		
		JOptionPane.showMessageDialog(null, "Hola, " + nom + ", su a�o de nacimiento es: " + nac + ", su edad es: " + ed);
	}

}
