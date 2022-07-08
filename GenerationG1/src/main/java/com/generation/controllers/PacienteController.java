package com.generation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class PacienteController {

@Controller
@RequestMapping("/registro")
public class RegistroController {//localhost:8080/registro
	
	//inyeccion de dependencias
	@Autowired
	UsuarioService usuarioService;
	
	
	//ruta para desplegar el jsp, ruta por default
	@RequestMapping("")
	public String registro(@ModelAttribute("usuario") Usuario usuario) {
		//pasamos el objeto usuario vacio
		
		return "paciente.jsp"; //la pagina a deplegar
	
}
	
}
