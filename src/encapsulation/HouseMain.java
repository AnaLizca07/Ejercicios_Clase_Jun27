package encapsulation;

import javax.swing.*;

public class HouseMain {
    public static void main(String[] args) {
        House house = new House();

        house.setAddress(JOptionPane.showInputDialog("Enter the address"));
        house.setPrice(Integer.parseInt(JOptionPane.showInputDialog("Enter the price:")));
        house.setNeighborhood(JOptionPane.showInputDialog("Enter the neighborhood: "));
        JOptionPane.showMessageDialog(null,house.getAddress());
        JOptionPane.showMessageDialog(null,house.getPrice());
        JOptionPane.showMessageDialog(null,house.getNeighborhood());
    }
}
