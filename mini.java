package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class mini extends JFrame implements ActionListener {
    String pin;
    JButton button;

    mini(String pin) {
        this.pin = pin;

        getContentPane().setBackground(new Color(255,204,204));
        setSize(400,600);
        setLocation(20,20);
        setLayout(null);

        JLabel lab1 = new JLabel();
        lab1.setBounds(20,140,400,200);
        add(lab1);

        JLabel lab2 = new JLabel("e-Statement");
        lab2.setFont(new Font("System",Font.BOLD,15));
        lab2.setBounds(150,20,200,20);
        add(lab2);

        JLabel lab3 = new JLabel();
        lab3.setBounds(20,80,300,20);
        add(lab3);

        JLabel lab4 = new JLabel();
        lab4.setBounds(20,400,300,20);
        add(lab4);

        try {
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '"+pin+"'");
            while (resultSet.next()){
                lab3.setText("Card Number: "+resultSet.getString("card_number").substring(0,4) + "XXXXXXXX" + resultSet.getString("card_number").substring(12));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            int balance = 0;
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while (resultSet.next()){
                lab1.setText(lab1.getText() + "<html>" + resultSet.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+ "<br><br><html>");


                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt((resultSet.getString("amount")));
                }
            }
            lab4.setText("Your Total Balance is Rs. "+ balance);
        }catch (Exception e){
            e.printStackTrace();
        }

        button = new JButton("Exit");
        button.setBounds(20,500,100,25);
        button.addActionListener(this);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        add(button);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new mini("");
    }
}
