package jp.tkys.java.study.main;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello World");
    }

    private static void dataType() {
        // 整数
        long longVar;       // 8byte (64bit) -9,223,372,036,854,775,808～9,223,372,036,854,775,807
        int intVar;         // 4byte (32bit) -2,147,483,648～2,147,483,647
        short shortVar;     // 2byte (16bit) -32,768～32,767
        byte byteVar;       // 1byte (8bit)  -128～127

        // 小数
        double doubleVar;
        float floatVar;

        // 真偽値
        boolean boolVar;

        // 文字
        char charVar;

        // 文字列
        String stringVar;
    }

    private static void literal() {
        int intVar = 30;
        long longVar = 300000L;
        double doubleVar = 30.5;
        float floatVar = 30.5F;
        boolean boolVar = true;
        char charVar = 'Y';
        String stringVar = "Hello";
    }
}
