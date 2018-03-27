public class Dispositivo {
	private int identificador;
	private String marca;
	private String modelo;
	
	public Dispositivo(int identificador, String marca, String modelo){
		this.setIdentificador(identificador);
		this.marca = marca;
		this.modelo = modelo;
	}

	public int getIdentificador() {
		return identificador;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}