package encapsulation;

import javax.swing.*;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName(JOptionPane.showInputDialog("Enter the name"));
        //get(obtener) y set(cargar)
        System.out.println(person.getName());
        person.setAge(Integer.parseInt(JOptionPane.showInputDialog("Enter the age")));
        System.out.println(person.getAge());

        Person person2 = new Person();
        person2.setName(JOptionPane.showInputDialog("Enter the second name"));
        System.out.println(person2.getName());
    }
}
