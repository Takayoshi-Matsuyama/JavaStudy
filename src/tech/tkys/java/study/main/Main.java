package tech.tkys.java.study.main;    // 推奨パッケージ名：保有するインターネットドメインを前後逆順にしたものから開始する。

// java.langパッケージは自動的にインポートされる。

public final class Main {   // finalが付くと継承不可能

    /**
     * Javaプログラムを実行するには、mainメソッドが含まれているクラスの完全限定クラス名(Full Qualified Class Name; FQCN)を指定する必要がある。
     * $java -cp /Users/username/IdeaProjects/JavaStudy/out/production/JavaStudy tech.tkys.java.study.main.Main
     * 注：ディレクトリのツリー構造を名前空間に合わせておく。
     * 注：-cpオプションでツリー構造先頭の直上("tech"の直上)のディレクトリを指定する。
     *    または、カレントディレクトリをそこに設定しておく。
     * @param args
     */
    public static void main(String[] args) {
	    System.out.println("Hello World");

	    // 1行の文字列入力を受ける
        System.out.print(">");
	    String inputLineString = new java.util.Scanner(System.in).nextLine();
        System.out.println(inputLineString);
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

    private static void parse() {
        int number = Integer.parseInt("123");
    }

    private static void ifStatement(int x) {
        if (x == 0) {
            System.out.println("x == 0");
        } else {
            System.out.println("x != 0");
        }

        if (x==0) {
            System.out.println("x == 0");
        } else if (x > 0) {
            System.out.println("x > 0");
        } else {
            System.out.println("x < 0");
        }
    }

    private static void switchStatement(int x) {
        switch (x) {
            case 0:
                System.out.println("x == 0");
                break;
            case 1:
                System.out.println("x == 1");
                break;
            default:
                System.out.println("(x != 0) && (x != 1)");
        }
    }

    private static void whileStatement(int x) {
        while (x < 10) {
            x++;
        }

        do {
            x++;
        } while (x < 20);
    }

    private static void forStatement() {
        for (int i = 0; i < 10; i++) {
            System.out.format("%d%n", i);

            if (i == 5) {
                continue;   // 今の周を中断し、次の周へ
            }

            if (i == 9) {
                break;      // 繰り返しそのものを中断
            }
        }

        int[] arrayVar = {0, 1, 2, 3, 4};
        for (int value : arrayVar) {        // 拡張for文
            System.out.println(value);
        }
    }

    private static void infiniteLoop() {
        while (true) {
            break;
        }

        for (;;) {
            break;
        }
    }

    private static void compareStrings(String x) {
        if (x.equals("ABC")) {
            System.out.println("x == ABC");

            // Javaでは、文字列の比較は"=="ではできない。
            // String.equals()メソッドを使う。
        }
    }

    private static void minimalEvaluation(int x, int y) {
        // 第1条件(x == 0)がfalseの場合、第2条件(y == 0)は評価されない。
        // 第1条件の結果で条件式全体がfalseになることが確定する。
        if ((x == 0) && (y ==0)) {
            System.out.println("(x == 0) && (y ==0)");
        }

        // 第1条件(x == 0)がtrueの場合、第2条件(y == 0)は評価されない。
        // 第1条件の結果で、条件式全体がtrueになることが確定する。
        if ((x == 0) || (y ==0)) {
            System.out.println("(x == 0) && (y ==0)");
        }
    }
}
