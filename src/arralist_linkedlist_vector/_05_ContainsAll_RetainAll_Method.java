package arralist_linkedlist_vector;

import java.util.ArrayList;

public class _05_ContainsAll_RetainAll_Method {
    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();
        countries.add("Italy");
        countries.add("USA");
        countries.add("Canada");
        countries.add("Germany");
        countries.add("Spain");
        countries.add("Portugal");
        countries.add("Sweden");

        /*
        Check if the countries ArrayList contains Spain
        print true if it contains, and false otherwise
        EXPECTED:
        true
                */
        System.out.println(countries.contains("Spain"));
        /*
        Check if the countries ArrayList contains Sweden and Denmark
         */
        System.out.println(countries.contains("Sweden") && countries.contains("Denmark"));

        boolean hasSweden = false;
        boolean hasDenmark = false;

        for (String country: countries){
            if(country.equals("Sweden")) hasSweden = true;
            else if (country.equals("Denmark")) hasDenmark = true; {
                if(hasDenmark && hasSweden) break; // eliminating redundant checks after both found
            }
        }System.out.println(hasDenmark && hasSweden);

        /*
        Check if the countries ArrayList contains Portugal, Spain,
         */
        ArrayList<String> europeCountries = new ArrayList<>();
        europeCountries.add("Portugal");
        europeCountries.add("Spain");
        europeCountries.add("Sweden");
        europeCountries.add("Germany");
        europeCountries.add("Italy");
        System.out.println(countries.containsAll(europeCountries));// true

        //Retain Method will delete all other countries

        countries.retainAll(europeCountries);

        System.out.println(countries);

    }
}
