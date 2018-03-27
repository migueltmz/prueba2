public class ManosLibres {
	private Dispositivo[] dispositivosAsociados = new Dispositivo[5];
	private int contadorDispositivosAsociados;
	private boolean ocupado;
	private Dispositivo[] dispositivosCompatibles = new Dispositivo[50];
	
	//Constructor
	public ManosLibres(){
		ocupado = false;
		contadorDispositivosAsociados = 0;
		dispositivosCompatibles[0] = new Dispositivo(0,"Samsumg","Galaxy");
		dispositivosCompatibles[1] = new Dispositivo(1,"Samsumg","Galaxy2");
		dispositivosCompatibles[2] = new Dispositivo(2,"Samsumg","Galaxy3");
	}
	
	//Conecta un dispositivo al manos libres
	public String conectarDispositivo(Dispositivo dispositivo){
		String mensaje;
		if (ocupado){
			mensaje = "Ya hay otro dispositivo conectado.";
		}
		else {
			if (comprobarSiAsociado(dispositivo)){
				ocupado = true;
				mensaje = "Dispositivo conectado con éxito.";
			}
			else{
				if (comprobarSiLleno()){
					mensaje = "Ya no se pueden asociar más dispositivos.";					
				}
				else{
					if (pedirContrasenya()){
						mensaje = "Dispositivo asociado correctamente.";
						conectarDispositivo(dispositivo);
					}
					else{
						mensaje = "No ha sido posible asociar el dispositivo.";
					}
				}
			}
		}
		return mensaje;
	}
	
	//Comprueba si el manos libres esta ocupado, y devuelve true o false.
	public boolean comprobarSiOcupado() {
		return this.ocupado;
	}
	
	//Comprueba si el dispositivo esta asociado
	public boolean comprobarSiAsociado(Dispositivo d) {
		boolean asociado=false;
		for(int i=0;i<this.contadorDispositivosAsociados;i++)
	        {
			    if(this.dispositivosAsociados[i].getIdentificador() == d.getIdentificador()){
	                asociado=true;	                
	            }
	        }
	        return asociado;
	}
	//Comprueba si el manos libres esta lleno (tiene asociados 5 dispositivos)
	public boolean comprobarSiLleno() {
		if(this.contadorDispositivosAsociados == this.dispositivosAsociados.length) {
			return true;
		} else {
			return false;
		}
	}
	//Comprueba si el dispositivo es compatible
	public boolean comprobarCompatibilidad(Dispositivo d) {
		boolean compatible = false;
		for(int i=0;i<this.dispositivosCompatibles.length;i++)
        {
            if(d.getMarca() == dispositivosAsociados[i].getMarca() && d.getModelo() == dispositivosAsociados[i].getModelo()){
            	compatible = true;                
            }
        }
		return compatible;
	}
	//Pide contrasenya al asociar nuevo dispositivo
	public boolean pedirContrasenya(){
		boolean resultado = false;
		return resultado;
	}
}