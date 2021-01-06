package org.airport.Bank;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;

/// Simulates retrieving data
public class RetrieveCustomerFlightCompanyDataDelegate implements JavaDelegate {
    public void execute(DelegateExecution execution) throws Exception {

        Random random = new Random();
        if (!execution.hasVariable(BankScopeVariables.CUSTOMER_FUNDS)) {
            execution.setVariable(BankScopeVariables.CUSTOMER_FUNDS, (long) random.nextInt(100000));
        }
        if (!execution.hasVariable(BankScopeVariables.OTHER_PARTY_FUNDS)) {
            execution.setVariable(BankScopeVariables.OTHER_PARTY_FUNDS, (long) random.nextInt(100000));
        }
    }
}
