import java.time.Duration;
import java.time.LocalDateTime;

public class AppelTelephonique {

    private LocalDateTime dateHeureAppel;
    private String numeroAppel;
    private Duration duree;
    private double tarifMinute;
    private static double tarifParDefaut = 0.15;

    public AppelTelephonique(LocalDateTime dateHeureAppel, String numeroAppel, Duration duree, double tarifMinute){
        this.dateHeureAppel = dateHeureAppel;
        this.numeroAppel = numeroAppel;
        this.duree = duree;
        this.tarifMinute = tarifMinute;
    }

    public AppelTelephonique(LocalDateTime dateHeureAppel, String numeroAppel, Duration duree){
        this(dateHeureAppel, numeroAppel, duree, AppelTelephonique.tarifParDefaut);
    }

    public static double getTarifParDefaut(){
        return tarifParDefaut;
    }
    public static void setTarifParDefaut(double tarifParDefaut){
       getTarifParDefaut();
    }



}
