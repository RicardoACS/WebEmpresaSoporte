/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

/**
 *
 * @author Ricardo
 */
public class Equipo 
{
    private String procesar;
    private int memoriaRam;
    private int espacioDiscoDuro;
    private String tarjetaDeVideo;
    private String numeroIp;

    public Equipo() 
    {
        procesar = new String();
        memoriaRam = 0;
        espacioDiscoDuro = 0;
        tarjetaDeVideo = new String();
        numeroIp = new String();
    }

    public String getProcesar() {
        return procesar;
    }

    public void setProcesar(String procesar) {
        this.procesar = procesar;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam)throws Exception{
        if(memoriaRam >=2 && memoriaRam <= 10)
        {
            this.memoriaRam = memoriaRam;
        }
        else
        {
            throw new Exception("La memoria ram debe estar entre 2 y 10");
        }
    }

    public int getEspacioDiscoDuro() {
        return espacioDiscoDuro;
    }

    public void setEspacioDiscoDuro(int espacioDiscoDuro) throws Exception{
        if(espacioDiscoDuro >= 120 && espacioDiscoDuro <= 1024)
        {
            this.espacioDiscoDuro = espacioDiscoDuro;
        }
        else
        {
            throw new Exception("El espacio del disco duro debe ser entre 120 y 1024");
        }
        
    }
    public String getTarjetaDeVideo() {
        return tarjetaDeVideo;
    }

    public void setTarjetaDeVideo(String tarjetaDeVideo) {
        this.tarjetaDeVideo = tarjetaDeVideo;
    }

    public String getNumeroIp() {
        return numeroIp;
    }

    public void setNumeroIp(String numeroIp) {
        this.numeroIp = numeroIp;
    }
    
    
}
