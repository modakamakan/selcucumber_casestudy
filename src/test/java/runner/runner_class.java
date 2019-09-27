package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature//case3.feature",glue="casestudy",plugin="html:target/case1.html")
public class runner_class {

}
