package labov.tp;

import android.graphics.Bitmap;

import java.util.List;

/**
 * Created by alumno on 08/10/2015.
 */
public class RSS {
    private String hora;
    private String titulo;
    private String nota;
    private String url;
    private Bitmap img;

    public Bitmap getImg() {
        return img;
    }

    public void setImg(Bitmap img) {
        this.img = img;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public RSS(){
        this.hora = "15:21";
        this.titulo = "titulo";
        this.nota = "nota";
        this.url = "www.ddddd.com";
    }
    public RSS(String hora, String titulo, String nota, String url, Bitmap img){
        this.hora = hora;
        this.titulo = titulo;
        this.nota = nota;
        this.url = url;

        this.img = img;
    }

    //public static List<RSS> obtenerListaRSS(String)

}
