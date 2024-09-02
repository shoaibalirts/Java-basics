import javax.swing.*;
class InputOutputTest {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number: ");
        int number = Integer.parseInt(input);
        int square = number*number;
        System.out.println(square);
        JOptionPane.showMessageDialog(null,"Square:"+ square);
        System.exit(0);
    }
}