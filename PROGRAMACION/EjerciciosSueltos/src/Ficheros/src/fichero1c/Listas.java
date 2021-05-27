package fichero1c;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class Listas {

	private HashSet<Country>listaPaises;
	
	public Listas (String ficheroPaises, String ficheroCiudades, String ficheroDirecciones) throws Exception {
		this.listaPaises=new HashSet<Country>();
		try {
			FileReader f=new FileReader(ficheroPaises);
			BufferedReader buffer=new BufferedReader(f);
			
			String linea = buffer.readLine();
			linea = buffer.readLine();
			
			while(linea!=null){
				String aux[]=linea.split(",");
				if(aux.length>=2) {
					Country c = new Country(Integer.parseInt(aux[0]),aux[1]);
					listaPaises.add(c);
				}
				linea = buffer.readLine();
			}
			buffer.close();
			f.close();
			
			listarCiudades(ficheroCiudades);
			listarDirecciones(ficheroDirecciones);
		}
		catch (FileNotFoundException e) {
			throw new Exception("No se puede abrir el fichero" + ficheroPaises);
		}
	}
	
	
	
	public void listarCiudades (String ficheroCiudades) throws Exception {
		try {
			FileReader f=new FileReader(ficheroCiudades);
			BufferedReader buffer=new BufferedReader(f);
			
			String linea = buffer.readLine();
			linea = buffer.readLine();
			
			while(linea!=null){
				String aux[]=linea.split(",");
				if(aux.length>=3) {
					City c = new City(Integer.parseInt(aux[0]),aux[1]);
					int codigoPais = Integer.parseInt(aux[2]);
					
					boolean existe=false;
					Iterator<Country> sig = listaPaises.iterator();
					while(existe==false && sig.hasNext()) {
						Country e = sig.next();
						if(e.getCountry_id()==codigoPais) {
							e.addCiudades(c);
							existe=true;
						}
					}
				}
				linea = buffer.readLine();
			}
			buffer.close();
			f.close();
			
		}catch(FileNotFoundException e) {
			throw new Exception("No se puede abrir el fichero" + ficheroCiudades);
		}
	}
	
	
	
	public void listarDirecciones(String ficheroDirecciones) throws Exception {
		try {
			FileReader f=new FileReader(ficheroDirecciones);
			BufferedReader buffer=new BufferedReader(f);
			
			String linea = buffer.readLine();
			linea = buffer.readLine();
			
			while(linea!=null){
				String aux[]=linea.split(",");
				if(aux.length>=5) {
					Address a = new Address(Integer.parseInt(aux[0]),aux[1]);
					int codigoCiudad = Integer.parseInt(aux[4]);
					String nombreCiudad = aux[3];
					
					boolean encontrado=false;
					Iterator<Country> sig = this.listaPaises.iterator();
					while(sig.hasNext() && !encontrado) {
						Country pais = sig.next();
						if(pais.addDirecciones(codigoCiudad, nombreCiudad, a)==true) {
							encontrado=true;
						}
					}
				}
				linea = buffer.readLine();
			}
			buffer.close();
			f.close();
			
		
		}
		catch(FileNotFoundException e) {
			throw new Exception("No se puede abrir el fichero" + ficheroDirecciones);
		}
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb  = new StringBuilder();
		
		for (Country a : listaPaises) {
			sb.append(a.toString() +"\n");
		}
		return sb.toString();
	}
	
	
}
