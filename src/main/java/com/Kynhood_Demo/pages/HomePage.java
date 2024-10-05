package com.Kynhood_Demo.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;


public class HomePage extends BaseClass implements HomePageInterface {

	public HomePage() {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@FindBy(xpath = Home_klips_xpath)
	private WebElement klips_btn;
    
	public WebElement getKlips() {
		return klips_btn;
	}

	@FindBy(xpath = Home_videos_xpath)
	private WebElement videos_btn;

	public WebElement getVideos() {
		return videos_btn;
	}

	@FindBy(xpath = videos_viewAll_xpath)
	private WebElement videoViewAll;

	public WebElement getVideoViewAll() {
		return videoViewAll;
	}
	
	@FindBy(xpath = location_xpath)
	private WebElement location;
	
	public WebElement getLocation() {
		return location;
	}
	@FindBy(xpath = content_xpath)
	private WebElement content;
	
	public WebElement getContent() {
		return content;
	}
	@FindBy(xpath = scroll_tocontent_xpath)
	private WebElement scrollTocontent;
	
	public WebElement getScrollTocontent() {
		return scrollTocontent;
	}
	
	@FindBy(xpath= klips_profie_name_xpath)
	private List<WebElement> klips_profile_name;
	
	public List<WebElement> getKlipsProfileName() {
		return klips_profile_name;
	}
	
	@FindBy(xpath= klips_title_xpath)
	private List<WebElement> klips_title;
	
	public List<WebElement> getKlipsTitle() {
		return klips_title;
	}
	
	@FindBy(xpath= loction_xpath)
	private List<WebElement> compareLocations;
	
	public List<WebElement> getCompareLocations() {
		return compareLocations;
	}
	
	@FindBy(xpath= thumbnail_xpath)
	private List<WebElement> thumbnails;
	
	public List<WebElement> getThumbnails() {
		return thumbnails;
	}
	
	@FindBy(xpath= contents_xpath)
	private WebElement contents;
	
	public WebElement getContents() {
		return contents;
	}
	
	
	@FindBy(xpath= contentclick_xpath)
	private WebElement contentclick;
	
	public WebElement getContentclick() {
		return contentclick;
	}
	
	@FindBy(xpath= viewAll_btn_xpath)
	private WebElement viewAll_btn;
	
	public WebElement getViewAllBtn() {
		return viewAll_btn;
	}
	
	@FindBy(xpath= category_xpath)
	private List<WebElement> category_name;
	
	public List<WebElement> getCategoryName() {
		return category_name;
	}
	
	
	

}
