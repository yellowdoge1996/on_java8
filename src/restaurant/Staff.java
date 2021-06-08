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
 * @date 2021/6/8 17:10
 */
public abstract class Staff implements StaffService {
    protected String name;
    protected String sex;
    protected Integer age;
    protected String job;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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
