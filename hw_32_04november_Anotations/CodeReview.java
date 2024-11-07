package org.example.hw_32_04november_Anotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface CodeReview {
    String reviewer() default "Andrey"; // ревьюер
    String date() ; // Дата ревью
    String comment(); // Комментарии
}
