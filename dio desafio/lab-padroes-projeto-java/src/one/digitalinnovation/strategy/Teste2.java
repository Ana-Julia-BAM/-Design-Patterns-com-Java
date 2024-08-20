package one.digitalinnovation.strategy;

public class Teste2 {
    Comportamento normal = new ComportamentoNormal();
    Comportamento agressivo = new ComportamentoAgressivo();
    Comportamento defensivo = new ComportamentoDefensivo();

    Robo robo = new Robo();
    robo.setStrategy(normal);

    robo.mover();
    robo.setStrategy(defensivo);

}
