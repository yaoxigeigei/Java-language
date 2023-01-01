public class studentComprehensiveExercise {
    /*定义一个长度为3的数组，数组存储1~在`3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
    学生的属性:学号，姓名，年龄。
    要求1: 再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
    要求2: 添加完毕之后，遍历所有学生信息。
    要求3: 通过id删除学生信息
    如果存在，则删除，如果不存在，则提示删除失败。
    要求4:删除完毕之后，遍历所有学生信息。
    要求5: 查询数组id为“××”的学生，如果存在，则将他的年龄+1岁*/

    //属性
    private int id;
    private String name;
    private int age;

    //构造方法
    public studentComprehensiveExercise() {
    }

    public studentComprehensiveExercise(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
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

}
