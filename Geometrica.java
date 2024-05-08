public class Geometrica implements ICalcMedia{

    public double calcMedia(double P1, double P2) {
        return Math.sqrt(P1*P2);
    }

    public String situacao(double P1, double P2) {
        if(calcMedia(P1,P2)>=5){
            return "Aprovado";
        }else return "Reprovado";
    }
}
