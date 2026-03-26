/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import components.Device;
import components.Mediator;
import java.util.ArrayList;
import java.util.List;
import components.AirConditioner;
import components.SmartCurtains;
import components.SmartAwning;

/**
 *
 * @author MyM
 */

public class SmartHub implements Mediator {

    private final List<Device> devices = new ArrayList<>();

    @Override
    public void registerDevice(Device device) {
        if (!devices.contains(device)) {
            devices.add(device);
        }
    }

    @Override
    public void send(String message, Device sender) {

        System.out.println("[SmartHub] Evento recibido de " + sender.getId() + " -> " + message);

        // ===== LÓGICA DE NEGOCIO CENTRALIZADA =====

        // Sensor detecta calor
        if (message.contains("CALOR")) {
            for (Device d : devices) {
                if (d instanceof AirConditioner) {
                    d.receive("CMD:ENCENDER");
                }
            }
            return;
        }

        // Sensor detecta noche
        if (message.contains("NOCHE")) {
            for (Device d : devices) {
                if (d instanceof SmartCurtains) {
                    d.receive("CMD:CERRAR");
                }
            }
            return;
        }

        // Sensor detecta lluvia
        if (message.contains("LLUVIA")) {
            for (Device d : devices) {
                if (d instanceof SmartAwning) {
                    d.receive("CMD:ABRIR");
                }
            }
            return;
        }

        // ===== COMPORTAMIENTO GENÉRICO (opcional) =====
        // Cualquier otro mensaje se reenvía a todos menos al remitente
        for (Device d : devices) {
            if (d != sender) {
                d.receive(message);
            }
        }
    }
}