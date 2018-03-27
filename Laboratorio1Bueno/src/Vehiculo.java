
public class Vehiculo {
	private String modelo;
	private String bastidor;
	private int dimensiones;
	private int peso;
	private int maleteroTamanyo;
	private int nPuertas;
	private int capacidadCombustible;
	private boolean extras;
	
	public Vehiculo (String mod, String bast, int dim, int peso, int malTam, int nPuer, int comb){
		modelo = mod;
		bastidor = bast;
		dimensiones = dim;
		this.peso = peso;
		maleteroTamanyo = malTam;
		nPuertas = nPuer;
		capacidadCombustible = comb;		
	}
	
	public double calcularRango (int velMedia){
		//había establecido el tipo devuelto en int, 
		//pero no sirve para la versión Deportivo porque tiene un factor 1.1 y tiene que devolver double
		return 0;
	}
	
	public void setExtras(boolean b){
		extras = b;
	}
	
	public int getCapacidadCombustible(){
		return capacidadCombustible;
	}

}
