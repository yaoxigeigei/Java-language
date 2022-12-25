public class GrilFriend {
    private String name;
    private int age;
    private String gender;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age>=18&&age<=60){
            this.age=age;
        }else{
            System.out.println("非法年龄");
        }
    }
    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }




    public void study(){
        System.out.println("正在学习");
    }
    public void sleep(){
        System.out.println("正在睡觉");
    }
}


