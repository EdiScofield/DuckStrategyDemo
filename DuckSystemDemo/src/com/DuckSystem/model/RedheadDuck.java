package com.DuckSystem.model;

public class RedheadDuck extends Duck {
	  public RedheadDuck() {
		    flyBehavior=new FlyWithRocket();
		    quackBehavior=new MuteQuack();
		  }
		  public void display() {
		    System.out.println("I am a RedHeadDuck!");
		  }
		}
