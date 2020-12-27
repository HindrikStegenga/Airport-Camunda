package org.airport.Bank;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class AcceptPaymentRequestDelegate implements JavaDelegate {
    public void execute(DelegateExecution execution) throws Exception {
        execution.getProcessEngineServices().getRuntimeService()
                .createMessageCorrelation("PaymentStatus")
                .setVariable("paymentStatus", true)
                .correlate();
    }
}
