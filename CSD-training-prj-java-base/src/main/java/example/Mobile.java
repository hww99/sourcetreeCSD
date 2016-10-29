package example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 184964 on 10/13/2016.
 */
public class Mobile {
    private List<String> list_mobile=new ArrayList();

    public void setvalue(String mobile_value){
        list_mobile.add(mobile_value);

    }

    public List<String> getvalue_list(){
        return list_mobile;
    }

    public String getvalue_String(){

        String value_String="";

        for(int i=0;i<=list_mobile.size()-1;i++){
            value_String=value_String+list_mobile.get(i)+",";
        }

        return value_String;
    }
}
