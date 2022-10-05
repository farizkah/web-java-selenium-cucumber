package automation.stepDefinitions;

import automation.pageObjects.SearchHotelPage;
import automation.utils.DriverFactory;
import io.cucumber.java.en.*;

public class SearchHotelStep {

    SearchHotelPage searchHotel = new SearchHotelPage(DriverFactory.getDriver());

    @Given("guest user visit hotel finder from homepage")
    public void guest_user_visit_hotel_finder_from_homepage() {
        searchHotel.visitWebpage();
    }
    @When("^user search area named \"([^\"]*)\"$")
    public void user_search_area_named(String location) {
        searchHotel.searchLocation(location);
    }
//    @When("^user set check in date to \"([^\"]*)\"th next month$")
//    public void user_set_check_in_date_to_x_th_next_month(String date) {
//        searchHotel.setCheckInDateNextMonth(date);
//    }
//    @When("user set duration for {int} night")
//    public void user_set_duration_for_night(Integer int1) {
//
//    }
//    @When("user set guests for {int} adults and {int} child")
//    public void user_set_guests_for_adults_and_child(Integer int1, Integer int2) {
//
//    }
//    @When("user search the hotels")
//    public void user_search_the_hotels() {
//
//    }
//    @Then("user see hotel search result in the area")
//    public void user_see_hotel_search_result_in_the_area() {
//
//    }

}
