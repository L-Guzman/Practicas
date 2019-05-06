import java.util.Scanner;

public class EntradaDatos {
public static void main(String args[])
{
	Scanner entrada= new Scanner(System.in);
	String nombre;
	int nac, ed;
	
	System.out.println("Ingrese su nombre: ");
	nombre= entrada.nextLine();
	System.out.println("Ingrese su año de nacimiento: ");
	nac=entrada.nextInt();

	ed=2019 - nac;
	System.out.println("Hola, " + nombre + ", tu año de nacimiento es: " + nac + ", tu edad es: " + ed);

	
}
}
