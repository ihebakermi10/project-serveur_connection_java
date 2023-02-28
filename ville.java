import java.io.Serializable;

public class ville implements Serializable{
    String nom ,pay,population ; 
    public ville(String nom,String pay,String population ){
        this.nom=nom ; 
        this.pay =pay; 
        this.population=population ; 

    }
    @Override
    public String toString() {
        return "ville [nom=" + nom + ", pay=" + pay + ", population=" + population + "]";
    }


    
}
