package util;

/**
 * <p>
 * 無
 * </p>
 *
 * @author NWT)hxl
 * @version 1.0
 * <p>
 * 変更履歴:
 * 2021/4/19 ： NWT)hxl ： 新規作成
 * @date 2021/4/19 16:09
 */
public class Range {
    // Produce a sequence [0,n)
    public static int[] range(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }
    // Produce a sequence [start..end)
    public static int[] range(int start, int end) {
        int sz = end - start;
        int[] result = new int[sz];
        for (int i = 0; i < sz; i++) {
            result[i] = start + i;
        }
        return result;
    }
    // Produce sequence [start..end) incrementing by step
    public static int[] range(int start, int end, int step) {
        int sz = (end - start) / step;
        int[] result = new int[sz];
        for (int i = 0; i < sz; i++) {
            result[i] = start + (i * step);
        }
        return result;
    }
}
