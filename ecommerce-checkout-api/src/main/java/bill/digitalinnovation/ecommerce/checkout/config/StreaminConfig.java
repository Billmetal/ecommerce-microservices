package bill.digitalinnovation.ecommerce.checkout.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

import bill.digitalinnovation.ecommerce.checkout.streaming.CheckoutCreatedSource;
import bill.digitalinnovation.ecommerce.checkout.streaming.PaymentPaidSink;

@Configuration
@EnableBinding(value = {CheckoutCreatedSource.class,PaymentPaidSink.class})
public class StreaminConfig {

}
