package org.airport.Bank;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
public class RetrieveCustomerFlightCompanyDataDelegate implements JavaDelegate {
    public void execute(DelegateExecution execution) throws Exception {
        execution.setVariable("enoughFundsAvailable", true);
    }
}
