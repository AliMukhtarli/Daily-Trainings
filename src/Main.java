import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Sum only positive numbers

        int[] reqemler = {3,56,61,-5656,-75,36,9,-24,58,3,-16,18,-8};
        int cem = 0;
        for (int i = 0; i < reqemler.length; i++) {
            if (reqemler[i] > 0) {
                cem = cem + reqemler[i];
            }
        }
        System.out.println(cem);


        // Remove duplicates from array

        String[] adlar = {"Ali", "Mehemmed", "Husein", "Ali", "Tural", "Kenan", 
        "Maqa", "Mehemmed", "Yusif", "Vezir"};
        ArrayList<String> kopyasizAdlar = new ArrayList<String>();
        for(int i = 0; i < adlar.length; i++) {
            if(!kopyasizAdlar.contains(adlar[i])) {
                kopyasizAdlar.add(adlar[i]);
            }else{
                System.out.println("Bu addan liste daxil edilib");
            }
        }System.out.println(kopyasizAdlar);



        // Finding second largest
        int[] largestNumbers = {23,56,95,23,5,6,562,31,16516,239,85,6566,62546,65664,221899,65331};
        Arrays.sort(largestNumbers);
        int length = largestNumbers.length;
        length = length - 2;
        System.out.println(largestNumbers[length]);

        // Reverse the Array
        int[] array = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int arrayLength = array.length;
        ArrayList<Integer> reverseArray = new ArrayList<Integer>();
        for(int i=arrayLength ; i>=0; i--){
            reverseArray.add(i);
        
        }System.out.println(reverseArray);


        // Count characters 
        String[] salamlama = {"Salam, bu gun men bu cumledeki herflerin sayini tapacam"};
        int k = salamlama[0].replace(" ","").length();
        System.out.println("Cumlenin uzunluqu: " + k);
        

        //Cheking palindrome
        String soz = "ana";
        int sol = 0;
        int sag = soz.length() - 1;

        while( sol < sag){
            if(soz.charAt(sol) != soz.charAt(sag) ){
                System.out.println("Palindrom deyil");
                return;
            }
            sag--;
            sol++;
        }
        System.out.println("Palindromdur");
        System.out.println("Elmire git izah edirem");
        



    }
}
