package ejercicio3;

/*Fecha: 02 de Febrero/2021
Nicol Dayana Arias Lebro*/

public class Punto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3 - Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de tipo int,
				dos variables N y M de tipo double y asigna a cada una un valor. A continuación muestra por pantalla:
				• El valor de cada variable.
				• La suma X + Y
				• La diferencia X – Y
				• El producto X * Y
				• El cociente X / Y
				• El resto X % Y
				• La suma N + M
				• La diferencia N – M
				• El producto N * M
				• El cociente N / M
				• El resto N % M
				• La suma X + N
				• El cociente Y / M
				• El resto Y % M
				• El doble de cada variable
				• La suma de todas las variables
				• El producto de todas las variables*/
		
		int X=0;
		int Y=2;
		double N=43.23;
		double M=0.23;
		
		System.out.println("Variable X= "+X);
		System.out.println("Variable Y= "+Y);
		System.out.println("Variable N= "+N);
		System.out.println("Variable M= "+M);
		
		System.out.println(X+" + "+Y+" = "+(X+Y));
		System.out.println(X+" - "+Y+" = "+(X-Y));
		System.out.println(X+" * "+Y+" = "+(X*Y));
		System.out.println(X+" / "+Y+" = "+(X/Y));
		System.out.println(X+" % "+Y+" = "+(X%Y));
		
		System.out.println(N+" + "+M+" = "+(N+M));
		System.out.println(N+" - "+M+" = "+(N-M));
		System.out.println(N+" * "+M+" = "+(N*M));
		System.out.println(N+" / "+M+" = "+(N/M));
		System.out.println(N+" % "+M+" = "+(N%M));
		
		System.out.println(X+" + "+N+" = "+(X+N));
		System.out.println(Y+" / "+M+" = "+(Y/M));
		System.out.println(Y+" % "+M+" = "+(Y%M));
		
		System.out.println("Doble de "+X+": "+X*2);
		System.out.println("Doble de "+Y+": "+Y*2);
		System.out.println("Doble de "+N+": "+N*2);
		System.out.println("Doble de "+M+": "+M*2);
		
		System.out.println("El resultado de la suma de todas las variables es= "+(X+Y+N+M));
		System.out.println("El resultado del producto de todas las variables es= "+(X*Y*N*M));
	}

}
