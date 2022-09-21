package com.quipux.controller;

import com.quipux.model.Cancion;
import com.quipux.model.PlayList;
import com.quipux.service.CancionService;
import com.quipux.service.PlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class PlayListController {

    @Autowired
    private PlayListService playListService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<PlayList> getAllCanciones(){
        List<PlayList> playlists = playListService.getAllPlayList();
        return new ResponseEntity(playlists, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<PlayList> createPlayList(@RequestBody PlayList playlist){
        PlayList playlistCreated = playListService.createPlayList(playlist);
        return new ResponseEntity(playlistCreated, HttpStatus.CREATED);
    }
}
