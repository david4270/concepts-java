// basic-3. basic OOP concepts 2 - interface, polymorphism, abstract class

interface AndroidDevices{

    void update(int osVer, double uiVer);

    
}

class MobileDevices{
    int osVersion;

    void setVersion(int ver){
        this.osVersion = ver;
    }

}

class SamsungGalaxy extends MobileDevices implements AndroidDevices{
    String name;

    double oneUIVersion;

    SamsungGalaxy(String n){
        this.name = n;
    }

    public void update(int osVer, double uiVer){
        this.osVersion = osVer;
        this.oneUIVersion = uiVer;
    }
}

class Oneplus extends MobileDevices implements AndroidDevices{
    String name;
    double colorOSVersion;

    Oneplus(String n){
        this.name = n;
    }

    public void update(int osVer, double uiVer){
        this.osVersion = osVer;
        this.colorOSVersion = uiVer;
    }

}

class GooglePixel extends MobileDevices implements AndroidDevices {
    String name;

    GooglePixel(String n){
        this.name = n;
    }

    public void update(int osVer, double uiVer){
        this.osVersion = osVer;
    }
}


class Motorola extends MobileDevices implements AndroidDevices{
    String name;
    double myUXVersion;

    Motorola(String n){
        this.name = n;
    }

    public void update(int osVer, double uiVer){
        this.osVersion = osVer;
        this.myUXVersion = uiVer;
    }
}

class iPhone extends MobileDevices{
    String name;

    iPhone(String n){
        this.name = n;
    }
    void iOSUpdate(int osVer){
        this.osVersion = osVer;
    }
}

class User{
    //no need to prepare functions for each Android device class anymore
    /*
    void oneUIUpdate(SamsungGalaxy galaxy, int osVer, double oneUIVer){
        galaxy.update(osVer,oneUIVer);
    }
     */

    void androidUpdate(AndroidDevices androidDevices, int osVer, double uiVer){
        androidDevices.update(osVer,uiVer);
    }
}

public class Main {
    public static void main(String[] args) {
        User me = new User();

    }
}