
package gitavecnetbeans;

import java.util.Date;

public class GitAvecNetBeans {

    public static void main(String[] args) {
        System.out.println("Voici un projet qui est configuré avec Git");
        afficherMessage();
        afficherDateAjourdhui();

    }
    
    public static void afficherMessage() {
        System.out.println("Bonjour");
    }
    
    public static void afficherDateAjourdhui(){
        System.out.println(new Date().toString());
    }
  
}
