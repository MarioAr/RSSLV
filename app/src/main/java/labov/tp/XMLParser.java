package labov.tp;

import android.util.Xml;

import org.xmlpull.v1.XmlPullParser;

import java.util.List;

/**
 * Created by alumno on 15/10/2015.
 */
public class XMLParser {

    private String xml;

    public XMLParser(String xml){
        this.xml = xml;
    }

    public List<RSS> parser(){
        XmlPullParser parser = Xml.newPullParser();

        return null;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }
}
