package restaurant;

/**
 * <p>
 * 無
 * </p>
 *
 * @author NWT)hxl
 * @version 1.0
 * <p>
 * 変更履歴:
 * 2021/6/8 ： NWT)hxl ： 新規作成
 * @date 2021/6/8 17:23
 */
public class Cashier extends Staff {
    public Cashier(){
        this.job = "收银员";
    }

    @Override
    public void startWork() {
        System.out.println(job + name + "上班打卡");
    }

    @Override
    public void endWork() {
        System.out.println(job + name + "下班打卡");
    }

    @Override
    public void doWork() {
        System.out.println(job + name + "开始工作");
    }
}
