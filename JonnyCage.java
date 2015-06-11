/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mortalkombat;

/**
 *
 * @author Fernanda
 */
public class JonnyCage extends Personagens {
    
    public String bolaFrente ()
    {
        return "Baixo - Frente " + socofraco;
    }
    
    public String bolaCima ()
    {
        return "Baixo - Frente " + socoforte;
    }
    
    public String slide ()
    {
        return "Frente - Frente " + chuteforte;
    }
    
    public String combo1 ()
    {
        return socoforte + "-" + chutefraco;
    }
    
    public String combo2 ()
    {
        return chuteforte + "-" + socoforte + "-" + chuteforte;
    }
    
    public String fataly1 ()
    {
        return socoforte + "-" + chutefraco + "-" + chuteforte;
    }
    
    public String fataly2 ()
    {
        return chuteforte + "-" + socoforte + "-" + chuteforte + "-" + chutefraco + "-" + chuteforte;
    }
}
