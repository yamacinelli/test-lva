import static org.junit.Assert.assertEquals;

import org.junit.Test;

import paranavai.ifpr.edu.br.SimuladorCashBack;

public class Teste {

    @Test
    public void limitValueAnalysis() {
        assertEquals("BRONZE: Valor abaixo do esperado", 149.99, SimuladorCashBack.calculaCashBack(1000.00, "Bronze"), 0.01);
        assertEquals("BRONZE: Valor acima do esperado", 150.01, SimuladorCashBack.calculaCashBack(1000.00, "Bronze"), 0.01);

        assertEquals("PRATA: Valor abaixo do esperado", 199.99, SimuladorCashBack.calculaCashBack(1000.00, "Prata"), 0.01);
        assertEquals("PRATA: Valor acima do esperado", 200.01, SimuladorCashBack.calculaCashBack(1000.00, "Prata"), 0.01);

        assertEquals("OURO: Valor abaixo do esperado", 249.99, SimuladorCashBack.calculaCashBack(1000.00, "Ouro"), 0.01);
        assertEquals("OURO: Valor acima do esperado", 250.01, SimuladorCashBack.calculaCashBack(1000.00, "Ouro"), 0.01);
    }
}
