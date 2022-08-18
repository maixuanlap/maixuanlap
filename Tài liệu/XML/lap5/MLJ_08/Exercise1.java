import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise1 {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();
        try(FileReader reader = new FileReader("Exercise1.json"))
        {
            Object obj = jsonParser.parse(reader);

            JSONObject menuList = (JSONObject) obj;
            System.out.println(menuList);

            JSONObject menuObject = (JSONObject) menuList.get("menu");
            System.out.println(menuObject);

            JSONObject popup = (JSONObject) menuObject.get("popup");
            System.out.println(popup);

            JSONArray menuitem = (JSONArray) popup.get("menuitem");
            System.out.println(menuitem);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }
    }

}