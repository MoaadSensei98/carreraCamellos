package carreraCamellos;

public class dados {
	   private int dado ;

	  public int getDado(){
	       return dado;
	   }
	   //M�todos necesarios para la ejecuci�n
	   public void lanzarDado(){
		   this.dado = (int)(Math.random()*(6-1+1)+1);
	   }
	}
 
