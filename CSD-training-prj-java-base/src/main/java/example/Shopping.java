package example;

/**
 * Created by 184964 on 10/13/2016.
 */
public class Shopping {

    Food obj_food=new Food();
    Mobile obj_mobile=new Mobile();
    Vehicle obj_vehicle=new Vehicle();
    Others obj_others=new Others();

    public void consume_setvalue(String consume_value) {


        if (consume_value.startsWith("food")) {
            obj_food.setvalue(consume_value);
        } else if (consume_value.startsWith("mobile")) {
            obj_mobile.setvalue(consume_value);

        } else if (consume_value.startsWith("vehicle")) {
            obj_vehicle.setvalue(consume_value);
        } else {
            obj_others.setvalue(consume_value);
        }
    }

    public String consume_showlist(String consume_value){

        String str_shopping_list=null;

        if (consume_value.startsWith("food")) {
            str_shopping_list="Food list:"+obj_food.getvalue_String();
        } else if (consume_value.startsWith("mobile")) {
            str_shopping_list="Mobile list:"+obj_mobile.getvalue_String();

        } else if (consume_value.startsWith("vehicle")) {
            str_shopping_list="Vehicle list:"+obj_vehicle.getvalue_String();
        } else {
            str_shopping_list="Other list:"+obj_others.getvalue_String();
        }

        return str_shopping_list;
    }
}
