package com.generation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.repositories.PacienteRepository;

@Service
public class PacienteService {
    /* INYECCION DE DEPENDENCIA */
    @Autowired
    PacienteRepository pacienteRepository;
}
