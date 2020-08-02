package com.erc.radioflix.service;

import com.erc.radioflix.domain.Video;
import com.erc.radioflix.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;

    public List<Video> findAll() {
        return videoRepository.findAll();
    }

    public Video findById(String id) {
        Optional<Video> video = videoRepository.findById(id);
        return video.orElseThrow(() -> new RuntimeException("Vídeo não encontrado"));
    }

    public Video insert(Video video) {
        return videoRepository.insert(video);
    }

}







