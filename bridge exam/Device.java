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
public interface Device {
    void powerOn();
    void powerOff();
    void setVolume(int volume);
    boolean isPoweredOn();
    int getVolume();
}
