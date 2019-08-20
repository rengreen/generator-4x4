import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String[] starterki = new String[]{"starterka1", "starterka2", "starterka3", "starterka4"};
        String[] juniorki = new String[]{"juniorka1", "juniorka2", "juniorka3", "juniorka4"};
        String[] szeregowe = new String[]{"szeregowa1", "szeregowa2", "szeregowa3", "szeregowa4"};
        String[] komandoski = new String[]{"komandoska1", "komandoska2", "komandoska3", "komandoska4"};

        String[] starterkiMix = mixArray(starterki);
        String[] juniorkiMix = mixArray(juniorki);
        String[] szeregoweMix = mixArray(szeregowe);
        String[] komandoskiMix = mixArray(komandoski);

        String[] gamerki = new String[]{starterkiMix[0], juniorkiMix[0], szeregoweMix[0], komandoskiMix[0]};
        System.out.println("Wylosowano gamerki: " + Arrays.toString(gamerki));

        String[] kosmonautki = new String[]{starterkiMix[1], juniorkiMix[1], szeregoweMix[1], komandoskiMix[1]};
        System.out.println("Wylosowano kosmonautki: " + Arrays.toString(kosmonautki));

        String[] zonyHollywood = new String[]{starterkiMix[2], juniorkiMix[2], szeregoweMix[2], komandoskiMix[2]};
        System.out.println("Wylosowano zony Hollywood: " + Arrays.toString(zonyHollywood));

        String[] heroski = new String[]{starterkiMix[3], juniorkiMix[3], szeregoweMix[3], komandoskiMix[3]};
        System.out.println("Wylosowano heroski: " + Arrays.toString(heroski));

    }

    private static String[] mixArray(String[] array){
        Random random = new Random();

        for (int i=0; i<array.length; i++) {
            int randomPosition = random.nextInt(array.length);
            String temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }
        return array;
    }
}

