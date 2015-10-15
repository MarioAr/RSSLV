package labov.tp;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import java.io.IOException;
import java.util.List;

/**
 * Created by alumno on 15/10/2015.
 */
public class ThreadConexion implements Runnable {

    private String url;
    private Handler h;

    public ThreadConexion(String url, Handler h){
        this.url = url;
        this.h = h;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override

    public void run() {
        HttpManager http =  new HttpManager(url);

        try {
            String resultado = http.getStrDataByGET();
            XMLParser parser = new XMLParser (resultado);
            List<RSS> rss = parser.parser();
            //Log.d("", "___________________");
            Message msg= new Message();
            msg.obj = rss;
            h.sendMessage(msg);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
