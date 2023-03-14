package fenyx.pay.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BankingAccountModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 50)
    private String companyName;

    @Column(nullable = false)
    private Long balance;

    @Column(nullable = false)
    private Long toReceive;

    @Column(nullable = false)
    private LocalDateTime createdAt;
}
