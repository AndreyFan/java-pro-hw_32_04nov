package org.example.hw_32_04november_Anotations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReportOfReview {
    public static void main(String[] args) {
        getReport(CodeTask1.class);
    }

    public static void getReport(Class<?> clazz) {
        // Проверка аннотации на уровне класса
        if (clazz.isAnnotationPresent(CodeReview.class)) {
            CodeReview classAnnotation = clazz.getAnnotation(CodeReview.class);
            System.out.printf("Class: %s ; Reviewer: %s ; Date: %s; Comment: %s%n",
                    clazz.getSimpleName(), classAnnotation.reviewer(), classAnnotation.date(), classAnnotation.comment());
        }

        // Проверка аннотаций на уровне полей
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(CodeReview.class)) {
                CodeReview fieldAnnotation = field.getAnnotation(CodeReview.class);
                System.out.printf("Field: %s ; Reviewer: %s ; Date: %s; Comment: %s%n",
                        field.getName(), fieldAnnotation.reviewer(), fieldAnnotation.date(), fieldAnnotation.comment());
            }
        }

        // Проверка аннотаций на уровне методов
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(CodeReview.class)) {
                CodeReview methodAnnotation = method.getAnnotation(CodeReview.class);
                System.out.printf("Method: %s ; Reviewer: %s ;Date: %s; Comment: %s%n",
                        method.getName(), methodAnnotation.reviewer(), methodAnnotation.date(), methodAnnotation.comment());
            }
        }


    }
}
