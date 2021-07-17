import java.util.Scanner;
public class CiclosJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		Lo anterior es código repetitivo y puede usarse un ciclo.*/
		
		/*
		 ciclo for
		 Sintaxis:
		 Palabra reservada  for (variable de inicialización; variable inicialización < 10; variable++
		*/
		
		//for (int i=0; i < 5; i++) {
			//System.out.println(i + 1);
		
		/*Crear un método que reciba por parámetro un número y nos muestre la 
		* tabla de multiplicar de ese número
		* Ejemplo:
		* 1 X 1 = 1
		* 1 X 2 = 2
		* 1 X 3 = 3
		* ...
		* 1 X 10 = 10*/
		
		Scanner number= new Scanner(System.in);
		System.out.println("Introduzca el número del que desee obtener la tabla de multiplicar");
		int timesTables= number.nextInt();
		multi(timesTables);
		
	} 
	
		public static void multi(int timesTables) {
			for (int i=1; i <= 10; i++) {
				System.out.println(timesTables + "x" + i + " = " + (i * timesTables));
			
		/*Ciclo whhile
		 *while (condición) {
		 *código
		 *código 
		 *código
		 *}
		 No se inicializa variable, ni se incrementa como en ciclo for. 
		 Se evalúa la con dición y mientras ésta sea verdadera se ejecuta el código 
		 En algún punto la condición debe ser falsa para que se pare el ciclo
		 y no trabemos nuestra comp


	/*Escribir un programa que pida dos números por consola de manera reiterada.
	 * La ejecución del programa terminará cuando los números ingresados sean iguales
	 * Nota. Utilizar un ciclo while
	 * Este ejercicio está en EjercicioCicloWhile */
				
				
				
		/*Ciclo do while
		 do {
		 código
		 código
		 código
		 } while (condición)
		 Primero ejecuta el código y luego pregunta. Si la condición es verdadera 
		 vuelve a ejecutar la condición */
			
		}
	}
}


		


