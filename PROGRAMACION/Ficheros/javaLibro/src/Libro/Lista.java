package Libro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;


public class Lista {
	
	private HashSet<Provincia> listaProvincia;

	public Lista(String fichero) throws Exception{
	
		this.listaProvincia=new HashSet<Provincia>();
		try {
			FileReader f=new FileReader(fichero);
			BufferedReader buffer=new BufferedReader(f);
			
			String linea = buffer.readLine();
			linea = buffer.readLine();
			
			while (linea!=null) {
				String aux[]=linea.split(",");
				if(aux.length>=1) {
					Provincia c = new Provincia(aux[0]);
					this.listaProvincia.add(c);
				}
				linea = buffer.readLine();
			}
			buffer.close();
			f.close();
			
			listaLocalidades(fichero);
			listaCentros(fichero);
		}
		catch (FileNotFoundException e){
			throw new Exception("No se encuentra el fichero");
		}
	}
	
	
	public void listaLocalidades(String fichero) throws Exception {
		try {
			FileReader f=new FileReader(fichero);
			BufferedReader buffer=new BufferedReader(f);
			
			String linea = buffer.readLine();
			linea = buffer.readLine();
			
			
			while(linea!=null) {				
				String aux[]=linea.split(",");
				if(aux.length>=2) {
					Localidad c = new Localidad(aux[1]);
					String nombreProvincia = aux[0];
					
					boolean encontrado=false;
					Iterator<Provincia> sig = this.listaProvincia.iterator();
					while(sig.hasNext() && !encontrado) {
						Provincia provincia = sig.next();
						if(provincia.getNombre().contentEquals(nombreProvincia)) {
							provincia.addLocalidad(c);
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
			throw new Exception("No se encuentra el fichero de localidades");
		}
	}
	
	
	public void listaCentros(String fichero) throws Exception {
		try {
			FileReader f=new FileReader(fichero);
			BufferedReader buffer=new BufferedReader(f);
			
			String linea = buffer.readLine();
			linea = buffer.readLine();
			
			
			while(linea!=null) {				
				String aux[]=linea.split(",");
				if(aux.length>=5) {
					Centro c = new Centro((aux[2]),(Integer.parseInt(aux[3])),(aux[4]));
					String nombreLocalidad = aux[1];
					
					boolean encontrado=false;
					Iterator<Provincia> sig = this.listaProvincia.iterator();
					while(sig.hasNext() && !encontrado) {
						Provincia provincia = sig.next();
						if(provincia.addCentro(nombreLocalidad, c)==true) {
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
			throw new Exception("No se encuentra el fichero de centros");
		}
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder sb  = new StringBuilder();
		
		for (Provincia a : listaProvincia) {
			sb.append(a.toString() +"\n");
		}
		return sb.toString();
	}

}
