package org.mnatikk.dataTypes;

import org.openqa.selenium.By;

public class PrimitiveTypes {
    public static void main(String[] args) {

        /*
        0) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой
        1) поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях,
        посмотреть результаты (вывести в консоль)
        2) попробовать вычисления комбинаций типов данных (int и double)
        3) прочитать про приоритет операторов в java
         */

        // Диапазоны типов данных для вещественных / чисел с плавающей точкой
        System.out.println("\n ### Диапазоны примитивных типов ###");
        System.out.println("\nbyte ");
        byte varByte = 100;
        System.out.println("  size (bits) = " + Byte.SIZE);
        System.out.println("  min value = " + Byte.MIN_VALUE);
        System.out.println("  max value = " + Byte.MAX_VALUE);
        System.out.println("  example = " + varByte);

        System.out.println("\nshort ");
        short varShort = 30_000;
        System.out.println("  size (bits) = " + Short.SIZE);
        System.out.println("  min value = " + Short.MIN_VALUE);
        System.out.println("  max value = " + Short.MAX_VALUE);
        System.out.println("  example = " + varShort);

        System.out.println("\nint ");
        int varInt = 100_000_000;
        System.out.println("  size (bits) = " + Integer.SIZE);
        System.out.println("  min value = " + Integer.MIN_VALUE);
        System.out.println("  max value = " + Integer.MAX_VALUE);
        System.out.println("  example = " + varInt);

        System.out.println("\nlong ");
        long varLong = 123_456_000_000_000L;
        System.out.println("  size (bits) = " + Long.SIZE);
        System.out.println("  min value = " + Long.MIN_VALUE);
        System.out.println("  max value = " + Long.MAX_VALUE);
        System.out.println("  example = " + varLong);

        System.out.println("\nfloat ");
        float varFloat = 1.2345f;
        System.out.println("  size (bits) = " + Float.SIZE);
        System.out.println("  min value = " + Float.MIN_VALUE);
        System.out.println("  max value = " + Float.MAX_VALUE);
        System.out.println("  example = " + varFloat);

        System.out.println("\ndouble ");
        double varDouble = 1.2345678901234567d;
        System.out.println("  size (bits) = " + Double.SIZE);
        System.out.println("  min value = " + Double.MIN_VALUE);
        System.out.println("  max value = " + Double.MAX_VALUE);
        System.out.println("  example = " + varDouble);

        System.out.println("\nchar ");
        char varChar = 'd';
        System.out.println("  size (bits) = " + Character.SIZE);
        System.out.println("  min value (uniCode) = \\u0000" );
        System.out.println("  max value (uniCode) = \\uffff");
        System.out.println("  example = " + varChar);

        System.out.println("\nboolean ");
        boolean varBoolean = false;
        System.out.println("  size (bits) = 1");
        System.out.println("  values = true/false");
        System.out.println("  example = " + varBoolean);

        //1) поупражняться с математическими и логическими операторами
        System.out.println("\n### Математические операции ###");
        System.out.println(String.format("byte + short = %s + %s = %s", varByte, varShort,varByte + varShort));
        System.out.println(String.format("int + short = %s + %s = %s", varInt, varShort,varInt + varShort));
        System.out.println(String.format("int * long = %s * %s = %s", varInt, varLong, varInt * varLong));
        System.out.println(String.format("int * float = %s * %s = %s", varInt, varFloat, varInt * varFloat));
        System.out.println(String.format("double / float = %s / %s = %s", varDouble, varFloat, varDouble / varFloat));
        System.out.println(String.format("double / byte = %s / %s = %s", varDouble, varByte, varDouble / varByte));

        System.out.println("\n### Логические операции ###");
        System.out.println(String.format("%s > 5  && %s < 2 byte = %s", varInt, varByte, varInt > 5 && varByte <2 ));
        System.out.println(String.format("%s > 5  || %s < 2 byte = %s", varInt, varByte, varInt > 5 || varByte <2 ));
        System.out.println(String.format("!false = %s", !varBoolean ));

        // добиться переполнения при вычислениях
        System.out.println("\n### Переполнение при вычислениях ###");
        System.out.println(String.format("byte: 127 + 1 = %s", (byte) (Byte.MAX_VALUE + 1)));
        System.out.println(String.format("int: 2147483647 + 1 = %s", (int) (Integer.MAX_VALUE + 1)));

        //Exceptions
        System.out.println("\n### Exceptions ###");
        try {
            int data= varInt / 0;
        } catch(ArithmeticException e) {
            System.out.println(e);
        }


        try {
            int data = Integer.parseInt(null) ;
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        try {
            String data = null ;
            data.length();
        } catch (NullPointerException e) {
            System.out.println(e);
        }

    }
}
