package com.quipux.service;

import com.quipux.model.Cancion;
import com.quipux.model.PlayList;
import com.quipux.repository.PlayListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayListService {

    @Autowired
    private PlayListRepository playListRepository;

    public PlayList createPlayList(PlayList playList) {
        playList.getCanciones().forEach((Cancion cancion) -> System.out.println(cancion));
        return playListRepository.save(playList);
    }

    public List<PlayList> getAllPlayList(){
        Iterable<PlayList> playLists = playListRepository.findAll();
        List<PlayList> playList = new ArrayList<PlayList>();
        playLists.forEach(playList::add);
        return  playList;
    }

    public Optional<PlayList> getPlayListById(long id){
        return playListRepository.findById(id);
    }

    public PlayList updatePlayList(PlayList playList){
        return playListRepository.save(playList);
    }
}
