package gusta.miithersz.geekcave.services.anime;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gusta.miithersz.geekcave.models.anime.AnimeModel;
import gusta.miithersz.geekcave.repositories.anime.AnimeRepository;

@Service
public class AnimeService {
 
    @Autowired
    private AnimeRepository animeRepository;

    public List<AnimeModel> getAnimeList() {
        List<AnimeModel> animeList = new ArrayList<>();
        
        try {
            animeList = animeRepository.findAll();
            
            return animeList;
        } catch (Exception e) {
            throw e;
        }
    }

}