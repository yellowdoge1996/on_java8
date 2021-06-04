package clean;

import java.io.Closeable;
import java.io.IOException;

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
public class CADSystem extends Shape implements Closeable {
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];
    public CADSystem(int i) {
        super(i + 1);
        for(int j = 0; j < lines.length; j++) {
            lines[j] = new Line(j, j*j);
        }
        c = new Circle(1);
        t = new Triangle(1);
        System.out.println("Combined constructor");
    }
    @Override
    public void dispose() {
        System.out.println("CADSystem.dispose()");
        // The order of cleanup is the reverse
        // of the order of initialization:
        t.dispose();
        c.dispose();
        for(int i = lines.length - 1; i >= 0; i--) {
            lines[i].dispose();
        }
        super.dispose();
    }
    public static void main(String[] args) {
//        CADSystem x = new CADSystem(47);
//        try {
//            // Code and exception handling...
//        } finally {
//            x.dispose();
//        }
        try(CADSystem x2 = new CADSystem(47)){

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() throws IOException {
        System.out.println("CADSystem.dispose()");
        // The order of cleanup is the reverse
        // of the order of initialization:
        t.dispose();
        c.dispose();
        for(int i = lines.length - 1; i >= 0; i--) {
            lines[i].dispose();
        }
        super.dispose();
    }
}
