
public class Deportivo extends Vehiculo{
	private boolean altavocesExtra;
	private boolean equipoMusica;
	private boolean asientosPiel;
	private boolean clubNacional; 

	public Deportivo(String mod, String bast, int dim, int peso, int malTam, int nPuer, int comb,
			boolean altavocesExtra, boolean equipoMusica, boolean asientosPiel, boolean clubNacional) {
		
		super(mod, bast, dim, peso, malTam, nPuer, comb);
		// TODO Auto-generated constructor stub
		
		this.altavocesExtra = altavocesExtra;
		this.equipoMusica = equipoMusica;
		this.asientosPiel = asientosPiel;
		this.clubNacional = clubNacional;
		if (this.altavocesExtra == true || this.asientosPiel == true || this.equipoMusica == true || this.clubNacional == true){
			setExtras(true);
		}
	}
	
	public double calcularRango(int vMedia){
		return getCapacidadCombustible() * 500 / (1.1 * vMedia); 
				//capacidad del depósito de combustible * 500) / (1,1 * velocidad media)
	}

}
