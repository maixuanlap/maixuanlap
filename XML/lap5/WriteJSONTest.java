import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.print.attribute.standard.Fidelity;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class WriteJSONTest {
    @SuppressWarnings("unchecked")
    public static void main(String[]args){
        JSONObject employeeDetails=new JSONObject();
        employeeDetails.put("firstName","Dang");
        employeeDetails.put("LastName","Kim Thi");
        employeeDetails.put("website","codelean.vn");

        JSONObject employeeObject=new JSONObject();
        employeeObject.put("employee",employeeDetails);

        JSONObject employeeDetails2=new JSONObject();
        employeeDetails2.put("firsName","Mai");
        employeeDetails2.put("LastName","Xuan Lap");
        employeeDetails2.put("website","codelean.com");

        JSONObject employeeObject2=new JSONObject();
        employeeObject2.put("employee",employeeDetails2);

        JSONArray employeeList=new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);

        try (FileWriter file=new FileWriter("employees.json")) {
             file.write(employeeList.toJSONString());
             file.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
