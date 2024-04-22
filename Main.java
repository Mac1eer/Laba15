package com.company;
import java.util.Scanner;
import java.util.regex.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner input = new Scanner(System.in);
        String STR = input.nextLine();
        String ipv6 = "([0-9a-fA-F]{1,4}:){7}([0-9a-fA-F]{1,4}|:)|" +
                "([0-9a-fA-F]{1,4}:){1,7}:|" +
                "([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|" +
                "([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}:){1,2}|" +
                "([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}:){1,3}|" +
                "([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}:){1,4}|" +
                "([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}:){1,5}|" +
                "[0-9a-fA-F]{1,4}:(:[0-9a-fA-F]{1,4}){1,6}|" +
                ":((:[0-9a-fA-F]{1,4}){1,7}|:)";
        String ipv4 = "(25[0-5].|2[0-4][0-9].|1[0-9]{2}.|[0-9]{2}.|[0-9].){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{2}|[0-9])";
        Pattern pattern_iv6 = Pattern.compile(ipv6);
        Pattern pattern_iv4 = Pattern.compile(ipv4);
        Matcher matcher6 = pattern_iv6.matcher(STR);
        Matcher matcher4 = pattern_iv4.matcher(STR);
        try(FileWriter file = new FileWriter("C:\\Users\\12\\IdeaProjects\\input.txt")){
            while (matcher4.find()){
                file.write(matcher4.group());
            }
            while (matcher6.find()){
                file.write(matcher6.group());
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
