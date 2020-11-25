package grafikus_felulet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ablak extends JFrame implements ActionListener {
    JPanel panel;
    JButton btn0;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn8;
    JButton btn9;
    JButton btn7;
    JButton btnsum;
    JButton btnMinus;
    JButton btnDiv;
    JButton btnMult;
    JButton btnResult;

    JLabel eredmenyek;
    int szam1 = 0;
    int szam2 = 0;
    public Ablak(){
        init();
    }
    private void init(){
        this.setTitle("Számológép");
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel=(JPanel)(this.getContentPane());
        this.panel.setBackground(new Color(100,200,100));
        this.setLayout(null);

        btn7 = new JButton("7");
        btn7.setBounds(10,200,50,50);
        panel.add(btn7);


        btn8 = new JButton("8");
        btn8.setBounds(60,200,50,50);
        panel.add(btn8);


        btn9 = new JButton("9");
        btn9.setBounds(110,200,50,50);
        panel.add(btn9);


        btn4 = new JButton("4");
        btn4.setBounds(10,250,50,50);
        panel.add(btn4);


        btn5 = new JButton("5");
        btn5.setBounds(60,250,50,50);
        panel.add(btn5);


        btn6 = new JButton("6");
        btn6.setBounds(110,250,50,50);
        panel.add(btn6);


        btn1 = new JButton("1");
        btn1.setBounds(10,300,50,50);
        panel.add(btn1);


        btn2 = new JButton("2");
        btn2.setBounds(60,300,50,50);
        panel.add(btn2);


        btn3 = new JButton("3");
        btn3.setBounds(110,300,50,50);
        panel.add(btn3);


        btn0 = new JButton("0");
        btn0.setBounds(10,350,150,50);
        panel.add(btn0);


        btnMult = new JButton("x");
        btnMult.setBounds(170,200,50,50);
        panel.add(btnMult);

        btnMinus = new JButton("-");
        btnMinus.setBounds(170,250,50,50);
        panel.add(btnMinus);

        btnDiv = new JButton("÷");
        btnDiv.setBounds(170,300,50,50);
        panel.add(btnDiv);

        btnsum = new JButton("+");
        btnsum.setBounds(170,350,50,50);
        panel.add(btnsum);

        btnResult = new JButton("=");
        btnResult.setBounds(10,400,210,50);
        panel.add(btnResult);

        eredmenyek = new JLabel("");
        eredmenyek.setBounds(10,10,300,50);
        panel.add(eredmenyek);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (btnDiv.getModel().isPressed() || btnMinus.getModel().isPressed() || btnMult.getModel().isPressed() || btnsum.getModel().isPressed()){
                    szam2+=9;
                    eredmenyek.setText(String.valueOf(szam2));
                    eredmenyek.setText("sza");

                }else {
                    szam1+=9;
                    eredmenyek.setText(String.valueOf(szam1));
                }
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (btnDiv.getModel().isPressed() || btnMinus.getModel().isPressed() || btnMult.getModel().isPressed() || btnsum.getModel().isPressed()){
                    szam2+=8;
                    eredmenyek.setText(String.valueOf(szam2));
                    eredmenyek.setText("sza");

                }else {
                    szam1+=8;
                    eredmenyek.setText(String.valueOf(szam1));
                }
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (btnDiv.getModel().isPressed() || btnMinus.getModel().isPressed() || btnMult.getModel().isPressed() || btnsum.getModel().isPressed()){
                    szam2+=7;
                    eredmenyek.setText(String.valueOf(szam2));
                    eredmenyek.setText("sza");

                }else {
                    szam1+=7;
                    eredmenyek.setText(String.valueOf(szam1));
                }
            }
        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (btnDiv.getModel().isPressed() || btnMinus.getModel().isPressed() || btnMult.getModel().isPressed() || btnsum.getModel().isPressed()){
                    szam2+=6;
                    eredmenyek.setText(String.valueOf(szam2));
                    eredmenyek.setText("sza");

                }else {
                    szam1+=6;
                    eredmenyek.setText(String.valueOf(szam1));
                }
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (btnDiv.getModel().isPressed() || btnMinus.getModel().isPressed() || btnMult.getModel().isPressed() || btnsum.getModel().isPressed()){
                    szam2+=5;
                    eredmenyek.setText(String.valueOf(szam2));
                    eredmenyek.setText("sza");

                }else {
                    szam1+=5;
                    eredmenyek.setText(String.valueOf(szam1));
                }
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (btnDiv.getModel().isPressed() || btnMinus.getModel().isPressed() || btnMult.getModel().isPressed() || btnsum.getModel().isPressed()){
                    szam2+=4;
                    eredmenyek.setText(String.valueOf(szam2));
                    eredmenyek.setText("sza");

                }else {
                    szam1+=4;
                    eredmenyek.setText(String.valueOf(szam1));
                }
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (btnDiv.getModel().isPressed() || btnMinus.getModel().isPressed() || btnMult.getModel().isPressed() || btnsum.getModel().isPressed()){
                    szam2+=3;
                    eredmenyek.setText(String.valueOf(szam2));
                    eredmenyek.setText("sza");

                }else {
                    szam1+=3;
                    eredmenyek.setText(String.valueOf(szam1));
                }
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (btnDiv.getModel().isPressed() || btnMinus.getModel().isPressed() || btnMult.getModel().isPressed() || btnsum.getModel().isPressed()){
                    szam2+=2;
                    eredmenyek.setText(String.valueOf(szam2));
                    eredmenyek.setText("sza");

                }else {
                    szam1+=2;
                    eredmenyek.setText(String.valueOf(szam1));
                }
            }
        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (btnDiv.getModel().isPressed() || btnMinus.getModel().isPressed() || btnMult.getModel().isPressed() || btnsum.getModel().isPressed()){
                    szam2+=1;
                    eredmenyek.setText(String.valueOf(szam2));
                    eredmenyek.setText("sza");

                }else {
                    szam1+=1;
                    eredmenyek.setText(String.valueOf(szam1));
                }
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int presssum = 1;
                    while (btnDiv.getModel().isPressed() || btnMinus.getModel().isPressed() || btnMult.getModel().isPressed() || btnsum.getModel().isPressed()) {
                        szam1 += 0;
                        eredmenyek.setText(String.valueOf(szam1 * 10));


                    }


            }
        });

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
