package org.airport.CheckInDesk;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckLuggage implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
//        String illegalSubstance = (String) execution.getVariable("luggageContents");
//
//        if (illegalSubstance.equals("DRUGS")) {
//            throw new BpmnError("illegalSubstance");
//        }
    }
}
