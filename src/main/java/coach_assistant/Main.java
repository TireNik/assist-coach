package coach_assistant;

import coach_assistant.model.Exercise;
import coach_assistant.model.ExerciseType;
import coach_assistant.workoutPlan.WorkoutDay;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        Exercise jumpPlan = Exercise.builder().name("Jump").type(ExerciseType.LEG).build();
        jumpPlan.addSet(20.0, 10);
        jumpPlan.addSet(30.0, 10);
        Exercise jumpAct = Exercise.builder().name("Jump").type(ExerciseType.LEG).build();
        jumpAct.addSet(20.0, 9);
        jumpAct.addSet(30.0, 9);
        WorkoutDay workoutDay = new WorkoutDay(List.of(jumpAct), List.of(jumpPlan), LocalDate.now(), 1L);
        System.out.println(workoutDay);
    }
}
