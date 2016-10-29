package example;

import java.io.*;

import java.util.List;



/**
 * Created by lx on 2016/10/28.
 */
public class Number_01 {
    public static void  main(String[] args)
    {
        BufferedReader in = null;
        try{
            in = new BufferedReader(new InputStreamReader(System.in));
            String line;
            int data;
            while ((line = in.readLine()).equals("end")==false) {

                data=Integer.valueOf(line);

                List <Integer> data_canuse=null;
                List<Integer> data_result=null;
                Boolean flag=false;
                int i;

                for(i=3;i<=data;i++){

                    for (int j=3;j<=data;j++){
                        if((i!=j) && (i%j==0)){
                            flag=true;
                            break;

                        }

                    }
                    if(flag.equals(true)){
                        data_canuse.add(i);
                    }
                }

                while(data % data_canuse.get(0)==0){
                    for(i=0;i<=data_canuse.size()-1;i++){
                        if(data % data_canuse.get(0)==0){
                            data=data/data_canuse.get(0);
                            data_result.add(data_canuse.get(0));
                        }
                    }
                }

                for(i=0;i<data_canuse.size()-1;i++){
                    System.out.println(data_result.get(0));
                }


            }
        }
        catch(Exception e){

        }
    }
}
