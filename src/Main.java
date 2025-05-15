//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ///Task1\\\

        int paperBlack = 1000000000;
        byte paperWhite = 110;
        short blackKing = 10000;
        long mercedesBenz = 11100000000L;
        float notHat = 1.11111111f;
        double espressoCafe = 0.1111111111;

        System.out.println("Значение переменной paperBlack с типом int равно " + paperBlack);
        System.out.println("Значение переменной paperWhite с типом byte равно " + paperWhite);
        System.out.println("Значение переменной blackKing с типом short равно " + blackKing);
        System.out.println("Значение переменной mercedesBenz с типом long равно " + mercedesBenz);
        System.out.println("Значение переменной notHat с типом float равно " + notHat);
        System.out.println("Значение переменной espressoCafe с типом double равно " + espressoCafe);

        ///Task2\\\

        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        int d = 569;
        short e = -159;
        short j = 27897;
        byte z = 67;

        System.out.println("float - " + a);
        System.out.println("long - " + b);
        System.out.println("double - " + c);
        System.out.println("int - " + d);
        System.out.println("short - " + e);
        System.out.println("char - " + j);
        System.out.println("byte - " + z);

        ///Task3\\\

        byte studentsLp = 23;
        byte studentsAs = 27;
        byte studentsEa = 30;
        short paperEveryone = 480;

        System.out.println("На каждого ученика расчитано " + paperEveryone / (studentsLp + studentsAs + studentsEa) + " листов бумаги");

        ///Task4\\\

        byte workMinutes = 2;
        byte bottleMachine = 16/2;
        short minutes = 20;
        short dayAndNightHours = 24*60;
        short days = 3;
        short oneMonth = 1*30;

        System.out.println("За 20 минут машина произвела " + minutes * bottleMachine + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottleMachine * dayAndNightHours + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + (dayAndNightHours * days) * bottleMachine  + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + (dayAndNightHours * oneMonth) * bottleMachine + " штук бутылок");

        ///Task5\\\

        byte totalCans = 120;
        byte oneClassWhiteCans = 2;
        byte oneClassBrownCans = 4;
        int totalCansOneClass = oneClassWhiteCans + oneClassBrownCans;
        int totalClasses = totalCans / totalCansOneClass;
        int totalWhiteCans = totalClasses * oneClassWhiteCans;
        int totalBrownCans = totalClasses * oneClassBrownCans;

        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        ///Task6\\\

        int weightOneBananaGram = 80;
        int totalBananas = 5;
        int oneHundredMlMilk = 105;
        int totalMilkMl = 200;
        int twoBriqIceСreamGram = 2*100;
        int oneRawEggsGram = 70;
        int totalRawEggs = 4;
        int totalGramBananas = weightOneBananaGram * totalBananas;
        int totalMilkGram = oneHundredMlMilk * 2;
        int totalRawEggsGram = oneRawEggsGram * totalRawEggs;
        int totalGram = totalGramBananas + totalMilkGram + twoBriqIceСreamGram + totalRawEggsGram;
        float totalKilogram = (float) totalGram / 1000;

        System.out.println("Общий вес спортзавтрака в граммах составляет " + totalGram);
        System.out.println("Общий вес спортзавтрака в килограммах составляет " + totalKilogram);

        ///Task7\\\

        short totalWeightGram = 7 * 1000;
        short oneDayLosingWeightMinGram = 250;
        short oneDayLosingWeightMaxGram = 500;
        int maxTotalDaysLosingWeight = totalWeightGram / oneDayLosingWeightMinGram;
        int minTotalDaysLosingWeight = totalWeightGram / oneDayLosingWeightMaxGram;

        System.out.println("Предварительно переведём 7 килограмм в граммы и получим " + totalWeightGram + " грамм");
        System.out.println("Далее разделим 7000 грамм на ежедневную норму 250 грамм и получим максимальное количество дней " + maxTotalDaysLosingWeight);
        System.out.println("Далее разделим 7000 грамм на ежедневную норму 500 грамм и получим минимальное количество дней " + minTotalDaysLosingWeight);
        System.out.println("Если худеть в день на 250 грамм потребуется максимум " + maxTotalDaysLosingWeight + " дней");
        System.out.println("Если худеть в день на 500 грамм потребуется минимум " + minTotalDaysLosingWeight + " дней");

        ///Task8\\\

        float everyYearSalaryIncr = (float) 0.10;
        int monthsYear = 12;
        int mashaGetsMonth = 67760;
        int mashaGetsYear = mashaGetsMonth * monthsYear;
        int denGetsMonth = 83690;
        int denGetsYear = denGetsMonth * monthsYear;
        int krisGetsMonth = 76230;
        int krisGetsYear = krisGetsMonth * monthsYear;
        float premiaMasha = (float) mashaGetsMonth * everyYearSalaryIncr;
        float premiaDen = (float) denGetsMonth * everyYearSalaryIncr;
        float premiaKris = (float) krisGetsMonth * everyYearSalaryIncr;
        float maxMashaGetsMonth = (float) mashaGetsMonth + premiaMasha;
        float maxDenGetsMonth = (float) denGetsMonth + premiaDen;
        float maxKrisGetsMonth = (float) krisGetsMonth + premiaKris;
        float maxMashaGetsYear = maxMashaGetsMonth * monthsYear;
        float maxDenGetsYear = maxDenGetsMonth * monthsYear;
        float maxKrisGetsYear = maxKrisGetsMonth * monthsYear;
        float premiaMashaYear = premiaMasha * monthsYear;
        float premiaDenYear = premiaDen * monthsYear;
        float premiaKrisYear = premiaKris * monthsYear;

        System.out.println("Маша теперь получает " + maxMashaGetsMonth + " рублей. Годовой доход вырос на " + premiaMashaYear + " рублей");
        System.out.println("Денис теперь получает " + maxDenGetsMonth + " рублей. Годовой доход вырос на " + premiaDenYear + " рублей");
        System.out.println("Кристина теперь получает " + maxKrisGetsMonth + " рублей. Годовой доход вырос на " + premiaKrisYear + " рублей");


    }
}

