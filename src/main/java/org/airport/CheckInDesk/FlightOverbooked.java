package org.airport.CheckInDesk;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class FlightOverbooked implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
//        String flightAttendance = (String) execution.getVariable("flightAttendance");
//        String flightCapacity = (String) execution.getVariable("flightCapacity");
//
//        if (flightAttendance == flightCapacity) {
//            throw new BpmnError("flightOverbooked");
//        }
    }
}
