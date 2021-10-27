package bill.digitalinnovation.ecommerce.checkout.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bill.digitalinnovation.ecommerce.checkout.entity.CheckoutEntity;

@Repository
public interface CheckoutRepository extends JpaRepository<CheckoutEntity,Long> {

	Optional<CheckoutEntity> findByCode(String code);
}
