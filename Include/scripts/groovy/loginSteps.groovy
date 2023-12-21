import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class loginSteps {

	@Given("I want to write a step with")
	def I_want_to_write_a_step_with_name(String name) {
		println name
	}

	@When("I check for the  in step")
	def I_check_for_the_value_in_step(int value) {
		println value
	}

	@Then("I verify the  in step")
	def I_verify_the_status_in_step(String status) {
		println status
	}
}