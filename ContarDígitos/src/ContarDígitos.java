import java.util.Scanner;
public class ContarD�gitos {

	public static void main(String[] args) {
		
		/*CONTAREMOS LOS D�GITOS QUE TIENE UN N�MERO INTRODUCIDO POR EL USUARIO.
		/EJEMPLO: N�MERO = 240
		/N�MERO DE D�GITOS = 3 (2 4 0)
		/PARA ELLO, DIVIDIREMOS ENTRE 10 TANTAS VECES COMO HAGA FALTA PARA LLEGAR A 0
		*/
		
		int d�gitos = 0;		//INICIALIZAR EL CONTADOR DE D�GITOS
		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO DE TIPO SCANNER
		System.out.print("Introduzca n�mero entero: ");		//SOLCITA N�MERO
		int n�mero = teclado.nextInt();		//INTRODUCE N�MERO
		
		do {
			d�gitos ++;		//CUENTA VUELTAS == N�MERO DE D�GITOS
			n�mero = n�mero/10;		//DIVIDE ENTRE 10
		}
		while (n�mero!=0);		//MIENTRAS EL N�MERO NO SEA 0
		
		System.out.printf("El n�mero tiene %d d�gitos.",d�gitos);		//OUTPUT
	}
}
