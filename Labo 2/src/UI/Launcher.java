package UI;

import Domain.EncryptorApp;

import javax.swing.*;

public class Launcher {
    public static void main(String[] args) {
        EncryptorApp encryptorApp = new EncryptorApp();

        String menu1 = "Would you like to encrypt or decrypt?\n\n";
        menu1 += "\t1. Encrypt\n";
        menu1 += "\t2. Decrypt\n\n";
        menu1 += "\t0. Quit";

        int direction = Integer.parseInt(JOptionPane.showInputDialog(menu1));

        String menu2 = "What algorithm would you like to use?\n\n";
        menu2 += "\t1. Caesar Chipher\n";
        menu2 += "\t2. Mirror\n\n";
        menu2 += "\t0. Quit";

        int encryptor = Integer.parseInt(JOptionPane.showInputDialog(menu2));

        String menu3 = "Please insert your text.\n\n";
        menu3 += "\t0. Quit";

        String text = (JOptionPane.showInputDialog(menu3));




    }
}
