/**
 * <p>
 * 無
 * </p>
 *
 * @author NWT)hxl
 * @version 1.0
 * <p>
 * 変更履歴:
 * 2021/4/14 ： NWT)hxl ： 新規作成
 * @date 2021/4/14 14:18
 */

public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        new Tree();
    }
    static class Tree {
        int height;
        Tree() {
            System.out.println("Planting a seedling");
            height = 0;
        }
        Tree(int initialHeight) {
            height = initialHeight;
            System.out.println("Creating new Tree that is " + height + " feet tall");
        }
        void info() {
            System.out.println("Tree is " + height + " feet tall");
        }
        void info(String s) {
            System.out.println(s + ": Tree is " + height + " feet tall");
        }
    }
}
