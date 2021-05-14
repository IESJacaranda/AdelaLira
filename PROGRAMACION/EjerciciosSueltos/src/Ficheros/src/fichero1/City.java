package fichero1;

import java.util.HashSet;

public class City {

	private int city_id;
	private String city;
	private HashSet<Address>listAddress;
	
	public City(int city_id, String city) {
		this.city_id=city_id;
		this.city=city;
		this.listAddress= new HashSet<Address>();
	}

	public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + city_id;
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
		City other = (City) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (city_id != other.city_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb  = new StringBuilder();
		sb.append("City [city_id=" + city_id + ", city=" + city + "]");
		for (Address a : listAddress) {
			sb.append(a.toString() +"\n");
		}
		return sb.toString();
	}
	
	public void addAddress(Address a) {
		this.listAddress.add(a);
	}
	
	
}
