package com.amky.model;

import java.util.ArrayList;
import java.util.List;

public class NFLTeams {

	 private List<NFLTeam> nflTeamList;
     
	    public List<NFLTeam> getNFLTeamList() {
	        if(nflTeamList == null) {
	        	nflTeamList = new ArrayList<NFLTeam>();
	        }
	        return nflTeamList;
	    }
	  
	    public void setNFLTeamList(List<NFLTeam> nflTeamList) {
	        this.nflTeamList = nflTeamList;
	    }
	 
}
