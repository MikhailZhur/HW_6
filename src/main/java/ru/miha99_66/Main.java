package ru.miha99_66;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        flag = false;
        //целочисленные типы данных
        byte aByte = -128; //8 бит   от -128 до 127
        short aShort = -32768; //16 бит от -32768 до 32767
        int aInt = -2147483648; //32 бит  2^(bit-1) -2 147 483 648 до 2 147 483 647
        long aLong = 139; //64 бит  2^(bit-1) = 2^63= 9 223 372 036 854 775 808
        aLong = (byte) aLong;
        System.out.println(aLong);

        // с плавающей точкой
        float aFloat = 1.0f;  //32 бит
        double aDouble = 1.0; //64 бит

        char aChar = 'a';

        //Операторы
        // 1. Присвоение
        char bChar = 'a';
        //2. Математические + - / * %
        int res = 3800 * 240;
        //res = (short)res;
        int res2 = 3800 % 240;

        System.out.println(res);
        System.out.println(res2);

        //Операторы сравления < > <= >= == !=
        System.out.println("booleab result " + !(10 > 2));



        if (method() || method2()){
            System.out.println("");
        }

        String name = "Олег";
        boolean result = name instanceof String;
        System.out.println( result );



        System.out.println(res);
        ;

        System.out.println(res2);

        int x = 45;
        double y = 45.45;
        System.out.println("x * y = " + (x*y));
        System.out.println("x / y = " + (x/y));
        System.out.println("x - y = " + (x-y));
        System.out.println("x + y = " + (x+y));
    }

    public static boolean method() {
        System.out.println("method");
        return false;
    }

    public static boolean method2() {
        System.out.println("method2");
        return true;

    }


}