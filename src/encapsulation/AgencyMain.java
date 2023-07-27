package encapsulation;

import javax.swing.*;

public class AgencyMain {
    public static void main(String[] args) {
        Agency agency = new Agency();
        agency.setAddress(JOptionPane.showInputDialog("Enter the address: "));
        agency.setAgencyName(JOptionPane.showInputDialog("Enter the agency name: "));
        agency.setPrice(Integer.parseInt(JOptionPane.showInputDialog("Enter the price")));
        JOptionPane.showMessageDialog(null,agency.getAgencyName());
        JOptionPane.showMessageDialog(null,agency.getAddress());
        JOptionPane.showMessageDialog(null,agency.getPrice());
    }
}
