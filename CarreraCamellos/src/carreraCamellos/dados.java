package carreraCamellos;

public class dados {
	   private int dado ;

	  public int getDado(){
	       return dado;
	   }
	   //Métodos necesarios para la ejecución
	   public void lanzarDado(){
		   this.dado = (int)(Math.random()*(6-1+1)+1);
	   }
	}
 
