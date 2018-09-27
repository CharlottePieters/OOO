import javax.swing.*;

public class UI {
    public static void main(String[] args) {
        Shop shop = new Shop();

        String menu = "1. Add product\n2. Show product\n3. Show rental price\n\n0. Quit";
        int choice = -1;
        while (choice != 0) {
            String choiceString = JOptionPane.showInputDialog(menu);
            choice = Integer.parseInt(choiceString);
            if (choice == 1) {
                this.addProduct(shop);
            } else if (choice == 2) {
                this.showProduct(shop);
            } else if (choice == 3){
                this.showPrice(shop);
            }
        }

        public static void addProduct(Shop shop) {
            String title = JOptionPane.showInputDialog("Enter the title:");
            String id = JOptionPane.showInputDialog("Enter the id:");
            String type = JOptionPane.showInputDialog("Enter the type (M for movie/G for game):");

            shop.addProduct(title, id, type);
        }

        public void showProduct(Shop shop){
            String id = JOptionPane.showInputDialog("Enter the id:");

            JOptionPane.showMessageDialog(null, shop.showProduct(id).getTitle());
        }

        public void showPrice(Shop shop){
            String id = JOptionPane.showInputDialog("Enter the id:");
            String daysString = JOptionPane.showInputDialog("Enter the number of days:");

            JOptionPane.showMessageDialog(null, shop.showPrice(id, daysString);

        }
}
