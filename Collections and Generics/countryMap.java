import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countryMap {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        countryMap.put("Bharat", "New Delhi");
        countryMap.put("China", "Beijing");
        countryMap.put("Pakistan", "Islamabad");
        countryMap.put("Bangladesh", "Dhaka");
        countryMap.put("Sri Lanka", "Colambo");

        System.out.println("Please enter the country name:");
        String country = sc.next();

        if(countryMap.containsKey(country)){
            System.out.printf("Capital of %s is %s ", country, countryMap.get(country));
        }else{
            System.out.println("Sorry we don't know the capital");
        }
    }

}
