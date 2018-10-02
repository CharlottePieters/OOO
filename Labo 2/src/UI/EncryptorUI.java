package UI;

import Domain.Ceasar;
import Domain.Encryptor;
import Domain.Mirror;

import javax.swing.*;

public class EncryptorUI {
    private String text;
    private Encryptor encryptor;

    public EncryptorUI(String text, Encryptor encryptor){
        this.text = text;
        this.encryptor = encryptor;
    }

    public EncryptorUI(String text){
        this.text = text;
        this.encryptor = new Mirror();
    }

    public EncryptorUI(){
        this.text = "test";
        this.encryptor = new Mirror();
    }

    public void menu() {
        int direction = 3;
        while (direction != 0) {
            String menu1 = "Would you like to encrypt or decrypt?\n\n";
            menu1 += "\t1. Encrypt\n";
            menu1 += "\t2. Decrypt\n\n";
            menu1 += "\t0. Quit.";

            direction = Integer.parseInt(JOptionPane.showInputDialog(menu1));

            if (direction != 0){

                String menu2 = "What algorithm would you like to use?\n\n";
                menu2 += "\t1. Caesar Chipher\n";
                menu2 += "\t2. Mirror";

                int encryptorNum = Integer.parseInt(JOptionPane.showInputDialog(menu2));

                if (encryptorNum == 1) {
                    int key = Integer.parseInt(JOptionPane.showInputDialog("What key would you like to use?"));
                    this.encryptor = new Ceasar(key);
                } else if (encryptorNum == 2) {
                    this.encryptor = new Mirror();
                }

                String menu3 = "Please insert your text.";

                this.text = (JOptionPane.showInputDialog(menu3));

                if (direction == 1) {
                    this.encrypt();
                }
                else if (direction == 2) {
                    this.decrypt();
                }
            }
        }
    }

    public void changeEncryptor(Encryptor encryptor){
        this.encryptor = encryptor;
    }

    public void encrypt() {
        String res = encryptor.encrypt(this.text);
        JOptionPane.showMessageDialog(null, res);
    }

    public void decrypt() {
        String res = encryptor.decrypt(this.text);
        JOptionPane.showMessageDialog(null, res);
    }

}