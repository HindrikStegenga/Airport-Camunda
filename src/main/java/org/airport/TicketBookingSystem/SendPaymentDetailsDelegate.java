package org.airport.TicketBookingSystem;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
public class SendPaymentDetailsDelegate implements JavaDelegate {
    public void execute(DelegateExecution execution) throws Exception {
        execution.getProcessEngineServices().getRuntimeService()
                .createMessageCorrelation("PaymentDetails")
                .correlate();
    }
}
