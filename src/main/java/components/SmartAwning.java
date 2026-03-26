/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 *
 * @author Santiago
 */

public class SmartAwning extends Actuator {

    public SmartAwning(Mediator mediator, String id) {
        super(mediator, id);
    }

    public void open() {
        performAction("ABRIR TOLDO");
    }
}