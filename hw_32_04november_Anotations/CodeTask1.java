package org.example.hw_32_04november_Anotations;


    @CodeReview(
            reviewer = "Alexandr",
            date = "2024-11-08",
            comment = "Классу дать осмысленное название и вынести один метод в отдельный интерфейс"
    )
    public class CodeTask1 {

        @CodeReview(
                date = "2024-11-07",
                comment = "Поле желательно сделать приватным"
        )
        String task;
        private int numberOfTask;

        @CodeReview(
                date = "2024-11-07",
                comment = "Метод стоит разбить на  части"
        )
        public void sumMachParameter(int numberOfTask) {
            // реализация метода
        }

        @CodeReview(
                reviewer = "Alexandr",
                date = "2024-11-08",
                comment = "Метод лучше вынести в отдельный интерфейс"
        )
        public void anotherMethod(String user) {
            // реализация метода
        }
    }

