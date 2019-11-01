package com.amky.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.amky.model.*;
 
@Repository
public class NFLTeamDAO {
	private static NFLTeams list = new NFLTeams();
    
    static
    {
        list.getNFLTeamList().add(new NFLTeam(1, "Eagles", "Philadelphia", "Carson Wentz"));
    }
     
    public NFLTeams getAllNFLTeams()
    {
        return list;
    }
     
    public void addNFLTeam(NFLTeam nflteam) {
        list.getNFLTeamList().add(nflteam);
    }
      
    public void updateNFLTeam(NFLTeam nflteam) {
//    	List<NFLTeam> listteam = list.getNFLTeamList();
//    	listteam.forEach(action);
//        list.getNFLTeamList().repl.add(nflteam);
    }
}
