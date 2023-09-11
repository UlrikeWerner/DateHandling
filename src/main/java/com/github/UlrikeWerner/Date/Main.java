package com.github.UlrikeWerner.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Jetziger Zeitpunkt: " + today);
        System.out.println("-------------------------------");

        LocalDateTime twoWeeksLaterFromNow = today.plusWeeks(2);
        System.out.println("in zwei Wochen von jetzt an: " + twoWeeksLaterFromNow);
        System.out.println("-------------------------------");

        LocalDateTime futurDate = LocalDateTime.of(2023, 11, 15, 10, 0);
        if (futurDate.isAfter(today)) {
            System.out.println(futurDate + " kommt nach dem " + today);
        } else {
            System.out.println(futurDate + " kommt vor dem " + today);
        }
        System.out.println("-------------------------------");

        LocalDate may15 = LocalDate.of(2023, 5, 15);
        LocalDate may31 = LocalDate.of(2023, 5, 31);
        long daysBetween = ChronoUnit.DAYS.between(may15, may31);
        System.out.println("Zwischen " + may15 + " und " + may31 + " liegen " + daysBetween + " Tage!");
    }
}
