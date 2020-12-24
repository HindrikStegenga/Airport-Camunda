package org.airport;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class acceptPaymentRequestDelegate implements JavaDelegate {
    public void execute(DelegateExecution execution) throws Exception {
        String paymentStatus=(String) execution.getVariable("PaymentStatus");
        execution.getProcessEngineServices().getRuntimeService().createMessageCorrelation("PaymentConfirmation").setVariable("accepted",paymentStatus).correlate();
    }
}
