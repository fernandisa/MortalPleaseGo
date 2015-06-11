package mortalkombat;
    public class Reptile extends Personagens{

    
    public Reptile ()
    {
        
        
    }

    //Métodos para modificar ou mostrar os meus atributos
   
    // Meodos para comandos
    public String invisivel ()
    {
        return " Baixo - Cima - Bolinha" +  chuteforte;
    }
    
    public String acido ()
    {
        return "Baixo - Frente " + socofraco;
    }
    
    public String bolarapida ()
    {
        return "Tras - Tras " + socofraco;
    }
    
  
    public String bolalenta ()
    {
        return "Tras - Tras " + chutefraco;
    }
    
  
    public String combo1 ()
    {
        return chuteforte + "-" + chutefraco;
    }
    
 
    public String combo2 ()
    {
        return chuteforte + "-" + chutefraco + "-" + socoforte;
    }
    
   
    public String fataly1 ()
    {
        return chuteforte + "-" + chutefraco + "- Tras - Tras " + chuteforte;
    }
    
  
    public String fataly2 ()
    {
        return chuteforte + "-" + chuteforte + "-" + socoforte + "-" + socofraco + "-" + chutefraco;
    }
    
    private String bolaultrasonica()
    {
        return chuteforte + "-" + chutefraco + "- Tras - Tras " + socofraco + chutefraco + "- Tras - Tras " + chuteforte;
    }
}
