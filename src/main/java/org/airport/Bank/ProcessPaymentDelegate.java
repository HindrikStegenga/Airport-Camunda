package org.airport.Bank;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/// Simulates the process of banking. Throws insufficientFunds business exception if insufficient funds.
public class ProcessPaymentDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {

        if (!execution.hasVariable(BankScopeVariables.CUSTOMER_FUNDS) ||
                !execution.hasVariable(BankScopeVariables.OTHER_PARTY_FUNDS) ||
                !execution.hasVariable(BankScopeVariables.BOOKING_PRICE))
        {
            throw new Exception("Incorrect setup!");
        }

        long customerFunds = (long) execution.getVariable(BankScopeVariables.CUSTOMER_FUNDS);
        long otherPartyFunds = (long) execution.getVariable(BankScopeVariables.OTHER_PARTY_FUNDS);
        long bookingPrice = (long) execution.getVariable(BankScopeVariables.BOOKING_PRICE);

        if (customerFunds < bookingPrice) {
            throw new BpmnError("insufficientFunds");
        } else {
            long newCustomerFunds = customerFunds - bookingPrice;
            long newOtherPartyFunds = otherPartyFunds + bookingPrice;
            execution.setVariable(BankScopeVariables.CUSTOMER_FUNDS, newCustomerFunds);
            execution.setVariable(BankScopeVariables.OTHER_PARTY_FUNDS, newOtherPartyFunds);
        }
    }
}
