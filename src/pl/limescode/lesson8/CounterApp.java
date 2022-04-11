package pl.limescode.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {

    private Integer counter = 0;

    public CounterApp() {
        setTitle("Counter App");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 300, 240);
        getContentPane().setLayout(new GridLayout(0, 2));
        Font font = new Font("Arial", Font.BOLD, 30);

        JLabel counterView = new JLabel(counter.toString());
        counterView.setHorizontalAlignment(SwingConstants.CENTER);
        counterView.setFont(font);
        add(counterView);

        JButton resetButton = new JButton("Reset");
        add(resetButton);

        JButton decrementButton = new JButton("<");
        add(decrementButton);

        JButton incrementButton = new JButton(">");
        add(incrementButton);

        JButton decrementByTenButton = new JButton("< by 10");
        add(decrementByTenButton);

        JButton incrementByTenButton = new JButton("> by 10");
        add(incrementByTenButton);

        ActionListener actionListener = e -> {
            if (e.getSource() == incrementButton) {
                counter++;
            } else if (e.getSource() == decrementButton) {
                counter--;
            } else if (e.getSource() == incrementByTenButton) {
                counter += 10;
            } else if (e.getSource() == decrementByTenButton) {
                counter -= 10;
            } else if (e.getSource() == resetButton) {
                counter = 0;
            }
            refreshCounterView(counterView);
        };
        decrementButton.addActionListener(actionListener);
        incrementButton.addActionListener(actionListener);
        decrementByTenButton.addActionListener(actionListener);
        incrementByTenButton.addActionListener(actionListener);
        resetButton.addActionListener(actionListener);
        setVisible(true);
    }

    private void refreshCounterView(JLabel counterView) {
        counterView.setText(counter.toString());
    }

    public static void main(String[] args) {
        new CounterApp();
    }
}
