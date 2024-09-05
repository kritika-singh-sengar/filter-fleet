/**
 * 
 */
package com.project.filter_fleet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author kritikasingh02
 */
@Entity
@Table(name="members")
public class Member {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int memberId;
	
	@Column(name="team_id")
	private int teamId;
	
	@Column(name="member_name")
	private String memberName;
	
	public Member() {
		
	}

	public Member(int memberId, int teamId, String memberName) {
		super();
		this.memberId = memberId;
		this.teamId = teamId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

}
