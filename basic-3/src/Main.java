// basic-3. basic OOP concepts 2 - interface, polymorphism, abstract class

import java.lang.reflect.Array;
import java.util.ArrayList;

//Interface - using interface will make function creation for different classes easier (and more concise)
interface AndroidDevices{

    //common function across all classes which implements this interface
    void update(int osVer, double uiVer);

    
}

//base class. The children class uses 'extends' to this class
class MobileDevices{
    private int osVersion;
    private String name;

    void setVersion(int ver){
        this.osVersion = ver;
    }

    int getVersion(){
        return osVersion;
    }

    void setName(String n){
        this.name = n;
    }

    String getName(){
        return name;
    }

}

// Class which has MobileDevices as parent, and uses AndroidDevices interface
class SamsungGalaxy extends MobileDevices implements AndroidDevices{
    //String name;

    double oneUIVersion;

    SamsungGalaxy(String n){
        setName(n);
    }

    //method of an interface should use 'public'
    public void update(int osVer, double uiVer){
        this.setVersion(osVer);
        this.oneUIVersion = uiVer;
        System.out.println(getName() + " updated to OS version of " + getVersion() + " with One UI version of " + oneUIVersion);
    }


}

class Oneplus extends MobileDevices implements AndroidDevices{
    //String name;
    double colorOSVersion;

    Oneplus(String n){
        setName(n);
    }

    //method of an interface should use 'public'
    public void update(int osVer, double uiVer){
        this.setVersion(osVer);
        this.colorOSVersion = uiVer;
        System.out.println(getName() + " updated to OS version of " + getVersion() + " with Color OS version of " + colorOSVersion);
    }

}

class GooglePixel extends MobileDevices implements AndroidDevices {
    //String name;

    GooglePixel(String n){
        setName(n);
    }

    //method of an interface should use 'public'
    public void update(int osVer, double uiVer){
        this.setVersion(osVer);
        System.out.println(getName() + " with OS version of " + getVersion());
    }
}


class Motorola extends MobileDevices implements AndroidDevices{
    //String name;
    double myUXVersion;

    Motorola(String n){
        setName(n);
    }

    //method of an interface should use 'public'
    public void update(int osVer, double uiVer){
        this.setVersion(osVer);
        this.myUXVersion = uiVer;
        System.out.println(getName() + " with OS version of " + getVersion() + " with My UX version of " + myUXVersion);
    }
}

class iPhone extends MobileDevices{
    //String name;

    iPhone(String n){
        setName(n);
    }

    //cannot use update under androidDevices template
    void iOSUpdate(int osVer){
        this.setVersion(osVer);
        System.out.println(getName() + " with iOS version of " + getVersion());
    }

}

class User{
    //no need to prepare functions for each Android device class anymore
    /*
    void oneUIUpdate(SamsungGalaxy galaxy, int osVer, double oneUIVer){
        galaxy.update(osVer,oneUIVer);
    }
     */
    ArrayList<MobileDevices> deviceList = new ArrayList<>();

    void androidUpdate(MobileDevices mobileDevice, int osVer, double uiVer){
        if(mobileDevice instanceof AndroidDevices){
            AndroidDevices androidDevice = (AndroidDevices) mobileDevice;
            androidDevice.update(osVer,uiVer);
        }

    }
}

public class Main {
    public static void main(String[] args) {
        User me = new User();

        me.deviceList.add(new SamsungGalaxy("Galaxy S23 Ultra"));
        me.androidUpdate(me.deviceList.get(0), 13, 5.1);

        iPhone myiPhone = new iPhone("iPhone 14 Pro Max");
        myiPhone.iOSUpdate(16);
        me.deviceList.add(myiPhone);

        me.deviceList.add(new GooglePixel("Pixel 7"));
        me.androidUpdate(me.deviceList.get(2), 13, 0);

        for(MobileDevices device : me.deviceList){
            System.out.println(device.getName());
        }

    }
}