package jp.tkys.java.study.main;

public class DataStructure {

    private static void array() {
        int[] arrayVar1 = new int[5];
        int[] arrayVar2 = new int[] {0, 1, 2, 3, 4};
        int[] arrayVar3 = {0, 1, 2, 3, 4};

        int[][] twoDimensionArrayVar = new int[][] {{0, 1, 2, 3, 4}, {5, 6, 7, 8, 9}};

        // Java VMの動作
        // ・int型の要素を5個分のメモリ領域を確保
        // ・int型の配列変数arrayVar1のメモリ領域を確保
        // ・arrayVar1に配列先頭要素のアドレスを入れる
    }

    private static void disposeArray(int x) {
        if (x > 0) {
            int[] arrayVar = new int[] {0, 1, 2, 3, 4};
        }

        // 配列変数arrayVarはブロックの最後で消滅する
        // newで確保した配列要素はブロックは消滅せず生き残る▶ガベージコレクションで回収、破棄される

        int[] arrayVar = new int[] {0, 1, 2, 3, 4};
        arrayVar = null;    // 参照を切る(わざと参照されないようにする)
    }
}
