package coach_assistant.workoutPlan;

import coach_assistant.model.Exercise;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class WorkoutDay {
    @JsonProperty("plannedExercises")
    List<Exercise> planned = new ArrayList<>();

    @JsonProperty("actualExercises")
    List<Exercise> actual = new ArrayList<>();

    LocalDate date;
    Long id;

}
