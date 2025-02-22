package com.example.demo.Domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Roles")
public class Role implements Serializable {
	@Id
	private String id;
	private String name;

	@JsonIgnore
	@OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
	@Cascade(value = { CascadeType.SAVE_UPDATE })
	@OnDelete(action = OnDeleteAction.CASCADE)
	Set<AccountRoles> accountroles;
}
