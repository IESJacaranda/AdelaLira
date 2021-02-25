package Galaxia;

public class Personajes {

	private String nombre;
	private double capacidadDestruccion;
	private String primeraPelicula;
	private double estatura;
	private String especie;
	private double peso;
	
	public Personajes () {
		}
	
	public Personajes (String nombre, double capacidadDestruccion, String primeraPelicula, double estuatura, String especie, double peso) {
		this.nombre=nombre;
		this.capacidadDestruccion=capacidadDestruccion;
		this.primeraPelicula=primeraPelicula;
		this.estatura=estatura;
		this.especie=especie;
		this.peso=peso;
	}

	@Override
	public String toString() {
		return "Personajes [nombre=" + nombre + ", capacidadDestruccion=" + capacidadDestruccion + ", primeraPelicula="
				+ primeraPelicula + ", estatura=" + estatura + ", especie=" + especie + ", peso=" + peso + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCapacidadDestruccion() {
		return capacidadDestruccion;
	}

	public void setCapacidadDestruccion(double capacidadDestruccion) {
		this.capacidadDestruccion = capacidadDestruccion;
	}

	public String getPrimeraPelicula() {
		return primeraPelicula;
	}

	public void setPrimeraPelicula(String primeraPelicula) {
		this.primeraPelicula = primeraPelicula;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
}
