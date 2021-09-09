import java.util.HashMap;
import java.util.Random;

public class MyMaps {

    public static int numQuarters = 0;
    public static int numDimes = 0;
    public static int numNickels = 0;

    public static void main(String[] args) {
        HashMap<String, Integer> map = initializeMaps();
        Random rand = new Random();

        for (int i = 0; i < 100; i++)
            fillMap(rand.nextInt(3) + 1, map);
    }

    public static HashMap<String, Integer> initializeMaps() {
        HashMap<String, Integer> tempMap = new HashMap<String, Integer>();
        tempMap.put("Quarters", numQuarters);
        tempMap.put("Dimes", numDimes);
        tempMap.put("Nickels", numNickels);
        return tempMap;
    }

    public static void fillMap(int value, HashMap<String, Integer> tempMap) {
        if (value == 1) {
            numQuarters++;
            tempMap.put("Quarters", numQuarters);
        } else if (value == 2) {
            numDimes++;
            tempMap.put("Dimes", numDimes);
        } else {
            numNickels++;
            tempMap.put("Nickels", numNickels);
        }
    }
}
