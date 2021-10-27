package bill.digitalinnovation.ecommerce.payment.listener;

import java.util.UUID;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import bill.digitalinnovation.ecommerce.payment.streaming.CheckoutProcessor;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CheckoutCreatedListener {
	
	private final CheckoutProcessor checkoutProcessor;

	@StreamListener(CheckoutProcessor.INPUT)
	public void handler(CheckoutCreatedEvent event) {
		// processa pagamento
		// salvar dados de pagamento
		// enviar o evento do pagamento processado
		final PaymentCreatedEvent paymentCreatedEvent = PaymentCreatedEvent.newBuilder()
				.setCheckoutCode(event.getCheckoutCode())
				.setCheckoutStatus(event.getStatus())
				.setPaymentCode(UUID.randomUUID().toString())
				.build();
		checkoutProcessor.output().send(MessageBuilder.withPayload(paymentCreatedEvent)).build();
	}
}
