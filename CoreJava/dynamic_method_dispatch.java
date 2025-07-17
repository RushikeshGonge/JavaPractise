class Phone{
    public void ShowTime()
    {
        System.out.println("Time is 9 pm");
    }
    public void TurnOn()
    {
        System.out.println("Phone is turning on...");
    }
}
class SmartPhone extends Phone
{
    public void PlayMusic()
    {
        System.out.println("Playing music...");
    }
    public void TurnOn()
    {
        System.out.println("Turning on SmartPhone...");
    }

}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        Phone obj2 = new Phone();
        SmartPhone obj1 = new SmartPhone();
       // SmartPhone obj1 = new Phone();  not allowed
        obj.ShowTime();
        obj2.TurnOn();
        obj.TurnOn();
        obj1.PlayMusic();
        //obj.PlayMusic(); not allowed
    }
}
