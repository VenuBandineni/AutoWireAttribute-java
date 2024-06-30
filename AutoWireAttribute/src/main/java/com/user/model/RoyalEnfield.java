package com.user.model;

import org.springframework.stereotype.Component;

@Component("royal")
public class RoyalEnfield implements BikeDetails
{

	@Override
	public void nameOfTheBike() {
		// TODO Auto-generated method stub
		System.out.println("Himalayan");
	}

	@Override
	public void ccOfTheBike() {
		// TODO Auto-generated method stub
		System.out.println("500");
	}

	@Override
	public void colorOfTheBike() {
		// TODO Auto-generated method stub
		System.out.println("Black");
	}

}
