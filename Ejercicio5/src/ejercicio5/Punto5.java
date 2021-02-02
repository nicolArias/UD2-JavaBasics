package ejercicio5;
/*Fecha: 02 de Febrero/2021
Nicol Dayana Arias Lebro*/
public class Punto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*5 - Programa java que declare cuatro variables enteras A, B, C y D y
				asígnale un valor a cada una. A continuación realiza las instrucciones
				necesarias para que:
					• B tome el valor de C
					• C tome el valor de A
					• A tome el valor de D
					• D tome el valor de B
		 */
		
		int A=1;
		int B=2;
		int C=3;
		int D=4;
		
		B=C;
		C=A;
		A=D;
		D=B;
		
		System.out.println("B con el valor de C: "+B);
		System.out.println("C con el valor de A: "+C);
		System.out.println("A con el valor de D: "+A);
		//En este caso D toma el valor 3 que al inicio es de C porque ahora es el nuevo valor de B, ya que asi se asigno en la linea 26.
		System.out.println("D con el valor de B: "+D);

							

	}

}
