package ar.edu.unlam.dominio;

public class Tareas {

	private String nombre;
	private EstadoDeLasTareas estado;
	private Usuario creador;
	private Usuario actual;

	public Tareas(String nombre, Usuario creador, Usuario actual, EstadoDeLasTareas estado) {
		this.nombre = nombre;
		this.creador = creador;
		this.actual = actual;
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public EstadoDeLasTareas getEstado() {
		return estado;
	}

	public void setEstado(EstadoDeLasTareas estado) {
		this.estado = estado;
	}

	public Usuario getCreador() {
		return creador;
	}

	public void setCreador(Usuario creador) {
		this.creador = creador;
	}

	public Usuario getActual() {
		return actual;
	}

	public void setActual(Usuario actual) {
		this.actual = actual;
	}

	@Override
	public String toString() {
		return "Tareas [nombre=" + nombre + ", estado=" + estado + ", creador=" + creador + "]";
	}

	
	
}
