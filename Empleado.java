public class Empleado {
    private String nombre;
	private int numEmpleado, sueldo;
	
	public void setNombre(String nombre){
	    this.nombre = nombre;
    }
	
	public String getNombre(){
	    return this.nombre;
	}
	
	public void setNumEmplaedo(String numEmpleado){
	    this.numEmpleado = numEmpleado;
    }
	
	public String getNumEmpleado(){
	    return this.numEmpleado;
	}
	
	public void setSueldo(String sueldo){
	    if(sueldo >= 0){
		    this.sueldo = sueldo;
		}
    }
	
	public String getSueldo(){
	    return this.sueldo;
	}
	
	public void aumentarSueldo(int porcentaje){
	    sueldo += (int)(sueldo*porcentaje/100);
	}

}
