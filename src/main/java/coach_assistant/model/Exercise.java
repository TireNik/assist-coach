package coach_assistant.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;

public class Exercise {
    private String name;
    private ExerciseType type;
    private List<Set> sets = new ArrayList();

    @JsonCreator
    public Exercise(@JsonProperty("name") String name, @JsonProperty("type") ExerciseType type, @JsonProperty("sets") List<Set> sets) {
        this.name = name;
        this.type = type;
        this.sets = (List)(sets != null ? sets : new ArrayList());
    }

    public void addSet(Double weight, Integer reps) {
        this.sets.add(new Set(weight, reps));
    }