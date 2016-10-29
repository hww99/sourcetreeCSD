package example;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by lx on 2016/10/28.
 */
public class Primeactor {
    public static List breakdown(int i) {

        List result = new ArrayList<>();

        if(i!=1){
            for (int factor = 2; factor <= i; factor++) {
                while (i % factor == 0) {

                    result.add(factor);

                    i = i / factor;
                }
            }



            if(i!=1){
                result.add(i);
            }
        }





        //result.add(i);

        return result;

    }
}
