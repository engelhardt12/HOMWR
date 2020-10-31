package gek;

public class Main {
    private static String ExceptionResult;
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        float x = 12f;

        int y = 2;

        char c='a';// создание переменной, которая использует символы

        double pi=3.14;

        byte f=54;

        short a=1;

        boolean isProgrammingFun=true;

        System.out.println(isProgrammingFun);

        System.out.println(x);
        System.out.println(y);
        System.out.println(c);
        System.out.println(pi);
        System.out.println(f);
        System.out.println(a);

        float E = 1.2f;
        float R = 1.3f;
        float O = 5.71f;
        float A = 3f;

        float expressionResult = calculateExpression (E,R,O,A);
        System.out.println("Результат вычислений" + expressionResult);

        int vvod1=10;
        int vvod2=9;


        boolean result= isBetween18and28(vvod1,vvod2);



        System.out.println("Результат\n"+result);

        int in = -8;
        int out = funcx(in);
        int vvod12=-1;
        boolean result1= funcxx(vvod12);
        System.out.println("Итог:" + result1);


        String name="";
        printName(name= "Елизабетт");


        int year=2020;
        int input = Proverka(year);


    }

    public static float calculateExpression ( float a,  float b, float c, float d)
    {
        return a*(b+(c/d));


    }

    public static boolean isBetween18and28(int a,int b)
    {
        int sum=a+b;

       // if (sum<18||sum>28){

        //    System.out.println("False");
       // }

        boolean res = sum>18&&sum<28;






        return res;



    }


    static int funcx ( int a){

        System.out.println("\nОтвет");
        if (a > 0) {
            System.out.println("Число\n " + a + "\nположительное.");
        }
        else if(a<0) {
            System.out.println("Число\n " + a + " \nотрицательное.");
        }
        else if (a == 0) {
            System.out.println("Number\n"+ a + "\nis zero but out is positive"); // это ноль, но оно является положительным
        }


        return a;
    }


    static boolean funcxx ( int a){
        System.out.println("\nОТВЕТ");
        if (a < 0) return true;
        return false;
    }

    static void printName(String name) {
        System.out.println("\nANSWER");
        System.out.println("Процеветания Империи, " + name + "!");


    }

    static int Proverka(int year) {
        System.out.println("\nЗадание 8.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
        {
            System.out.println(year + " год не високосный");
        }
        else
        {
            System.out.println(year + " год високосный");
        }
        return year;


    }



}










