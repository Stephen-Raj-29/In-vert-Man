package in.steve.eMart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "rest")

@Getter
@Setter
public class Pcom {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long rid;
	private Integer sid;
	private Integer id;
	private String name;
	private Integer quantity;

}
