package Decorate;

public class Soldado extends Unidad {

	public Soldado (String Nombre) {
		this.setNombre(Nombre);
		this.setSalud(200);
		this.setEnergia(100);
		this.setDa�o(50);
		this.setPosicionX(0);
		this.setPosicionY(0);
	}

	
	@Override
	public void atacarA(Unidad unidad) {
		unidad.setSalud(unidad.getSalud()-this.da�o);
		this.setEnergia(this.getEnergia()-10);
	}







	
	
}
