package com.terenko.cipher;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class Ciphert {
    public static String encryption(String plain, int key) {
        if (key>0) {
        } else return null;
        String sh="abcdefghijklmnopqrstuvwxyz";
        String shL="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        ArrayList<String> shA=new ArrayList<>();
        for (int i=0;i<sh.length();i++){
            shA.add(sh.substring(i,i+1));
        }
        ArrayList<String> shAL=new ArrayList<>();
        for (int i=0;i<shL.length();i++){
            shAL.add(shL.substring(i,i+1));
        }
        ArrayList<String> plainA=new ArrayList<>();
        for (int i=0;i<plain.length();i++){

            plainA.add(plain.substring(i,i+1));
        }
        ArrayList<Integer> kod=new ArrayList<>();
        for (String s:plainA){
            kod.add((key+shA.indexOf(s))%26);
        }
        ArrayList<String> cryptedText=new ArrayList<>();
        for (int i:kod){
            cryptedText.add(shAL.get(i));
        }
        String res="";
        for(String s:cryptedText){
            res=res+s;
        }
        return res;
    }
    public static String dencryption(String plain, int key) {
        if (key>0) {
        } else return null;
        String shL="abcdefghijklmnopqrstuvwxyz";
        String sh="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ArrayList<String> shA=new ArrayList<>();
        for (int i=0;i<sh.length();i++){
            shA.add(sh.substring(i,i+1));
        }
        ArrayList<String> shAL=new ArrayList<>();
        for (int i=0;i<shL.length();i++){
            shAL.add(shL.substring(i,i+1));
        }
        ArrayList<String> plainA=new ArrayList<>();
        for (int i=0;i<plain.length();i++){
            plainA.add(plain.substring(i,i+1));
        }

        ArrayList<Integer> kod=new ArrayList<>();
        for (String s:plainA){
            kod.add((shA.indexOf(s)-key)%26);
        }
        ArrayList<String> cryptedText=new ArrayList<>();
        for (int i:kod){
            cryptedText.add(shAL.get(i));
        }
        String res="";
        for(String s:cryptedText){
            res+=s;
        }
        return res;
    }
}
