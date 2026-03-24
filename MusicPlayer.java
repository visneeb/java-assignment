interface Playable {
    void play();
}

abstract class MusicDevice {
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    void info() {
        System.out.println("Music player brand: " + brand);
    }

    abstract void connect();
}

class CDPlayer extends MusicDevice implements Playable {
    public CDPlayer(String brand) {
        setBrand(brand);
    }

    public void connect() {
        System.out.println("Connecting CD...");
    }

    public void play() {
        System.out.println("Music is playing from CD");
    }
}

class Smartphone extends MusicDevice implements Playable {
    public Smartphone(String brand) {
        setBrand(brand);
    }

    public void connect() {
        System.out.println("Connecting Bluetooth...");
    }

    public void play() {
        System.out.println("Music is playing from Spotify");
    }
}

public class MusicPlayer {
    public static void main(String[] args) {
        MusicDevice device1 = new CDPlayer("Sony");
        MusicDevice device2 = new Smartphone("Samsung");

        device1.connect();
        device1.info();
        ((Playable) device1).play();

        System.out.println("---");

        device2.connect();
        device2.info();
        ((Playable) device2).play();
    }
}