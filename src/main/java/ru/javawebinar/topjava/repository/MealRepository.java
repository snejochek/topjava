package ru.javawebinar.topjava.repository;

import org.springframework.stereotype.Component;
import ru.javawebinar.topjava.model.Meal;

import java.util.Collection;

@Component
public interface MealRepository {
    // null if updated meal does not belong to userId
    Meal save(Meal meal);

    // false if meal does not belong to userId
    boolean delete(int id);

    // null if meal does not belong to userId
    Meal get(int id);

    // ORDERED dateTime desc
    Collection<Meal> getAll();
}
