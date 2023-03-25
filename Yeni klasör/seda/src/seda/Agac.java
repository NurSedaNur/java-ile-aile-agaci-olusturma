/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seda;

/**
 *
 * @author sedan
 */
public class Agac {
    AgacNode ilk = null;
        
    public static void ara(AgacNode kim) {
        if (kim == null) {
            return;
        }

        System.out.print(kim.uye.tc_no + kim.uye.ad);
        if (kim.evliBekar.equals("-- evliii")) {
            System.out.println("-----" + kim.uyeninEsi);
        } else {
            System.out.println();
        }
        ara(kim.uyekardes);
        ara(kim.cocuk);
//        
//        if(kim.uye.ad.equals(kim.cocuk.uyekardes.cocuk.uye.ad)){
//            System.out.println(kim.uye.ad+"-- esitt");
//        }
//        
    }

    public AgacNode ekle(AgacNode agacKok, AgacNode kokAdd) {
          
        if (agacKok.uye.ad.contains(kokAdd.uye.anneAdı) && agacKok.uyeninEsi.contains(kokAdd.uye.babaAdı)) {

            if (agacKok.cocuk == null) {
                agacKok.cocuk = kokAdd;

                return agacKok;

            } else {

                agacKok = agacKok.cocuk;
                while (agacKok.uyekardes != null) {
                    agacKok = agacKok.uyekardes;
                }
                agacKok.uyekardes = kokAdd;
               
                return agacKok;
            }
        }
        if (agacKok.uye.ad.contains(kokAdd.uye.babaAdı) && agacKok.uyeninEsi.contains(kokAdd.uye.anneAdı)) {
            if (agacKok.cocuk == null) {
                agacKok.cocuk = kokAdd;

                return agacKok;
            } else {

                agacKok = agacKok.cocuk;
                while (agacKok.uyekardes != null) {
                    agacKok = agacKok.uyekardes;
                }
                agacKok.uyekardes = kokAdd;
               
                return agacKok;
                
            }
        }
        
        if (agacKok.uyekardes != null) {
            agacKok = ekle(agacKok.uyekardes, kokAdd);

        }

        if (agacKok.cocuk != null) {
            agacKok = ekle(agacKok.cocuk, kokAdd);

        }

        return agacKok;
    }
}
