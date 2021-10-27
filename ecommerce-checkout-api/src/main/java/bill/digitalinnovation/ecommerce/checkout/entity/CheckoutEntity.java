package bill.digitalinnovation.ecommerce.checkout.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Entity
public class CheckoutEntity {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String code;
	
	@Column
	@Enumerated(value = EnumType.STRING)
	private Status status;
	
	public enum Status {
		CREATED,
		APPROVED
	}
}
