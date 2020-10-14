import java.util.Scanner;		//IMPORTAR SCANNER
public class TestSumatorioT1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO TECLADO
		System.out.print("Itnroduzca un número: ");		//SOLICITAR NÚMERO
		int m = teclado.nextInt();		//ALMACENAR EN VARIABLE M
		
		if (m<0) {		//COMPROBACIÓN NÚMERO POSITIVO
			System.out.print("El número introducido es negativo.");		//AVISO
			System.exit(0);		//CERRAR PROGRAMA
		}
		
		int suma = 0;		//CREAR VALOR DEL SUMATORIO
		for (int i = 0; i<=m; i++) {		//MIENTRAS LA I SEA MENOR QUE M Y SUMAR UNO A LA I CADA VUELTA.
			suma = suma + i;		//SUMAR LA I AL VALOR DE SUMA. (0 + 1 + 2 + 3 + 4 + ... + M)
		}
		System.out.printf("El sumatorio de los números desde el 0 hasta el %d es %d.",m,suma);		//OUTPUT
	}

}
