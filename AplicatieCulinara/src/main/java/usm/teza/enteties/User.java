package usm.teza.enteties;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="USERS")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name = "ID_USER")
	private int id;
	
	@Column(name = "NICKNAME", length = 30)
	private String nickname;
	
	@Column(name = "PASSWD") //, length = 70 - A SE PRECIZA
	private String password;
	
	@Column(name = "EMAIL", length = 30)
	private String email;
	
	@Column(name = "REGISTER_DATE")
	private Date registerDate;
	
	@Column(name = "ROLE", length = 10)
	private String role; //user sau admin
	
	@OneToMany(mappedBy="user", orphanRemoval=true)
	private Set<Recipe> recipes = new HashSet<Recipe>();
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) { //de aplicat o functie da hash-are (md5 de ex) - de facut alert la tabel cu marimea respectiva
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {//Default = user
		this.role = role;
	}
	
	

}
