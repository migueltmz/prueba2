
public class Comprador {
	private String identificador;
	private String nombre;
	private int telefono;
	private String direccion;
	private Vehiculo[] vehiculos = new Vehiculo[10];
	private int contadorVehiculos = 0;
	
	public Comprador(String id, String nombre, int telf, String dir){
		identificador = id;
		this.nombre = nombre;
		telefono = telf;
		direccion = dir;
	}
	
	public void comprarVehiculo(Vehiculo v){
		vehiculos[contadorVehiculos] = v;
		contadorVehiculos++;
	}
	
}
