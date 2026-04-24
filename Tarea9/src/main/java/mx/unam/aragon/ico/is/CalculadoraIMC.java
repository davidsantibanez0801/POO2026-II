package mx.unam.aragon.ico.is;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode


public class CalculadoraIMC {

    private double imc;
    private double peso;
    private double altura;

    public void CalculadoraIMC() {
        this.imc = this.peso / (this.altura * this.altura);
    }

}
