package com.raghugannaram.springcrashcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.raghugannaram.springcrashcourse.game.GameRunner;
import com.raghugannaram.springcrashcourse.game.SuperMario;
import com.raghugannaram.springcrashcourse.game.Asphalt;

@SpringBootApplication
public class SpringCrashCourseApplication {

	public static void main(String[] args) {
		SuperMario superMario = new SuperMario();
		Asphalt asphalt = new Asphalt();
		GameRunner superMarioGameRunner = new GameRunner(superMario);
		GameRunner asphaltGameRunner = new GameRunner(asphalt);
		superMarioGameRunner.runGame();
		asphaltGameRunner.runGame();
		SpringApplication.run(SpringCrashCourseApplication.class, args);
	}

}
