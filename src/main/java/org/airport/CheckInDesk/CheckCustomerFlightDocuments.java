package org.airport.CheckInDesk;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckCustomerFlightDocuments implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
//        String flightDocuments = (String) execution.getVariable("flightDocuments");
//
//        if (flightDocuments.equals("ERROR")) {
//            throw new BpmnError("invalidFlightDocuments");
//        }
    }
}
