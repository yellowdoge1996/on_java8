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
public class Line extends Shape {
    private int start, end;
    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println(
                "Drawing Line: " + start + ", " + end);
    }
    @Override
    void dispose() {
        System.out.println(
                "Erasing Line: " + start + ", " + end);
        super.dispose();
    }
}
