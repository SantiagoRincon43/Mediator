/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 *
 * @author Santiago
 */

public class TemperatureSensor extends Sensor {

    public TemperatureSensor(Mediator mediator, String id) {
        super(mediator, id);
    }

    public void detectTemperature(int temp) {
        if (temp > 30) {
            detect("CALOR");
        }
    }
}