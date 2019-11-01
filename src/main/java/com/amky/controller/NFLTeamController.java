package com.amky.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.amky.dao.NFLTeamDAO;
import com.amky.model.NFLTeam;
import com.amky.model.NFLTeams;


@RestController
@RequestMapping(path = "/nflteams")
public class NFLTeamController {

	@Autowired
    private NFLTeamDAO nflTeamDao;
     
    @GetMapping(path="/", produces = "application/json")
    public NFLTeams getNFLTeams()
    {
        return nflTeamDao.getAllNFLTeams();
    }
     
    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addNFLTeam(@RequestBody NFLTeam nflTeam)
    {
        Integer id = nflTeamDao.getAllNFLTeams().getNFLTeamList().size() + 1;
        nflTeam.setId(id);
         
        nflTeamDao.addNFLTeam(nflTeam);
         
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                    .path("/{id}")
                                    .buildAndExpand(nflTeam.getId())
                                    .toUri();
         
        return ResponseEntity.created(location).build();
    }
    
    @PutMapping(path= "/id", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> updateNFLTeam(@RequestBody NFLTeam nflTeam)
    {
        Integer id = nflTeamDao.getAllNFLTeams().getNFLTeamList().size() + 1;
        nflTeam.setId(id);
         
        nflTeamDao.updateNFLTeam(nflTeam);
         
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                    .path("/{id}")
                                    .buildAndExpand(nflTeam.getId())
                                    .toUri();
         
        return ResponseEntity.created(location).build();
    }
    	
}
