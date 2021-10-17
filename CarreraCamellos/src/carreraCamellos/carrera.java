package carreraCamellos;

public class carrera implements Runnable {
	private camello camello = new camello();
	private dados d1 = new dados();
	private dados d2 = new dados();

	public dados getD1() {
		return d1;
	}

	public void setD1(dados d1) {
		this.d1 = d1;
	}

	public dados getD2() {
		return d2;
	}

	public void setD2(dados d2) {
		this.d2 = d2;
	}

	public camello getCamello() {
		return camello;
	}

	public void setCamello(camello camello) {
		this.camello = camello;
	}
	 
	@Override
	public void run() {
		boolean finish = true;
		int suma = 0;

		while (finish) {
			d1.lanzarDado();
			d2.lanzarDado();

			if (d1.getDado() != d2.getDado()) {
				suma += d1.getDado() + d2.getDado();
				camello.setPosicio(suma);
				System.out
						.println("El camello " + camello.getNombre() + " está en la posicion " + camello.getPosicio());
				if (camello.getPosicio() >= 100) {
					System.out.println("ha llegado a la meta el camello " + camello.getNombre());
					finish = false;

				}
			} else {
				suma -= d1.getDado() + d2.getDado();
				camello.setPosicio(suma);
				System.out
						.println("El camello " + camello.getNombre() + " está en la posicion " + camello.getPosicio());
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//if (finish) break;

		}
		

	}
}
