package bill.digitalinnovation.ecommerce.checkout.resource.checkout;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutRequest implements Serializable{

	private String firstName;
	private String lastName;
	private String userName;
	private String email;
	private String address;
	private String complement;
	private String country;
	private String state;
	private String zip;
	private Boolean saveAddress;
	private Boolean saveInfo;
	private String paymentMethod;
	private String cardName;
	private String cardNumber;
	private String cardDate;
	private String cardCvv;
}
