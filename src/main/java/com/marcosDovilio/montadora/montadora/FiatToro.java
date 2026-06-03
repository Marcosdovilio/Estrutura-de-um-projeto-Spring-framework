package com.marcosDovilio.montadora.montadora;

import java.awt.*;

public class FiatToro extends Carro {
    public FiatToro(Motor motor) {
        super(motor);
        setCor(Color.DARK_GRAY);
        setModelo("TORO");
        setMontadora(Montadora.FIAT);
        setMotor(motor);
    }
}
