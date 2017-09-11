package stupid.controller;

import stupid.model.PlayDohCircle;
import stupid.model.PlayDohCube;

public class StupidController 
{

	public void start()
	{
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle (20);
		PlayDohCircle thirdCircle;
		thirdCircle = new PlayDohCircle (10);
	
			PlayDohCube firstCube = new PlayDohCube();
			PlayDohCube secondCube;
			secondCube = new PlayDohCube (40);
	
		System.out.println("Here is my play doh circle");
		System.out.println(firstCircle);
		System.out.println("Here is my second circle " + secondCircle);
		System.out.println("Here is my first playdoh cube " + firstCube);
		System.out.println(firstCube);	
		System.out.println("Here is my second cube " + secondCube);
		
			System.out.println("My name is Amber. I am a CIborg and I love to write. I am 17 years old.");
		
	}
	
}



