package tech.tkys.java.study.main;

public class Method {

    private static void methodCall() {
        testMethod("実引数 (argument)");
    }

    private static void testMethod(String parameter) {
        // 仮引数 (parameter)
    }

    private static void testMethod(String parameterA, String parameterB) {
        // シグネチャ：メソッド名、仮引数の個数・型・並び順
        // (戻り値の型はシグネチャに含まれない)
    }
}
