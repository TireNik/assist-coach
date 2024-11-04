package coach_assistant.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;


@Data
@ToString
@EqualsAndHashCode
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Exercise {
    String name;
    ExerciseType type;
    List<Set> sets = new ArrayList<>();  // Инициализация списка

    @JsonCreator
    public Exercise(@JsonProperty("name") String name,
                    @JsonProperty("type") ExerciseType type,
                    @JsonProperty("sets") List<Set> sets) {
        this.name = name;
        this.type = type;
        this.sets = sets != null ? sets : new ArrayList<>();
    }

    public void addSet(Double weight, Integer reps) {
        sets.add(new Set(weight, reps));
    }

    @Data
    @ToString
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Set {
        Double weight;
        Integer reps;

        @JsonCreator
        public Set(@JsonProperty("weight") Double weight,
                   @JsonProperty("reps") Integer reps) {
            this.weight = weight;
            this.reps = reps;
        }
    }
}