package com.testing.youtube.selenium.step_definitions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testing.youtube.selenium.pages.SearchData;
import com.testing.youtube.selenium.utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestSearchData {

    private static WebDriver driver;
    private static ExtentTest extentTest;

    private Hooks hooks = new Hooks();

    private SearchData searchData = new SearchData();

    public TestSearchData() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    // SEARCH DATA 001
    @Given("TCC.Search.001 open web music youtube")
    public void tcc_search_001_open_web_music_youtube() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "open web music youtube");
    }

    @When("TCC.Search.001 click search menu")
    public void tcc_search_001_click_search_menu() {
        searchData.clickSearchMenu();
        extentTest.log(LogStatus.PASS,"click search menu");
    }

    @And("TCC.Search.001 type sugeng dalu")
    public void tcc_search_001_type_sugeng_dalu() {
        searchData.inputSearch("sugeng dalu");
        extentTest.log(LogStatus.PASS, "type sugeng dalu");
    }

    @And("TCC.Search.001 click enter")
    public void tcc_search_001_click_enter() {
        searchData.inputSearch(String.valueOf(Keys.ENTER));
        extentTest.log(LogStatus.PASS,"click enter");
    }

    @Then("TCC.Search.001 display result data sugeng dalu")
    public void tcc_search_001_display_result_data_sugeng_dalu() {
        hooks.waiting(1);
        Assert.assertEquals(searchData.getTxtResultSearch(), "Sugeng Ndalu");
        extentTest.log(LogStatus.PASS,"display result data sugeng dalu");
    }

    // SEARCH DATA 002
    @Given("TCC.Search.002 open web music youtube")
    public void tcc_search_002_open_web_music_youtube() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "open web music youtube");
    }

    @When("TCC.Search.002 click search menu")
    public void tcc_search_002_click_search_menu() {
        searchData.clickSearchMenu();
        extentTest.log(LogStatus.PASS,"click search menu");
    }

    @And("TCC.Search.002 type kulpsihfkshp")
    public void tcc_search_002_type_kulpsihfkshp() {
        searchData.inputSearch("kulpsihfkshp");
        extentTest.log(LogStatus.PASS, "type kulpsihfkshp");
    }

    @And("TCC.Search.002 click enter")
    public void tcc_search_002_click_enter() {
        searchData.inputSearch(String.valueOf(Keys.ENTER));
        extentTest.log(LogStatus.PASS,"click enter");
    }

    @Then("TCC.Search.002 display no result found in the web")
    public void tcc_search_002_display_no_result_found_in_the_web() {
        hooks.waiting(1);
        Assert.assertEquals(searchData.getTxtResultNotFound(), "No results found");
        extentTest.log(LogStatus.PASS,"display no result found in the web");
    }

    // SEARCH DATA 003
    @Given("TCC.Search.003 open web music youtube")
    public void tcc_search_003_open_web_music_youtube() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "open web music youtube");
    }

    @When("TCC.Search.003 click search menu")
    public void tcc_search_003_click_search_menu() {
        searchData.clickSearchMenu();
        extentTest.log(LogStatus.PASS,"click search menu");
    }

    @And("TCC.Search.003 type empty in search")
    public void tcc_search_003_type_empty_in_search() {
        searchData.inputSearch("");
        extentTest.log(LogStatus.PASS, "type empty in search");
    }

    @And("TCC.Search.003 click enter")
    public void tcc_search_003_click_enter() {
        searchData.inputSearch(String.valueOf(Keys.ENTER));
        extentTest.log(LogStatus.PASS,"click enter");
    }

    @Then("TCC.Search.003 stay in search menu")
    public void tcc_search_003_stay_in_search_menu() {
        hooks.waiting(1);
        Assert.assertEquals(searchData.getTxtAttributeSearch(), "Search");
        extentTest.log(LogStatus.PASS,"stay in search menu");
    }
}
