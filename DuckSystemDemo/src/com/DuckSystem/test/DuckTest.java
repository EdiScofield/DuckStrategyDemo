package com.DuckSystem.test;

import com.DuckSystem.model.Duck;
import com.DuckSystem.model.MallardDuck;
import com.DuckSystem.model.RedheadDuck;
import com.DuckSystem.model.RubberDuck;

public class DuckTest {
	public static void main(String[] args) {
		Duck mallarduck = new MallardDuck();
		mallarduck.performFly();
		mallarduck.performQuack();
		mallarduck.swim();

		Duck rubberduck = new RubberDuck();
		rubberduck.performFly();
		rubberduck.performQuack();
		rubberduck.swim();

		Duck readduck = new RedheadDuck();
		readduck.performFly();
		readduck.performQuack();
		readduck.swim();

	}
}