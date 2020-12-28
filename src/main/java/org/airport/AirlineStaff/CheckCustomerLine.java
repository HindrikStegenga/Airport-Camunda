package org.airport.AirlineStaff;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckCustomerLine implements JavaDelegate {
    public void execute(DelegateExecution execution) throws Exception {
        execution.setVariable("anotherCustomerWaiting", true);
    }
}
