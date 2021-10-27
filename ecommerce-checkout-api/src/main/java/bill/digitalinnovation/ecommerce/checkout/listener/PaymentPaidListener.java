package bill.digitalinnovation.ecommerce.checkout.listener;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import bill.digitalinnovation.ecommerce.checkout.entity.CheckoutEntity;
import bill.digitalinnovation.ecommerce.checkout.repository.CheckoutRepository;
import bill.digitalinnovation.ecommerce.checkout.streaming.PaymentPaidSink;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PaymentPaidListener {

	private final CheckoutRepository checkoutRepository;
	
	@StreamListener(PaymentPaidSink.class)
	public void handler(PaymentCreatedEvent event) {
		final CheckoutEntity checkoutEntity = checkoutRepository.findByCode(event.getCheckoutCode().toString()).orElseThrow();
		checkoutEntity.setStatus(checkoutEntity.Status.APPROVED);
		checkoutRepository.save(checkoutEntity);
	}
}
