package Decorate;

public abstract class Unidad {
	
	 public String nombre;
	 public double energia,
	 			   salud,
	 			   da�o,
	 			   posicionX,
	 			   posicionY,
	 			   distanciaMaxima,
	 			   distanciaMinima;
	 		
	 	 
	 public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEnergia(double energia) {
		this.energia = energia;
	}
	public void setDa�o(double da�o) {
		this.da�o = da�o;
	}
	public void setPosicionX(double posicionX) {
		this.posicionX = posicionX;
	}
	public void setPosicionY(double posicionY) {
		this.posicionY = posicionY;
	}
	public void setDistanciaMaxima(double distanciaMaxima) {
		this.distanciaMaxima = distanciaMaxima;
	}
	public void setDistanciaMinima(double distanciaMinima) {
		this.distanciaMinima = distanciaMinima;
	}
	public void setSalud(double salud) {
		this.salud = salud;
	}
	
	public String getNombre() {
		return nombre;
	}

	public double getEnergia() {
		return energia;
	}

	
	public double getSalud() {
		return salud;
	}


	public double getDa�o() {
		return da�o;
	}


	public double getPosicionX() {
		return posicionX;
	}


	public double getPosicionY() {
		return posicionY;
	}


	public double getDistanciaMaxima() {
		return distanciaMaxima;
	}


	public double getDistanciaMinima() {
		return distanciaMinima;
	}
	
	
	/*
	 public abstract String getNombre();
	 public abstract double getEnergia();
	 public abstract double getSalud();
	 public abstract double getDa�o();
	 public abstract double getPosicionX();
	 public abstract double getPosicionY();
	 public abstract double getDistanciaMaxima();
	 public abstract double getDistanciaMinima();
*/
	 public abstract void atacarA (Unidad unidad);



	 

}
