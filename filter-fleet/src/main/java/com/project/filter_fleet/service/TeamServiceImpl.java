package com.project.filter_fleet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.filter_fleet.dao.TeamDao;
import com.project.filter_fleet.model.Team;


@Service
public class TeamServiceImpl implements TeamService {
	
	@Autowired
	private TeamDao teamDao;

	@Override
	public List<Team> getAllTeam() {
		return teamDao.findAll();
	}

	@Override
	public Team createTeam(Team team) {
		if(getTeamById(team.getTeamId()) != null) {
			return teamDao.save(team);
		} else {
			throw new RuntimeException("Team Name already exist. Please another name");
		}
		
	}

	@Override
	public Team updateTeam(Team team, int teamId) {
		if(getTeamById(teamId) != null) {
			return teamDao.save(team);
		} else {
			throw new RuntimeException("Team Name already exist. Please another name");
		}
	}

	@Override
	public boolean deleteTeam(int teamId) {
		if(getTeamById(teamId) != null) {
			teamDao.deleteById(teamId);
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public Team getTeamById(int teamId) {
		return teamDao.findById(teamId).get();
	}

}
