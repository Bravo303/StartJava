public class VariablesTheme {
    public static void main(String[] argrs) { // пробел после main не нужен!
        //Задача №1
        System.out.println("\nЗадача №1. Создание переменных и вывод их значений на консоль.\n");
        byte ddr = 16;
        short ssd = 512;
        int video = 3080;
        long win = 346120945;
        float ghz = 3.5f;
        double hz = 3.52342526d;
        char cpu = 'I';
        boolean gamePc = true;
        String topPc = "У меня топовый компьютер (нет)!";
        System.out.println("- Количество оперативной памяти: " + ddr + " gb");
        System.out.println("- Объем жесткого диска: " + ssd + " gb");
        System.out.println("- Серия видеокарты: " + video);
        System.out.println("- Серийный номер Windows: " + win);
        System.out.println("- Частота одного ядра процессора: " + ghz);
        System.out.println("- Тоже самое, только что бы показать double: " + hz);
        System.out.println("- Имя процессора: " + cpu + " - типа Intel =)");
        System.out.println("- У меня игровой компьютер?: " + gamePc);
        System.out.println("- Вывод строки: " + topPc) ;

        //Задача №2
        System.out.println("\nЗадача №2. Расчет стоимости товара со скидкой.\n");
        byte pen = 100;
        short book = 200;
        byte discount = 11;
        int discountSum = ((pen + book) / 100) * discount;
        int discountPrice = (pen + book) - discountSum;
        System.out.println("Размер суммы скидок составляет: " + discountSum + " рубля.");
        System.out.println("Общая стоимость товаров со скидкой составляет: " + discountPrice + " рублей.");
        
        //Задача №3
        System.out.println("\nЗадача №3. Вывод на консоль слова 'JAVA'.\n");
        String result1 = "   J    a  v     v  a      ";
        String result2 = "   J   a a  v   v  a a     ";
        String result3 = "J  J  aaaaa  V V  aaaaa   ";
        String result4 = " JJ  a     a  V  a     a";
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        //Задача №4
        System.out.println ("\nЗадача №4. Отображение min и max значений числовых типов данных.\n");
        byte byteNum = 127;
        // ++x - сначала увеличение, потом вывод
        // x++ - сначала вывод, потом увеличение
        System.out.println("Первоначальное значение byte: " + byteNum);
        System.out.println("Значение после инкремента: " + ++byteNum);
        System.out.println("Значение после декремента: " + --byteNum);
        short shortNum = 32767;
        System.out.println("\nПервоначальное значение short: " + shortNum);
        System.out.println("Значение после инкремента: " + ++shortNum);
        System.out.println("Значение после декремента: " + --shortNum);
        int intNum = 2147483647;
        System.out.println("\nПервоначальное значение int: " + intNum);
        System.out.println("Значение после инкремента: " + ++intNum);
        System.out.println("Значение после декремента: " + --intNum);
        long longNum = 922372036854775807L;
        System.out.println("\nПервоначальное значение int: " + longNum);
        System.out.println("Значение после инкремента: " + ++longNum);
        System.out.println("Значение после декремента: " + --longNum);

        //Задача №5
        System.out.println ("\nЗадача №5. Перестановка значений переменных.\n");
        int num1 = 10;
        int num2 = 3;
        System.out.println("Исходное значение первой переменной num1: " + num1);
        System.out.println("Исходное значение второй переменной num2: " + num2);
        
        //Третья переменная
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("\n>>>>> Меняем местами с помощью третьей переменной");
        System.out.println("Новое значение переменной num1: " + num1);
        System.out.println("Новое значение переменной num2: " + num2);
        
        //Арифметические операции
        System.out.println("\n>>>>> Меняем местами с помощью арифметических операций");
        System.out.println("Исходное значение первой переменной num1: " + num1);
        System.out.println("Исходное значение второй переменной num2: " + num2);
        num1 -= num2;
        num2 += num1;
        num1 = num2 - num1;
        System.out.println("Новое значение переменной num1: " + num1);
        System.out.println("Новое значение переменной num2: " + num2);

        //Побитовые операции
        System.out.println("\n>>>>> Меняем местами с помощью побитовых операций");
        System.out.println("Исходное значение первой переменной num1: " + num1);
        System.out.println("Исходное значение второй переменной num2: " + num2);
        num1 = num1 ^ num2;
        num2 = num2 ^ num1;
        num1 = num1 ^ num2;
        System.out.println("\nНовое значение переменной num1: " + num1);
        System.out.println("Новое значение переменной num2: " + num2);
        
        //Задача №6
        System.out.println("\nЗадача №6. Вывод символов и их кодов.\n");
        byte sym1 = 35;
        byte sym2 = 38;
        byte sym3 = 64;
        byte sym4 = 94;
        byte sym5 = 95;
        System.out.println("Символ " + (char) sym1 + ", код: " + sym1);// обязательный пробел после приведения типа!
        System.out.println("Символ " + (char) sym2 + ", код: " + sym2);
        System.out.println("Символ " + (char) sym3 + ", код: " + sym3);
        System.out.println("Символ " + (char) sym4 + ", код: " + sym4);
        System.out.println("Символ " + (char) sym5 + ", код: " + sym5);

        //Задача №7
        System.out.println("\nЗадача №7. Произведение и сумма цифр числа.");
        int number = 345;
        int newNumber1 = number / 100;
        int newNumber2 = number % 100 / 10;
        int newNumber3 = number % 10;
        int newSum = newNumber1 + newNumber2 + newNumber3;
        int newProiz = newNumber1 * newNumber2 * newNumber3;
        System.out.println("\nСумма чисел числа " + number + " = " + newSum);
        System.out.println("Произведение чисел числа " + number + " = " + newProiz);
        
        //Задача №8*
        System.out.println("\nЗадача №8*. Вывод на консоль ASCII-арт Дюка.\n");
        char slash = 47;
        char backSlash = 92;
        char under = 95;
        char whiteSpace = 32;
        char bracket1 = 40;
        char bracket2 = 41;
        System.out.println("" + whiteSpace + whiteSpace + whiteSpace + whiteSpace + slash + backSlash + whiteSpace + whiteSpace + whiteSpace + whiteSpace + "\n" + 
            whiteSpace + whiteSpace + whiteSpace + slash + whiteSpace + whiteSpace + backSlash + whiteSpace + whiteSpace + whiteSpace + "\n" + 
            whiteSpace + whiteSpace + slash + under + bracket1 + whiteSpace + bracket2 + backSlash + whiteSpace + whiteSpace + "\n" + 
            whiteSpace + slash + whiteSpace + whiteSpace + whiteSpace + whiteSpace + whiteSpace + whiteSpace + backSlash + whiteSpace + "\n" + 
            slash + under + under + under + under + slash + backSlash + under + under + backSlash);
      

        //Задача №9*
        System.out.println("\nЗадача №9*. Отображение количества сотен, десятков и единиц числ.\n");
        int num = 123;
        int hundred = num / 100;
        int tens = (num % 100) / 10;
        int ones = num % 10;
        System.out.println( "Число " + num + " содержит: \n" + hundred + " сотня (-ен)\n" + tens + " десятка (-ов)\n" + ones + " единицы (-а)");

        //Задача №10*
        System.out.println("\nЗадача №10*. Преобразование секунд.\n");
        int time = 86399;
        int allMin = time / 60;
        int sec = time % 60;
        int hour = allMin / 60;
        int min = allMin % 60;
        System.out.println("ЧЧ:ММ::СС " + hour + ":" + min + ":" + sec);
  }
}