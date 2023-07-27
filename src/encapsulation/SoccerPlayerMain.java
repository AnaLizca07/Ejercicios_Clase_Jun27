package encapsulation;

import javax.swing.*;

public class SoccerPlayerMain {
    public static void main(String[] args) {
        SoccerPlayer soccerPlayer = new SoccerPlayer();

        soccerPlayer.setName("Juanito Perez");
        soccerPlayer.setJerseyNumber(7);
        soccerPlayer.setGoalsScored(9);

        JOptionPane.showMessageDialog(null,"Player name:" +soccerPlayer.getName());
        JOptionPane.showMessageDialog(null,"Player jersey number: "+soccerPlayer.getJerseyNumber());
        JOptionPane.showMessageDialog(null,"Player goals Score"+soccerPlayer.getGoalsScored());
    }

}
