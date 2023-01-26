package br.com.kb.hr.services.promotion;

import br.com.kb.hr.Exception;
import br.com.kb.hr.entities.Employee;
import br.com.kb.hr.entities.OfficePosition;

public class PromotionService {
    public void promote(Employee employee, boolean isTargetHit) {
        OfficePosition actualPosition = employee.getPosition();
        if (actualPosition == OfficePosition.MANAGER) {
            throw new Exception("Managers does not has a promotion");
        }
        if (isTargetHit) {
            OfficePosition newPosition = actualPosition.getNextPosition();
            employee.promote(newPosition);
        }
    }
}
