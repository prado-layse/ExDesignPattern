public class Aritmetica implements ICalcMedia{

    public double calcMedia(double P1, double P2) {
        return ((P1+P2)/2.0);
    }

    public String situacao(double P1, double P2) {
        if(calcMedia(P1,P2)>=7){
            return "Aprovado";
        }else return "Reprovado";
    }
}
