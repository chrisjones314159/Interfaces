package com.BAE.interfaces;

public class Hyena implements CarnivorInterface, Animal, PreyInterface{

	@Override
	public void IsPrey() {
		// TODO Auto-generated method stub
		System.out.println("Is prey to other animals");
	}

	@Override
	public void breathes() {
		// TODO Auto-generated method stub
		System.out.println("breathes");
	}

	@Override
	public void eats() {
		// TODO Auto-generated method stub
		System.out.println("eats");
	}

	@Override
	public void eatsOtherAnimals() {
		// TODO Auto-generated method stub
		System.out.println("does wat other animals");
	}

	@Override
	public void Predator() {
		// TODO Auto-generated method stub
		System.out.println("is a predator");
	}

	
	public Hyena() {
		
	}
}
