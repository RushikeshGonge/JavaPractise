class majdur{
    int salary;
    String name;
    void setName(String naam)
    {
        name = naam;
    }
    int getSalary()
    {
        return salary;
    }
    String getName()
    {
        return name;
    }
}
public class employee {
    public static void main(String[] args) {
        majdur rushi = new majdur();
        rushi.salary = 12;
        rushi.setName("Rushikesh");
        System.out.println(rushi.getName());
        System.out.println(rushi.getSalary());
    }
}
