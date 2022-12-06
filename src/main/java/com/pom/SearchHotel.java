package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public  class SearchHotel {
	public static WebDriver driver;
	
	@FindBy(css=".search_combobox")
	private WebElement selectLocation ;

	@FindBy(id="hotels")
	private WebElement selectHotel;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement noofRooms;
	
	@FindBy(className = "date_pick")
	private WebElement checkinDate;
	
	@FindBy(id="datepick_out")
	private WebElement checkoutDate;
	
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	
	@FindBy(id="child_room")
	private WebElement childRoom;
	
	@FindBy(id="Submit")
	private WebElement submit;

	

	public SearchHotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelectLocation() {
		return selectLocation;
	}

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoofRooms() {
		return noofRooms;
	}

	public WebElement getCheckinDate() {
		return checkinDate;
	}

	public WebElement getCheckoutDate() {
		return checkoutDate;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSubmit() {
		return submit;
	}


	}
	
