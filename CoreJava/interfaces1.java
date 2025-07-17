interface MyCamera
{
    void takeSnapshot();
    void recordVideo();
    private void greet()
    {
        System.out.println("Wait a minute...");
    }
    default void record4Kvideo()
    {
        greet();
        System.out.println("Recording in 4K...");
    }
}
interface MyWifi
{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class CellPhone
{
    void connectToNumber()
    {
        System.out.println("Dialing...");
    }
    void takeNumber()
    {
        System.out.println("Receiving call...");
    }
}
class MySmartPhone extends CellPhone implements MyCamera,MyWifi
{
    public void takeSnapshot()
    {
        System.out.println("Taking photos...");
    }
    public void recordVideo()
    {
        System.out.println("Recording video...");
    }
    public String[] getNetworks()
    {
        System.out.println("Getting list of networks...");
        String[] networks = {"Rushi","Tejas5G","AnjaliSuperfast"};
        return networks;
    }
    public void connectToNetwork(String network) {
        System.out.println("Connecting to a network " + network);
    }
}
public class interfaces1 {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.takeSnapshot();;
        ms.recordVideo();
        ms.connectToNetwork("Rushi");
        ms.takeNumber();
        ms.connectToNumber();
        String[] ar = ms.getNetworks();
        for (String ntwrk : ar)
        {
            System.out.println(ntwrk);
        }
        ms.record4Kvideo();

    }
}
