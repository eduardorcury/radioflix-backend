package com.erc.radioflix.resource;

import com.erc.radioflix.domain.Video;
import com.erc.radioflix.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Controller
@RequestMapping(value = "/videos")
public class VideoResource {

    @Autowired
    private VideoService videoService;

    @GetMapping
    public ResponseEntity<List<Video>> findAll() {
        List<Video> videos = videoService.findAll();
        return ResponseEntity.ok(videos);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Video> findById(@PathVariable int id) {
        Video video = videoService.findById(id);
        return ResponseEntity.ok(video);
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody Video video) {
        video = videoService.insert(video);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(video.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

}





