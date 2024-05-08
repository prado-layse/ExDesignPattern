import org.apache.xpath.operations.String;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Aritmetica calculo = new Aritmetica();
        //Geometrica calculo = new Geometrica();
        Disciplina d = new Disciplina(calculo);

        d.setNome("Padroes de Desenvolvimento");
        d.setP1(8);
        d.setP2(8);
        d.calcMedia();

        System.out.println(String.format("P1:%.2f \nP2:%.2f \nMedia:%.2f \nSituacao:%s", d.getP1(), d.getP2(), d.getMedia(), d.getSituacao()));
    }
}