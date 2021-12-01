package hu.nive.ujratervezes.kepesitovizsga_pot_potvizsga.numberofdigits;

import static java.lang.Character.isDigit;

public class NumberOfDigits {
    public int getNumberOfDigits(int s) {

        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s; i++) {
            sb.append(i);

        }

        int sum = 0;
        char[] arr = sb;
        for(Character item : arr){
            if(isDigit(item)){
                sum ++;
            }

        }
        return sum;


}

