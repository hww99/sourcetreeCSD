package example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 184964 on 10/13/2016.
 */
public class Vehicle {
    private List<String> list_vehicle=new ArrayList();

    public void setvalue(String vehicle_value){
        list_vehicle.add(vehicle_value);

    }

    public List<String> getvalue_list(){
        return list_vehicle;
    }

    public String getvalue_String(){

        String value_String="";

        for(int i = 0; i<= list_vehicle.size()-1; i++){
            value_String=value_String+ list_vehicle.get(i)+",";
        }

        return value_String;
    }
}
