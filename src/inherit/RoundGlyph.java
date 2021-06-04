package inherit;

import polymorphism.Note;
import polymorphism.Wind;

/**
 * <p>
 * 無
 * </p>
 *
 * @author NWT)hxl
 * @version 1.0
 * <p>
 * 変更履歴:
 * 2021/05/17 ： NWT)hxl ： 新規作成
 * @date 2021/05/17 16:30
 */
public class RoundGlyph extends Glyph {
    private int radius = 1;
    private Wind wind = new Wind();

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
        wind.play(Note.C_SHARP);
    }
}
