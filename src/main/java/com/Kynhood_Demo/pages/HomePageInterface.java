package com.Kynhood_Demo.pages;

public interface HomePageInterface {
	
	String Home_klips_xpath = "//span[text()='Klips']";
	String Home_videos_xpath = "//span[text()='Videos']";
	String videos_viewAll_xpath="//a[@href='/kynexclusive/videos']";
	
	String location_xpath = "//div[@class='location detail-item']//div[@class='name']";
	String content_xpath = "//a[@class='redirect']";
	String scroll_tocontent_xpath = "(//div[@class='name'])[1]";
	String loction_xpath="//div[@class='location detail-item'//div[@class='name']";
	String contentclick_xpath ="//div[@class='title' or @class='content-box']";
	String thumbnail_xpath = "//div[@class='post']/a";
	String contents_xpath = "//div[@class='post";
	String klips_xpath = "//h3[text() = 'Klips'";
	String klips_profie_name_xpath = "//div[@class='header']/a/div[@class='header-text']";
	String klips_title_xpath = "//div[@class='category-item']/div";
	
	String viewAll_btn_xpath = "//h3[text() = 'Areas']//following-sibling::a[text() = 'View all']";
	String category_xpath = "//div[@class='details']/div/div";
	
}
