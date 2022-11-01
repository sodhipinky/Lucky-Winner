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
        Random random = new Random();
        int randomIndex = random.nextInt(names.length);
        System.out.println("Lucky Winner for the Question = " + names[randomIndex]);
        JOptionPane.showConfirmDialog(null, "Lucky Winner is: " + names[randomIndex], "Winner", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
        JOptionPane.showInputDialog(null, "Enter your name");
    }
}