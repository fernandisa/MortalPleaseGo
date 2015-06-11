package mortalkombat;
public class Scorpion extends Personagens {
    

    public Scorpion ()
    {
       
    }

   
    // Métodos para comandos
    
    
    public String spear ()
    {
        return " Baixo - Tras - Bolinha" +  socofraco;
    }
    
    public String teleport ()
    {
        return "Baixo - Baixo " + socoforte;
    }
    
    public String takedown ()
    {
        return "Trás - Frente " + chuteforte;
    }
    
    public String combo1 ()
    {
        return chuteforte + "-" + chuteforte;
    }
    
    public String combo2 ()
    {
        return chuteforte + "-" + socoforte;
    }
    
    public String fataly1 ()
    {
        return chuteforte + "-" + socofraco;
    }
    
    public String fataly2 ()
    {
        return socoforte + "-" + chutefraco;
    }
    
    private String airdeamon()
    {
        return chuteforte + "-" + chutefraco + "- Frente - Trás " + socoforte;
    }
}
