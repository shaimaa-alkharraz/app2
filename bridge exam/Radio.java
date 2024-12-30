/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgeexample;

/**
 *
 * @author User
 */
public class Radio implements Device{
    private boolean power = false;
    private int volume = 30;

    @Override
    public void powerOn() {
        power = true;
        System.out.println("Radio is now ON");
    }

    @Override
    public void powerOff() {
        power = false;
        System.out.println("Radio is now OFF");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Radio volume set to " + volume);
    }

    @Override
    public boolean isPoweredOn() {
        return power;
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
