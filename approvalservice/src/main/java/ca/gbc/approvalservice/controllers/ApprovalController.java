package ca.gbc.approvalservice.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ca.gbc.approvalservice.models.Approval;
import ca.gbc.approvalservice.repositories.ApprovalRepository;
import java.util.List;

@RestController
@RequestMapping("/approvals")
public class ApprovalController {
    @Autowired
    private ApprovalRepository approvalRepository;

    @GetMapping
    public List<Approval> getAllApprovals() {
        return approvalRepository.findAll();
    }

    @PostMapping
    public Approval createApproval(@RequestBody Approval approval) {
        return approvalRepository.save(approval);
    }
}
