package polymorphism;

/**
 * <p>
 * 無
 * </p>
 *
 * @author NWT)hxl
 * @version 1.0
 * <p>
 * 変更履歴:
 * 2021/05/09 ： NWT)hxl ： 新規作成
 * @date 2021/05/09 17:14
 */
public class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play()");
    }
    String what() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}
