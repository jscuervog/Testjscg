package co.com.choucair.certification.proyectojs.stepdefinitions;

import co.com.choucair.certification.proyectojs.model.AcademyChoucairData;
import co.com.choucair.certification.proyectojs.questions.Answer;
import co.com.choucair.certification.proyectojs.tasks.Login;
import co.com.choucair.certification.proyectojs.tasks.Search;
import co.com.choucair.certification.proyectojs.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^than juan wants to learn automation at the academy Choucair$")
    public void thanJuanWantsToLearnAutomationAtTheAcademyChoucair
            (List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage(), (Login
                .OnThePage(academyChoucairData.get(0).getSrtUser(),academyChoucairData.get(0).getStrPassword())));
    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseResourcesAutomationBancolombiaOnTheChoucairAcademyPlatform
            (List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesAutomationBancolombia
            (List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));

    }
}
