package Interpret;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;

public class GUI {

    private JFrame frame;
    private JTextField Input;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUI window = new GUI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public GUI() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 535, 390);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setTitle("Oblivion");

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBackground(Color.BLACK);
        scrollPane.setAutoscrolls(true);
        scrollPane.setBounds(0, 0, 535, 338);
        frame.getContentPane().add(scrollPane);

        final JTextArea Output = new JTextArea();
        Output.setFont(new Font("Ayuthaya", Font.PLAIN, 12));
        Output.setForeground(Color.CYAN);
        Output.setBackground(Color.BLACK);
        scrollPane.setViewportView(Output);
        Output.setEditable(false);

        Input = new JTextField();
        Input.setText(">>> ");
        Input.setFont(new Font("Ayuthaya", Font.PLAIN, 12));
        Input.setForeground(Color.CYAN);
        Input.setBackground(Color.BLACK);
        Input.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String f = Input.getText() +"\n";
                    Output.append(f);
                    Input.setText(">>> ");
                }
            }
        });
        Input.setBounds(0, 334, 535, 34);
        frame.getContentPane().add(Input);
        Input.setColumns(10);





    }
}
