package Decorate;

public class Arquero extends Unidad {
	
	int flechas;
	
	public int getFlechas() {
		return flechas;
	}


	public void setFlechas(int flechas) {
		this.flechas = flechas;
	}


	public Arquero (String Nombre) {
		this.setNombre(Nombre);
		this.setSalud(200);
		this.setEnergia(100);
		this.setDaño(50);
		this.setPosicionX(0);
		this.setPosicionY(0);
		this.setFlechas(6);
	}

	
	@Override
	public void atacarA(Unidad unidad) {
		unidad.setSalud(unidad.getSalud()-this.daño);
		this.setEnergia(this.getEnergia()-10);
		this.setFlechas(this.getFlechas()-1);
	}


}
