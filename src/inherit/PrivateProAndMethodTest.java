package inherit;

import java.lang.reflect.Field;

/**
 * <p>
 * 無
 * </p>
 *
 * @author NWT)hxl
 * @version 1.0
 * <p>
 * 変更履歴:
 * 2021/05/13 ： NWT)hxl ： 新規作成
 * @date 2021/05/13 15:30
 */
public class PrivateProAndMethodTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Sub sub = new Sub();
        Field privateStringField = Super.class.getDeclaredField("sp1");

        privateStringField.setAccessible(true);//允许访问私有字段

        String fieldValue = (String) privateStringField.get(sub);//获得私有字段值
        System.out.println("sp1 = " + fieldValue);
    }
}
