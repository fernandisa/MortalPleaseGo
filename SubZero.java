package mortalkombat;
public class SubZero extends Personagens {


    public SubZero ()
    {
       
    }
    
    // Métodos para comandos
    
    
    public String gelofrente ()
    {
        return " Cima - Baixo - Quadrado" +  chuteforte;
    }
    
    public String gelochao ()
    {
        return "Trás- Frente " + socoforte;
    }
    
    public String slide ()
    {
        return "Frente - Trás " + chutefraco;
    }
    
    public String combo1 ()
    {
        return chuteforte + "-" + chutefraco;
    }
    
    public String combo2 ()
    {
        return chuteforte + "-" + chutefraco;
    }
    
    public String fataly1 ()
    {
        return chuteforte + "-" + chutefraco;
    }
    
    public String fataly2 ()
    {
        return chuteforte + "-" + chutefraco;
    }
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
    
    private String supergelo()
    {
        return chuteforte + "-" + chutefraco + "- Trás - Trás " + socofraco;
    }

   
    }

