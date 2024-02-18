package test;

import java.util.*;

public class Auto {
	
	static int cantidadCreados = 0;

	String modelo;
	int precio;
	Asiento [] asientos;
	String marca;
	Motor motor;
	int registro;
	
	int cantidadAsientos() {
		
		int numAsientos = 0;
		
		int contador = this.asientos.length;
		
		for (int i = 0; i < contador; i++) {
			
			if (this.asientos[i] instanceof Asiento) {
				
				numAsientos++;
				
			}				
							
	}
		return numAsientos;
			
	}
	
	String verificarIntegridad() {
		
		int cont = this.asientos.length;
		
		List<Asiento> lista = new ArrayList<>();
		
		if (this.motor.registro == this.registro) {
			
			for (int j = 0; j < cont; j++) {
				
				if (this.asientos[j] instanceof Asiento) {
					
					lista.add(this.asientos[j]);
					
					
				}
			
		}
			
							
				
	} 
		for (int x = 0 ; x < lista.size()-1; x++) 
			
			if (lista.get(x).registro == lista.get(x+1).registro) {
				
				return "Auto original";
				
				
			}
		return "Las piezas no son originales";	
	}
}
		
	


