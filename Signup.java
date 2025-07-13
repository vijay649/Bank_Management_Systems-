package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JRadioButton r1,r2,m1,m2,m3;
    JButton next;

    JTextField textName ,textFname, textEmail, textadd, textstate, textcity, textpin ;
    JDateChooser dateChooser;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) +1000L;
    String first = " " + Math.abs(first4);

    Signup(){
        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("Application From No." + first);
        label1.setBounds(130,20,600,40);
        label1.setFont(new Font("Raleway", Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Detail's");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name : ");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,240,400,30);
        add(textFname);

        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel labelg = new JLabel("Gender");
        labelg.setFont(new Font("Raleway",Font.BOLD,20));
        labelg.setBounds(100,290,200,30);
        add(labelg);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email Address : ");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelMs = new JLabel("Martial Status : ");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setBounds(300,440,200,30);
        m1.setBackground(new Color(222,255,228));
        m1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBounds(450,440,200,30);
        m2.setBackground(new Color(222,255,228));
        m2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m2);

        m3 = new JRadioButton("Other's");
        m3.setBounds(635,440,200,30);
        m3.setBackground(new Color(222,255,228));
        m3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m3);

        ButtonGroup buttonGroups = new ButtonGroup();
        buttonGroups.add(m1);
        buttonGroups.add(m2);
        buttonGroups.add(m3);

        JLabel labeladd = new JLabel("Address : ");
        labeladd.setFont(new Font("Raleway",Font.BOLD,20));
        labeladd.setBounds(100,490,200,30);
        add(labeladd);

        textadd = new JTextField();
        textadd.setFont(new Font("Raleway",Font.BOLD,14));
        textadd.setBounds(300,490,400,30);
        add(textadd);

        JLabel labelCity = new JLabel("City : ");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textcity = new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD,14));
        textcity.setBounds(300,540,400,30);
        add(textcity);

        JLabel labelpin = new JLabel("Pin Code : ");
        labelpin.setFont(new Font("Raleway",Font.BOLD,20));
        labelpin.setBounds(100,590,200,30);
        add(labelpin);

        textpin = new JTextField();
        textpin.setFont(new Font("Raleway",Font.BOLD,14));
        textpin.setBounds(300,590,400,30);
        add(textpin);

        JLabel labelState = new JLabel("State : ");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textstate = new JTextField();
        textstate.setFont(new Font("Raleway",Font.BOLD,14));
        textstate.setBounds(300,640,400,30);
        add(textstate);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(900,800);
        setLocation(360,40);
//        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        String email = textEmail.getText();

        String martial = null;
        if (m1.isSelected()){
            martial = "Married";
        } else if (m2.isSelected()) {
            martial = "Unmaried";
        } else if (m3.isSelected()) {
            martial = "Other";
        }
        String address = textadd.getText();
        String city = textcity.getText();
        String pincode = textpin.getText();
        String state = textstate.getText();

        try{
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Con con1 = new Con();
                String v = "insert into Signupp values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+martial+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"')";
                con1.statement.executeUpdate(v);
                new Signup2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Signup();
    }
}
