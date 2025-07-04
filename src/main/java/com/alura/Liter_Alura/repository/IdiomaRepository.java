package com.alura.Liter_Alura.repository;

import com.alura.Liter_Alura.model.Idioma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository

public interface IdiomaRepository extends JpaRepository<Idioma,Long> {
    List<Idioma> findByName(String name);

}
