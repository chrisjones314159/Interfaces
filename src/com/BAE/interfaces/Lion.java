package com.BAE.interfaces;

public class Lion implements Animal, CarnivorInterface{

	@Override
	public void eatsOtherAnimals() {
		// TODO Auto-generated method stub
		System.out.println("Lions eat other animals.");
	}

	@Override
	public void Predator() {
		// TODO Auto-generated method stub
		System.out.println("Lions are Predators.");
	}

	@Override
	public void breathes() {
		// TODO Auto-generated method stub
		System.out.println("Lions breathe");
	}

	@Override
	public void eats() {
		// TODO Auto-generated method stub
		System.out.println("Lions eat");
	}
	
	public Lion() {
		
	}

}
