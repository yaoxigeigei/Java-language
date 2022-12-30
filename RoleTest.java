public class RoleTest {
    public static void main(String[] args) {

        //人物设定
        Role r1 = new Role("八嘎",200,'男');
        Role r2 = new Role("雅鹿",200,'男');

        //打印人物所有信息
        r1.showRoleInfo();
        r2.showRoleInfo();
        System.out.println();

        //开始回合制
        while (true){
            //人物互相打击
            r1.attack(r2);
            if(r2.getBlood()==0){
                System.out.println(r1.getName()+"KO了"+r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood()==0){
                System.out.println(r2.getName()+"KO了"+r1.getName());
                break;
            }


        }




    }
}
