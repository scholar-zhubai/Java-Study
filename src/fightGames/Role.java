package fightGames;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "亭亭玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    String[] attacks_desc = new String[]{
            "%s使出了一招〖背心钉〗，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s 使出了一招〖游空探爪〗，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招〖劈雷坠地〗，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式〖掌心雷〗，推向%s。",
            "%s阴手翻起阳手跟进，一招〖没遮拦〗，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招〖剪挂连环〗，连环攻向 %s。"
    };

    String[] injureds_desc = {
            "%s退了半步，亳发无损",
            "给%s 造成一处瘀伤",
            "一击命中，%s 痛得弯下腰",
            "%s痛苦地闷哼了一声，显然受了点内伤",
            "%s摇摇晃晃，一跤摔倒在地",
            "%s脸色一下变得惨白，连退了好几步",
            "轰的一声，%s口中鲜血狂喷而出",
            "%s一声惨叫，像滩软泥般塌了下去"
    };

    public Role() {

    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;

        setFace(gender);
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        //随机长相
        Random r = new Random();

        if (gender == '男') {
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == '女') {
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "平平无奇";
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getBlood() {
        return blood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    private void printCharByChar(String str, int delay) throws InterruptedException {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); // 逐个获取字符
            System.out.print(c);    // 打印单个字符
            System.out.flush();     // 刷新输出流，避免字符缓存（关键！）
            Thread.sleep(delay);    // 暂停指定时间，控制打字速度
        }
    }

    //攻击的方法
    public void attack(Role role) throws InterruptedException{
        Random r = new Random();

        // 1. 随机获取攻击招式，格式化生成完整字符串（替换%s）
        int attackIndex = r.nextInt(attacks_desc.length);
        String attackStr = String.format(attacks_desc[attackIndex], this.getName(), role.getName());

        // 2. 逐字打印攻击描述（延迟120ms，可调整）
        printCharByChar(attackStr + "\n", 120); // 加\n换行，让格式更清晰
        Thread.sleep(500); // 攻击描述打印完后，暂停0.5秒再显示受伤效果


        //计算伤害
        int hurt = r.nextInt(20);

        int remainBlood = role.getBlood() - hurt;

        remainBlood = remainBlood < 0 ? 0 : remainBlood;

        role.setBlood(remainBlood);

        //判断受伤
        int injuredIndex;
        if (remainBlood > 90) {
            injuredIndex = 0;
        } else if (remainBlood > 80) {
            injuredIndex = 1;
        } else if (remainBlood > 70) {
            injuredIndex = 2;
        } else if (remainBlood > 60) {
            injuredIndex = 3;
        } else if (remainBlood > 50) {
            injuredIndex = 4;
        } else if (remainBlood > 30) {
            injuredIndex = 5;
        } else if (remainBlood > 20) {
            injuredIndex = 6;
        } else {
            injuredIndex = 7;
        }
        String injuredStr = String.format(injureds_desc[injuredIndex], role.getName());

        // 4. 逐字打印受伤描述（延迟100ms）
        printCharByChar(injuredStr + "\n\n", 100); // 加2个\n，分隔两轮攻击
        Thread.sleep(300); // 受伤效果打印完后，暂停0.3秒再进入下一轮
    }

    public void showRoleInfo() {
        System.out.println("姓名为：" + getName());
        System.out.println("血量为：" + getBlood());
        System.out.println("性别为：" + getGender());
        System.out.println("长相为：" + getFace());

    }
}
