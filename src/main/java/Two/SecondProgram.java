package Two;

public class SecondProgram {
    public static void main(String[] args) {
        //CELI BROJEVI
        byte firstNumber = 127;
        byte secondNumber = (byte) 128;
        //Short 16
        short shortNumber = 32767;
        short secondShortNumber = (short) 32768;
        System.out.println(firstNumber);
        //AUTOMATSKA KONVERZIJA tipa iz byte -> short
        short shortNumber3 = firstNumber;
        System.out.println(shortNumber3);
        short shortyBroj = (byte) 89;
        //EKSPLICITNA KONVERZIJA tipa iz shotr -> byte
        byte byteBroj = (byte) shortyBroj;
        //32-bitni zapis
        int number = 23;
        //64-bitni TIP varijable = vrednost;
        long longNumber = 100l;
        // 1. 234 evaluira ili tretira kao integer 32-bitni celi broj
        // 2. automtsku konverzaciju tipa u 234 32-bitni -> 64 -bitni
        // 3. varibijalni longNumber cu upisati vrednost tog 64 bitni
        double doubleNumber = 3.14;
        // 1. 3.14 vrednost se tretira 64 -bitni
        // 2. operater dodele ce upisati vrednost 3.14
        float floatNumber = 3.14F;
        char slovo = 'A';
        char novoSlovo = 66;;
        int noviBroj = slovo;
        System.out.println("NOVI BROJ = " + noviBroj);
        System.out.println("NOVI SLOVO = " + novoSlovo);
        char separator = ';';
        int separatorNumber = separator;
        System.out.println("SEPARATOR = " + separatorNumber + " SEPARATOR NUMBER= " + separatorNumber);

        boolean condition = true;
        System.out.println(condition);

  //Java 10
        var nekiBroj = 23;//int
        nekiBroj = 345;
        System.out.println("ISPIS NEKI BROJ = "+nekiBroj); // 345
        int slovoNaPapiru = 'A';//char
        slovoNaPapiru = 66;
        System.out.println("SLOVO NA PAPIRU = " +slovoNaPapiru); // B
    }
}
