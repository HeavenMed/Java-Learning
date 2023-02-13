import javax.swing.JFrame;
import javax.swing.JLabel; // importando JLabel
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font; 



public class JLabellearning {
    public static void main(String[] args){ 
        //JLabel = a gui display area for a string of text, image or both

        JLabel label = new JLabel();
        label.setText("Hello Bro, do you even code?"); // setando texto
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setFont( new Font("MV Boli" , Font.PLAIN , 20));
        ImageIcon image = new ImageIcon("download.jfif");
        label.setIcon(image);
        label.setIconTextGap(100);// tamanho da distancia do texto. gap
        label.setBackground(Color.black);

        JFrame frame = new JFrame(); // Creates a frame
        frame.setTitle("JFRAME TÍTULO"); // setando o título
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Encerra quando o cliente fecha a janela, pode ter outros módulos
        frame.setSize(420, 420); //sets the x-dimension and y dimension
        frame.setVisible(true);// makes frame visible
        frame.add(label); // add o label criado




    }

}
