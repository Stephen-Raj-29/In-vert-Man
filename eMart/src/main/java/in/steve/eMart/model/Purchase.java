package in.steve.eMart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="purchase")

@Getter
@Setter
public class Purchase {

	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long pid;
	@Id
	private Integer sid;
	private Integer id;
	private String name;
	private Integer quantity;
	private Integer price;
}
