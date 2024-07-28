package app;

public class RandomNumberGenerator {

    static int generateRandomNumber(int min, int max) {
        return (int) (Math.random()*(max-min))+min;
    }
}
