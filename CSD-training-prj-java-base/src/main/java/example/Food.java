package example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 184964 on 10/13/2016.
 */
public class Food {

    private List<String> list_food=new ArrayList();

    public void setvalue(String food_value){
        list_food.add(food_value);

    }

    public List<String> getvalue_list(){
        return list_food;
    }

    public String getvalue_String(){

        String value_String="";

        for(int i=0;i<=list_food.size()-1;i++){
            value_String=value_String+list_food.get(i)+",";
        }

        return value_String;
    }

}
