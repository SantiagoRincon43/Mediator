/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 *
 * @author Santiago
 */

public class RainSensor extends Sensor {

    public RainSensor(Mediator mediator, String id) {
        super(mediator, id);
    }

    public void detectRain(boolean isRaining) {
        if (isRaining) {
            detect("LLUVIA");
        }
    }
}