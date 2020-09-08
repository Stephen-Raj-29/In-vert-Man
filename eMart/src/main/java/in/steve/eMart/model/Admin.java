package in.steve.eMart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="login")

@Getter
@Setter
public class Admin {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long aid;
	@Id
	private String aname;
	private String password;
	private String type;
}
