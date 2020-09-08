package in.steve.eMart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="communicate")

@Getter
@Setter
public class Communicate {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long cid;
	private Integer id;
	private String name;
	private Integer quantity;
}
