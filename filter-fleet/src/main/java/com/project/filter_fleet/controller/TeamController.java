/**
 * 
 */
package com.project.filter_fleet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.filter_fleet.model.Team;
import com.project.filter_fleet.service.TeamService;

/**
 * @author kritikasingh02
 *
 */
@RestController
@RequestMapping("/api/v1/team")
public class TeamController {
	
	@Autowired
	private TeamService teamService;
	
	@GetMapping()
	public ResponseEntity<List<Team>> getAllTeamList() {
		List<Team> allTeam = teamService.getAllTeam();
		return new ResponseEntity<List<Team>>(allTeam, HttpStatus.ACCEPTED);
	}

}
