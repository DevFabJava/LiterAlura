package com.alura.Liter_Alura.service;

import com.alura.Liter_Alura.model.Autor;
import com.alura.Liter_Alura.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class AutorService {
    @Autowired
    private AutorRepository repository;

    public List<Autor> listAuthors() {
        return repository.findAll();
    }

    public List<Autor> listAuthorsAliveInSpecificYear(Integer ano) {
        return repository.findAutoresByYear(ano);
    }
}
