public abstract class WorkshopMember {
    // Attributes
    String name;       // Member's full name
    String nickName;   // Member's nickname
    int age;           // Member's age

    // Constructor
    public WorkshopMember(String name, int age) {
        this.name = name;
        this.nickName = nickName;
        this.age = age;
    }

    public String WorkshopMember(String name)
    {
        return name;
    }
    public int WorkshopMember(int age)
    {
        return age;
    }

    public WorkshopMember()
    {

    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getNickName()
    {
        return nickName;
    }

    public void setNickName(String nickName)
    {
        this.nickName = nickName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
            this.age = age;
    }
}
