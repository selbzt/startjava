public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера\n");

        // Целочисленные типы данных
        int numberOfCores = 4;
        long processorCpu = 3000000000L;
        short ramSize = 8192;
        byte systemArchitectureBits = 64;

        // Типы данных с плавающей точкой
        float gpuClockSpeed = 1500.5f;
        double storageCapacity = 512.75d;

        // Тип char для символьных данных
        char processorCodeName = 'i';

        // Тип boolean для булевых данных
        boolean isSsd = true;
        boolean isGamingComputer = false;

        // Вывод значений переменных
        System.out.println("Характеристики компьютера:");
        System.out.println("Количество ядер: " + numberOfCores);
        System.out.println("Частота процессора: " + processorCpu + " ГГц");
        System.out.println("Объем оперативной памяти: " + ramSize + " МБ");
        System.out.println("Разрядность системы: " + systemArchitectureBits + " бит");
        System.out.println("Частота GPU: " + gpuClockSpeed + " ГГц");
        System.out.println("Объем накопителя: " + storageCapacity + " ГБ");
        System.out.println("Кодовое имя процессора: " + processorCodeName);
        System.out.println("Используется SSD: " + isSsd);
        System.out.println("Это игровой компьютер: " + isGamingComputer + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой\n");

        double penPrice = 100.0;
        double bookPrice = 200.0;
        double totalPriceWithoutDiscount = penPrice + bookPrice;

        double discountPercentage = 11.0;
        double discountAmount = (discountPercentage / 100) * totalPriceWithoutDiscount;

        double discountPrice = totalPriceWithoutDiscount - discountAmount;

        System.out.println("Общая стоимость товаров без скидки: " + totalPriceWithoutDiscount + " руб.");
        System.out.println("Сумма скидки (" + discountPercentage + "%): " + discountAmount + " руб.");
        System.out.println("Общая стоимость товаров со скидкой: " + discountPrice + " руб." + "\n");

        System.out.println("3. Вывод слова JAVA\n");

        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");

        byte maxValueByte = 127;
        short maxValuetShort = 32767;
        int maxValueInt = 2147483647;
        long maxValueLong = 9223372036854775807L;

        System.out.println("maxValueByte:");
        System.out.println("Исходное значение: " + maxValueByte);
        System.out.println("Значение после инкремента: " + maxValueByte++);
        System.out.println("Значение после декремента: " + maxValueByte--);

        System.out.println("\nmaxValuetShort:");
        System.out.println("Исходное значение: " + maxValuetShort);
        System.out.println("Значение после инкремента: " + maxValuetShort++);
        System.out.println("Значение после декремента: " + maxValuetShort--);

        System.out.println("\nmaxValueInt:");
        System.out.println("Исходное значение: " + maxValueInt);
        System.out.println("Значение после инкремента: " + maxValueInt++);
        System.out.println("Значение после декремента: " + maxValueInt--);

        System.out.println("\nmaxValueLong:");
        System.out.println("Исходное значение: " + maxValueLong);
        System.out.println("Значение после инкремента: " + maxValueLong++);
        System.out.println("Значение после декремента: " + maxValueLong--);

        System.out.println("\n5. Перестановка значений переменных\n");

        int a = 2;
        int b = 5;

        System.out.println("С использованием третьей переменной");
        System.out.println("Исходные значения: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Новые значения: a = " + a + ", b = " + b);

        System.out.println("\nС использованием арифметических операций");
        System.out.println("Исходные значения: a = " + a + ", b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Новые значения: a = " + a + ", b = " + b);

        System.out.println("\nС использованием побитовой операции");
        System.out.println("Исходные значения: a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Новые значения: a = " + a + ", b = " + b);

        System.out.println("\n6. Перестановка значений переменных\n");

        char dollarSymbol = '$';
        char asteriskSymbol = '*';
        char atSignSymbol = '@';
        char verticalBarSymbol = '|';
        char tildeSymbol = '~';

        System.out.println("\nКод символа: " + (int) dollarSymbol + " Символ: " + dollarSymbol);
        System.out.println("\nКод символа: " + (int) asteriskSymbol + " Символ: " + asteriskSymbol);
        System.out.println("\nКод символа: " + (int) atSignSymbol + " Символ: " + atSignSymbol);
        System.out.println("\nКод символа: " + (int) verticalBarSymbol + " Символ: " + verticalBarSymbol);
        System.out.println("\nКод символа: " + (int) tildeSymbol + " Символ: " + tildeSymbol);
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");

        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';

        System.out.println("    " + slash +  backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + 
                underscore + slash + backslash + underscore + underscore + backslash);

        System.out.println("\n8. Перестановка значений переменных\n");

        int number = 123;

        int hundreds = number / 100;
        int tens = number / 10 % 10;
        int ones = number % 10;

        int sum = hundreds + tens + ones;
        int product = hundreds * tens * ones;

        System.out.println("Число " + number + " содержит:" +
                "\nСотен - " + hundreds + 
                "\nДесятков - " + tens + 
                "\nЕдиниц - " + ones + 
                "\nСумма его цифр = " + sum +
                "\nПроизведение = " + product);

        System.out.println("\n9.Вывод времени");

        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.println("\n" + hours + ":" + minutes + ":" + seconds);
    }
}