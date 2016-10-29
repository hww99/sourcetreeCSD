package example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 184964 on 10/13/2016.
 */
public class Others {
    private List<String> list_others =new ArrayList();

    public void setvalue(String others_value){
        list_others.add(others_value);

    }

    public List<String> getvalue_list(){
        return list_others;
    }

    public String getvalue_String(){

        String value_String="";

        for(int i = 0; i<= list_others.size()-1; i++){
            value_String=value_String+ list_others.get(i)+",";
        }

        return value_String;
    }
}
