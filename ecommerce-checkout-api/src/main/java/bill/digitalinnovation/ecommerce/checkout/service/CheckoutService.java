package bill.digitalinnovation.ecommerce.checkout.service;

import java.util.Optional;

import bill.digitalinnovation.ecommerce.checkout.entity.CheckoutEntity;
import bill.digitalinnovation.ecommerce.checkout.resource.checkout.CheckoutRequest;

public interface CheckoutService {

	Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}
