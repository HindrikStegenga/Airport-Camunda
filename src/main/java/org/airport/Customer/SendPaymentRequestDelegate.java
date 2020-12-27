package org.airport.Customer;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
public class SendPaymentRequestDelegate implements JavaDelegate{
    public void execute(DelegateExecution execution) throws Exception {
        execution.getProcessEngineServices()
                .getRuntimeService()
                .createMessageCorrelation("PaymentRequest").correlate();
    }
}
