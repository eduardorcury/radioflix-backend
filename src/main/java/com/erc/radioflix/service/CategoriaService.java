package com.erc.radioflix.service;

import com.erc.radioflix.domain.Categoria;
import com.erc.radioflix.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    public Categoria findById(int id) {
        Optional<Categoria> categoria = categoriaRepository.findById(id);
        return categoria.orElseThrow(() -> new RuntimeException("Categoria não encontrada"));
    }

    public Categoria insert(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

}
