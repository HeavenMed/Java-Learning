import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color; 


public class JFrameLearning {

    public static void main(String[] args){
        //JFrame = a GUI window to add components

        JFrame frame = new JFrame(); // Creates a frame
        frame.setTitle("JFRAME TÍTULO"); // setando o título
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Encerra quando o cliente fecha a janela, pode ter outros módulos
        frame.setResizable(false);//Pode ser True = o cliente pode alterar o tamanho, e falso: tamanho bixo
        frame.setSize(420, 420); //sets the x-dimension and y dimension
        frame.setVisible(true);// makes frame visible

        ImageIcon image = new ImageIcon("nomedoarquivo.png"); // Create a image icon para ser usado
        frame.setIconImage(image.getImage()); // muda o ícone do Frame
        frame.getContentPane().setBackground(Color.green);

    }
    
}
