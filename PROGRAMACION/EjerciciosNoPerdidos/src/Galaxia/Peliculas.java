package Galaxia;

public class Peliculas {

	private String nombre;
	private int a�o;
	private Personajes p1;
	private Personajes p2;
	private Personajes p3;
	

	public Peliculas (String nombre, int a�o, Personajes p1, Personajes p2, Personajes p3) { //�tendria que poner en los constructores de las dos clases todas las variables(menos personajes)?
		this.nombre=nombre;
		this.a�o=a�o;
		this.p1=p1;
		this.p2=p2;
		this.p3=p3;
	}
	
	public int comparaPelicula() {
		return 0;
	}
	
	public String poderMaximoPelicula() {
	
		return "El personaje 1 tiene un poder de" + this.p1.getCapacidadDestruccion() + ", el personaje 2 tiene un poder de " +  this.p2.getCapacidadDestruccion() + ", "
				+ " el personaje 3 tiene un poder de " +  this.p3.getCapacidadDestruccion();
	}

	public int poderPelicula() {
		int poder=0;
		return 0;
	}
	

	@Override
	public String toString() {
		return "Peliculas [nombre=" + nombre + ", a�o=" + a�o + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public Personajes getP1() {
		return p1;
	}

	public void setP1(Personajes p1) {
		this.p1 = p1;
	}

	public Personajes getP2() {
		return p2;
	}

	public void setP2(Personajes p2) {
		this.p2 = p2;
	}

	public Personajes getP3() {
		return p3;
	}

	public void setP3(Personajes p3) {
		this.p3 = p3;
	}
	
	
	
	
	
}
