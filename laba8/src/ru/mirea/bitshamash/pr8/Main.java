package ru.mirea.bitshamash.pr8;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            FileWriter file = new FileWriter("/Users/Nuka-Cola/IdeaProjects/laba8/src/ru/mirea/bitshamash/pr8/note.txt");
            String text = "Мама мыла раму, раму мыла Мама";
            file.write(text);
            file.append('\n');
            file.append('E');
            file.flush();


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try{
            FileReader reader = new FileReader("/Users/Nuka-Cola/IdeaProjects/laba8/src/ru/mirea/bitshamash/pr8/note.txt");
            int c;
            while((c=reader.read())!=-1){
                System.out.println((char)c);
            }
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}