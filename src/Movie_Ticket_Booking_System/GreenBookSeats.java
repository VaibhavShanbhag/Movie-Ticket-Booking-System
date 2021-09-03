package Movie_Ticket_Booking_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GreenBookSeats extends MouseAdapter {
    JFrame greenBookSeat;
    JPanel centrePanel;
    JLabel userIcon = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\profile-user.png"));
    JLabel logo = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Theatrelogo1.png"));
    JLabel exitCross = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\letter-x.png"));
    JLabel someText = new JLabel("Select Seat");
    JLabel backImage = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\left-arrow.png"));
    JLabel bookedImageText = new JLabel("Booked:");
    JLabel bookedImage = new JLabel("40",SwingConstants.CENTER);
    JLabel availableImage = new JLabel("40",SwingConstants.CENTER);
    JLabel availableImageText = new JLabel("Available:");
    JLabel seatsPriceText = new JLabel("Each Booked Seat Price:");
    JLabel price = new JLabel("250 INR");

    JLabel seatNo1 = new JLabel("1",SwingConstants.CENTER);
    JLabel seatNo2 = new JLabel("2",SwingConstants.CENTER);
    JLabel seatNo3 = new JLabel("3",SwingConstants.CENTER);
    JLabel seatNo4 = new JLabel("4",SwingConstants.CENTER);
    JLabel seatNo5 = new JLabel("5",SwingConstants.CENTER);
    JLabel seatNo6 = new JLabel("6",SwingConstants.CENTER);
    JLabel seatNo7 = new JLabel("7",SwingConstants.CENTER);
    JLabel seatNo8 = new JLabel("8",SwingConstants.CENTER);
    JLabel seatNo9 = new JLabel("9",SwingConstants.CENTER);
    JLabel seatNo10 = new JLabel("10",SwingConstants.CENTER);
    JLabel seatNo11 = new JLabel("11",SwingConstants.CENTER);
    JLabel seatNo12 = new JLabel("12",SwingConstants.CENTER);
    JLabel seatNo13 = new JLabel("13",SwingConstants.CENTER);
    JLabel seatNo14 = new JLabel("14",SwingConstants.CENTER);
    JLabel seatNo15 = new JLabel("15",SwingConstants.CENTER);
    JLabel seatNo16 = new JLabel("16",SwingConstants.CENTER);
    JLabel seatNo17 = new JLabel("17",SwingConstants.CENTER);
    JLabel seatNo18 = new JLabel("18",SwingConstants.CENTER);
    JLabel seatNo19 = new JLabel("19",SwingConstants.CENTER);
    JLabel seatNo20 = new JLabel("20",SwingConstants.CENTER);
    JLabel seatNo21 = new JLabel("21",SwingConstants.CENTER);
    JLabel seatNo22 = new JLabel("22",SwingConstants.CENTER);
    JLabel seatNo23 = new JLabel("23",SwingConstants.CENTER);
    JLabel seatNo24 = new JLabel("24",SwingConstants.CENTER);
    JLabel seatNo25 = new JLabel("25",SwingConstants.CENTER);
    JLabel seatNo26 = new JLabel("26",SwingConstants.CENTER);
    JLabel seatNo27 = new JLabel("27",SwingConstants.CENTER);
    JLabel seatNo28 = new JLabel("28",SwingConstants.CENTER);
    JLabel seatNo29 = new JLabel("29",SwingConstants.CENTER);
    JLabel seatNo30 = new JLabel("30",SwingConstants.CENTER);
    JLabel seatNo31 = new JLabel("31",SwingConstants.CENTER);
    JLabel seatNo32 = new JLabel("32",SwingConstants.CENTER);

    Font displayFont = new Font("Sans Serif",Font.BOLD,14);

    JLabel screenText = new JLabel("Screen");
    JLabel screen = new JLabel();

    int totalAmount = 0;
    int booked = 0;

    JLabel noOfSeatsText = new JLabel("Seats Selected:");
    JLabel noOfSeats = new JLabel("0");

    JLabel totalAmountText = new JLabel("Total Amount:");
    JLabel totalAmountPrice = new JLabel("0");

    JButton confirm = new JButton("Confirm");

    public GreenBookSeats()
    {
        createGUI();
        createCenterPanel();
        addLogoImage();
        addUserIcon();
        addExitImage();
        addSomeText();
        addSeatsSelectionField();
        addBookingPricingInfo();
        addSeatsLabelfield();
        addScreenField();
        addBackImage();
        addConfirmButton();
    }

    public void createGUI()
    {
        greenBookSeat = new JFrame();
        greenBookSeat.getContentPane().setLayout(null);
        greenBookSeat.setUndecorated(true);
        greenBookSeat.setSize(800,550);
        greenBookSeat.setLocationRelativeTo(null);
        greenBookSeat.getContentPane().setBackground(Color.orange);
        greenBookSeat.setVisible(true);
    }

    public void createCenterPanel()
    {
        centrePanel = new JPanel();
        centrePanel.setLayout(null);
        centrePanel.setBounds(0,0,800,55);
        centrePanel.setBackground(Color.gray);
        greenBookSeat.getContentPane().add(centrePanel);

    }

    public void addUserIcon()
    {
        userIcon.setBounds(750,3,50,50);
        centrePanel.add(userIcon);
        greenBookSeat.getContentPane().add(centrePanel);

    }

    public void addExitImage()
    {
        exitCross.setBounds(10,12,30,30);
        exitCross.setBorder(BorderFactory.createLineBorder(Color.black));
        exitCross.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                greenBookSeat.dispose();
            }
        });
        centrePanel.add(exitCross);
        greenBookSeat.getContentPane().add(centrePanel);
    }

    public void addLogoImage()
    {
        logo.setBounds(60,1,55,55);
        centrePanel.add(logo);
        greenBookSeat.getContentPane().add(centrePanel);
    }

    public void addSomeText()
    {
        someText.setBounds(320,15,300,25);
        someText.setFont(new Font("Sans Serif",Font.BOLD,25));
        someText.setForeground(Color.black);
        centrePanel.add(someText);
        greenBookSeat.getContentPane().add(centrePanel);
    }

    public void addBackImage()
    {
        backImage.setBounds(15,490,30,30);
        backImage.setBorder(BorderFactory.createLineBorder(Color.black));
        backImage.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new MainMoviePage().movieList.setVisible(true);
                greenBookSeat.dispose();
            }
        });
        greenBookSeat.add(backImage);
    }

    public void addSeatsSelectionField()
    {
        noOfSeatsText.setBounds(500,300,150,20);
        noOfSeatsText.setFont(new Font("Sans Serif",Font.BOLD,15));
        greenBookSeat.add(noOfSeatsText);
        noOfSeats.setBounds(650,300,150,20);
        noOfSeats.setFont(new Font("Sans Serif",Font.BOLD,15));
        greenBookSeat.add(noOfSeats);

        totalAmountText.setBounds(500,340,150,20);
        totalAmountText.setFont(new Font("Sans Serif",Font.BOLD,15));
        greenBookSeat.add(totalAmountText);
        totalAmountPrice.setBounds(650,340,150,20);
        totalAmountPrice.setFont(new Font("Sans Serif",Font.BOLD,15));
        greenBookSeat.add(totalAmountPrice);
    }

    public void addBookingPricingInfo()
    {
        bookedImageText.setBounds(690,85,80,20);
        bookedImageText.setFont(new Font("Sans Serif",Font.BOLD,15));
        greenBookSeat.add(bookedImageText);
        bookedImage.setBounds(760,80,30,30);
        bookedImage.setBackground(Color.gray);
        bookedImage.setOpaque(true);
        bookedImage.setFont(new Font("Sans Serif",Font.BOLD,14));
        bookedImage.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(bookedImage);

        availableImageText.setBounds(690,124,100,20);
        availableImageText.setFont(new Font("Sans Serif",Font.BOLD,15));
        greenBookSeat.add(availableImageText);
        availableImage.setBounds(760,120,30,30);
        availableImage.setBackground(Color.white);
        availableImage.setOpaque(true);
        availableImage.setFont(new Font("Sans Serif",Font.BOLD,14));
        availableImage.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(availableImage);

        seatsPriceText.setBounds(560,160,180,20);
        seatsPriceText.setFont(new Font("Sans Serif",Font.BOLD,15));
        greenBookSeat.add(seatsPriceText);
        price.setBounds(740,160,80,20);
        price.setFont(new Font("Sans Serif",Font.BOLD,14));
        greenBookSeat.add(price);
    }

    public void addSeatsLabelfield()
    {
        seatNo32.setBounds(130,160,30,30);
        seatNo32.setBackground(Color.gray);
        seatNo32.setOpaque(true);
        seatNo32.setFont(displayFont);
        seatNo32.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo32);

        seatNo31.setBounds(170,160,30,30);
        seatNo31.setBackground(Color.gray);
        seatNo31.setOpaque(true);
        seatNo31.setFont(displayFont);
        seatNo31.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo31);

        seatNo30.setBounds(210,160,30,30);
        seatNo30.setBackground(Color.gray);
        seatNo30.setOpaque(true);
        seatNo30.setFont(displayFont);
        seatNo30.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo30);

        seatNo29.setBounds(250,160,30,30);
        seatNo29.setBackground(Color.gray);
        seatNo29.setOpaque(true);
        seatNo29.setFont(displayFont);
        seatNo29.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo29);

        seatNo28.setBounds(130,200,30,30);
        seatNo28.setBackground(Color.gray);
        seatNo28.setOpaque(true);
        seatNo28.setFont(displayFont);
        seatNo28.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo28);

        seatNo27.setBounds(170,200,30,30);
        seatNo27.setBackground(Color.gray);
        seatNo27.setOpaque(true);
        seatNo27.setFont(displayFont);
        seatNo27.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo27);

        seatNo26.setBounds(210,200,30,30);
        seatNo26.setBackground(Color.gray);
        seatNo26.setOpaque(true);
        seatNo26.setFont(displayFont);
        seatNo26.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo26);

        seatNo25.setBounds(250,200,30,30);
        seatNo25.setBackground(Color.white);
        seatNo25.addMouseListener(this);
        seatNo25.setOpaque(true);
        seatNo25.setFont(displayFont);
        seatNo25.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo25);

        seatNo24.setBounds(130,240,30,30);
        seatNo24.setBackground(Color.gray);
        seatNo24.setOpaque(true);
        seatNo24.setFont(displayFont);
        seatNo24.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo24);

        seatNo23.setBounds(170,240,30,30);
        seatNo23.setBackground(Color.gray);
        seatNo23.setOpaque(true);
        seatNo23.setFont(displayFont);
        seatNo23.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo23);

        seatNo22.setBounds(210,240,30,30);
        seatNo22.setBackground(Color.gray);
        seatNo22.setOpaque(true);
        seatNo22.setFont(displayFont);
        seatNo22.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo22);

        seatNo21.setBounds(250,240,30,30);
        seatNo21.setBackground(Color.gray);
        seatNo21.setOpaque(true);
        seatNo21.setFont(displayFont);
        seatNo21.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo21);

        seatNo20.setBounds(130,280,30,30);
        seatNo20.setBackground(Color.white);
        seatNo20.addMouseListener(this);
        seatNo20.setOpaque(true);
        seatNo20.setFont(displayFont);
        seatNo20.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo20);

        seatNo19.setBounds(170,280,30,30);
        seatNo19.setBackground(Color.white);
        seatNo19.addMouseListener(this);
        seatNo19.setOpaque(true);
        seatNo19.setFont(displayFont);
        seatNo19.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo19);

        seatNo18.setBounds(210,280,30,30);
        seatNo18.setBackground(Color.gray);
        seatNo18.setOpaque(true);
        seatNo18.setFont(displayFont);
        seatNo18.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo18);

        seatNo17.setBounds(250,280,30,30);
        seatNo17.setBackground(Color.gray);
        seatNo17.setOpaque(true);
        seatNo17.setFont(displayFont);
        seatNo17.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo17);

        seatNo16.setBounds(130,330,30,30);
        seatNo16.setBackground(Color.gray);
        seatNo16.setOpaque(true);
        seatNo16.setFont(displayFont);
        seatNo16.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo16);

        seatNo15.setBounds(170,330,30,30);
        seatNo15.setBackground(Color.gray);
        seatNo15.setOpaque(true);
        seatNo15.setFont(displayFont);
        seatNo15.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo15);

        seatNo14.setBounds(210,330,30,30);
        seatNo14.setBackground(Color.gray);
        seatNo14.setOpaque(true);
        seatNo14.setFont(displayFont);
        seatNo14.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo14);

        seatNo13.setBounds(250,330,30,30);
        seatNo13.setBackground(Color.white);
        seatNo13.addMouseListener(this);
        seatNo13.setOpaque(true);
        seatNo13.setFont(displayFont);
        seatNo13.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo13);

        seatNo12.setBounds(130,370,30,30);
        seatNo12.setBackground(Color.white);
        seatNo12.addMouseListener(this);
        seatNo12.setOpaque(true);
        seatNo12.setFont(displayFont);
        seatNo12.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo12);

        seatNo11.setBounds(170,370,30,30);
        seatNo11.setBackground(Color.white);
        seatNo11.addMouseListener(this);
        seatNo11.setOpaque(true);
        seatNo11.setFont(displayFont);
        seatNo11.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo11);

        seatNo10.setBounds(210,370,30,30);
        seatNo10.setBackground(Color.white);
        seatNo10.addMouseListener(this);
        seatNo10.setOpaque(true);
        seatNo10.setFont(displayFont);
        seatNo10.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo10);

        seatNo9.setBounds(250,370,30,30);
        seatNo9.setBackground(Color.white);
        seatNo9.addMouseListener(this);
        seatNo9.setOpaque(true);
        seatNo9.setFont(displayFont);
        seatNo9.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo9);

        seatNo8.setBounds(130,410,30,30);
        seatNo8.setBackground(Color.white);
        seatNo8.addMouseListener(this);
        seatNo8.setOpaque(true);
        seatNo8.setFont(displayFont);
        seatNo8.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo8);

        seatNo7.setBounds(170,410,30,30);
        seatNo7.setBackground(Color.white);
        seatNo7.addMouseListener(this);
        seatNo7.setOpaque(true);
        seatNo7.setFont(displayFont);
        seatNo7.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo7);

        seatNo6.setBounds(210,410,30,30);
        seatNo6.setBackground(Color.white);
        seatNo6.addMouseListener(this);
        seatNo6.setOpaque(true);
        seatNo6.setFont(displayFont);
        seatNo6.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo6);

        seatNo5.setBounds(250,410,30,30);
        seatNo5.setBackground(Color.white);
        seatNo5.addMouseListener(this);
        seatNo5.setOpaque(true);
        seatNo5.setFont(displayFont);
        seatNo5.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo5);

        seatNo4.setBounds(130,450,30,30);
        seatNo4.setBackground(Color.gray);
        seatNo4.setOpaque(true);
        seatNo4.setFont(displayFont);
        seatNo4.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo4);

        seatNo3.setBounds(170,450,30,30);
        seatNo3.setBackground(Color.white);
        seatNo3.addMouseListener(this);
        seatNo3.setOpaque(true);
        seatNo3.setFont(displayFont);
        seatNo3.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo3);

        seatNo2.setBounds(210,450,30,30);
        seatNo2.setBackground(Color.gray);
        seatNo2.setOpaque(true);
        seatNo2.setFont(displayFont);
        seatNo2.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo2);

        seatNo1.setBounds(250,450,30,30);
        seatNo1.setBackground(Color.white);
        seatNo1.addMouseListener(this);
        seatNo1.setOpaque(true);
        seatNo1.setFont(displayFont);
        seatNo1.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(seatNo1);

    }

    public void addScreenField()
    {
        screen.setBounds(110,500,200,8);
        screen.setBackground(Color.BLACK);
        screen.setOpaque(true);
        screen.setBorder(BorderFactory.createLineBorder(Color.black,2));
        greenBookSeat.add(screen);

        screenText.setBounds(180,510,100,20);
        screenText.setFont(displayFont);
        greenBookSeat.add(screenText);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int priceAmount = 250;

        if (e.getSource().equals(seatNo1))
        {
            if (seatNo1.getBackground().equals(Color.white))
            {
                seatNo1.setBackground(Color.red);
                booked++;
            }

            totalAmount = booked * priceAmount;
        }

        else if (e.getSource().equals(seatNo3))
        {
            if (seatNo3.getBackground().equals(Color.white))
            {
                seatNo3.setBackground(Color.red);
                booked++;
            }
            else
            {
                seatNo3.setBackground(Color.white);
                booked--;
            }
            totalAmount = booked * priceAmount;
        }

        else if (e.getSource().equals(seatNo5))
        {
            if (seatNo5.getBackground().equals(Color.white))
            {
                seatNo5.setBackground(Color.red);
                booked++;
            }
            else
            {
                seatNo5.setBackground(Color.white);
                booked--;
            }
            totalAmount = booked * priceAmount;
        }

        else if (e.getSource().equals(seatNo6))
        {
            if (seatNo6.getBackground().equals(Color.white))
            {
                seatNo6.setBackground(Color.red);
                booked++;
            }
            else
            {
                seatNo6.setBackground(Color.white);
                booked--;
            }
            totalAmount = booked * priceAmount;
        }

        else if (e.getSource().equals(seatNo7))
        {
            if (seatNo7.getBackground().equals(Color.white))
            {
                seatNo7.setBackground(Color.red);
                booked++;
            }
            else
            {
                seatNo7.setBackground(Color.white);
                booked--;
            }
            totalAmount = booked * priceAmount;
        }

        else if (e.getSource().equals(seatNo8))
        {
            if (seatNo8.getBackground().equals(Color.white))
            {
                seatNo8.setBackground(Color.red);
                booked++;
            }
            else
            {
                seatNo8.setBackground(Color.white);
                booked--;
            }
            totalAmount = booked * priceAmount;
        }

        else if (e.getSource().equals(seatNo9))
        {
            if (seatNo9.getBackground().equals(Color.white))
            {
                seatNo9.setBackground(Color.red);
                booked++;
            }
            else
            {
                seatNo9.setBackground(Color.white);
                booked--;
            }
            totalAmount = booked * priceAmount;
        }

        else if (e.getSource().equals(seatNo10))
        {
            if (seatNo10.getBackground().equals(Color.white))
            {
                seatNo10.setBackground(Color.red);
                booked++;
            }
            else
            {
                seatNo10.setBackground(Color.white);
                booked--;
            }
            totalAmount = booked * priceAmount;
        }

        else if (e.getSource().equals(seatNo11))
        {
            if (seatNo11.getBackground().equals(Color.white))
            {
                seatNo11.setBackground(Color.red);
                booked++;
            }
            else
            {
                seatNo11.setBackground(Color.white);
                booked--;
            }
            totalAmount = booked * priceAmount;
        }

        else if (e.getSource().equals(seatNo12))
        {
            if (seatNo12.getBackground().equals(Color.white))
            {
                seatNo12.setBackground(Color.red);
                booked++;
            }
            else
            {
                seatNo12.setBackground(Color.white);
                booked--;
            }
            totalAmount = booked * priceAmount;
        }

        else if (e.getSource().equals(seatNo13))
        {
            if (seatNo13.getBackground().equals(Color.white))
            {
                seatNo13.setBackground(Color.red);
                booked++;
            }
            else
            {
                seatNo13.setBackground(Color.white);
                booked--;
            }
            totalAmount = booked * priceAmount;
        }

        else if (e.getSource().equals(seatNo19))
        {
            if (seatNo19.getBackground().equals(Color.white))
            {
                seatNo19.setBackground(Color.red);
                booked++;
            }
            else
            {
                seatNo19.setBackground(Color.white);
                booked--;
            }
            totalAmount = booked * priceAmount;
        }

        else if (e.getSource().equals(seatNo20))
        {
            if (seatNo20.getBackground().equals(Color.white))
            {
                seatNo20.setBackground(Color.red);
                booked++;
            }
            else
            {
                seatNo20.setBackground(Color.white);
                booked--;
            }
            totalAmount = booked * priceAmount;
        }

        else if (e.getSource().equals(seatNo25))
        {
            if (seatNo25.getBackground().equals(Color.white))
            {
                seatNo25.setBackground(Color.red);
                booked++;
            }
            totalAmount = booked * priceAmount;
        }

        noOfSeats.setText(String.valueOf(booked));
        totalAmountPrice.setText(String.valueOf(totalAmount));
    }

    public void addConfirmButton()
    {
        confirm.setBounds(500,450,240,35);
        confirm.setBackground(Color.decode("#43cea2"));
        confirm.setFont(displayFont);
        confirm.setBorder(BorderFactory.createLineBorder(Color.white,2));
        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PaymentForm().paymentForm.setVisible(true);
                greenBookSeat.dispose();
            }
        });
        greenBookSeat.add(confirm);
    }

    public static void main(String[] args) {


    }

}
