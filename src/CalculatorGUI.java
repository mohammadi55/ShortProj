import javax.swing.*;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;


public class CalculatorGUI extends JFrame implements ActionListener, KeyListener {

    private JPanel mainPanel;
    private JButton Calculate;
    private JTextArea enterANumberTextArea;
    private JButton sinButton;
    private JButton cosButton;
    private JButton tanButton;
    private JButton pwButton;
    private JButton Clear;
    private JButton logButton;
    private JButton lnButton;
    private JButton Bracket;
    private JButton e;
    private JButton Pi;
    private JButton RootButton;
    private JButton subtractButton;
    private JButton addButton;
    private JButton divideButton;
    private JButton xButton;
    private JButton remainderButton;
    private JButton a9Button;
    private JButton a7Button;
    private JButton a5Button;
    private JButton a3Button;
    private JButton a1Button;
    private JButton a8Button;
    private JButton a6Button;
    private JButton a4Button;
    private JButton a2Button;
    private JButton a0Button;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;

    public CalculatorGUI() {
        createUIComponents();
    }

    private void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("Calculator");
        setSize(300,400);
        setLocation(450,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        // TODO: place custom component creation code here
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
