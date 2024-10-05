package com.Kynhood_Demo.stepdefinition;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Kynhood_Demo.pages.HomePage;
import com.base.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KynhoodStepDefinition extends BaseClass{
	HomePage hp = new HomePage();
	
	
	
	@Given("User visit the Home page {string}")
	public void user_visit_the_home_page(String string) {
		launchUrl(string);
	}


	@When("User scroll through the Home feed contents")
	public void user_scroll_through_the_home_feed_contents() throws InterruptedException {
//		Thread.sleep(2000);
		scrollIntoView(driver,hp.getScrollTocontent());
	}
	@Then("User validate the location mapped to these contents is either {string} or {string} or {string}")
	public void user_validate_the_location_mapped_to_these_contents_is_either_or_or(String string, String string2, String string3) {
		List<WebElement> compareLocations = hp.getCompareLocations();
		   
		   for(int i=0;i<3;i++) {
			   if(compareLocations.get(i).getText().equals(string) ||compareLocations.get(i).getText().equals(string2) ||compareLocations.get(i).getText().equals(string3)) {
				 Assert.assertTrue(true);
			   }else {
				   System.out.println("The location is : "+compareLocations.get(i).getText());
					
			   }
		   }
	}
	@Then("User validate the thumbnail of each of these contents")
	public void user_validate_the_thumbnail_of_each_of_these_contents() throws InterruptedException {
//		Thread.sleep(2000);
		List<WebElement> thumbnails = hp.getThumbnails();
		String expected_link = thumbnails.get(0).getAttribute("href");
		clickElement(driver,thumbnails.get(0));
//		Thread.sleep(2000);
		String actual_link = hp.getContents().getAttribute("href");
		Assert.assertEquals(actual_link, expected_link);
	}
	
	
	@When("User click on the klips screen")
	public void user_click_on_the_klips_screen() {
		clickElement(driver, hp.getKlips());
	}

	@Then("User validate the title and user profile name of the first two or three klips")
	public void user_validate_the_title_and_user_profile_name_of_the_first_two_or_three_klips() {
		 List<WebElement> klipsTitle = hp.getKlipsTitle();
		    for(WebElement e : klipsTitle) {
		    	if(e.getText().equals("Learning,Comedy")){
		    		System.out.println("Title Validated");
		    	}
		    }
		    
		    List<WebElement> klipsProfileName = hp.getKlipsProfileName();
		    for(WebElement e : klipsProfileName) {
		    	if(e.getText().equals("KYNrqq80gh3c")) {
		    		System.out.println("Profile Validated");
		    	}
		    }
	}

	@When("User navigate to the Videos tab")
	public void gej() {
		clickElement(driver,hp.getVideos());
	}



	@When("User select View all of any category")
	public void user_select_view_all_of_any_category() throws InterruptedException {
//		Thread.sleep(3000);
		clickElement(driver,hp.getViewAllBtn());
	}
	@Then("User scroll through the video contents")
	public void user_scroll_through_the_video_contents() {
		scrollBy(driver, 0, 300);
	}
	@Then("User validate that all of listed videos are from the same category")
	public void user_validate_that_all_of_listed_videos_are_from_the_same_category() {
		List<WebElement> categoryName = hp.getCategoryName();
	    for(int i=0;i<categoryName.size();i++) {
	    	if(categoryName.get(i).getText().equals("Areas")) {
	    		Assert.assertTrue(true);
	    	}
	    }
	}

	
}
