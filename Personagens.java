package mortalkombat;
    public class Personagens {
    protected String socoforte;
    protected String socofraco;
    protected String chuteforte;
    protected String chutefraco;
    protected String defesa;
    protected String agarra;
    protected String especial;
    protected String trocalutador;
    protected Integer vida;

    public String getTrocalutador() {
        return trocalutador;
    }

    public void setTrocalutador(String trocalutador) {
        this.trocalutador = trocalutador;
    }

    
    
    public Personagens ()
    {
        this.agarra = null;
        this.chuteforte = null;
        this.chutefraco = null;
        this.defesa = null;
        this.especial = null;
        this.socoforte = null;
        this.socofraco = null;
        this.vida = 100;
    }

    //Métodos para modificar ou mostrar os meus atributos
    public String getSocoforte() {
        return socoforte;
    }

    public void setSocoforte(String socoforte) {
        this.socoforte = socoforte;
    }

    public String getSocofraco() {
        return socofraco;
    }

    public void setSocofraco(String socofraco) {
        this.socofraco = socofraco;
    }

    public String getChuteforte() {
        return chuteforte;
    }

    public void setChuteforte(String chuteforte) {
        this.chuteforte = chuteforte;
    }

    public String getChutefraco() {
        return chutefraco;
    }

    public void setChutefraco(String chutefraco) {
        this.chutefraco = chutefraco;
    }

    public String getDefesa() {
        return defesa;
    }

    public void setDefesa(String defesa) {
        this.defesa = defesa;
    }

    public String getAgarra() {
        return agarra;
    }

    public void setAgarra(String agarra) {
        this.agarra = agarra;
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }
    
//     Meodos para comandos
//    public String invisivel ()
//    {
//        return " Baixo - Cima - Bolinha" +  chuteforte;
//    }
//    
//    public String acido ()
//    {
//        return "Baixo - Frente " + socofraco;
//    }
//    
//    public String bolarapida ()
//    {
//        return "Tras - Tras " + socofraco;
//    }
//    
//    public String bolalenta ()
//    {
//        return "Tras - Tras " + chutefraco;
//    }
//    
    public String combo1 ()
    {
        return chutefraco + "-" + socoforte;
    }
    
    public String combo2 ()
    {
        return socoforte + "-" + chutefraco + "-" + chuteforte;
    }
    
    public String fataly1 ()
    {
        return chuteforte + "-" + chutefraco;
    }
    
    public String fataly2 ()
    {
        return chuteforte + "-" + chutefraco;
    }
    
//    private String bolaultrasonica()
//    {
//        return chuteforte + "-" + chutefraco + "- Tras - Tras " + socofraco;
//    }
//    public String gelofrente ()
//    {
//        return " Cima - Baixo - Quadrado" +  chuteforte;
//    }
//    
//    public String gelochao ()
//    {
//        return "Trás- Frente " + socoforte;
//    }
//    
//    public String slide ()
//    {
//        return "Frente - Trás " + chutefraco;
//    }
}
