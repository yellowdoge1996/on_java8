/**
 * <p>
 * 無
 * </p>
 *
 * @author NWT)hxl
 * @version 1.0
 * <p>
 * 変更履歴:
 * 2021/4/13 ： NWT)hxl ： 新規作成
 * @date 2021/4/13 18:26
 */
// 带标签的 break 和 conitue 在 while 循环中的使用

public class LabeledWhile {
    public static void main(String[] args) {
        int i = 0;
        outer:
        while(true) {
            System.out.println("Outer while loop");
            while(true) {
                i++;
                System.out.println("i = " + i);
                if(i == 1) {
                    System.out.println("continue");
                    continue;
                }
                if(i == 3) {
                    System.out.println("continue outer");
                    continue outer;
                }
                if(i == 5) {
                    System.out.println("break");
                    break;
                }
                if(i == 7) {
                    System.out.println("break outer");
                    break outer;
                }
            }
        }
    }
}
