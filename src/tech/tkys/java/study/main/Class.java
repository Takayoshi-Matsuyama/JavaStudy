package tech.tkys.java.study.main;

public class Class {
    private static int StaticFileld;

    public int publicField;
    protected int protectedField;
    private int privateField;
    int packagePrivateField;      // アクセス修飾子を付けない

    public Class() {        // コンストラクタ
    }

    public Class(int x) {   // コンストラクタ
        this.privateField = x;
    }

    public static void staticMethod() {
    }

    public void publicMethod() {
    }

    protected void protectedMathod() {
    }

    private void privateMethod() {
    }

    void packagePrivateMethod() {   // アクセス修飾子を付けない
    }
}
