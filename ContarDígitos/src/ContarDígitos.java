import java.util.Scanner;
public class ContarDígitos {

	public static void main(String[] args) {
		
		int dígitos = 0;
		Scanner teclado = new Scanner (System.in);
		System.out.print("Introduzca número entero: ");		//SOLCITA NÚMERO
		int número = teclado.nextInt();		//INTRODUCE NÚMERO
		
		do {
			dígitos ++;		//CUENTA VUELTAS == NÚMERO DE DÍGITOS
			número = número/10;		//DIVIDE ENTRE 10
		}
		while (número!=0);		//MIENTRAS EL NÚMERO NO SEA 0
		
		System.out.printf("El número tiene %d dígitos.",dígitos);
	}
}
