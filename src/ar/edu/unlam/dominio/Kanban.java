package ar.edu.unlam.dominio;

import java.util.ArrayList;

public class Kanban {

	private ArrayList<Tareas> Tarea;
	private ArrayList<Usuario> usuario;

	public Kanban() {
		this.Tarea = new ArrayList<>();
		this.usuario = new ArrayList<>();

	}

	public Boolean agregarTarea(Tareas nuevaTarea) {
		boolean retorno = false;
		if (!Tarea.contains(nuevaTarea)) {
			Tarea.add(nuevaTarea);
			retorno = true;
		}
		return retorno;
	}

	public Boolean agregarUsuario(Usuario nuevoUsuario) {
		boolean retorno = false;
		if (this.usuario.add(nuevoUsuario)) {
			usuario.add(nuevoUsuario);
			retorno = true;
		}
		return retorno;
	}

	public ArrayList<Tareas> tareasTerminadas() {
		ArrayList<Tareas> tareasTerminadas = new ArrayList<Tareas>();
		for (Tareas I : Tarea) {
			if (I.getEstado() == EstadoDeLasTareas.FINALIZADA) {
				tareasTerminadas.add(I);
			}
		}
		return tareasTerminadas;
	}

	public Boolean eliminarTarea(Tareas tareaAEliminar) {
		boolean retorno = false;
		if (Tarea.contains(tareaAEliminar)) {
			Tarea.remove(tareaAEliminar);
			retorno = true;
		}
		return retorno;
	}

	public Boolean tomarTarea(Tareas nuevaTarea, Usuario nuevoUsuario) {
		boolean retorno = false;
		for (Tareas I : Tarea) {
			if (Tarea.contains(nuevaTarea) && usuario.contains(nuevoUsuario)) {
				if (I.getEstado() == EstadoDeLasTareas.EN_CURSO) {
					I.setEstado(EstadoDeLasTareas.EN_CURSO);
					I.setActual(nuevoUsuario);
					retorno = true;
				}
			}
		}
		return retorno;
	}

}
