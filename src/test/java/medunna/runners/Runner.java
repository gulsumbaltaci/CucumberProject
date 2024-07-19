package medunna.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)//cucumber ile junit in entgre olmasini saglayan scenario calistirici notasyon
    @CucumberOptions(//bu notasyon sayesinde hangi scanriolari calistiracagimizi ve hangi raporlari alacagimizi ayarlariz

            features = "src/test/resources/features",
            glue = "medunna/stepDefinitions",
            tags = "@US01",
            dryRun = false//=>dryRun parametresi true secilirse scenariolari calistirmadan feature file daki
            // steplerden eksik stepDefinition olup olmadigini kontrol eder ve browser i calistirmeaz

    )
    public class Runner {
    }

