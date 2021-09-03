package Movie_Ticket_Booking_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DateTimeSelectionTanhaji implements ActionListener {
    JFrame dateTimeMovie;
    JPanel centrePanel;
    JLabel userIcon = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\profile-user.png"));
    JLabel backImage = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\left-arrow.png"));
    JLabel logo = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Theatrelogo1.png"));
    JLabel exitCross = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\letter-x.png"));
    JLabel someText = new JLabel("Select Date and Time");
    JLabel date = new JLabel("Select Date: ");
    JLabel tueDateText = new JLabel("20 July");
    JLabel wedDateText = new JLabel("21 July");
    JButton tueDate = new JButton(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\tue.png"));
    JButton wedDate = new JButton(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\wed.png"));
    JLabel theatre = new JLabel("Select Theatre:");
    String[] theatreList = {"Inox Theatre G Wing", "Z-Square Multiplex", "Cine Lata"};
    JComboBox theatreMovieList = new JComboBox(theatreList);

    JLabel movieTime = new JLabel("Select Movie Timings:");
    JButton inox8am20 = new JButton("8:00 AM");
    JButton inox11am20 = new JButton("11:00 AM");
    JButton square1pm20 = new JButton("1:00 PM");
    JButton square4pm20 = new JButton("4:00 PM");
    JButton lata6pm20 = new JButton("6:00 PM");
    JButton lata10pm20 = new JButton("10:00 PM");

    JButton inox9pm21 = new JButton("9:00 PM");
    JButton square3pm21 = new JButton("3:00 PM");
    JButton lata7pm21 = new JButton("7:00 PM");
    JButton lata9pm21 = new JButton("9:00 PM");

    public DateTimeSelectionTanhaji()
    {
        createGUI();
        createCenterPanel();
        addLogoImage();
        addUserIcon();
        addExitImage();
        addSomeText();
        addDateField();
        addTheatreField();
        addMovieInoxTimeField20();
        addBackImage();
    }

    public void createGUI()
    {
        dateTimeMovie = new JFrame();
        dateTimeMovie.getContentPane().setLayout(null);
        dateTimeMovie.setUndecorated(true);
        dateTimeMovie.setSize(800,350);
        dateTimeMovie.setLocationRelativeTo(null);
        dateTimeMovie.getContentPane().setBackground(Color.orange);
        dateTimeMovie.setVisible(true);
    }


    public void createCenterPanel()
    {
        centrePanel = new JPanel();
        centrePanel.setLayout(null);
        centrePanel.setBounds(0,0,800,55);
        centrePanel.setBackground(Color.gray);
        dateTimeMovie.getContentPane().add(centrePanel);

    }

    public void addUserIcon()
    {
        userIcon.setBounds(750,3,50,50);
        centrePanel.add(userIcon);
        dateTimeMovie.getContentPane().add(centrePanel);

    }

    public void addExitImage()
    {
        exitCross.setBounds(10,12,30,30);
        exitCross.setBorder(BorderFactory.createLineBorder(Color.black));
        exitCross.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dateTimeMovie.dispose();
            }
        });
        centrePanel.add(exitCross);
        dateTimeMovie.getContentPane().add(centrePanel);
    }

    public void addLogoImage()
    {
        logo.setBounds(60,1,55,55);
        centrePanel.add(logo);
        dateTimeMovie.getContentPane().add(centrePanel);
    }

    public void addSomeText()
    {
        someText.setBounds(290,15,300,25);
        someText.setFont(new Font("Sans Serif",Font.BOLD,25));
        someText.setForeground(Color.black);
        centrePanel.add(someText);
        dateTimeMovie.getContentPane().add(centrePanel);
    }

    public void addDateField()
    {
        date.setBounds(50,200,100,20);
        date.setFont(new Font("Sans Serif",Font.BOLD,15));
        dateTimeMovie.add(date);

        tueDateText.setBounds(145,172,50,20);
        tueDateText.setFont(new Font("Sans Serif",Font.BOLD,12));
        dateTimeMovie.add(tueDateText);
        tueDate.setBounds(145,192,40,40);
        tueDate.setBorder(null);
        tueDate.setBackground(null);
        tueDate.addActionListener(this);
        dateTimeMovie.add(tueDate);

        wedDateText.setBounds(210,172,50,20);
        wedDateText.setFont(new Font("Sans Serif",Font.BOLD,12));
        dateTimeMovie.add(wedDateText);
        wedDate.setBounds(210,192,40,40);
        wedDate.setBorder(null);
        wedDate.setBackground(null);
        wedDate.addActionListener(this);
        dateTimeMovie.add(wedDate);

    }

    public void addTheatreField()
    {
        theatre.setBounds(50,130,130,20);
        theatre.setFont(new Font("Sans Serif",Font.BOLD,15));
        dateTimeMovie.add(theatre);

        theatreMovieList.setBounds(170,122,180,30);
        theatreMovieList.setFont(new Font("Sans Serif",Font.BOLD,14));
        theatreMovieList.setBackground(Color.orange);
        theatreMovieList.setBorder(BorderFactory.createLineBorder(Color.white,2));
        theatreMovieList.addActionListener(this);
        dateTimeMovie.add(theatreMovieList);

    }

    public void addMovieInoxTimeField20()
    {
        movieTime.setBounds(50,265,200,20);
        movieTime.setFont(new Font("Sans Serif",Font.BOLD,15));
        dateTimeMovie.add(movieTime);

        inox8am20.setVisible(true);
        inox8am20.setBounds(220,260,100,30);
        inox8am20.setFont(new Font("Sans Serif",Font.BOLD,14));
        inox8am20.setBackground(Color.decode("#43cea2"));
        inox8am20.setBorder(BorderFactory.createLineBorder(Color.white,2));
        inox8am20.addActionListener(this);
        dateTimeMovie.add(inox8am20);

        inox11am20.setVisible(true);
        inox11am20.setBounds(335,260,100,30);
        inox11am20.setFont(new Font("Sans Serif",Font.BOLD,14));
        inox11am20.setBackground(Color.decode("#43cea2"));
        inox11am20.setBorder(BorderFactory.createLineBorder(Color.white,2));
        inox11am20.addActionListener(this);
        dateTimeMovie.add(inox11am20);
    }

    public void addBackImage()
    {
        backImage.setBounds(10,310,30,30);
        backImage.setBorder(BorderFactory.createLineBorder(Color.black));
        backImage.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new MovieTanhaji().movieTanhaji.setVisible(true);
                dateTimeMovie.dispose();
            }
        });
        dateTimeMovie.add(backImage);
    }

    public void addMovieZSquareTimeField20()
    {
        square1pm20.setVisible(true);
        square1pm20.setBounds(220,260,100,30);
        square1pm20.setFont(new Font("Sans Serif",Font.BOLD,14));
        square1pm20.setBackground(Color.decode("#43cea2"));
        square1pm20.setBorder(BorderFactory.createLineBorder(Color.white,2));
        square1pm20.addActionListener(this);
        dateTimeMovie.add(square1pm20);

        square4pm20.setVisible(true);
        square4pm20.setBounds(335,260,100,30);
        square4pm20.setFont(new Font("Sans Serif",Font.BOLD,14));
        square4pm20.setBackground(Color.decode("#43cea2"));
        square4pm20.setBorder(BorderFactory.createLineBorder(Color.white,2));
        square4pm20.addActionListener(this);
        dateTimeMovie.add(square4pm20);
    }

    public void addMovieLataTimeField20()
    {
        lata6pm20.setVisible(true);
        lata6pm20.setBounds(220,260,100,30);
        lata6pm20.setFont(new Font("Sans Serif",Font.BOLD,14));
        lata6pm20.setBackground(Color.decode("#43cea2"));
        lata6pm20.setBorder(BorderFactory.createLineBorder(Color.white,2));
        lata6pm20.addActionListener(this);
        dateTimeMovie.add(lata6pm20);

        lata10pm20.setVisible(true);
        lata10pm20.setBounds(335,260,100,30);
        lata10pm20.setFont(new Font("Sans Serif",Font.BOLD,14));
        lata10pm20.setBackground(Color.decode("#43cea2"));
        lata10pm20.setBorder(BorderFactory.createLineBorder(Color.white,2));
        lata10pm20.addActionListener(this);
        dateTimeMovie.add(lata10pm20);
    }

    public void addMovieInoxTimeField21()
    {
        inox9pm21.setVisible(true);
        inox9pm21.setBounds(220,260,100,30);
        inox9pm21.setFont(new Font("Sans Serif",Font.BOLD,14));
        inox9pm21.setBackground(Color.decode("#43cea2"));
        inox9pm21.setBorder(BorderFactory.createLineBorder(Color.white,2));
        inox9pm21.addActionListener(this);
        dateTimeMovie.add(inox9pm21);
    }

    public void addMovieZSquareTimeField21()
    {
        square3pm21.setVisible(true);
        square3pm21.setBounds(220,260,100,30);
        square3pm21.setFont(new Font("Sans Serif",Font.BOLD,14));
        square3pm21.setBackground(Color.decode("#43cea2"));
        square3pm21.setBorder(BorderFactory.createLineBorder(Color.white,2));
        square3pm21.addActionListener(this);
        dateTimeMovie.add(square3pm21);
    }

    public void addMovieLataTimeField21()
    {
        lata7pm21.setVisible(true);
        lata7pm21.setBounds(220,260,100,30);
        lata7pm21.setFont(new Font("Sans Serif",Font.BOLD,14));
        lata7pm21.setBackground(Color.decode("#43cea2"));
        lata7pm21.setBorder(BorderFactory.createLineBorder(Color.white,2));
        lata7pm21.addActionListener(this);
        dateTimeMovie.add(lata7pm21);

        lata9pm21.setVisible(true);
        lata9pm21.setBounds(335,260,100,30);
        lata9pm21.setFont(new Font("Sans Serif",Font.BOLD,14));
        lata9pm21.setBackground(Color.decode("#43cea2"));
        lata9pm21.setBorder(BorderFactory.createLineBorder(Color.white,2));
        lata9pm21.addActionListener(this);
        dateTimeMovie.add(lata9pm21);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedTheatre = String.valueOf(theatreMovieList.getSelectedItem());

        if (e.getSource().equals(inox9pm21))
        {
            new GreenBookSeats().greenBookSeat.setVisible(true);
            dateTimeMovie.dispose();
        }

        if (e.getSource().equals(inox8am20))
        {
            new GreenBookSeats().greenBookSeat.setVisible(true);
            dateTimeMovie.dispose();
        }

        if (e.getSource().equals(inox11am20))
        {
            new GreenBookSeats().greenBookSeat.setVisible(true);
            dateTimeMovie.dispose();
        }

        if (e.getSource().equals(square3pm21))
        {
            new GreenBookSeats().greenBookSeat.setVisible(true);
            dateTimeMovie.dispose();
        }

        if (e.getSource().equals(square4pm20))
        {
            new GreenBookSeats().greenBookSeat.setVisible(true);
            dateTimeMovie.dispose();
        }

        if (e.getSource().equals(square1pm20))
        {
            new GreenBookSeats().greenBookSeat.setVisible(true);
            dateTimeMovie.dispose();
        }

        if (e.getSource().equals(lata10pm20))
        {
            new GreenBookSeats().greenBookSeat.setVisible(true);
            dateTimeMovie.dispose();
        }

        if (e.getSource().equals(lata9pm21))
        {
            new GreenBookSeats().greenBookSeat.setVisible(true);
            dateTimeMovie.dispose();
        }

        if (e.getSource().equals(lata6pm20))
        {
            new GreenBookSeats().greenBookSeat.setVisible(true);
            dateTimeMovie.dispose();
        }

        if (e.getSource().equals(lata7pm21))
        {
            new GreenBookSeats().greenBookSeat.setVisible(true);
            dateTimeMovie.dispose();
        }

        if (e.getSource().equals(wedDate))
        {
            if (selectedTheatre.equals(theatreList[1]))
            {
                inox8am20.setVisible(false);
                inox11am20.setVisible(false);
                inox9pm21.setVisible(false);
                lata6pm20.setVisible(false);
                lata10pm20.setVisible(false);
                lata7pm21.setVisible(false);
                lata9pm21.setVisible(false);
                addMovieZSquareTimeField21();
            }

            if (selectedTheatre.equals(theatreList[0]))
            {
                lata6pm20.setVisible(false);
                lata10pm20.setVisible(false);
                lata7pm21.setVisible(false);
                lata9pm21.setVisible(false);
                square1pm20.setVisible(false);
                square4pm20.setVisible(false);
                square3pm21.setVisible(false);
                addMovieInoxTimeField21();
            }

            if (selectedTheatre.equals(theatreList[2]))
            {
                inox8am20.setVisible(false);
                inox11am20.setVisible(false);
                inox9pm21.setVisible(false);
                square1pm20.setVisible(false);
                square4pm20.setVisible(false);
                square3pm21.setVisible(false);
                addMovieLataTimeField21();
            }
        }

        if (e.getSource().equals(tueDate))
        {
            if (selectedTheatre.equals(theatreList[1]))
            {
                inox8am20.setVisible(false);
                inox11am20.setVisible(false);
                lata6pm20.setVisible(false);
                lata10pm20.setVisible(false);
                addMovieZSquareTimeField20();
            }

            if (selectedTheatre.equals(theatreList[0]))
            {
                lata6pm20.setVisible(false);
                lata10pm20.setVisible(false);
                square1pm20.setVisible(false);
                square4pm20.setVisible(false);
                addMovieInoxTimeField20();
            }

            if (selectedTheatre.equals(theatreList[2]))
            {
                inox8am20.setVisible(false);
                inox11am20.setVisible(false);
                square1pm20.setVisible(false);
                square4pm20.setVisible(false);
                addMovieLataTimeField20();
            }
        }
    }

    public static void main(String[] args) {

    }
}
