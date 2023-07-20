
package pbo;

public class contoh {
    //atribut dan encapculation
    private String namamobil;
    private String plat;

    //construktor

    public contoh(String namamobil, String plat) {
        this.plat = plat;
        this.namamobil = namamobil;
       
    }

    
    //setter

    public String getNamamobil() {
        return namamobil;
    }

    public void setNamamobil(String namamobil) {
        this.namamobil = namamobil;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }
    
    
    
    public String displayInfo() {
        return "plat = "+getPlat()+ "\nNamamobil = "+getNamamobil();
    }
    
    //polymortisme(overloding)

}
