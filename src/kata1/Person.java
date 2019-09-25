package kata1;

import java.time.LocalDate;

public class Person {
    
    private final String name;
    private final LocalDate birthdate;
    private static final double DAYS_PER_YEAR = 365.25;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    public int getAge(){
        long ms = LocalDate.now().toEpochDay() - birthdate.toEpochDay();
        return (int) (ms / DAYS_PER_YEAR);
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", birthdate=" + birthdate + ", age=" + getAge() + '}';
    }
    
}
