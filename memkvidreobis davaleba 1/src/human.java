public class human
{
    private String name;
    private String surname;
    private int age;
    human = new human(String name, String surname, int age)
    {
        this.setname(name);
        this.setSurname(surname);
        this.setAge(age);
    }
    public String getname()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }
    public String getage()
    {
        return age;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public void setSurname(String surname)
    {
        this.surname=surname;
    }
    public void setAge(int age)
    {
        this.age=age;
    }

}
