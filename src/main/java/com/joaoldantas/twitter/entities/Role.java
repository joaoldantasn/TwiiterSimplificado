package com.joaoldantas.twitter.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_role")
@Data
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_id")
	private Long roleId;
	
	private String name;
	
	public enum Values {
		ADMIN (1L),
		BASIC(2L);
		
		long roleId;
		
		Values(long roleId){
			this.roleId = roleId;
		}
		
		public long getRoleId() {
			return roleId;
		}
		
	}
	
}
