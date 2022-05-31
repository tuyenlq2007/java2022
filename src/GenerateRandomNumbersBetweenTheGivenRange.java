import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumbersBetweenTheGivenRange {

    public static void main(String[] args)
    {

        int Min = 1, Max = 100;

        System.out.println("Random value between "
                + Min + " and " + Max + ": "
                + ThreadLocalRandom
                .current()
                .nextInt(Min, Max + 1));
    }
}
