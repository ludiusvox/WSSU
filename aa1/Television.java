package aa1;

//Aaron Linder
//9/27/2013
//The purpose of this class is to model a television.

public class Television
{
    public final String MANUFACTURER;
    public final int SCREEN_SIZE; //assuming a 50 inch
    public boolean power;  //Default to off
    public int channel;  // defaulting to 0
    public int volume;
    
    public Television(String m, int s)
    {
        MANUFACTURER = m;
        SCREEN_SIZE = s;
        power = false;
        channel = 2;
        volume = 20;
    }
    public void setChannel(int c)
    {
        channel = c;
    }
    public void power()
    {
        power = !power;
    }
    public void increaseVolume()
    {
        ++volume;
    }
    public void decreaseVolume()
    {
        --volume;
    }
    public int getChannel()
    {
        return channel;
    }
    public int getVolume()
    {
        return volume;
    }
    public String getManufacturer()
    {
        return MANUFACTURER;
    }
    public int getScreenSize()
    {
        return SCREEN_SIZE;
    }
}
