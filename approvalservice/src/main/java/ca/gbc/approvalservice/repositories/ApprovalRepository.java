package ca.gbc.approvalservice.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import ca.gbc.approvalservice.models.Approval;

public interface ApprovalRepository extends JpaRepository<Approval, Long> {
    // Additional query methods if needed
}
