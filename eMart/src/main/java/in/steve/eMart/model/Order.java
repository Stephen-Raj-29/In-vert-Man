package in.steve.eMart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="orders")

@Getter
@Setter
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long oid;
	private Integer cid;
	private Integer id;
	private Integer quantity;
	private Integer price;
	
}
