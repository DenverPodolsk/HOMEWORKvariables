import javax.swing.*;

public class Main{
    public static void main(String[] args){
        // Задание первое

byte a =1;
short b = 2;
int d = 3;
long e = 400L;
float f = 0.98f;
double c = 1.12;
boolean aIsAdult=a  > 2;
char bar = 35;
// Задание втрое
    float boxer1 = 78.2f;
    float boxer2 = 82.7f;
    float totalWeight = boxer1+boxer2;
    float weightDifference = boxer2-boxer1;
    System.out.println("Общий вес боксеров: "+ totalWeight + "кг ");
System.out.println("Разница в весе боксеров: "+ weightDifference +"кг ");

// Задание третье
        byte bananasPiece = 5;
        short milkMililiters = 200;
        byte icecreamBriqettes = 2;
        byte egsPiece = 4;
       byte oneBananasGrams= 80;
       byte milk100MilitersGrams = 105;
       byte icecreamOneBrigettesGram= 100;
       byte egsOneGrams=70;
       int bananasGrams=bananasPiece*oneBananasGrams;
       int milkGrams=milk100MilitersGrams*2;
       int iceCreamGrams=icecreamBriqettes*icecreamOneBrigettesGram;
       int egsGrams=egsPiece*egsOneGrams;
       int breakfastGrams =bananasGrams+milkGrams+iceCreamGrams+egsGrams;
       System.out.println("Завтрак в граммах = "+ breakfastGrams +"гр");
double breakfastKg=breakfastGrams*0.001;
System.out.println("Завтрак в килограммах =" + breakfastKg +"кг");
// Задание четвертое

byte weightKG= 7;
short loseWeightGr1=250;
short loseWeightGr2=500;
int weightGr = weightKG*1000;
int days250Gr=weightGr/loseWeightGr1;
System.out.println("Дней уйдет на похудение по 250г :"+ days250Gr);
int days500Gr=weightGr/loseWeightGr2;
System.out.println("Дней уйдет на похудение по 500г :"+ days500Gr);
int avarageDay = (days500Gr+days250Gr)/2;
System.out.println("Среднее количество дней:"+ avarageDay);

// Задание пятое

        int mashaSalary =67760;
        int denisSalary =83690;
        int kristinaSalary = 76230;
        double mashaSalaryIncreases= mashaSalary*1.1;
        double denisSalaryIncreases= denisSalary*1.1;
        double kristinaSalaryIncreses = kristinaSalary*1.1;
        System.out.println("Маша теперь получает:"+mashaSalaryIncreases+" рублей");
        System.out.println("Денис теперь получает:"+denisSalaryIncreases+" рублей");
        System.out.println("Кристина теперь получает:"+kristinaSalaryIncreses+" рублей");
        double mashaIncome =(mashaSalaryIncreases-mashaSalary)/12;
        double denisIncome =(denisSalaryIncreases-denisSalary)/12;
        double kristinaIncome =(kristinaSalaryIncreses-kristinaSalary)/12;
        System.out.println("Годовой доход Маши вырос на: " + mashaIncome +" рублей");
        System.out.println("Годовой доход Дениса вырос на: "+ denisIncome+ " рублей");
        System.out.println("Годовой доход Кристины вырос на:"+kristinaIncome+" рублей");






    }}
