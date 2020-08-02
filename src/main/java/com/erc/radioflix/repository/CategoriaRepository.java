package com.erc.radioflix.repository;

import com.erc.radioflix.domain.Categoria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends MongoRepository<Categoria, String> {

    Categoria findByTitulo(String titulo);
}
