package encapsulation;

import javax.swing.*;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.setPlate(JOptionPane.showInputDialog("Enter the car plate"));
        car.setColor(JOptionPane.showInputDialog("Enter the color"));
        car.setModel((Integer.parseInt(JOptionPane.showInputDialog("Enter the model"))));
        JOptionPane.showMessageDialog(null,car.getPlate());
        JOptionPane.showMessageDialog(null,car.getColor());
        JOptionPane.showMessageDialog(null, car.getModel());
    }
}
