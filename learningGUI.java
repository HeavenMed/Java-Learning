import javax.swing.JOptionPane; // a simple gui to use here

public class learningGUI {
    //What is GUI? Graphical User Interface


    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null , "Hello" + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null , "your age is" + age);

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null , "your height is" + altura);
            
        //É importante converter o type do JOptionPane.showInputDialog("") 
        // pq ele vem em formato de string, por isso o integer.parseInt ou Double.parseDouble
        // para converter no type que quisermos

    }
    
}
