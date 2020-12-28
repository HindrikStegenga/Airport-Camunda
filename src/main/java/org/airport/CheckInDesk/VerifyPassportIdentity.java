package org.airport.CheckInDesk;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class VerifyPassportIdentity implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String ticketIdentity = (String) execution.getVariable("identity");

        if (ticketIdentity.equals("FRAUD")) {
            throw new BpmnError("FRAUD_DETECTED");
        }
    }
}
