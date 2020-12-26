package org.airport;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class handOverDocumentsDelegate implements JavaDelegate {
    public void execute(DelegateExecution execution) throws Exception {
        execution.getProcessEngineServices().getRuntimeService().createMessageCorrelation("CustomerTicketandPassport").correlate();
    }
}
