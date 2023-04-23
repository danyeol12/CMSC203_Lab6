package lab6;

/**
 * The purpose of this class is to model a television
 * Daniel Kim - 04/22/2023
 *
 * @author Daniel Kim
 */
public class Television {

    /** Manufacturer of the TV */
    private final String manufacturer;

    /** Size of the TV Screen */
    private final int screenSize;

    private boolean powerOn;    // The powerState of the TV.
    private int channel;        // The current channel
    private int volume;         // The current volume

    /**
     * Constructor designed to instantiate the
     * brand and size of the television.
     *
     * @param brand The brand of the television
     * @param size  The size of the television
     */
    public Television(String brand, int size) {
        // Initialize all global variables
        this.manufacturer = brand;
        this.screenSize = size;
        this.channel = 0;
        this.volume = 20;
        this.powerOn = false;
    }

    /**
     * Method designed to change the channel of the TV
     *
     * @param station The channel to change to
     */
    public void setChannel(int station) {
        this.channel = station;
    }

    /** Powers the TV on and off */
    public void power() {
        this.powerOn = !this.powerOn;
    }

    /** Increases the volume of the TV */
    public void increaseVolume() {
        this.volume++;
    }

    /** Decreases the volume of the TV */
    public void decreaseVolume() {
        this.volume--;
    }

    /** Get the current channel
     *
     * @return the currently set channel
     */
    public int getChannel() {
        return this.channel;
    }

    /** Get the current volume
     *
     * @return the currently set volume
     */
    public int getVolume() {
        return this.volume;
    }

    /** The the manufacturer of the TV
     *
     * @return the manufacturer
     */
    public String getManufacturer() {
        return this.manufacturer;
    }

    /** Return the size of the TV
     *
     * @return the TV size
     */
    public int getScreenSize() {
        return this.screenSize;
    }
}
