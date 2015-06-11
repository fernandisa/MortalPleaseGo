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
public class KungLao extends Personagens {
    
    public String slash ()
    {
        return "Trás - Cima " + socofraco + "-" + chuteforte;
    }
    
    public String power ()
    {
        return "Baixo - Frente " + socoforte +  "-" + socoforte + "-" + chuteforte;
    }
    
    public String extreme ()
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
        return chuteforte + "-" + socoforte + "-" + chuteforte + "-" + chutefraco + "-" + chuteforte + extreme();
    }
}
