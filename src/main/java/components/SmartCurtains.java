/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 *
 * @author Santiago
 */

public class SmartCurtains extends Actuator {

    public SmartCurtains(Mediator mediator, String id) {
        super(mediator, id);
    }

    public void close() {
        performAction("CERRAR CORTINAS");
    }
}