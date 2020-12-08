package com.erc.radioflix.service;

import com.erc.radioflix.domain.Categoria;
import com.erc.radioflix.domain.Video;
import com.erc.radioflix.repository.CategoriaRepository;
import com.erc.radioflix.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Video> findAll() {
        return videoRepository.findAll();
    }

    public Video findById(int id) {
        Optional<Video> video = videoRepository.findById(id);
        return video.orElseThrow(() -> new RuntimeException("Vídeo não encontrado"));
    }

    public Video insert(Video video) {

        Categoria categoria = categoriaRepository.findByTitulo(video.getCategoria().getTitulo());
        categoria.getVideos().add(video);
        categoriaRepository.save(categoria);
        return videoRepository.save(video);
    }

}







