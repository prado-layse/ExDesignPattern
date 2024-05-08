public class Disciplina {

    //Propriedades
    private ICalcMedia calcMedia;
    private double media, P1, P2;
    private String nome, situacao;

    //metodo para calcular a media
    public void calcMedia(){
        media= calcMedia.calcMedia(P1,P2);
        situacao = calcMedia.situacao(P1,P2);
    }

    public Disciplina(ICalcMedia calcMedia){
        this.calcMedia = calcMedia;
    }

    public ICalcMedia getCalcMedia(){
        return calcMedia;
    }

    public void setCalcMedia(ICalcMedia calcMedia){
        this.calcMedia = calcMedia;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getP1() {
        return P1;
    }

    public void setP1(double p1) {
        this.P1 = p1;
    }

    public double getP2() {
        return P2;
    }

    public void setP2(double p2) {
        this.P2 = p2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
