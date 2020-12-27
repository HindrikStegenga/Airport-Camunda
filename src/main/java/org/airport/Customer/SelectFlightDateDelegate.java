package org.airport.Customer;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Date;
import java.util.Random;

public class SelectFlightDateDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Random rando = new Random();
        Date selectedFlightDate = new Date();

        execution.setVariable("selectedFlightDate", selectedFlightDate);
        execution.setVariable("availableFlightOnDate", true);
    }
}
