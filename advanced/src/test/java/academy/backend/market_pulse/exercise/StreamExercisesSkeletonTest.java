package academy.backend.market_pulse.exercise;

import org.junit.jupiter.api.Disabled;


/**
 * Прогресс студента: красный сразу после выдачи {@link StreamExercisesSkeleton} (все методы —
 * {@code throw}), по мере реализации каждого упражнения соответствующий тест зеленеет. Полностью
 * зелёный — все 16 упражнений решены.
 */
@Disabled
class StreamExercisesSkeletonTest extends StreamExercisesContractTest {

    @Override
    protected StreamExercises createExercises() {
        return new StreamExercisesSkeleton();
    }
}
