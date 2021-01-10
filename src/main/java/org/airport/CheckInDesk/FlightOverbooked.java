package org.airport.CheckInDesk;

import org.airport.Customer.CheckInScopeVariables;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class FlightOverbooked implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        if (!execution.hasVariable(CheckInScopeVariables.FLIGHT_OVERBOOKED)) {
            throw new Exception("Incorrect setup!");
        }
        Boolean flightOverbooked = (Boolean) execution.getVariable(CheckInScopeVariables.FLIGHT_OVERBOOKED);
        if (flightOverbooked) {
            throw new BpmnError("flightOverbooked");
        } else {
            return;
        }
    }
}
