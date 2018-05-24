import com.google.gson.JsonParser;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class TipoListado {


    public void parseListado() {



        String jsonMeli = "[{ \"site_id\": \"MLA\", \"id\": \"gold_pro\", \"name\": \"Premium\" }, { \"site_id\": \"MLA\", \"id\": \"gold_special\", \"name\": \"Clásica\" }, { \"site_id\": \"MLA\", \"id\": \"gold\", \"name\": \"Oro\" }, { \"site_id\": \"MLA\", \"id\": \"silver\", \"name\": \"Plata\" }, { \"site_id\": \"MLA\", \"id\": \"bronze\", \"name\": \"Bronce\" }, { \"site_id\": \"MLA\", \"id\": \"free\", \"name\": \"Gratuita\" }]";


        String sURL = "https://jsonplaceholder.typicode.com/comments?postId=1"; //Get an array
        //String sURL = "http://freegeoip.net/json/"; //get an object
        //https://api.mercadolibre.com/sites/MLA/listing_types

        // Connect to the URL using java's native library
        URL url = null;
        try {
            url = new URL(sURL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        URLConnection request = null;
        try {
            request = url.openConnection();
            request.connect();
        } catch (IOException e) {
            e.printStackTrace();
        }


        JsonParser jp = new JsonParser();
        JsonElement root = null; //Convert the input stream to a json element
        try {
            root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(root.isJsonArray()) {

            JsonArray rootobj = root.getAsJsonArray(); //May be an array, may be an object.

            // for each element of array
            for (JsonElement obj : rootobj) {

                JsonObject gsonObj = obj.getAsJsonObject();


                System.out.println(gsonObj.get("name"));
            }
        }
        else if(root.isJsonObject()){

            System.out.println("objeto");
        }




    }
}
