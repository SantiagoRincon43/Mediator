/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package app;

import components.*;

/**
 *
 * @author MyM
 */
public class Main {
    public static void main(String[] args) {

        SmartHub hub = new SmartHub();

        // ===== SENSORES =====
        TemperatureSensor tempSensor = new TemperatureSensor(hub, "TempSensor1");
        LightSensor lightSensor = new LightSensor(hub, "LightSensor1");
        RainSensor rainSensor = new RainSensor(hub, "RainSensor1");

        // ===== ACTUADORES =====
        AirConditioner airConditioner = new AirConditioner(hub, "AC1");
        SmartCurtains curtains = new SmartCurtains(hub, "Curtains1");
        SmartAwning awning = new SmartAwning(hub, "Awning1");

        // ===== SIMULACIÓN =====
        tempSensor.detectTemperature(35);   // CALOR -> enciende AC
        lightSensor.detectNight(true);      // NOCHE -> cierra cortinas
        rainSensor.detectRain(true);        // LLUVIA -> abre toldo
    }
}