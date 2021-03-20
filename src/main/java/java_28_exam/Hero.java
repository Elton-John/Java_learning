package java_28_exam;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Optional;

public class Hero implements Comparable<Hero>, Serializable {
    private String name;
    private Long power;
    private LocalDate dateOfBirth;
    private String phoneNumber;


    public Hero() {
    }

    public Hero(String name, Long power, LocalDate dateOfBirth) {
        this.name = name;
        this.power = power;
        this.dateOfBirth = dateOfBirth;

    }

    public Hero(String name, Long power, LocalDate dateOfBirth, String phoneNumber) {
        this.name = name;
        this.power = power;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPower() {
        return power;
    }

    public void setPower(Long power) {
        this.power = power;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(Hero o) {
        Long thisHeroPower = Optional.of(this.power).orElse(0L);
        Long otherHeroPower = Optional.of(o.getPower()).orElse(0L);
        if (thisHeroPower > otherHeroPower) {
            return 1;
        } else if (thisHeroPower < otherHeroPower) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", dateOfBirth=" + dateOfBirth +

                '}';
    }
}
