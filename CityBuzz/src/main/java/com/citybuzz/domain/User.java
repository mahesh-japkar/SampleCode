package com.citybuzz.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String email;

	@Column(name="is_deleted")
	private byte isDeleted;

	private String mobile;

	private String name;

	private String password;

	private String username;

	//bi-directional many-to-one association to Event
	@OneToMany(mappedBy="user1")
	private List<Event> events1;

	//bi-directional many-to-one association to Event
	@OneToMany(mappedBy="user2")
	private List<Event> events2;

	public User() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Event> getEvents1() {
		return this.events1;
	}

	public void setEvents1(List<Event> events1) {
		this.events1 = events1;
	}

	public Event addEvents1(Event events1) {
		getEvents1().add(events1);
		events1.setUser1(this);

		return events1;
	}

	public Event removeEvents1(Event events1) {
		getEvents1().remove(events1);
		events1.setUser1(null);

		return events1;
	}

	public List<Event> getEvents2() {
		return this.events2;
	}

	public void setEvents2(List<Event> events2) {
		this.events2 = events2;
	}

	public Event addEvents2(Event events2) {
		getEvents2().add(events2);
		events2.setUser2(this);

		return events2;
	}

	public Event removeEvents2(Event events2) {
		getEvents2().remove(events2);
		events2.setUser2(null);

		return events2;
	}

}