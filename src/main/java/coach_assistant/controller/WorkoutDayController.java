package coach_assistant.controller;

import coach_assistant.workoutPlan.WorkoutDay;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping({"/workouts"})
public class WorkoutDayController {
    private final Map<Long, WorkoutDay> workouts = new HashMap();


    @GetMapping
    public Collection<WorkoutDay> getWorkout() {
        return this.workouts.values();
    }

    @PostMapping
    public WorkoutDay addWorkout(@RequestBody WorkoutDay workoutDay) {
        workoutDay.setId(this.getNextId());
        this.workouts.put(workoutDay.getId(), workoutDay);
        return workoutDay;
    }

    private long getNextId() {
        long currentMaxId = this.workouts.keySet().stream().mapToLong((id) -> {
            return id;
        }).max().orElse(0L);
        return ++currentMaxId;
    }
}
