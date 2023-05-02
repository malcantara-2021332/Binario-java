import java.util.Scanner;

public class Binario{
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
   System .out.println("Hola, en esta oportunidad ingresaremos un valor y este se convertira en Binario.");

		int decimal, modulo,aux;
		String binario = "";
		System.out.println("Porfavor ingrsa el numero decimal en el rango de 1-10");
		decimal = leer.nextInt();
      aux = decimal;


 		while (decimal > 0) {
			modulo = (decimal % 2);
			binario = modulo + binario;
			decimal = decimal/2;
		}
		
		//El numero directamente se imprimira.
		System.out.println("El numero " + aux+ " = " + binario+ ".");
	}
}