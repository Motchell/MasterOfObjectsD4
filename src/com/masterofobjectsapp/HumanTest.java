package com.masterofobjectsapp;

import com.masterofobjects.*;

public class HumanTest {

	public static void main(String[] args) {
		Samurai Jack = new Samurai();
		Ninja Shinobi = new Ninja();

		Jack.attack(Shinobi);
		Jack.attack(Shinobi);
		Jack.attack(Shinobi);
		Jack.attack(Shinobi);

		Shinobi.attack(Jack);
		Shinobi.attack(Jack);
		Shinobi.attack(Jack);
		
		Jack.setStrength(88);
		
		Jack.attack(Shinobi);
	}

}
