package kata1;

import java.util.Date;

public class Person {
    
    private final String name;
    private final Date birthdate;
    private static final int MS_PER_SECOND = 1000;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int MINUTES_PER_HOUR = 60;
    private static final int HOURS_PER_DAY = 24;
    private static final double DAYS_PER_YEAR = 365.25;
    private static final double MS_PER_YEAR = MS_PER_SECOND * SECONDS_PER_MINUTE * MINUTES_PER_HOUR * HOURS_PER_DAY * DAYS_PER_YEAR;

    public Person(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }
    
    public int getAge(){
        long ms = new Date().getTime() - birthdate.getTime();
        return (int) (ms / MS_PER_YEAR);
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", birthdate=" + birthdate + ", age=" + getAge() + '}';
    }
    
}
