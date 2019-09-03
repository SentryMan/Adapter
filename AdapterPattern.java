package com.collabera.adapter;

interface SpiritWorld{
	
	void spiritAttack();
}

interface PhysicalWorld{
	
	void Bend(String s);
}


class Spirit implements SpiritWorld{
	
	public void spiritAttack() {
		
		System.out.println("Boo! I'm a ghost your dead m8");
	}
	
}

class Human implements PhysicalWorld{


	@Override
	public void Bend(String s) {
		System.out.println("I'm gonna bend " + s + " at you");
		
	}
	
	
}


class Avatar implements SpiritWorld{

	Human avatar = new Human();
	
	@Override
	public void spiritAttack() {
		avatar.Bend("spirit energy");
	}
	
	
}

public class AdapterPattern {

	public static void main(String[] args) {
		
		Spirit KohTheFaceStealer = new Spirit();
		Human Zuko = new Human();
		Avatar Aang = new Avatar();
		
		System.out.print("Spirit: ");
		KohTheFaceStealer.spiritAttack();
		System.out.print("Human: ");
		Zuko.Bend("fire");
		System.out.print("Avatar: ");
		Aang.spiritAttack();

	}

}
