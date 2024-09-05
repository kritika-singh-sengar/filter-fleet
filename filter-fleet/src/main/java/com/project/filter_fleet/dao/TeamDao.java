/**
 * 
 */
package com.project.filter_fleet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.filter_fleet.model.Team;

/**
 * @author kritikasingh02
 *
 */
@Repository
public interface TeamDao extends JpaRepository<Team, Integer> {

}
