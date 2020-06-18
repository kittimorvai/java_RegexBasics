package mypackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

//=============================================================================
//        String challenge1 = "This is a dog.";
//        System.out.println(challenge1.matches("This is a sentence."));
//=============================================================================


//=============================================================================
//        String challenge2 = "This is a cat.";
//        String regEx1 = "This is a \\w+.";
//        System.out.println(challenge1.matches(regEx1));
//        System.out.println(challenge2.matches(regEx1));
//
//
//        String regEx2 = "This is a (dog|cat).";
//        System.out.println(challenge1.matches(regEx2));
//        System.out.println(challenge2.matches(regEx2));
//
//        Pattern challenge1Pattern = Pattern.compile(challenge1);
//        Pattern challenge2Pattern = Pattern.compile(challenge2);
//        Matcher c1Matches = challenge1Pattern.matcher(regEx1);
//        Matcher c2Matches = challenge2Pattern.matcher(regEx1);
//=============================================================================


//=============================================================================
//        String challenge4 = "Replace all blanks with underscores";
//        System.out.println(challenge4.replaceAll("\\s", "_"));
//=============================================================================


//=============================================================================
//        String challenge5 = "aaabccccccccdddefffg";
//        System.out.println(challenge5.matches("[a-g]+"));
//        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g"));
//=============================================================================


//=============================================================================
//        String challenge7 = "abc5d.135";
//        String regEx7 = "^([a-z]{4})(.{1})([0-9]{3})";
//        System.out.println(challenge7.matches(regEx7));
//=============================================================================


//=============================================================================
//        String challenge8 = "abcd.135uvqz.7tzik.999";
//        Pattern challenge8Pattern = Pattern.compile("[A-Za-z]+\\.(\\d+)");
//        Matcher c8Match = challenge8Pattern.matcher(challenge8);
//        while(c8Match.find()){
//            System.out.println("Occurrence: " + c8Match.group(1));
//        }
//=============================================================================


//=============================================================================
//        String challenge9 = "abcd.135\tuvqz.7\tzik.999\n";
//        Pattern challenge9Pattern = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
//        Matcher c9Match = challenge9Pattern.matcher(challenge9);
//        while(c9Match.find()){
//            System.out.println("Occurrence: " + c9Match.group(1));
//        }
//=============================================================================


//=============================================================================
//        String challenge10 = "abcd.135\tuvqz.7\tzik.999\n";
//        Pattern challenge10Pattern = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
//        Matcher c10Match = challenge10Pattern.matcher(challenge10);
//        c10Match.reset();
//        int count = 0;
//        while(c10Match.find()){
//            count++;
//            System.out.println("Occurrence " + count + " : " + c10Match.start(1) + "-" + (c10Match.end(1)-1));
//        }
//=============================================================================


    }
}
