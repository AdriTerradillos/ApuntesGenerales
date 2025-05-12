package es.curso.spring08;



public class tipoHabitaculo extends Habitaciones {
	
	// genero los atributos de la clase tipoHabitaculo, clase extendida de la clase Habitación
	private String cocina;
	private String baño;
	private String salaEstar;
	private String Dormitorio1;
	private String Dormitorio2;
	private String Dormitorio3;
	private String Jardin;
	
	
	
	// genero los getters y setters de la clase extendida tipoHabitaculo
	
	public String getCocina() {
		return cocina;
	}
	public void setCocina(String cocina) {
		this.cocina = cocina;
	}
	public String getBaño() {
		return baño;
	}
	public void setBaño(String baño) {
		this.baño = baño;
	}
	public String getSalaEstar() {
		return salaEstar;
	}
	public void setSalaEstar(String salaEstar) {
		this.salaEstar = salaEstar;
	}
	public String getDormitorio1() {
		return Dormitorio1;
	}
	public void setDormitorio1(String dormitorio1) {
		Dormitorio1 = dormitorio1;
	}
	public String getDormitorio2() {
		return Dormitorio2;
	}
	public void setDormitorio2(String dormitorio2) {
		Dormitorio2 = dormitorio2;
	}
	public String getDormitorio3() {
		return Dormitorio3;
	}
	public void setDormitorio3(String dormitorio3) {
		Dormitorio3 = dormitorio3;
	}
	public String getJardin() {
		return Jardin;
	}
	public void setJardin(String jardin) {
		Jardin = jardin;
	}
	
	
}