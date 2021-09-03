package Movie_Ticket_Booking_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MovieAspirants {
    JFrame movieAspirants;
    JPanel centrePanel;
    JLabel userIcon = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\profile-user.png"));
    JLabel logo = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Theatrelogo1.png"));
    JLabel exitCross = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\letter-x.png"));
    JLabel someText = new JLabel("Movie Description");
    JLabel AspirantsMovieImage = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\TvfImage1.jpg"));
    JLabel AspirantsMovieTitle = new JLabel("Aspirants");
    JLabel AspirantsMovieLang = new JLabel("Hindi • Drama • UA");
    JLabel AspirantsMovieAboutText = new JLabel("About the movie: ");
    JTextArea AspirantsMovieAbout = new JTextArea();
    JLabel AspirantsMovieDurationText = new JLabel("Duration: ");
    JLabel AspirantsMovieDuration = new JLabel("3h 20m");
    JLabel AspirantsMovieReleaseText = new JLabel("Release Date: ");
    JLabel AspirantsMovieRelease = new JLabel("25 June 2021");
    JLabel AspirantsMovieCastText = new JLabel("Cast: ");
    JLabel AspirantsMovieCast = new JLabel("Abhilash Thapliyal, Naveen Kasturia, Shivankit Singh Parihar.");
    JButton AspirantsBookSeat = new JButton("Book");
    JLabel backImage = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\left-arrow.png"));

    Font displayFontLeft = new Font("Sans Serif",Font.BOLD,15);
    Font displayFontRight = new Font("Sans Serif",Font.PLAIN,15);

    public MovieAspirants()
    {
        createGUI();
        createCenterPanel();
        addLogoImage();
        addUserIcon();
        addExitImage();
        addSomeText();
        addMovieAspirantsImageText();
        addAboutMovie();
        addDurationMovie();
        addReleaseDateMovie();
        addCastMovie();
        addBookButton();
        addBackImage();

    }

    public void createGUI()
    {
        movieAspirants = new JFrame();
        movieAspirants.getContentPane().setLayout(null);
        movieAspirants.setUndecorated(true);
        movieAspirants.setSize(800,550);
        movieAspirants.setLocationRelativeTo(null);
        movieAspirants.getContentPane().setBackground(Color.orange);
        movieAspirants.setVisible(true);
    }

    public void createCenterPanel()
    {
        centrePanel = new JPanel();
        centrePanel.setLayout(null);
        centrePanel.setBounds(0,0,800,55);
        centrePanel.setBackground(Color.gray);
        movieAspirants.getContentPane().add(centrePanel);

    }

    public void addUserIcon()
    {
        userIcon.setBounds(750,3,50,50);
        centrePanel.add(userIcon);
        movieAspirants.getContentPane().add(centrePanel);

    }

    public void addExitImage()
    {
        exitCross.setBounds(10,12,30,30);
        exitCross.setBorder(BorderFactory.createLineBorder(Color.black));
        exitCross.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                movieAspirants.dispose();
            }
        });
        centrePanel.add(exitCross);
        movieAspirants.getContentPane().add(centrePanel);
    }

    public void addLogoImage()
    {
        logo.setBounds(60,1,55,55);
        centrePanel.add(logo);
        movieAspirants.getContentPane().add(centrePanel);
    }

    public void addSomeText()
    {
        someText.setBounds(300,15,300,25);
        someText.setFont(new Font("Sans Serif",Font.BOLD,25));
        someText.setForeground(Color.black);
        centrePanel.add(someText);
        movieAspirants.getContentPane().add(centrePanel);
    }

    public void addMovieAspirantsImageText()
    {
        AspirantsMovieImage.setBounds(300,68,200,200);
        AspirantsMovieImage.setBorder(BorderFactory.createLineBorder(Color.cyan,2));
        movieAspirants.add(AspirantsMovieImage);
        AspirantsMovieTitle.setBounds(364,272,200,20);
        AspirantsMovieTitle.setFont(new Font("Sans Serif",Font.BOLD,15));
        movieAspirants.add(AspirantsMovieTitle);
        AspirantsMovieLang.setBounds(345,290,200,20);
        AspirantsMovieLang.setFont(new Font("Sans Serif",Font.PLAIN,12));
        AspirantsMovieLang.setForeground(Color.white.brighter());
        movieAspirants.add(AspirantsMovieLang);
    }

    public void addAboutMovie()
    {
        AspirantsMovieAboutText.setBounds(15,320,150,20);
        AspirantsMovieAboutText.setFont(displayFontLeft);
        AspirantsMovieAboutText.setForeground(Color.red);
        movieAspirants.add(AspirantsMovieAboutText);
        AspirantsMovieAbout.setBounds(140,320,655,65);
        AspirantsMovieAbout.setText("It is the story of the journey of three UPSC (public service competitive exams in India) aspirants and their friendship against all odds.");
        AspirantsMovieAbout.setFont(displayFontRight);
        AspirantsMovieAbout.setEditable(false);
        AspirantsMovieAbout.setLineWrap(true);
        AspirantsMovieAbout.setWrapStyleWord(true);
        AspirantsMovieAbout.setBackground(Color.orange);
        movieAspirants.add(AspirantsMovieAbout);
    }

    public void addDurationMovie()
    {
        AspirantsMovieDurationText.setBounds(15,390,100,20);
        AspirantsMovieDurationText.setFont(displayFontLeft);
        AspirantsMovieDurationText.setForeground(Color.red);
        movieAspirants.add(AspirantsMovieDurationText);
        AspirantsMovieDuration.setBounds(90,390,70,20);
        AspirantsMovieDuration.setFont(displayFontRight);
        movieAspirants.add(AspirantsMovieDuration);
    }

    public void addReleaseDateMovie()
    {
        AspirantsMovieReleaseText.setBounds(15,420,150,20);
        AspirantsMovieReleaseText.setFont(displayFontLeft);
        AspirantsMovieReleaseText.setForeground(Color.red);
        movieAspirants.add(AspirantsMovieReleaseText);
        AspirantsMovieRelease.setBounds(120,420,100,20);
        AspirantsMovieRelease.setFont(displayFontRight);
        movieAspirants.add(AspirantsMovieRelease);
    }

    public void addCastMovie()
    {
        AspirantsMovieCastText.setBounds(15,450,70,20);
        AspirantsMovieCastText.setFont(displayFontLeft);
        AspirantsMovieCastText.setForeground(Color.red);
        movieAspirants.add(AspirantsMovieCastText);
        AspirantsMovieCast.setBounds(60,450,400,20);
        AspirantsMovieCast.setFont(displayFontRight);
        movieAspirants.add(AspirantsMovieCast);
    }

    public void addBookButton()
    {
        AspirantsBookSeat.setBounds(300,490,200,40);
        AspirantsBookSeat.setFont(displayFontLeft);
        AspirantsBookSeat.setBackground(Color.decode("#43cea2"));
        AspirantsBookSeat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DateTimeSelectionAspirants().dateTimeMovie.setVisible(true);
                movieAspirants.dispose();
            }
        });
        movieAspirants.add(AspirantsBookSeat);
    }

    public void addBackImage()
    {
        backImage.setBounds(15,490,30,30);
        backImage.setBorder(BorderFactory.createLineBorder(Color.black));
        backImage.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new MainMoviePage().movieList.setVisible(true);
                movieAspirants.dispose();
            }
        });
        movieAspirants.add(backImage);
    }

    public static void main(String[] args) {


    }
}
