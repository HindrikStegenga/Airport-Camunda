package org.airport.CheckInDesk;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class InspectPCRReport implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Boolean reportResult = (Boolean) execution.getVariable("reportResult");
        int reportResultsTime = (int) execution.getVariable("reportResultsTime");

        // If PCR report is positive of the results are older than 2 days old:
        if (reportResult == true || reportResultsTime > 2) {
            throw new BpmnError("PCR_REPORT_NOT_VALID");
        }
    }
}
