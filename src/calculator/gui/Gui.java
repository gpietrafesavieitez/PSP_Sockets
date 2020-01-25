package calculator.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui extends JFrame {

    private JPanel panel;
    private JTextField display;
    private boolean newOperation = false;
    private int firstOperation;

    public Gui() {
        setMinimumSize(new Dimension(350, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.CYAN);
        setVisible(true);
        setResizable(false);
        pack();
    }

    public void init() {
        createFrame();
        createButtons();
    }

    private void createFrame() {
        panel = new JPanel();
        panel.setSize(350, 500);
        panel.setBackground(Color.gray);
        panel.setVisible(true);
        panel.setLayout(null);
        this.add(panel);
        display = new JTextField();
        display.setBounds(0, 50, 335, 100);
        Font displayFont = new Font("Courier", Font.BOLD, 50);
        display.setFont(displayFont);
        panel.add(display);
    }

    private void createButtons() {
        int c = -1;
        for (int x = 0; x < 4; x++) {
            for (int y = 4; y < 8; y++) {
                c++;
                JButton btn = new JButton("0");
                btn.setBounds(x * 85, y * 55, 80, 50);
                Font btnFont = new Font("Courier", Font.BOLD, 20);
                btn.setFont(btnFont);
                switch (c) {
                    case 0:
                        btn.setText(Integer.toString(c));
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                if (newOperation) {
                                    display.setText("");
                                    newOperation = false;
                                }
                                if (display.getText().length() < 10) {
                                    display.setText(display.getText() + "0");
                                }
                            }
                        });
                        break;
                    case 1:
                        btn.setText(Integer.toString(c));
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (newOperation) {
                                    display.setText("");
                                    newOperation = false;
                                }
                                if (display.getText().length() < 10) {
                                    display.setText(display.getText() + "1");
                                }
                            }
                        });
                        break;
                    case 2:
                        btn.setText(Integer.toString(c));
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (newOperation) {
                                    display.setText("");
                                    newOperation = false;
                                }

                                if (display.getText().length() < 10) {
                                    display.setText(display.getText() + "2");
                                }

                            }
                        });
                        break;
                    case 3:
                        btn.setText(Integer.toString(c));
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (newOperation) {
                                    display.setText("");
                                    newOperation = false;
                                }
                                if (display.getText().length() < 10) {
                                    display.setText(display.getText() + "3");
                                }
                            }
                        });
                        break;
                    case 4:
                        btn.setText(Integer.toString(c));
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (newOperation) {
                                    display.setText("");
                                    newOperation = false;
                                }
                                if (display.getText().length() < 10) {
                                    display.setText(display.getText() + "4");
                                }
                            }
                        });
                        break;
                    case 5:
                        btn.setText(Integer.toString(c));
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (newOperation) {
                                    display.setText("");
                                    newOperation = false;
                                }
                                if (display.getText().length() < 10) {
                                    display.setText(display.getText() + "5");
                                }
                            }
                        });
                        break;
                    case 6:
                        btn.setText(Integer.toString(c));
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (newOperation) {
                                    display.setText("");
                                    newOperation = false;
                                }
                                if (display.getText().length() < 10) {
                                    display.setText(display.getText() + "6");
                                }
                            }
                        });
                        break;
                    case 7:
                        btn.setText(Integer.toString(c));
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (newOperation) {
                                    display.setText("");
                                    newOperation = false;
                                }
                                if (display.getText().length() < 10) {
                                    display.setText(display.getText() + "7");
                                }
                            }
                        });
                        break;
                    case 8:
                        btn.setText(Integer.toString(c));
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (newOperation) {
                                    display.setText("");
                                    newOperation = false;
                                }
                                if (display.getText().length() < 10) {
                                    display.setText(display.getText() + "8");
                                }
                            }
                        });
                        break;
                    case 9:
                        btn.setText(Integer.toString(c));
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (newOperation) {
                                    display.setText("");
                                    newOperation = false;
                                }
                                if (display.getText().length() < 10) {
                                    display.setText(display.getText() + "9");
                                }
                            }
                        });
                        break;
                    case 10:
                        btn.setText("+");
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                firstOperation = Integer.parseInt(display.getText());
                                display.setText("");
                            }
                        });
                        break;
                    case 11:
                        btn.setText("-");
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                display.setText("-");
                            }
                        });
                        break;
                    case 12:
                        btn.setText("*");
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                display.setText("*");
                            }
                        });
                        break;
                    case 13:
                        btn.setText("%");
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                display.setText("%");
                            }
                        });
                        break;
                    case 14:
                        btn.setText(".");
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                display.setText(".");
                            }
                        });
                        break;
                    case 15:
                        btn.setText("=");
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                int r = firstOperation + Integer.parseInt(display.getText());
                                display.setText(String.valueOf(r));
                                newOperation = true;
                            }
                        });
                        break;
                }

                panel.add(btn);

            }
        }
    }
}
