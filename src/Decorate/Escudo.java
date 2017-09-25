package Decorate;

public class Escudo extends Item{

	 public Escudo (Unidad unidad){
		  this.unidad = unidad;
		 }

	@Override
	public String getNombre() {
		return this.unidad.getNombre();
	}

	@Override
	public double getEnergia() {
		return this.unidad.getEnergia();
	}

	@Override
	public double getSalud() {
		return this.unidad.getSalud() * 1.40 ;
	}

	@Override
	public double getDaño() {
		return this.unidad.getDaño();
	}

	@Override
	public double getPosicionX() {
		return this.unidad.getPosicionX();
	}

	@Override
	public double getPosicionY() {
		return this.unidad.getPosicionY();
	}

	@Override
	public double getDistanciaMaxima() {
		return this.unidad.getDistanciaMaxima();
	}

	@Override
	public double getDistanciaMinima() {
		return this.unidad.getDistanciaMaxima();
	}

	@Override
	public void atacarA(Unidad unidad) {
		this.unidad.atacarA(unidad);
		
	}






}
