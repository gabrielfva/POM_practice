package pom.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/buy_products.feature",
        glue = "pom.steps",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class BuyProductsRunner {
}
