import java.util.Random;

public class IgrovoPolence {

    String[] polenca = new String[]{" S", "ST", "ST", "ST", " C", " C", " C", " T", " T", " T", " T", " T", " T", " T", " P", " P", " P", " I", " I", " I"};
    Igrach igrach = new Igrach();
    Igrach bot = new Igrach();

    public IgrovoPolence(){
        RandomizeField();
    }

    public void RandomizeField() {
        Random rand = new Random();
        for (int i = 1; i < 20; i++) {
            int rndIndex = rand.nextInt(19) + 1;
            String smth = polenca[rndIndex];
            polenca[rndIndex] = polenca[i];
            polenca[i] = smth;
        }
    }

    public void printField() {
        for (int i = 10; i <= 17; i++) System.out.printf("|%s|", polenca[i]);
        System.out.println();
        System.out.println("|"+polenca[9] + "|                        |" + polenca[18]+"|");
        System.out.println("|"+polenca[8] + "|                        |" + polenca[19]+"|");
        for (int i = 7; i >= 0; i--) System.out.printf("|%s|", polenca[i]);
        System.out.println();
    }

    public void PuskajDaSeVyrtiIgrovotoPolence(){
        while (true){

            bot.dviijiSe(metniZara(1)+1);
            igrach.dviijiSe(metniZara(1)+1);
            System.out.println("Igrach pos:"+igrach.poziciq);
            System.out.println("Bot pos:"+bot.poziciq);
            printField();

        }
    }
    public int metniZara(int maks){
        Random random = new Random();
        return random.nextInt(maks);
    }
}