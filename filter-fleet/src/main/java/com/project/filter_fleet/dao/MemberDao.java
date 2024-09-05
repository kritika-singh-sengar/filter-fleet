/**
 * 
 */
package com.project.filter_fleet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.filter_fleet.model.Member;

/**
 * @author kritikasingh02
 *
 */
@Repository
public interface MemberDao extends JpaRepository<Member, Integer> {

}
