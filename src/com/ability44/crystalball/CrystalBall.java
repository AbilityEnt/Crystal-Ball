package com.ability44.crystalball;

import java.util.Random;

public class CrystalBall {
	public String[] mAnswers = {
			"It is certian",
			"It is decidedly so",
			"All signs point to YES",
			"The stears are not aligned",
			"My reply is no",
			"It is doubtful",
			"Better not tell you now",
			"Concentrate and ask again",
			"Unable to answer now",
			"It is hard to say"
	};
	public String getAnAnswer(){

		String answer = "";

		Random randomGenerator = new Random(); // Construct a new Random number generator
		int randomNumber = randomGenerator.nextInt(mAnswers.length);
		
		answer = mAnswers[randomNumber];
		
		return answer;
	}
}
