import java.util.Random;

public class Availability {

    Random random = new Random();

    public boolean modelAvailability(){
        return random.nextBoolean();
    }

}
