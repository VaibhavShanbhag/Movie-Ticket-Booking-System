package Movie_Ticket_Booking_System;

import javax.swing.*;
import java.awt.*;

public class HomePage {
    JFrame homePage;
    JLabel homePageImage = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Homepage image.jpg"));
    JProgressBar progressBar = new JProgressBar();
    JLabel rightMessageLoader=new JLabel();
    JLabel leftMessageLoader=new JLabel();

    public HomePage()
    {
        createGUI();
        addImage();
        addProgressbar();
        addLeftLoader();
        addRightLoader();
        addRunningPBar();
    }
    public void createGUI(){

        homePage =new JFrame();
        homePage.getContentPane().setLayout(null);
        homePage.setUndecorated(true);
        homePage.setSize(800,500);
        homePage.setLocationRelativeTo(null);
        homePage.getContentPane().setBackground(Color.magenta.brighter());
        homePage.setVisible(true);

    }
    public void addImage(){
        homePageImage.setSize(800,500);
        homePage.add(homePageImage);
    }

    public void addProgressbar()
    {
        progressBar.setBounds(10,467,780,20);
        progressBar.setBackground(Color.white);
        progressBar.setForeground(Color.ORANGE);
        progressBar.setBorderPainted(true);
        homePage.add(progressBar);
    }

    public void addLeftLoader()
    {
        leftMessageLoader.setBounds(10,445,250,20);
        leftMessageLoader.setFont(new Font("Sans Serif", Font.BOLD,15));
        leftMessageLoader.setForeground(Color.white);
        leftMessageLoader.setText("Loading......!");
        homePage.add(leftMessageLoader);
    }

    public void addRightLoader()
    {
        rightMessageLoader.setBounds(760,445,50,20);
        rightMessageLoader.setFont(new Font("Sans Serif", Font.BOLD,15));
        rightMessageLoader.setForeground(Color.white);
        rightMessageLoader.setText("0%");
        homePage.add(rightMessageLoader);
    }

    public void addRunningPBar()
    {
        int i=0;
        while( i<=100)
        {
            try{
                Thread.sleep(150);
                progressBar.setValue(i);
                rightMessageLoader.setText(i + "%");

                if (i == 30)
                {
                    leftMessageLoader.setText("Loading package files....!");
                }

                if (i == 55)
                {
                    leftMessageLoader.setText("Loading class modules....!");
                }

                if(i == 75)
                {
                    leftMessageLoader.setText("Loading other dependencies....!");
                }

                if (i == 90)
                {
                    leftMessageLoader.setText("Done......!");
                }
                if(i==100)
                {
                    Thread.sleep(400);
                    homePage.dispose();
                }

                i++;
            }catch(Exception e){
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args){

        new HomePage();
        new LoginPage();

    }
}
