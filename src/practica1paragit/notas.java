package practica1paragit;
import java.util.Scanner;

/**
 * Clase que permite calcular la nota definitiva de un estudiante a partir de las notas de tres unidades y saber  si aprobó o no el curso
 */

public class notas {
	//declaramos la variables que nos hacen falta
	double uf1, uf2, uf3;
	double acu1, acu2, acu3, def;
	//utilizamos el scanner para poder introducir datos
	Scanner entrada = new Scanner(System.in);
	
	
	
	/**
	 * IngresaNotas es un método que se encarga de solicitar al usuario las notas del estudiante
	 */
	
	public void IngresaNotas() {
		//cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		
		uf1= entrada.nextDouble();

		
		
		System.out.print("ingrese nota 2: ");
		
		uf2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		uf3= entrada.nextDouble();
		
	
	}
	
	/**
	 * comprobarcion es un método que se encarga de verificar que las notas ingresadas estén dentro de lo que se permite
	 */
	
	public void variableComprobacionFinal(){
		
		if (uf1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (uf2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (uf3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}
		
			
		
		
	}
	/**
	 * Calculonotas es un método que se encarga de calcular la nota definitiva del estudiante
	 * y almacenarla en la variable "def".
	 */
	
	public void variableCalculoDeNotas() {
		acu1= uf1*0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		
		def = acu1 + acu2+ acu3;
		
		/**
		 * Mostrar es un método que se encarga de mostrar en pantalla las notas ingresadas por el usuario,
		 * los acumulados obtenidos y la nota definitiva del estudiante
		 */
	}
	
	/**
     * Método que muestra las notas ingresadas y la nota definitiva calculada
     */
	public void variableMostrarNotas() {
		//print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		
		System.out.println(" nota definitiva es = "+ def);
		
	}

	/**
	 * aprobado es un método que se encarga de si el estudiante aprobó o no la asignatura
	 * según a la nota definitiva 
	 */
	
	public void variableAprobado() {
			
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
		
	/**
     * Método principal que crea una instancia de la clase notas y llama a los diferentes métodos para realizar el cálculo y mostrar los resultados.
     */
	
	public static void main(String[] args) {
		
		notas fc= new notas();
		
		fc.IngresaNotas();
		
		fc.variableComprobacionFinal();
		

		fc.variableCalculoDeNotas();
		
		fc.variableMostrarNotas();
		
		fc.variableAprobado();
		
	}

}
