package kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(1980,10,1);
        Person pau = new Person("Pau", birthdate);
        System.out.println(pau);
    }
    
}
