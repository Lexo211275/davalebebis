public class coworker extends  human
{
    private String name;
    private String surname;
    private int age;
    private int id;
    coworker = new coworker(String name, String surname, int age, int id)
{
    this.setname(name);
    this.setSurname(surname);
    this.setAge(age);
    this.setid(id);
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
    public void setid(int id)
    {
        this.id=id;
    }
}
