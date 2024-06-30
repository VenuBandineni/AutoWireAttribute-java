package com.user.model;

import org.springframework.stereotype.Component;

@Component("ktm")
public class KTM implements BikeDetails
{

	@Override
	public void nameOfTheBike() {
		// TODO Auto-generated method stub
		System.out.println("KTM 390");
	}

	@Override
	public void ccOfTheBike() {
		// TODO Auto-generated method stub
		System.out.println("550");
	}

	@Override
	public void colorOfTheBike() {
		// TODO Auto-generated method stub
		System.out.println("orange");
	}

}
