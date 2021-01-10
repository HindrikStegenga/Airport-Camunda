package org.airport.CheckInDesk;

import org.airport.Bank.BankScopeVariables;
import org.airport.Customer.CheckInScopeVariables;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckCustomerFlightDocuments implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        if (!execution.hasVariable(CheckInScopeVariables.INVALID_DOCUMENTS)){
            throw new Exception("Incorrect setup!");
        }
        Boolean invalidDocuments = (Boolean) execution.getVariable(CheckInScopeVariables.INVALID_DOCUMENTS);
        if (invalidDocuments) {
            throw new BpmnError("invalidFlightDocuments");
        }
        else{
            return;
        }
    }
}
