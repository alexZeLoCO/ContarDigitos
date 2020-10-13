import java.util.Scanner;
public class ContarDígitos {

	public static void main(String[] args) {
		
		/*CONTAREMOS LOS DÍGITOS QUE TIENE UN NÚMERO INTRODUCIDO POR EL USUARIO.
		/EJEMPLO: NÚMERO = 240
		/NÚMERO DE DÍGITOS = 3 (2 4 0)
		/PARA ELLO, DIVIDIREMOS ENTRE 10 TANTAS VECES COMO HAGA FALTA PARA LLEGAR A 0
		*/
		
		int dígitos = 0;		//INICIALIZAR EL CONTADOR DE DÍGITOS
		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO DE TIPO SCANNER
		System.out.print("Introduzca número entero: ");		//SOLCITA NÚMERO
		int número = teclado.nextInt();		//INTRODUCE NÚMERO
		
		do {
			dígitos ++;		//CUENTA VUELTAS == NÚMERO DE DÍGITOS
			número = número/10;		//DIVIDE ENTRE 10
		}
		while (número!=0);		//MIENTRAS EL NÚMERO NO SEA 0
		
		System.out.printf("El número tiene %d dígitos.",dígitos);		//OUTPUT
	}
}
