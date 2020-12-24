package org.airport;
import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class sendmessageDelegate implements JavaDelegate{
    public void execute(DelegateExecution execution) throws Exception {
        execution.getProcessEngineServices().getRuntimeService().createMessageCorrelation("FlightRequest").correlate();
    }
}
