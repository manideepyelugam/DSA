import java.util.*;


public class hashingBasic {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("manideep",100);
        map.put("sathwika",120);


        map.put("sathwika",130);


        if(map.containsKey("manideep")){
            System.out.println("contains manideep");
        }else{
            System.out.println("does not contain manideep");
        }


        System.out.println(map.get("manideep"));

        System.out.println(map.get("sathvika"));

        Set<String> keys = map.keySet();

        for(String key : keys){
            System.out.println(key + " " +map.get(key));
        }


        map.remove("manideep");


        for(String key : keys){
            System.out.println(key + " " +map.get(key));
        }




    }
}