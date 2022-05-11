package ar.edu.unlam.dominio;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void crearKanban() {

		Kanban kanbann = new Kanban();
		assertNotNull(kanbann);
	}

	@org.junit.Test
	public void AgregarTareas() {

		boolean resultadoEsperado = true;
		boolean resultadoObtenido;

		Kanban kanbann = new Kanban();
		Usuario Ariel = new Usuario("ariel");
		// (String nombre, Usuario creador, Usuario actual, EstadoDeLasTareas estado)
		Tareas nuevaTarea = new Tareas("agregar tarea", Ariel, Ariel, EstadoDeLasTareas.PENDIENTE);

		resultadoObtenido = kanbann.agregarTarea(nuevaTarea);

		assertEquals(resultadoEsperado, resultadoObtenido);

	}

	@org.junit.Test
	public void AgregarUsuarios() {

		boolean resultadoEsperado = true;
		boolean resultadoObtenido;

		Kanban kanbann = new Kanban();
		Usuario nuevoUsuario = new Usuario("ariel");
		Tareas nuevaTarea = new Tareas("agregar tarea", nuevoUsuario, nuevoUsuario, EstadoDeLasTareas.PENDIENTE);

		resultadoObtenido = kanbann.agregarUsuario(nuevoUsuario);

		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@org.junit.Test
	public void verTareasEnCurso() {

		boolean resultadoEsperado = true;
		boolean resultadoObtenido;

		Kanban kanbann = new Kanban();
		Usuario Ariel = new Usuario("ariel");
		Tareas nuevaTarea = new Tareas("agregar tarea", Ariel, Ariel, EstadoDeLasTareas.EN_CURSO);

		kanbann.agregarUsuario(Ariel);
		kanbann.agregarTarea(nuevaTarea);

	//	System.out.println(kanbann.TareaEnCurso());
	}

	@org.junit.Test
	public void finalizarUnaTarea() {

		Kanban kanbann = new Kanban();
		Usuario Ariel = new Usuario("ariel");
		Tareas nuevaTarea = new Tareas("agregar tarea", Ariel, Ariel, EstadoDeLasTareas.EN_CURSO);

		kanbann.agregarUsuario(Ariel);
		kanbann.agregarTarea(nuevaTarea);

		assertEquals(true, kanbann.eliminarTarea(nuevaTarea));
	}

	@org.junit.Test
	public void listaDeTareasFinalizadas() {

		Kanban kanbann = new Kanban();
		Usuario Ariel = new Usuario("ariel");
		Tareas nuevaTarea = new Tareas("agregar tarea", Ariel, Ariel, EstadoDeLasTareas.FINALIZADA);

		kanbann.agregarUsuario(Ariel);
		kanbann.agregarTarea(nuevaTarea);

		System.out.println(kanbann.tareasTerminadas());
	}

	@org.junit.Test
	public void queUnUsuarioTomeUnaTarea() {

		Boolean Esperado = true;
		Boolean resultado;

		Kanban kanbann = new Kanban();
		Usuario Ariel = new Usuario("ariel");
		Tareas nuevaTarea = new Tareas("agregar tarea", Ariel, Ariel, EstadoDeLasTareas.PENDIENTE);

		kanbann.agregarUsuario(Ariel);
		kanbann.agregarTarea(nuevaTarea);

		resultado = kanbann.tomarTarea(nuevaTarea, Ariel);

		assertEquals(Esperado, resultado);
	}
}
