package in.steve.eMart.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "seller")

@Getter
@Setter
@IdClass(SellerId.class)
public class Seller {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long sid;
	@Id
	private String sname;
	private String smob;
	private String email;
	private String password;
}
