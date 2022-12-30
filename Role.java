import java.util.Random;

public class Role {

    //私有属性
    private String name;
    private int blood;
    private char gender;
    private String face;

    //引入随机函数
    Random rdm = new Random();

    //face
    String boyfaces[] = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String girlfaces[] = {"美轮美奂", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    //attack 攻击描述:
    String[] attacks_desc = {
            "%s使出了一招[背心钉]，转到对方的身后，一掌向%s背心的灵台穴拍去",
            "%s使出了一招[游空探爪]，飞起身形自半空中变掌为抓锁向%s",
            "%s大喝一声，身形下伏，一招[劈雷坠地]，捶向%s双腿",
            "%s运气于掌，一瞬间掌心变得血红，一式[掌心雷]，推向%s",
            "%s阴手翻起阳手跟进，一招[没遮拦]，结结实实的捶向%s",
            "%s上步抢身，招中套招，一招[劈挂连环]，连环攻向%s"
    };
    //injured 受伤描述:
    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果轰的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    //构造方法
    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    //set和get
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {

        if (gender == '男') {
            int index = rdm.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == '女') {
            int index = rdm.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "面目狰狞";
        }


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //攻击模块
    public void attack(Role role) {
        //攻击效果
        int index = rdm.nextInt(attacks_desc.length);
        String KungFu = attacks_desc[index];
        System.out.printf(KungFu, this.getName(), role.getName());

        //造成的伤害  (随机值0-20)
        int hurt = rdm.nextInt(21);

        //剩余血量
        int remainBlood = role.getBlood() - hurt;
        //对剩余血量的验证
        remainBlood = remainBlood < 0 ? 0 : remainBlood;

        //修改剩余血量
        role.setBlood(remainBlood);

        //受伤效果
        if (hurt == 0) {
            System.out.printf(injureds_desc[0], role.getName());
        } else if (remainBlood > 90) {
            System.out.printf(injureds_desc[1], role.getName());
        } else if (remainBlood > 80 && remainBlood <= 90) {
            System.out.printf(injureds_desc[2], role.getName());
        } else if (remainBlood > 70 && remainBlood <= 80) {
            System.out.printf(injureds_desc[3], role.getName());
        } else if (remainBlood > 50 && remainBlood <= 70) {
            System.out.printf(injureds_desc[4], role.getName());
        } else if (remainBlood > 30 && remainBlood <= 50) {
            System.out.printf(injureds_desc[5],role.getName());
        } else if (remainBlood > 0 && remainBlood <= 30) {
            System.out.printf(injureds_desc[6],role.getName());
        }else{
            System.out.printf(injureds_desc[7],role.getName());
        }
        System.out.println();
    }

    //展示角色的所有信息
    public void showRoleInfo() {
        System.out.println("姓名:" + getName());
        System.out.println("性别:" + getGender());
        System.out.println("长相:" + getFace());
    }


}
