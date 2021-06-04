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
 * @date 2021/05/07 18:00
 */
public class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        System.out.println("Drawing Triangle");
    }
    @Override
    void dispose() {
        System.out.println("Erasing Triangle");
        super.dispose();
    }
}
