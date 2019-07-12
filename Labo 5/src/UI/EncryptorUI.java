package UI;

import Domain.*;

import javax.swing.*;

public class EncryptorUI {
    private String text;
    private Encryptor encryptor;

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
                menu2 += "\t2. Mirror\n";
                menu2 += "\t3. Random Cypher";

                int encryptorNum = Integer.parseInt(JOptionPane.showInputDialog(menu2));

                AlgorithmFactory factory = new AlgorithmFactory();
                Algorithm algorithm = null;

                if (encryptorNum == 1){
                    algorithm = Algorithm.CEASAR;
                }
                else if (encryptorNum == 2){
                    algorithm = Algorithm.MIRROR;
                }
                else if (encryptorNum == 3){
                    algorithm = Algorithm.RANDOMCYPHER;
                }

                this.encryptor = factory.createEncryptor(algorithm);

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

    public void encrypt() {
        String res = encryptor.encrypt(this.text);
        JOptionPane.showMessageDialog(null, res);
    }

    public void decrypt() {
        String res = encryptor.decrypt(this.text);
        JOptionPane.showMessageDialog(null, res);
    }

}