package org.airport.Bank;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class RejectPaymentRequestDelegate implements JavaDelegate {
    public void execute(DelegateExecution execution) throws Exception {
        execution.getProcessEngineServices().getRuntimeService()
                .createMessageCorrelation("PaymentStatus")
                .setVariable("paymentStatus", false)
                .correlate();
    }
}
