package example;

import java.io.*;
import example.Food;
import example.Mobile;
import example.Vehicle;

public class One {
    String message = "foo";




    public String foo() {
        return message;
    }




    public static void consume_getvalue(String Category){

    }

    public void uncoveredMethod() {
        System.out.println(foo());
    }

    public static void  main(String[] args)  throws IOException {

        Shopping shop=new Shopping();

        if (args[0].equals("consume")) {
            BufferedReader in = null;
            try {
                in = new BufferedReader(new InputStreamReader(System.in));
                String line;
                while ((line = in.readLine()).equals("end")==false) {
                    System.out.println(line);

                    shop.consume_setvalue(line);

                }

                System.out.println(shop.consume_showlist("food"));
                System.out.println(shop.consume_showlist("mobile"));
                System.out.println(shop.consume_showlist("vehicle"));
                System.out.println(shop.consume_showlist("others"));
            }
            catch (IOException e) {
                throw e;
            }
            finally {
                if (in != null) {
                    in.close();
                }
            }
        } else {
            for (String s: args) {
                System.out.println(s);
            }
        }

    }
}