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
public class BridgeExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        RemoteControl basicRemoteForTV = new BasicRemote(tv);
        RemoteControl advancedRemoteForRadio = new AdvancedRemote(radio);

        // Control the TV
        basicRemoteForTV.togglePower();
        basicRemoteForTV.volumeUp();
        basicRemoteForTV.volumeDown();
        basicRemoteForTV.togglePower();

        System.out.println();

        // Control the Radio
        advancedRemoteForRadio.togglePower();
        advancedRemoteForRadio.volumeUp();
        advancedRemoteForRadio.mute();
        advancedRemoteForRadio.togglePower();
    }
    
}
