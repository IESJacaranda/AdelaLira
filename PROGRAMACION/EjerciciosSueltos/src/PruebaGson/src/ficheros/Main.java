package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Properties;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader buffer = new BufferedReader(new FileReader("./ficheritos/prueba.json"));

		String ficheroCadena="";
		String aux = buffer.readLine();
		while(aux!=null) {
			ficheroCadena=ficheroCadena+aux;
			aux=buffer.readLine();
		}
		System.out.println(ficheroCadena);
		
		
		// LEER UN FICHERO O UNA PERSONA
		Gson gson = new Gson();
//		Properties propiedades = gson.fromJson(ficheroCadena, Properties.class);
//		
//		System.out.println(propiedades.getProperty("nombre"));
//		System.out.println(propiedades.getProperty("apellidos"));
//		System.out.println(propiedades.getProperty("edad"));
//	
//	
//		Persona p1 = gson.fromJson(ficheroCadena, Persona.class);
//		System.out.println(p1);
	
		
//		ArrayList<Persona> lista = gson.fromJson(ficheroCadena, new TypeToken<ArrayList<Persona>>(){}.getType());
//		for (Persona p : lista) {
//			System.out.println(p);
//		}
		
		ListaPersona l = gson.fromJson(ficheroCadena, ListaPersona.class);
		System.out.println(l);
		
		l.addPersona("pepe","perez",50);
		l.addPersona("juana","rodriguez",48);
		l.addPersona("juanita","perez",25);
		//meter mas
		
		
		String resultado = gson.toJson(l);
		
		Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
		String representacionBonita = prettyGson.toJson(l);
		
		FileWriter f = new FileWriter("./ficheritos/nuevo.json");
		PrintWriter bufferEscritura = new PrintWriter(f);
		
		bufferEscritura.println(representacionBonita);
		bufferEscritura.close();
		f.close();
		
		
		
	}

}
