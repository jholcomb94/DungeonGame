package dungeon;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */



public class Sorceress extends Hero
{
	public final int MIN_ADD = 25;
	public final int MAX_ADD = 50;

//-----------------------------------------------------------------
    public Sorceress(String name)
	{	
		super("Sorceress", 75, 5, .7, 25, 50, .3,name);
		
		//Adds Sorceress attacks to AttackBehavior array, gets attacks from AttackFactory
		AttackFactory attacks = AttackFactory.getAttackFactory();
		
		AttackBehavior[] sorceressAttacks = {attacks.getAttack("Sorceress Attack"), 
				attacks.getAttack("Sorceress Increase HP")};
		//Sets sorceress attack behaviors array
		this.setAttackBehaviors(sorceressAttacks);
    }//end constructor

	public void attack(DungeonCharacter opponent)
	{
		
		//This attack is set at runtime when user chooses which attack to use
		this.attackBehavior.attack(this, name, opponent);
	}//end override of attack method
}//end class