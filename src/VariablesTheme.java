public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера\n");

        // Целочисленные типы данных
        int numberOfCores = 4;
        long processorFrequency = 3000000000L;
        short ramSize = 8192;
        byte systemArchitectureBits = 64;

        // Типы данных с плавающей точкой
        float gpuClockSpeed = 1500.5f;
        double storageCapacity = 512.75d;

        // Тип char для символьных данных
        char processorCodeName = 'i';

        // Тип boolean для булевых данных
        boolean isSSD = true;
        boolean isGamingComputer = false;

        // Вывод значений переменных
        System.out.println("Характеристики компьютера:");
        System.out.println("Количество ядер: " + numberOfCores);
        System.out.println("Частота процессора: " + processorFrequency + " ГГц");
        System.out.println("Объем оперативной памяти: " + ramSize + " МБ");
        System.out.println("Разрядность системы: " + systemArchitectureBits + " бит");
        System.out.println("Частота GPU: " + gpuClockSpeed + " ГГц");
        System.out.println("Объем накопителя: " + storageCapacity + " ГБ");
        System.out.println("Кодовое имя процессора: " + processorCodeName);
        System.out.println("Используется SSD: " + isSSD);
        System.out.println("Это игровой компьютер: " + isGamingComputer + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой\n");

        //Стоимость товара без скидки
        double penPrice = 100.0;
        double bookPrice = 200.0;
        double totalPriceWithoutDiscount = penPrice + bookPrice;

        //Сумма скидки
        double discountPercentage = 11.0;
        double discountAmount = (discountPercentage / 100) * totalPriceWithoutDiscount;

        //Стоимость товара со скидкой
        double totalPriceWithDiscount = totalPriceWithoutDiscount - discountAmount;

        // Вывод результатов в консоль
        System.out.println("Общая стоимость товаров без скидки: " + totalPriceWithoutDiscount + " руб.");
        System.out.println("Сумма скидки (" + discountPercentage + "%): " + discountAmount + " руб.");
        System.out.println("Общая стоимость товаров со скидкой: " + totalPriceWithDiscount + " руб." + "\n");

        System.out.println("3. Вывод слова JAVA\n");

        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");

        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;

        // Вывод информации для byte
        System.out.println("byteVar:");
        System.out.println("Исходное значение: " + byteVar);
        byteVar++;
        System.out.println("Значение после инкремента: " + byteVar);
        byteVar--;
        System.out.println("Значение после декремента: " + byteVar);

        // Вывод информации для short
        System.out.println("\nshortVar:");
        System.out.println("Исходное значение: " + shortVar);
        shortVar++;
        System.out.println("Значение после инкремента: " + shortVar);
        shortVar--;
        System.out.println("Значение после декремента: " + shortVar);

        // Вывод информации для int
        System.out.println("\nintVar:");
        System.out.println("Исходное значение: " + intVar);
        intVar++;
        System.out.println("Значение после инкремента: " + intVar);
        intVar--;
        System.out.println("Значение после декремента: " + intVar);

        // Вывод информации для long
        System.out.println("\nlongVar:");
        System.out.println("Исходное значение: " + longVar);
        longVar++;
        System.out.println("Значение после инкремента: " + longVar);
        longVar--;
        System.out.println("Значение после декремента: " + longVar);

        System.out.println("\n5. Перестановка значений переменных\n");

        int a = 2;
        int b = 5;

        // Перестановка с использованием третьей переменной
        System.out.println("С использованием третьей переменной");
        int temp = a;
        a = b;
        System.out.println("Исходные значения: a = " + a + ", b = " + b);
        b = temp;
        System.out.println("Новые значения: a = " + a + ", b = " + b);

        // Перестановка с использованием арифметических операций
        System.out.println("\nС использованием арифметических операций");
        System.out.println("Исходные значения: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Новые значения: a = " + a + ", b = " + b);

        // Перестановка с использованием побитовой операции
        System.out.println("\nС использованием побитовой операции");
        System.out.println("Исходные значения: a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Новые значения: a = " + a + ", b = " + b);

        System.out.println("\n6. Перестановка значений переменных\n");

        // Инициализация переменных типа char символами из ASCII-таблицы
        char char1 = 36;  // Символ '$'
        char char2 = 42;  // Символ '*'
        char char3 = 64;  // Символ '@'
        char char4 = 124; // Символ '|'
        char char5 = 126; // Символ '~'

        // Вывод кодов символов и соответствующих символов в столбец
        System.out.println("Код символа: " + (int) char1);
        System.out.println("Символ: " + char1 + "\n");

        System.out.println("Код символа: " + (int) char2);
        System.out.println("Символ: " + char2 + "\n");

        System.out.println("Код символа: " + (int) char3);
        System.out.println("Символ: " + char3 + "\n");

        System.out.println("Код символа: " + (int) char4);
        System.out.println("Символ: " + char4 + "\n");

        System.out.println("Код символа: " + (int) char5);
        System.out.println("Символ: " + char5 + "\n");

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");

         // Инициализация переменных с символами для ASCII-арт Дюка
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';

        // Вывод ASCII-арт Дюка в консоль
        System.out.println("    " + slash +  backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + backslash + underscore + underscore + backslash);

        System.out.println("\n8. Перестановка значений переменных\n");

        // Исходное число
        int number = 123;

        // Выделение цифр числа
        int hundreds = number / 100;
        int remainder = number % 100;
        int tens = remainder / 10;
        int units = remainder % 10;

        // Сумма и произведение цифр
        int sum = hundreds + tens + units;
        int product = hundreds * tens * units;

        // Вывод результата
        System.out.println("Число " + number + " содержит:");
        System.out.println("  remainder - " + remainder);
         System.out.println("  сотен - " + hundreds);
        System.out.println("  десятков - " + tens);
        System.out.println("  единиц - " + units);
        System.out.println("Сумма его цифр = " + sum);
        System.out.println("Произведение = " + product);
    }
}


