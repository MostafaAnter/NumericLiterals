package com.company;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

	    //#this Feature let you put underscore to separate parts of number
        // compiler ignore this underscores
        int numberOfOlives = 1_000_000_000;
        NumberFormat format = NumberFormat.getInstance();

        System.out.println(format.format(numberOfOlives));
    }
}
