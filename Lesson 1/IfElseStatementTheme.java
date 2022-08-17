public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\nЗадача №1. Перевод псевдокода на язык Java.");
        byte age = 19;
        System.out.println ("Ваш возраст: " + age);
        if (age > 20) {
            System.out.println ("Вы старше 20-ти");
        } else {
            System.out.println("Вы младше 20-ти");
        } 

        boolean isManGender = true;
        if (!isManGender) {
            System.out.println("Поздравляем - у Вас девочка!");
        }

        double height = 1.90;
        if (height < 1.80) {
            System.out.println("Ваш рост - " + height + " и он меньше 1.80");
        } else {
            System.out.println("Ваш рост - " + height + " и он больше или равен 1.80");
        }
        String name = "Dimon";
        char firstNameChar = name.charAt(0);
        if (firstNameChar == 'M') {
            System.out.println("Первая буква в имени " + name + " M");
        } else if (firstNameChar == 'I') {
            System.out.println("Первая буква в имени " + name + " I");
        } else {
            System.out.println("В имени " + name + " первая буква " + firstNameChar);
        }
        
        System.out.println("\nЗадача №2. Поиск max и min числа.");
        byte num1 = 31;
        byte num2 = 14;
        if (num1 > num2) {
            System.out.println("Число " + num1 + " является Максимальным, а число " + num2 + " минимальным");
        } else if(num2 > num1) {
            System.out.println("Число " + num2 + " является Максимальным, а число " + num1 + " минимальным");
        }
        
        System.out.println("\nЗадача №3. Работа с числом.");
        int num = 0;
        System.out.println("Заданное число равно " + num);
        if (num == 0) {
            System.out.println("Число - 0");
        } else {
            if (num % 2 == 0) {
                System.out.println("Число четное");
             } else {
                System.out.println("Число нечетное");
            }
            if (num < 0) {
                System.out.println("Число отрицательное");
            } else {
                System.out.println("Число положительное");
            }
        }
                
        System.out.println("\nЗадача №4. Поиск одинаковых цифр в числах.");
        int numOne = 149;
        int numTwo = 138;
        System.out.println("Исходные числа :\n" + numOne + "\n" + numTwo);
        int hundredOne = numOne / 100;
        int tensOne = numOne % 100 / 10; 
        int onesOne = numOne % 10;
        System.out.println("Полученные цифры первого числа : " + hundredOne + ", " + tensOne +  ", " + onesOne);
        int hundredTwo = numTwo / 100;
        int tensTwo = numTwo % 100 / 10; 
        int onesTwo = numTwo % 10;
        System.out.println("Полученные цифры второго числа : " + hundredTwo + ", " + tensTwo + ", " + onesTwo);
        if (hundredOne == hundredTwo) {
            System.out.println("Одинаковые цифры в сотом разряде: " + hundredOne + " и " + hundredTwo);
        }
        if (tensOne == tensTwo) {
            System.out.println("Одинаковые цифры в десятичном разряде: " + tensOne + " и " + tensTwo);
        }
        if (onesOne == onesTwo) {
            System.out.println("Одинаковые цифры в единичном разряде: " + onesOne + " и " + onesTwo);
        }

        System.out.println("\nЗадача №5. Определение буквы, числа или символа по их коду.");
        char someChar = '\u0013';//'\u0057'
        System.out.println("Значение по данному в условии задачи коду : " + someChar);
        if (someChar >= '0' && someChar <= '9') {
            System.out.println("Это цифра");
        } else if (someChar >= 'a' && someChar <= 'z') {
            System.out.println("Это маленькая буква");
        } else if (someChar >= 'A' && someChar <= 'Z') {
            System.out.println("Это большая буква");
        } else {
            System.out.println("Это не буква и не цифра");
        }

       System.out.println("\nЗадача №6. Определение суммы вклада и начисленных банком %.");
       int deposit = 100000;
       int procent = 0;
       if (deposit < 100000) {
           procent = (deposit / 100) * 5;
       } else if (deposit >= 100000 && deposit < 300000) {
           procent = (deposit / 100) * 7;
       } else if (deposit >= 300000) {
           procent = (deposit / 100) * 10;
       }
       System.out.println("Сумма вклада: " + deposit + "\n" + "Начисленный процент: " + procent + "\n" +
            "Сумма с %: " + (deposit + procent));
       
       System.out.println("\nЗадача №7. Определение оценки по предметам.");
       int history = 59;
       int prog = 91;
       int historyBall = 0;
       int progBall = 0; 
       if (history <= 60) {
           historyBall = 2;
       } else if (history > 60 && history <= 73) {
           historyBall = 3;
       } else if (history > 73 && history <= 91) {
           historyBall = 4;
       } else if (history > 91 && history <= 100) {
           historyBall = 5;
       }
       if (prog <= 60) {
           progBall = 2;
       } else if (prog > 60 && prog <= 73) {
           progBall = 3;
       } else if (prog > 73 && prog <= 91) {
           progBall = 4;
       } else if (prog > 91 && prog <= 100) {
           progBall = 5;
       }
       System.out.println ("Предмет: Программирование, оценка: " + progBall + "\n" + "Предмет: История, оценка: " + historyBall);
       System.out.println("Средний балл по предметам: " + (historyBall + progBall) /2 );
       System.out.println("Средний процент по предметам: " + (history + prog) / 2 + "%");

       System.out.println("\nЗадача №8. Расчет прибыли.");
       int rent = 5000;
       int sale = 13000;
       int costPrice = 9000;
       int profit = (sale - costPrice - rent) * 12;
       if (profit > 0) {
            System.out.println("Прибыль за год составляет: " + "+" + profit + " руб.");
       } else if (profit < 0) {
            System.out.println("Прибыль за год составляет: " + profit + " руб.");
       }
       
       System.out.println("\nЗадача №9. Подсчет количества банкнот.\n");
       int hundredBlancNom = 100;
       int tenBlancNom = 10;
       int oneBlancNom = 1;
       System.out.println("Номиналы банкнот: " + "\n" + hundredBlancNom + "$ банкнота" + "\n" + tenBlancNom + "$ банкнота - 5 шт осталось" 
        + "\n" + oneBlancNom + "$ банкнота\n");
       int finalSum = 665; // 567
       System.out.println("Исходная сумма $: " + finalSum);
       int hundredBlanc = finalSum / hundredBlancNom; //(5)
       System.out.println("Сотен нужно: " + hundredBlanc);
       int tenBlanc = (finalSum - (hundredBlanc * 100)) / tenBlancNom; //(6)банкнот 
       System.out.println("Десяток нужно: " + tenBlanc);
       int oneBlanc = finalSum - (hundredBlanc * 100) - (tenBlanc * 10);
       System.out.println("Единичек нужно: " + oneBlanc + "\n");
       if (tenBlanc > 5) {
        int oneBlancCount = (tenBlanc - 5) * tenBlancNom / oneBlancNom;
        System.out.println("При учете остатка 10$ банкнот: \nСотен нужно: "+ hundredBlanc + "\nДесяток нужно: 5" +
        "\nЕдиничек нужно: " + (oneBlancCount + oneBlanc) +"\n" + "Исходная сумма составляет: " + ((hundredBlanc *
        hundredBlancNom) + (tenBlancNom * 5) + ((oneBlanc + oneBlancCount) * oneBlancNom)));
       }
    }
}

