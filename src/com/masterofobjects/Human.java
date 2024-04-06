package com.masterofobjects;

public class Human {
	private int health;
	private int strength;
	private int intelligence;
	private int stealth;
	
	public Human() {
		this.health = 100;
		this.stealth = 3;
		this.strength = 3;
		this.intelligence = 3;
	}
	
	public void attack(Human persona) {
		int newHealth = persona.health - this.getStrength();
		persona.setHealth(newHealth);
		System.out.println("vida actual del enemigo: (" + persona.health + ")");
	}
	
	public int getHealth() {
		return health;
	}
	public int getStrength() {
		return strength;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
}
