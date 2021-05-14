package fichero1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;


public class ListaPaises {

	private HashSet<Country> listaPaises;
	
	public ListaPaises(String fichero, String ficheroCity, String ficheroDireciones) throws Exception{
		listaPaises = new HashSet<Country>();
//		try {
			FileReader f=new FileReader(fichero);
			BufferedReader buffer=new BufferedReader(f);
			
			String linea = buffer.readLine();
			
			while(linea!=null) {
				String aux[] = linea.split(",");
				if(aux.length>=2) {
					Country c = new Country(Integer.parseInt(aux[0]),aux[1]);
					this.listaPaises.add(c);
				}//else informar del error
				linea = buffer.readLine();
			}
			buffer.close();
			f.close();
			
			ListaCiudades(ficheroCity); //quizas sea ficheroCity y me he liado
			ListaDirecciones(ficheroDireciones);
//		}
//		catch(FileNotFoundException e) {
//			throw new Exception("no se puede abrir el fichero");
//		}
	}
	
	
	private void ListaCiudades(String ficheroCity) throws Exception{
//		try {
			FileReader f=new FileReader(ficheroCity);
			BufferedReader buffer=new BufferedReader(f);
			
			String linea = buffer.readLine();
			
			while(linea!=null) {
				String aux[] = linea.split(",");
				if(aux.length < 1) {
					City d = new City(Integer.parseInt(aux[0]),aux[1]);
					int codigoPais=Integer.parseInt(aux[4]);
					
					boolean encontrado=false;
					Iterator<Country> sig = this.listaPaises.iterator();
					
					while(sig.hasNext() && !encontrado) {
						Country pais = sig.next();
						if(pais.getCountry_id()==codigoPais) {
							pais.addCity(d);
							encontrado=true;
						}
					}
				}//else informar del error
				linea = buffer.readLine();
			}
			buffer.close();
			f.close();
		}
//		catch(FileNotFoundException e) {
//			throw new Exception("no se puede abrir el fichero" + ficheroCity);
//		}
	}
	
	
	
	
	private void ListaDirecciones(String ficheroDireciones) throws Exception{
		try {
			FileReader f=new FileReader(ficheroDireciones);
			BufferedReader buffer=new BufferedReader(f);
			
			String linea = buffer.readLine();
			
			while(linea!=null) {
				String aux[] = linea.split(",");
				if(aux.length < 4) {
					Address a = new Address(Integer.parseInt(aux[0]),aux[1]);
					int codigoCiudad=Integer.parseInt(aux[2]);
					
					boolean encontrado=false;
					Iterator<Country> sig = this.listaPaises.iterator();
					
					while(sig.hasNext() && !encontrado) {
						Country pais = sig.next();
						if(pais.getCountry_id()==codigoCiudad) {
							pais.addAddress(codigoCiudad, a);
							encontrado=true;
						}
					}
				}//else informar del error
				linea = buffer.readLine();
			}
			buffer.close();
			f.close();
		}
		catch(FileNotFoundException e) {
			throw new Exception("no se puede abrir el fichero" + ficheroDireciones);
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
