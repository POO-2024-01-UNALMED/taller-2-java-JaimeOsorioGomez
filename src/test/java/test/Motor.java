package test;

public class Motor {
	
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro (int registro_auto) {
		
		this.registro = registro_auto;
			
	}
	
	void asignarTipo (String tipo_auto) {
		
		if (tipo_auto == "electrico" || tipo_auto == "gasolina");
			
			this.tipo = tipo_auto;
		
	}
	

}
