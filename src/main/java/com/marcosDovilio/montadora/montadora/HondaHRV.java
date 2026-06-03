package com.marcosDovilio.montadora.montadora;

import java.awt.*;

public class HondaHRV extends Carro{
    public HondaHRV(Motor motor) {
        super(motor);
        setCor(Color.WHITE);
        setModelo("HRV");
        setMontadora(Montadora.HONDA);
        setMotor(motor);
    }


}
