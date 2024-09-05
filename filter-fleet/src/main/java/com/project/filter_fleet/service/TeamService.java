/**
 * 
 */
package com.project.filter_fleet.service;

import java.util.List;


import com.project.filter_fleet.model.Team;

/**
 * @author kritikasingh02
 *
 */
public interface TeamService {
	
	public List<Team> getAllTeam();
	public Team createTeam(Team team);
	public Team updateTeam(Team team, int teamId);
	public boolean deleteTeam(int teamId);
	public Team getTeamById(int teamId);
}
