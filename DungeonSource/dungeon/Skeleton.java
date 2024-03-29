package dungeon;


/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Skeleton extends Monster
{

    public Skeleton()
	{
		super("Sargath the Skeleton", 100, 3, .8, .3, 30, 50, 30, 50);
		this.healBehavior = new MonsterBasicHealBehavior();
		
		AttackFactory attacks = AttackFactory.getAttackFactory();
		this.attackBehavior = attacks.getAttack("Base Attack");
    }//end constructor

	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " slices his rusty blade at " +
							opponent.getName() + ":");
		this.attackBehavior.attack(this, this.getName(), opponent);

	}//end override of attack


}//end class Skeleton