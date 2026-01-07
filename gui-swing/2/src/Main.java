/*
What is java swing










 */

import javax.swing.*;    //import swing
import java.awt.event.*; //import events

public class Main{
    public static void main(String[] args){
        System.out.println("Hello, World!");

        //JFrame

        JFrame f1=new JFrame("frame1");    //create frame object
        f1.setSize(400,300);                 //create frame size

        f1.setLayout(null);                  //4 default layout disable


        //JLabel & JTextField & JButton

        JLabel l1=new JLabel("number 01");                  //1 create a label   //label
        l1.setBounds(40,30,80,20);                         //3 position and size     (from left,from top,width,height)
        f1.add(l1);                                         //2 add label to frame

        
        JTextField t1=new JTextField();                                         //text filed
        t1.setBounds(150,30,80,20);
        f1.add(t1);

        JLabel l2=new JLabel("number 02:");
        l2.setBounds(40,100,80,20);
        f1.add(l2);

        JTextField t2=new JTextField();
        t2.setBounds(150,100,80,20);
        f1.add(t2);

        JButton b1=new JButton();                                           //button
        b1.setText("sum");
        b1.setBounds(200,130,60,20);
        f1.add(b1);


        
        //action

        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //what to do
                String num1=t1.getText();
                String num2=t2.getText();

                l1.setText(num1+num2);

            }
        });




        
        f1.setVisible(true);                 //frame visibility turned on

    }
}