package org.airport;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
public class retrieveCustomerFlightCompanyDataDelegate implements JavaDelegate {
    //Random rando = new Random();
    public void execute(DelegateExecution execution) throws Exception {
        String enoughFunds=(String) execution.getVariable("enoughFunds");
        execution.setVariable("yes", enoughFunds);
    }
}
