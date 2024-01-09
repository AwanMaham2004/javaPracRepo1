import java.util.Random;

public class Availability {

    Random random = new Random();

    public boolean availability(){
        return random.nextBoolean();
    }
}

