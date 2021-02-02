package ejercicio4;

/*Fecha: 02 de Febrero/2021
Nicol Dayana Arias Lebro*/
public class Punto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4 - Escribe un programa Java que declare una variable entera N y asígnale un valor. A
			continuación escribe las instrucciones que realicen los siguientes:
				• Incrementar N en 77.
				• Decrementarla en 3.
				• Duplicar su valor.
			
			Si por ejemplo N = 1 la salida del programa será:
				• Valor inicial de N = 1
				• N + 77 = 78
				• N - 3 = 75
				• N * 2 = 150
		 */
		
		int N=23;
		int op=0;
		System.out.println("Valor inicial de N = "+N);
		op=N+77;
		System.out.println("N + 77"+" = "+op);
		op=op-3;
		System.out.println("N - 3"+" = "+op);
		op=op*2;
		System.out.println("N * 2"+" = "+op);

	}

}
