import java.util.Scanner;
public class ContarD�gitos {

	public static void main(String[] args) {
		
		int d�gitos = 0;
		Scanner teclado = new Scanner (System.in);
		System.out.print("Introduzca n�mero entero: ");		//SOLCITA N�MERO
		int n�mero = teclado.nextInt();		//INTRODUCE N�MERO
		
		do {
			d�gitos ++;		//CUENTA VUELTAS == N�MERO DE D�GITOS
			n�mero = n�mero/10;		//DIVIDE ENTRE 10
		}
		while (n�mero!=0);		//MIENTRAS EL N�MERO NO SEA 0
		
		System.out.printf("El n�mero tiene %d d�gitos.",d�gitos);
	}
}
