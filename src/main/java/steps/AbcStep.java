package steps;

import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.BeforeStory;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.jbehave.core.annotations.Then;

public class AbcStep {

	@BeforeStory
	public void beforeStory() {
		System.out.println("****************  Before Story ****************");
	}
	
	@BeforeScenario
	public void beforeEachScenario() {
		System.out.println("****************  Before Scenarios ****************");
	}
	
	
	@Given("I am a test user")
	public void i_am_a_test_user(){
		System.out.println("****************  I am in Given ****************");
	}
	
	@When("I open a link")
	public void i_open_a_link(){
		System.out.println("**************** I am in When ****************");
	}
	
	@Then("I am able to get home page")
	public void i_am_able_to_get_home_page(){
		System.out.println("**************** I am in Then ****************");
	}
	
}
