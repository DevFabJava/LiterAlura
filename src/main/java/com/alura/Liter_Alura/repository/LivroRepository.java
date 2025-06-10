package com.alura.Liter_Alura.repository;

import com.alura.Liter_Alura.model.Livro;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface LivroRepository extends JpaRepository<Livro, Long> {
    @JsonIgnoreProperties(ignoreUnknown = true)
    boolean existsByTitle(String title);
    Optional<Livro> findById(Long id);
}
