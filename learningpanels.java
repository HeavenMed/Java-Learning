import javax.swing.JFrame;
import javax.swing.JLabel; // importando JLabel
import javax.swing.JPanel; // 
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font; 

public class learningpanels {
    public static void main(String[] args){  

        //JPanel = a GUI component that functions as a container to hold other components
        ImageIcon icon = new ImageIcon("download.jfif");


        JLabel label = new JLabel();
        label.setText("Hi emojo");
        label.setIcon(icon);



        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0 , 0 , 250 , 250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250 , 0 , 250 , 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0 , 250 , 500 , 250);



        JFrame frame = new JFrame(); // Creates a frame
            frame.setTitle("JFRAME TÍTULO"); // setando o título
            frame.setLayout(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Encerra quando o cliente fecha a janela, pode ter outros módulos
            frame.setSize(750, 750); //sets the x-dimension and y dimension
            frame.setVisible(true);// makes frame visible
        
        frame.add(redPanel);
        redPanel.add(label);

        frame.add(bluePanel);
        frame.add(greenPanel);








    }
}
