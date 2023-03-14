package fenyx.pay.repositories;

import fenyx.pay.models.BankingAccountModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BankingAccountRepository extends JpaRepository<BankingAccountModel, UUID> {

}
