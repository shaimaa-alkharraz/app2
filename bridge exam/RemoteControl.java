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
public abstract class RemoteControl {
    protected Device device;
    protected RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void togglePower();
    public abstract void volumeUp();
    public abstract void mute();
    public abstract void volumeDown();
}
