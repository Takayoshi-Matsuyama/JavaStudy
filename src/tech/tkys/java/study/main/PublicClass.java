package tech.tkys.java.study.main;

public class PublicClass {
    private static int StaticFileld;

    public int publicField;
    protected int protectedField;
    private int privateField;
    int packagePrivateField;      // アクセス修飾子を付けない

    public PublicClass() {        // コンストラクタ
    }

    public PublicClass(int x) {   // コンストラクタ
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

    public int getPrivateField() {              // getterメソッド
        return this.privateField;
    }

    public void setPrivateField(int value) {    // setterメソッド
        this.privateField = value;
    }
}

class PackagePrivateClass {         // アクセス修飾子を付けない

}
