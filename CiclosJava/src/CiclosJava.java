import java.util.Scanner;
public class CiclosJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		Lo anterior es c�digo repetitivo y puede usarse un ciclo.*/
		
		/*
		 ciclo for
		 Sintaxis:
		 Palabra reservada  for (variable de inicializaci�n; variable inicializaci�n < 10; variable++
		*/
		
		//for (int i=0; i < 5; i++) {
			//System.out.println(i + 1);
		
		/*Crear un m�todo que reciba por par�metro un n�mero y nos muestre la 
		* tabla de multiplicar de ese n�mero
		* Ejemplo:
		* 1 X 1 = 1
		* 1 X 2 = 2
		* 1 X 3 = 3
		* ...
		* 1 X 10 = 10*/
		
		Scanner number= new Scanner(System.in);
		System.out.println("Introduzca el n�mero del que desee obtener la tabla de multiplicar");
		int timesTables= number.nextInt();
		multi(timesTables);
		
	} 
	
		public static void multi(int timesTables) {
			for (int i=1; i <= 10; i++) {
				System.out.println(timesTables + "x" + i + " = " + (i * timesTables));
			
		/*Ciclo whhile
		 *while (condici�n) {
		 *c�digo
		 *c�digo 
		 *c�digo
		 *}
		 No se inicializa variable, ni se incrementa como en ciclo for. 
		 Se eval�a la con dici�n y mientras �sta sea verdadera se ejecuta el c�digo 
		 En alg�n punto la condici�n debe ser falsa para que se pare el ciclo
		 y no trabemos nuestra comp


	/*Escribir un programa que pida dos n�meros por consola de manera reiterada.
	 * La ejecuci�n del programa terminar� cuando los n�meros ingresados sean iguales
	 * Nota. Utilizar un ciclo while
	 * Este ejercicio est� en EjercicioCicloWhile */
				
				
				
		/*Ciclo do while
		 do {
		 c�digo
		 c�digo
		 c�digo
		 } while (condici�n)
		 Primero ejecuta el c�digo y luego pregunta. Si la condici�n es verdadera 
		 vuelve a ejecutar la condici�n */
			
		}
	}
}


		


