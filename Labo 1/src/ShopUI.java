import javax.swing.*;

public class ShopUI {
        private Shop shop;

        public ShopUI(){
            shop = new Shop();
        }

        public void showMenu(){
            String menu = "1. Add product\n2. Show product\n3. Show rental price\n\n0. Quit";
            int choice = -1;
            while (choice != 0) {
                String choiceString = JOptionPane.showInputDialog(menu);
                choice = Integer.parseInt(choiceString);
                if (choice == 1) {
                    this.addProduct();
                } else if (choice == 2) {
                    this.showProduct();
                } else if (choice == 3) {
                    this.showPrice();
                }
            }
        }

        public void addProduct(){
            String title = JOptionPane.showInputDialog("Enter the title:");
            String id = JOptionPane.showInputDialog("Enter the id:");
            String type = JOptionPane.showInputDialog("Enter the type (M for movie/G for game):");

            shop.addProduct(title, id, type);
        }

        public void showProduct(){
            String id = JOptionPane.showInputDialog("Enter the id:");

            JOptionPane.showMessageDialog(null, shop.getProduct(id).getTitle());
        }

        public void showPrice(){
            String id = JOptionPane.showInputDialog("Enter the id:");
            String daysString = JOptionPane.showInputDialog("Enter the number of days:");

            JOptionPane.showMessageDialog(null, shop.getPrice(id, Integer.parseInt(daysString)));
        }
}
