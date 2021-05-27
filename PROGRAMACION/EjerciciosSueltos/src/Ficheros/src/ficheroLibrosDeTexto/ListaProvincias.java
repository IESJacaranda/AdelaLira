package ficheroLibrosDeTexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Iterator;

public class ListaProvincias {

	private HashSet<Provincia> listaProvincias;
	
	public ListaProvincias(String fichero) throws Exception{
		listaProvincias = new HashSet<Provincia>();
		try {
			FileReader f=new FileReader(fichero);
			BufferedReader buffer=new BufferedReader(f);
			
			String linea = buffer.readLine();
			
			while(linea!=null) {
				String aux[] = linea.split(",");
				if(aux.length>=1) {
					Provincia c = new Provincia(aux[0]);
					this.listaProvincias.add(c);
				}//else informar del error
				linea = buffer.readLine();
			}
			buffer.close();
			f.close();
			
			ListaLocalidades(fichero); 
		}
		catch(FileNotFoundException e) {
			throw new Exception ("No se puede abrir el fichero");
		}
	}
	
	private void ListaLocalidades(String fichero) throws Exception {
		try {
			FileReader f = new FileReader(fichero);
			BufferedReader buffer = new BufferedReader(f);
			
			String linea = buffer.readLine();
			linea = buffer.readLine();
			
			while(linea!=null) {
				String aux[] = linea.split(",");
				if(aux.length<=2) {
					Localidad l = new Localidad(aux[1]);
					
					String nombreProvincia = aux[0];
					
					boolean encontrado =false;
					Iterator<Provincia> sig = this.listaProvincias.iterator();
					
					while(sig.hasNext() && !encontrado) {
						Provincia provincia = sig.next();
						if(provincia.getNombre().equals(nombreProvincia)) {
							provincia.addLocalidad(l);
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
			throw new Exception("no se puede abrir el fichero-Localidades");
		}
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder sb  = new StringBuilder();
		
		for (Provincia a : listaProvincias) {
			sb.append(a.toString() +"\n");
		}
		return sb.toString();
	}
}
