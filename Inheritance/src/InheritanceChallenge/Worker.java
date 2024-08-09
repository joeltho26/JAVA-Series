package InheritanceChallenge;

import java.time.LocalDate;
import java.time.Month;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    int getAge() {
        LocalDate date = LocalDate.now();

        int currentYear = date.getYear();
        int currentDay = date.getDayOfMonth();
        int currentMonth = date.getMonthValue();

        int year = Integer.parseInt(birthDate.substring(6));
        int day = Integer.parseInt(birthDate.substring(0,2));
        int month = Integer.parseInt(birthDate.substring(3,5));

        int age = currentYear - year;
        if ((currentMonth-month)==0 && (currentDay-day)>=0) {
            age += 1;
        }
        return age;
    }

    double collectPay() {
        return 0.0;
    }

    void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
