import java.util.Scanner;		//IMPORTAR SCANNER
public class TestSumatorioT2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO TECLADO
		System.out.print("Itnroduzca un número inicial: ");		//SOLICITAR NÚMERO INICIAL
		int m = teclado.nextInt();		//ALMACENAR EN VARIABLE M
		if (m<0) {		//COMPROBACIÓN NÚMERO POSITIVO
			System.out.print("El número introducido es negativo.");		//AVISO
			System.exit(0);		//CERRAR PROGRAMA
		}
		System.out.print("Introduzca el número final: ");		//SOLICITA EL NÚMERO FINAL
		int n = teclado.nextInt();
		if (n<0) {		//COMPROBACIÓN NÚMERO POSITIVO
			System.out.print("El número introducido es negativo.");		//AVISO
			System.exit(0);		//CERRAR PROGRAMA
		}
		
		System.out.printf("Se hara el sumatorio de todos los valores comprendidos en el intervalo (%d,%d).\n",m,n);

		
		int suma = 0;		//CREAR VALOR DEL SUMATORIO
		for (int i = m; i<=n; i++) {		//MIENTRAS LA I SEA MENOR QUE N Y SUMAR UNO A LA I CADA VUELTA.
			suma = suma + i;		//SUMAR LA I AL VALOR DE SUMA. (I + (I+1) + (I+2) + (I+3) + ... + N)
		}
		System.out.printf("El sumatorio de los números desde el %d hasta el %d es %d.",m,n,suma);		//OUTPUT
	}

}
