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
public class BasicRemote extends RemoteControl{
   
    
    public BasicRemote(Device device) {
        super(device);}

    
    

    @Override
    public void togglePower() {
        if (device.isPoweredOn()) {
            device.powerOff();
        } else {
            device.powerOn();
        }    
}
    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
    }
    public void mute() {
        device.setVolume(0);
        System.out.println("Device muted");
    }
}