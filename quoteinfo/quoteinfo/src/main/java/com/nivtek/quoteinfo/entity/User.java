package com.nivtek.quoteinfo.entity;

import java.util.Date;

//@Entity
//@Table(name="userpeter")
public class User {
	
//	  @Id
//	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	 
//	  @Column(unique = true, nullable = false)
	  private String username;
	  
//	  @Column(nullable = false)
	  private String password;
	  
//	  @Column(nullable = true)
	  private String firstname;
	  
//	  @Column(nullable = true)
	  private String lastname;
	  
//	  @Column(nullable = true)
	  private String email;
	  
//	  @Column(nullable = false)
//	  @Enumerated(EnumType.STRING)
	  private Role role;
	  
//	  @Column(nullable = false)
	  private Boolean enabled = false;
	  
//	  @Column(nullable = false)
	  private Date dateCreate = new Date();

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	/**
	 * @return the enabled
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @return the dateCreate
	 */
	public Date getDateCreate() {
		return dateCreate;
	}

	/**
	 * @param dateCreate the dateCreate to set
	 */
	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", email=" + email + ", role=" + role + ", enabled=" + enabled
				+ ", dateCreate=" + dateCreate + "]";
	}

	/**
	 * @param id
	 * @param username
	 * @param password
	 * @param firstname
	 * @param lastname
	 * @param email
	 * @param role
	 * @param enabled
	 * @param dateCreate
	 */
	public User(Long id, String username, String password, String firstname, String lastname, String email, Role role,
			Boolean enabled, Date dateCreate) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.role = role;
		this.enabled = enabled;
		this.dateCreate = dateCreate;
	}

	/**
	 * 
	 */
	public User() {
		super();
	}

	/**
	 * @param username
	 * @param password
	 * @param firstname
	 * @param lastname
	 * @param email
	 * @param role
	 * @param enabled
	 */
	public User(String username, String password, String firstname, String lastname, String email, Role role,
			Boolean enabled) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.role = role;
		this.enabled = enabled;
	}
	  
	  

}



