package fichero1;

import java.util.ArrayList;

public class Country {

	private int country_id;
	private String country; 
	private ArrayList<City>ciudades;
	
	public Country(int country_id, String country) {
		this.country_id=country_id;
		this.country=country;
		ciudades=new ArrayList<City>();
	}
	
	//Este metodo añade ciudades a la lista
	public void addCity(City a) {
		if(!this.ciudades.contains(a)){
			this.ciudades.add(a);
		}
	}
	//Este metodo recibe una ciudad y una dirección, añadiendo a la lista una nueva dirección
	public boolean addAddress(int idCity, Address a) {
		boolean resul=false;
		City c = new City(idCity,null);
		if(!this.ciudades.contains(c)) {
			this.ciudades.get(this.ciudades.indexOf(c)).addAddress(a);
			resul=true;
		}
		return resul;
	}
	//Este metodo muestra la lista de ciudades que tenemos
	public String listarCiudades() {
		return "";
	}
	
	public String listarCiudadPorCodigo(City city_id) {
		return "";
	}
	
	public int getNumeroDeCiudades() {
		return 2;
	}

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + country_id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (country_id != other.country_id)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb  = new StringBuilder();
		sb.append("Pais [oais_id=" + country_id + ", nombre=" + country + "]");
		for (City a : ciudades) {
			sb.append(a.toString() +"\n");
		}
		return sb.toString();
	}
	

}
