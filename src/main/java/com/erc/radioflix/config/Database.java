package com.erc.radioflix.config;

import com.erc.radioflix.domain.Categoria;
import com.erc.radioflix.domain.Video;
import com.erc.radioflix.repository.CategoriaRepository;
import com.erc.radioflix.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Database implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private VideoRepository videoRepository;

    @Override
    public void run(String... args) throws Exception {

        categoriaRepository.deleteAll();
        videoRepository.deleteAll();

        Categoria categoria1 = new Categoria(null, "The Bends", "#ab2b2b", "Segundo álbum (1995)");
        Categoria categoria2 = new Categoria(null, "OK Computer", "#6BD1FF", "Terceiro álbum (1997)");
        Categoria categoria3 = new Categoria(null, "In Rainbows", "#88942e", "Sétimo álbum (2007)");
        Categoria categoria4 = new Categoria(null, "From the Basement", "#2d6639", "Performances live de In Rainbows");

        categoriaRepository.saveAll(Arrays.asList(categoria1, categoria2, categoria3, categoria4));

        Video video1 = new Video(null, "My Iron Lung", "https://www.youtube.com/watch?v=pRU-6vaKaf4", categoria1.getTitulo());
        Video video2 = new Video(null, "High and Dry", "https://www.youtube.com/watch?v=7qFfFVSerQo", categoria1.getTitulo());
        Video video3 = new Video(null, "Fake Plastic Trees", "https://www.youtube.com/watch?v=n5h0qHwNrHk", categoria1.getTitulo());
        Video video4 = new Video(null, "Just", "https://www.youtube.com/watch?v=oIFLtNYI3Ls", categoria1.getTitulo());
        Video video5 = new Video(null, "Street Spirit (Fade Out)", "https://www.youtube.com/watch?v=LCJblaUkkfc", categoria1.getTitulo());

        Video video6 = new Video(null, "Paranoid Android", "https://www.youtube.com/watch?v=fHiGbolFFGw", categoria2.getTitulo());
        Video video7= new Video(null, "Karma Police", "https://www.youtube.com/watch?v=1uYWYWPc9HU", categoria2.getTitulo());
        Video video8 = new Video(null, "No Surpises", "https://www.youtube.com/watch?v=u5CVsCnxyXg", categoria2.getTitulo());
        Video video9 = new Video(null, "Man of War", "https://www.youtube.com/watch?v=DXP1KdZX4io", categoria2.getTitulo());
        Video video10 = new Video(null, "I Promise", "https://www.youtube.com/watch?v=0sFvFVkeGVg", categoria2.getTitulo());

        Video video11 = new Video(null, "Jigsaw Falling into Place", "https://www.youtube.com/watch?v=GoLJJRIWCLU", categoria3.getTitulo());
        Video video12 = new Video(null, "Nude", "https://www.youtube.com/watch?v=BbWBRnDK_AE", categoria3.getTitulo());
        Video video13 = new Video(null, "Reckoner", "https://www.youtube.com/watch?v=_uofQD-N6UI", categoria3.getTitulo());
        Video video14 = new Video(null, "Weird Fishes", "https://www.youtube.com/watch?v=TNRCvG9YtYI", categoria3.getTitulo());

        Video video15 = new Video(null, "Weird Fishes / Arpeggi", "https://www.youtube.com/watch?v=ejdZEe4Rd0o", categoria4.getTitulo());
        Video video16 = new Video(null, "15 Step", "https://www.youtube.com/watch?v=kXl0F9oF92E", categoria4.getTitulo());
        Video video17 = new Video(null, "All I Need", "https://www.youtube.com/watch?v=t2DWy__LS6o", categoria4.getTitulo());
        Video video18 = new Video(null, "Reckoner", "https://www.youtube.com/watch?v=2FMP-9bn9N8", categoria4.getTitulo());
        Video video19 = new Video(null, "Nude", "https://www.youtube.com/watch?v=b_jj9r4b5i4", categoria4.getTitulo());
        Video video20 = new Video(null, "Videotape", "https://www.youtube.com/watch?v=BTsH6jcyJgw", categoria4.getTitulo());

        categoria1.getVideos().addAll(Arrays.asList(video1, video2, video3, video4, video5));
        categoria2.getVideos().addAll(Arrays.asList(video6, video7, video8, video9, video10));
        categoria3.getVideos().addAll(Arrays.asList(video11, video12, video13, video14));
        categoria4.getVideos().addAll(Arrays.asList(video15, video16, video17, video18, video19, video20));

        videoRepository.saveAll(Arrays.asList(video1, video2, video3, video4, video5, video6, video7, video8, video9, video10,
                video11, video12, video13, video14, video15, video16, video17, video18, video19, video20));

        categoriaRepository.save(categoria1);
        categoriaRepository.save(categoria2);
        categoriaRepository.save(categoria3);
        categoriaRepository.save(categoria4);

    }
}
