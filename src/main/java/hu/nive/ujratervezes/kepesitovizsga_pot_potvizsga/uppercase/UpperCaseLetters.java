package hu.nive.ujratervezes.kepesitovizsga_pot_potvizsga.uppercase;

import java.nio.file.Path;

public class UpperCaseLetters {
    public int getNumberOfUpperCase(Path of) {

        String str;
        char ch;

        int uppercase=0;
        for(int i=0; i < str.length();i++)
        {
            ch = str.charAt(i);

                uppercase++;

            return uppercase;
        }

}
