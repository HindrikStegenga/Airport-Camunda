package org.airport;
import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class sendmessageDelegate implements JavaDelegate{
    private final Logger LOGGER = Logger.getLogger(sendmessageDelegate.class.getName());
    public void execute(DelegateExecution execution) throws Exception {
        LOGGER.info("Sending message to Flight Company");
    }
}
