package ejercicio2;
/*Fecha: 02 de Febrero/2021
Nicol Dayana Arias Lebro*/
public class Punto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*2 - Escribe un programa Java que realice lo siguiente: declarar una variable N de tipo int,
				una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
				A continuaci�n muestra por pantalla:
				� El valor de cada variable.
				� La suma de N + A
				� La diferencia de A - N
				� El valor num�rico correspondiente al car�cter que contiene la variable C.
				
				Si por ejemplo le hemos dado a N el valor 5, a A el valor 4.56 y a C el valor �a�, se debe
				mostrar por pantalla:
				� Variable N = 5
				� Variable A = 4.56
				� Variable C = a
				� 5 + 4.56 = 9.559999999999999
				� 4.56 - 5 = -0.4400000000000004
				� Valor num�rico del car�cter a = 97
		 */
		
		int N=8;
		double A=27.98;
		char C='C';
		double suma=N+A;
		double resta=A-N;
		
		System.out.println("Variable N: "+N);
		System.out.println("Variable A: "+A);
		System.out.println("Variable C: "+C);
		System.out.println(N+ " + "+A+" = "+suma);
		System.out.println(A+" - "+N+" = "+resta);
		System.out.println("Valor n�merico del car�cter "+C+" = "+(int)C);
		

		
		
	}

}
