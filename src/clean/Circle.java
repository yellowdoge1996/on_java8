package clean;

/**
 * <p>
 * 無
 * </p>
 *
 * @author NWT)hxl
 * @version 1.0
 * <p>
 * 変更履歴:
 * 2021/05/07 ： NWT)hxl ： 新規作成
 * @date 2021/05/07 17:59
 */
public class Circle extends Shape {
    Circle(int i) {
        super(i);
        System.out.println("Drawing Circle");
    }
    @Override
    void dispose() {
        System.out.println("Erasing Circle");
        super.dispose();
    }
}
