package stepdefinitions;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

public class MyStepdefs {
    @Given("Thread id yi yazdir")
    public void threadIdYiYazdir() {
        System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId() );
    }
}
