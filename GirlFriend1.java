public class GirlFriend1 {

    //属性
    private String name; //名字
    private int age;//年龄
    private char gender;//性别
    private String hobby;//爱好

    //构造方法
    public GirlFriend1() {
    }

    public GirlFriend1(String name, int age, char gender, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return hobby
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * 设置
     * @param hobby
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    //打印数据的所有信息
    public void GirlfriendShowInfo(){
        System.out.println("名字:"+getName());
        System.out.println("年龄:"+getAge());
        System.out.println("性别:"+getGender());
        System.out.println("爱好:"+getHobby());
    }


}
