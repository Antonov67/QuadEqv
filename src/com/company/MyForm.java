package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyForm extends JFrame {
    private JPanel rootPanel;
    private JTextField c;
    private JTextField b;
    private JTextField a;
    private JButton button;
    private JLabel label;
    private QuadEqv quadEqv;

    //конструктор
    public MyForm(){
        setTitle("Решение квадратного уравнения");
        setBounds(300,300,300,300);
        setContentPane(rootPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double aa, bb, cc;
                aa = Double.parseDouble(a.getText());
                bb = Double.parseDouble(b.getText());
                cc = Double.parseDouble(c.getText());
                quadEqv = new QuadEqv(aa, bb, cc);
                label.setText(quadEqv.getRoots());
            }
        });
    }
}
