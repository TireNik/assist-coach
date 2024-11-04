package coach_assistant.workoutPlan;

import coach_assistant.model.Exercise;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;

public class WorkoutDay {
    @JsonProperty("plannedExercises")
    private List<Exercise> planned = new ArrayList();
    @JsonProperty("actualExercises")
    private List<Exercise> actual = new ArrayList();
    private LocalDate date;
    private Long id;
}
