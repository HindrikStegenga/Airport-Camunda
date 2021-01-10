package org.airport.CheckInDesk;

import org.airport.Customer.CheckInScopeVariables;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckLuggage implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        if (!execution.hasVariable(CheckInScopeVariables.ILLEGAL_SUBSTANCES)) {
            throw new Exception("Incorrect setup!");
        }
        Boolean illegalSubstance = (Boolean) execution.getVariable(CheckInScopeVariables.ILLEGAL_SUBSTANCES);
        if (illegalSubstance) {
            throw new BpmnError("illegalSubstance");
        } else {
            return;
        }
    }
}
