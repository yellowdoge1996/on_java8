package restaurant;

import java.util.ArrayList;
import java.util.List;

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
 * @date 2021/6/8 17:10
 */
public class Restaurant {
    List<Staff> staffs = new ArrayList<>();
    public void startWork(Staff staff){
        staffs.add(staff);
        staff.startWork();
        staff.doWork();
    };
    public void endWork(Staff staff){
        staff.endWork();
        staffs.remove(staff);
    }

    public static void main(String[] args) throws InterruptedException {
        Restaurant restaurant = new Restaurant();
        Staff waiter = new Waiter();
        waiter.setName("张三");
        restaurant.startWork(waiter);
        Staff chief = new Chief();
        chief.setName("李四");
        restaurant.startWork(chief);
        Staff manager = new Manager();
        manager.setName("王五");
        restaurant.startWork(manager);
        Thread.sleep(2000);
        restaurant.endWork(waiter);
        restaurant.endWork(chief);
        restaurant.endWork(manager);
    }
}
