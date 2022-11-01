package com.niit.jdp;

import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Ajay Sharma", "Anisha Palei", "Ankit Kishore", "Ankit Ambekar",
                "Ankush Singh", "Anuj Chaudhary", "Anusha S", "Ashutosh Das", "Bhagi Baghel",
                "Bhosale Pratik Pratap", "Dinesh Kumar", "Gai Srikanth", "Hanamagouda Goudar",
                "Harshal Urade", "Hemangi Thombre", "Hemosh Indorkar", "Ishu Bhatia",
                "Joycee Alfred Nirmal", "Kaif", "Ketki Keni", "Masoom Vali",
                "Mohd Adnan Parvez Shaikh Mukhtar", "Monica Ragunathan",
                "Mushib Khan", "Naveen Kumar", "Sanket Gongale"};
        System.out.println("There are " + names.length + " names in the list.");
        String luckyWinner = Main.findLuckyWinner(names);
        JOptionPane.showMessageDialog(null, "The Lucky Winner is " + luckyWinner);
    }

    public static String findLuckyWinner(String[] names) {
        String luckyWinner = "";
        Random random = new Random();
        int randomIndex = random.nextInt(names.length);
        luckyWinner = names[randomIndex];
        return luckyWinner;
    }
}