package com.example.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cinema")
public class Cinema implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	@Column(name="name")
	private String name;
	

	
	@Column(name="schedule")
	private String schedule;
	@Column(name="rooms")
	private Integer rooms;
	@Column(name ="postalCode")
	private Integer postalCode;
	
	@ManyToMany
	@JoinTable(name = "cinema_movie",
	joinColumns = @JoinColumn(name = "cinema_id", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name = "movie_id", referencedColumnName = "id"))
	private List<Movie> movies = new ArrayList<Movie>();
	@ManyToMany(mappedBy="cinemas")
	private List<User> user =new ArrayList<User>();
	public Cinema() {}

	public Cinema(String name, Direction direction, String schedule, Integer rooms, Integer postalCode,
			List<Movie> movies, List<User> user) {
		super();
		this.name = name;
		this.schedule = schedule;
		this.rooms = rooms;
		this.postalCode = postalCode;
		this.movies = movies;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public Integer getRooms() {
		return rooms;
	}

	public void setRooms(Integer rooms) {
		this.rooms = rooms;
	}

	public Integer getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	
}
