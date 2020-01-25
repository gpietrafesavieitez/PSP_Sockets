package calculator.gui;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui{
    private JFrame frame;
    private JPanel panel;
    private JTextField display;
    
    
    public void init(){
        createFrame();
        createButtons();
    }

    public JTextField getDisplay() {
        return display;
    }

    public void setDisplay(JTextField display) {
        this.display = display;
    }


    public void setButtonList(ArrayList<JButton> buttonList) {
        buttonList = buttonList;
    }
    
    private void createFrame(){
        frame = new JFrame();
        frame.setSize(350, 500);
        frame.setDefaultCloseOperation(3);
        frame.setBackground(Color.CYAN);
        frame.setVisible(true);
        frame.setResizable(false);

        panel = new JPanel();
        panel.setSize(350, 500);
        panel.setBackground(Color.gray);
        panel.setVisible(true);
        panel.setLayout(null);
        frame.add(panel);
        
//        display = new JTextField();
//        display.setBounds(0, 50, 350, 100);
//        display.setColumns(15);
//        Font displayFont = new Font("Courier", Font.BOLD,50);
//        display.setFont(displayFont);
//        panel.add(display);
    }
   
    
    private void createButtons(){
        int c = -1;
        for(int x = 0; x < 4; x++){
            for(int y = 4; y < 8; y++){
                c++;
                JButton btn = new JButton("0");
                btn.setBounds(x*85, y*55, 80, 50);
                Font btnFont = new Font("Courier", Font.BOLD,20);
                btn.setFont(btnFont);
                switch(c){
                    case 0: btn.setText(Integer.toString(c)); break;
                    case 1: btn.setText(Integer.toString(c)); break;
                    case 2: btn.setText(Integer.toString(c)); break;
                    case 3: btn.setText(Integer.toString(c)); break;
                    case 4: btn.setText(Integer.toString(c)); break;
                    case 5: btn.setText(Integer.toString(c)); break;
                    case 6: btn.setText(Integer.toString(c)); break;
                    case 7: btn.setText(Integer.toString(c)); break;
                    case 8: btn.setText(Integer.toString(c)); break;
                    case 9: btn.setText(Integer.toString(c)); break;
                    case 10: btn.setText("+"); break;
                    case 11: btn.setText("-"); break;
                    case 12: btn.setText("*"); break;
                    case 13: btn.setText("%"); break;
                    case 14: btn.setText("."); break;
                    case 15: btn.setText("="); break;
                }
                panel.add(btn);
            }
        }
    }
}