package Decorate;

public class App {

	public static void main(String[] args) {
		Unidad soldado1 = new Soldado("Soldado1");
		Unidad soldado2 = new Soldado("Soldado2");
		Unidad arquero1 = new Arquero ("Arquero1");
		
		System.out.println("VALORES INICIALES DE SOLDADO:");
		System.out.println("Nombre:" + soldado1.getNombre());
		System.out.println("Energia:" + soldado1.getEnergia());
		System.out.println("Salud:" + soldado1.getSalud());
		
		System.out.println(" ");
		System.out.println(" ");
		
		soldado1 =new Escudo (soldado1);
		System.out.println("VALORES DEL SOLDADO LUEGO DE OBTENER ESCUDO:");
		System.out.println("Nombre:" + soldado1.getNombre());
		System.out.println("Energia:" + soldado1.getEnergia());
		System.out.println("Salud:" + soldado1.getSalud());
		
		System.out.println(" ");
		System.out.println(" ");
		soldado1.atacarA(soldado2);
		System.out.println("VALORES DEL SOLDADO 1 LUEGO DE SER ATACADO POR SOLDADO 2:");
		System.out.println("Nombre:" + soldado2.getNombre());
		System.out.println("Fuerza:" + soldado2.getEnergia());
		System.out.println("Salud:" + soldado2.getSalud());
		
		System.out.println(" ");
		System.out.println(" ");
		arquero1.atacarA(soldado2);
		System.out.println("VALORES DEL SOLDADO 1 LUEGO DE SER ATACADO POR SOLDADO 2:");
		System.out.println("Nombre:" + soldado2.getNombre());
		System.out.println("Fuerza:" + soldado2.getEnergia());
		System.out.println("Salud:" + soldado2.getSalud());
		

	}

}
