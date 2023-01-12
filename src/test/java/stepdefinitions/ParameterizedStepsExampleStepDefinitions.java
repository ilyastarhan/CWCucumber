package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ParameterizedStepsExampleStepDefinitions {
    private int sayi1, sayi2,sonuc;

    @Given ("Ilk sayi {int}")
    public void ilkSayi(int sayi1){
        this.sayi1=sayi1;
        System.out.println("sayi1 = " + sayi1);
    }
    @Given("Ikinci sayi {int}")
    public void ikinciSayi(int sayi2){
        this.sayi2=sayi2;
        System.out.println("sayi2 = " + sayi2);

    }

    @When("Bu sayilari {word} operatorune sokarsam")
    public void buSayilariOperatoreSokarsam(String operator){
        switch (operator){
            case "+":
                sonuc = sayi1+sayi2;
                break;
            case "-":
                sonuc = sayi1-sayi2;
                break;
            case "*":
                sonuc = sayi1*sayi2;
                break;
            case "/":
                sonuc = sayi1/sayi2;
                break;

        }
        System.out.println("sonuc = " + sonuc);

    }
    @Then("Sonuc {int} olmalidir")
    public void sonuc(int result){
        Assert.assertEquals(result,sonuc);
        //deneme branci


    }
}
