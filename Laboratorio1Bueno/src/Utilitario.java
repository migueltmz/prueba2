
public class Utilitario extends Vehiculo{
	
	//ManosLibrea manosLibres = null; //pendiente creación clase ManosLibres
	private boolean dvdTrasero;
	private boolean cajonJuguetes;
	private boolean espejo;
	
	
	//Constructor que incicializa todos los atributos, incluidos super
	public Utilitario(String modelo, String bast, int dim, int peso, int maleteroTam,
			int nPuer, int combustible, boolean dvd, boolean cajon, boolean espejo) {//, ManosLibres m //pendiente
			
		super(modelo, bast, dim, peso, maleteroTam, nPuer, combustible);
		// TODO Auto-generated constructor stub
		
		dvdTrasero = dvd;
		cajonJuguetes = cajon;
		this.espejo = espejo;
		//determinar si hay al menos un extra para super.extras = true,
		if (dvd == true || cajon == true || espejo == true){//||manosLibres != null; //pendiente
			setExtras(true);
		}
	}
	
	public double calcularRango(int vMedia){		
		return getCapacidadCombustible() * 1000 / vMedia;
		//(capacidad del depósito de combustible * 1000) / velocidad media
	}

}
