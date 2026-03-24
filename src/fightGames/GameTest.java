package fightGames;

public class GameTest {
    public static void main(String[] args)throws InterruptedException {
        //创建角色
        Role r1 = new Role("Amy",100, '女');
        Role r2 = new Role("Sam",100, '男');
        //展示角色信息
        r1.showRoleInfo();
        r2.showRoleInfo();
        System.out.println();
        //战斗
        while (true){
            r1.attack(r2);
            if (r2.getBlood() == 0){
                System.out.println(r1.getName() + "KO了" + r2.getName());
                break;
            }

            r2.attack(r1);
            if (r1.getBlood() == 0){
                System.out.println(r2.getName() + "KO了" + r1.getName());
                break;
            }
        }
    }
}
