package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Etudiant {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@Column(name = "first_name")
		private String firstName;

		@Column(name = "last_name")
		private String lastName;
		
		@Column(name = "birthday")
		private Date  birthday;
		
		@Column(name = "numerotele")
		private String numerotele;
		
		@Column(name = "email_id")
		private String emailId;
		
		@Column(name = "pwd")
		private String pwd;
		
	
		
		
		public Etudiant() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Etudiant(long id, String firstName, String lastName, String emailId) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.emailId = emailId;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public Date getBirthday() {
			return birthday;
		}
		public void setBirthday(Date birthday) {
			this.birthday = birthday;
		}
		public String getNumerotele() {
			return numerotele;
		}
		public void setNumerotele(String numerotele) {
			this.numerotele = numerotele;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
	
		
		
	}



