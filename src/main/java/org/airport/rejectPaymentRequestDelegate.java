package org.airport;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class rejectPaymentRequestDelegate implements JavaDelegate {
    public void execute(DelegateExecution execution) throws Exception {
        String paymentStatus=(String) execution.getVariable("PaymentStatus");
        execution.getProcessEngineServices().getRuntimeService().createMessageCorrelation("PaymentStatus").setVariable("rejected",paymentStatus).correlate();
    }
}
