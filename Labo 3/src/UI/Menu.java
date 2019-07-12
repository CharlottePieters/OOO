package UI;

import Domain.Artikel;
import Domain.Winkel;

import javax.swing.*;

public class Menu {
    public Winkel winkel;

    public Menu(){
        winkel = new Winkel();
    }

    public void start(){
        String startMenu = "1. Add party item\n";
        startMenu += "2. Remove party item\n";
        startMenu += "3. Rent party item\n";
        startMenu += "4. Return party item\n";
        startMenu += "5. Repair party item\n";
        startMenu += "6. Show available party items\n\n";
        startMenu += "0. Stop\n\n";
        startMenu += "Make your choice:";

        int choice = -1;

        while (choice != 0){
            choice = Integer.parseInt(JOptionPane.showInputDialog(startMenu));

            if (choice == 1){
                addPartyItem();
            }
            else if (choice == 2){
                removePartyItem();
            }
            else if (choice == 3){
                rentPartyItem();
            }
            else if (choice == 4){
                returnPartyItem();
            }
            else if (choice == 5){
                repairPartyItem();
            }
            else if (choice == 6){
                showAvailablePartyItems();
            }
            else {
                throw new IllegalArgumentException("Your choice has to be 0-6");
            }
        }
    }

    private void showAvailablePartyItems(){
        JOptionPane.showMessageDialog(null, this.winkel.artikelString());
    }

    private void repairPartyItem(){
        String naam = JOptionPane.showInputDialog("Which artikel would you like to return?");
        JOptionPane.showMessageDialog(null, this.winkel.repairArtikel(naam));
    }

    private void returnPartyItem(){
        String naam = JOptionPane.showInputDialog("Which artikel would you like to return?");
        String beschadigdString = JOptionPane.showInputDialog("Is the artikel damaged.\n1. Yes\n2.No");
        boolean beschadigd;
        if (beschadigdString.equals("1")){
            beschadigd = true;
        }
        else {
            beschadigd = false;
        }
        JOptionPane.showMessageDialog(null, this.winkel.returnArtikel(naam, beschadigd));
    }

    private void rentPartyItem(){
        String naam = JOptionPane.showInputDialog("Which artikel would you like to rent?");
        JOptionPane.showMessageDialog(null, this.winkel.rentArtikel(naam));
    }

    private void removePartyItem() {
        String naam = JOptionPane.showInputDialog("Which artikel would you like to remove?");
        JOptionPane.showMessageDialog(null, this.winkel.removeArtikel(naam));
    }

    private void addPartyItem() {
        String naam = JOptionPane.showInputDialog("What is the name of the item you would like to add?");
        double prijs = Double.parseDouble(JOptionPane.showInputDialog("What is the price of the item you would like tot add? (Type with '.' for decimal."));
        Artikel artikel = new Artikel(naam, prijs);
        this.winkel.addArtikel(artikel);
        JOptionPane.showMessageDialog(null, "Artikel " + artikel.getNaam() + " has been added to the shop.");
    }
}
