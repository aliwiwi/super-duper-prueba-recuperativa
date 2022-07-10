package com.generation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generation.models.Paciente;
import com.generation.services.PacienteService;

@Controller
@RequestMapping("/registro")
public class PacienteController {// localhost:8080/registro

    // inyeccion de dependencias
    @Autowired
    PacienteService pacienteService;

    // ruta para desplegar el jsp, ruta por default
    @RequestMapping("")
    public String registro(@ModelAttribute("paciente") Paciente paciente) {
        // pasamos el objeto usuario vacio

        return "paciente.jsp"; // la pagina a deplegar

    }

}
