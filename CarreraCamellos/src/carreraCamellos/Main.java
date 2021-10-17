package carreraCamellos;


public class Main {
	public static void main(String[] args) {
		 carrera c1 = new carrera();
		 camello ca1 = new camello();
		 
		 carrera c2 = new carrera();
		 camello ca2 = new camello();
		 
		 Thread hilo = new Thread(c1);
		 Thread hilo2 = new Thread(c2);
		 
		 ca1.setNombre("Pepito");
		 ca1.setPosicio(0);
		 c1.setCamello(ca1);
		 ca2.setNombre("Juanito");
		 ca2.setPosicio(0);
		 c2.setCamello(ca2); 
		 
			hilo.start();
			hilo2.start();
 

	}
 
}
