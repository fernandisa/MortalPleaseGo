/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mortalkombat;

/**
 *
 * @author Fernanda - 4I 
 */
public class Raiden extends Personagens {
    
    public String toward ()
    {
        return "Trás - Cima " + socofraco + "-" + chuteforte;
    }
    
    public String rain ()
    {
        return "Baixo - Frente " + socoforte +  "-" + socoforte + "-" + chuteforte;
    }
    
    public String tornado ()
    {
        return "Frente - Frente " + chuteforte + "-" + socoforte;
    }
    
    public String combo1 ()
    {
        return socoforte + "-" + chutefraco + "-" + socoforte + "Frente - Trás";
    }
    
    public String combo2 ()
    {
        return "Frente - Trás - Frente " + chuteforte + "-" + socoforte + "-" + chuteforte;
    }
    
    public String fataly1 ()
    {
        return "Trás - Trás - Trás " + socoforte + "-" + chutefraco + "-" + chuteforte;
    }
    
    public String fataly2 ()
    {
        return chuteforte + "-" + socoforte + "-" + chuteforte + "-" + chutefraco + "-" + chuteforte + rain();
    }
}
