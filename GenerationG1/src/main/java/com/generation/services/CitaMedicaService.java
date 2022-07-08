package com.generation.services;

import com.generation.repositories.CitaMedicaRepository;

@Service
public class CitaMedicaService {
    /* INYECCION DE DEPENDENCIA A REPOSITORIO */
    @Autowired
    CitaMedicaRepository citaMedicaRepository;
}
