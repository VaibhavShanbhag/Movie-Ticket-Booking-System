package Movie_Ticket_Booking_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MovieAndhadoon {
    JFrame movieAndhadoon;
    JPanel centrePanel;
    JLabel userIcon = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\profile-user.png"));
    JLabel logo = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Theatrelogo1.png"));
    JLabel exitCross = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\letter-x.png"));
    JLabel someText = new JLabel("Movie Description");
    JLabel AndhaMovieImage = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Andhadoon1.jpg"));
    JLabel AndhaMovieTitle = new JLabel("Andhadhun");
    JLabel AndhaMovieLang = new JLabel("Hindi • Crime, Thriller • UA");
    JLabel AndhaMovieAboutText = new JLabel("About the movie: ");
    JTextArea AndhaMovieAbout = new JTextArea();
    JLabel AndhaMovieDurationText = new JLabel("Duration: ");
    JLabel AndhaMovieDuration = new JLabel("2h 19m");
    JLabel AndhaMovieReleaseText = new JLabel("Release Date: ");
    JLabel AndhaMovieRelease = new JLabel("15 June 2021");
    JLabel AndhaMovieCastText = new JLabel("Cast: ");
    JLabel AndhaMovieCast = new JLabel("Ayushmann Khurrana, Radhika Apte, Tabu.");
    JButton AndhaBookSeat = new JButton("Book");
    JLabel backImage = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\left-arrow.png"));

    Font displayFontLeft = new Font("Sans Serif",Font.BOLD,15);
    Font displayFontRight = new Font("Sans Serif",Font.PLAIN,15);

    public MovieAndhadoon()
    {
        createGUI();
        createCenterPanel();
        addLogoImage();
        addUserIcon();
        addExitImage();
        addSomeText();
        addMovieAndhadoonImageText();
        addAboutMovie();
        addDurationMovie();
        addReleaseDateMovie();
        addCastMovie();
        addBookButton();
        addBackImage();

    }

    public void createGUI()
    {
        movieAndhadoon = new JFrame();
        movieAndhadoon.getContentPane().setLayout(null);
        movieAndhadoon.setUndecorated(true);
        movieAndhadoon.setSize(800,550);
        movieAndhadoon.setLocationRelativeTo(null);
        movieAndhadoon.getContentPane().setBackground(Color.orange);
        movieAndhadoon.setVisible(true);
    }

    public void createCenterPanel()
    {
        centrePanel = new JPanel();
        centrePanel.setLayout(null);
        centrePanel.setBounds(0,0,800,55);
        centrePanel.setBackground(Color.gray);
        movieAndhadoon.getContentPane().add(centrePanel);

    }

    public void addUserIcon()
    {
        userIcon.setBounds(750,3,50,50);
        centrePanel.add(userIcon);
        movieAndhadoon.getContentPane().add(centrePanel);

    }

    public void addExitImage()
    {
        exitCross.setBounds(10,12,30,30);
        exitCross.setBorder(BorderFactory.createLineBorder(Color.black));
        exitCross.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                movieAndhadoon.dispose();
            }
        });
        centrePanel.add(exitCross);
        movieAndhadoon.getContentPane().add(centrePanel);
    }

    public void addLogoImage()
    {
        logo.setBounds(60,1,55,55);
        centrePanel.add(logo);
        movieAndhadoon.getContentPane().add(centrePanel);
    }

    public void addSomeText()
    {
        someText.setBounds(300,15,300,25);
        someText.setFont(new Font("Sans Serif",Font.BOLD,25));
        someText.setForeground(Color.black);
        centrePanel.add(someText);
        movieAndhadoon.getContentPane().add(centrePanel);
    }

    public void addMovieAndhadoonImageText()
    {
        AndhaMovieImage.setBounds(300,68,200,200);
        AndhaMovieImage.setBorder(BorderFactory.createLineBorder(Color.cyan,2));
        movieAndhadoon.add(AndhaMovieImage);
        AndhaMovieTitle.setBounds(360,272,200,20);
        AndhaMovieTitle.setFont(new Font("Sans Serif",Font.BOLD,15));
        movieAndhadoon.add(AndhaMovieTitle);
        AndhaMovieLang.setBounds(330,290,200,20);
        AndhaMovieLang.setFont(new Font("Sans Serif",Font.PLAIN,12));
        AndhaMovieLang.setForeground(Color.white.brighter());
        movieAndhadoon.add(AndhaMovieLang);
    }

    public void addAboutMovie()
    {
        AndhaMovieAboutText.setBounds(15,320,150,20);
        AndhaMovieAboutText.setFont(displayFontLeft);
        AndhaMovieAboutText.setForeground(Color.red);
        movieAndhadoon.add(AndhaMovieAboutText);
        AndhaMovieAbout.setBounds(140,320,655,65);
        AndhaMovieAbout.setText("Akash, a piano player pretending to be visually-impaired, unwittingly becomes entangled in a number of problems as he witnesses the murder of a former film actor.");
        AndhaMovieAbout.setFont(displayFontRight);
        AndhaMovieAbout.setEditable(false);
        AndhaMovieAbout.setLineWrap(true);
        AndhaMovieAbout.setWrapStyleWord(true);
        AndhaMovieAbout.setBackground(Color.orange);
        movieAndhadoon.add(AndhaMovieAbout);
    }

    public void addDurationMovie()
    {
        AndhaMovieDurationText.setBounds(15,390,100,20);
        AndhaMovieDurationText.setFont(displayFontLeft);
        AndhaMovieDurationText.setForeground(Color.red);
        movieAndhadoon.add(AndhaMovieDurationText);
        AndhaMovieDuration.setBounds(90,390,70,20);
        AndhaMovieDuration.setFont(displayFontRight);
        movieAndhadoon.add(AndhaMovieDuration);
    }

    public void addReleaseDateMovie()
    {
        AndhaMovieReleaseText.setBounds(15,420,150,20);
        AndhaMovieReleaseText.setFont(displayFontLeft);
        AndhaMovieReleaseText.setForeground(Color.red);
        movieAndhadoon.add(AndhaMovieReleaseText);
        AndhaMovieRelease.setBounds(120,420,100,20);
        AndhaMovieRelease.setFont(displayFontRight);
        movieAndhadoon.add(AndhaMovieRelease);
    }

    public void addCastMovie()
    {
        AndhaMovieCastText.setBounds(15,450,70,20);
        AndhaMovieCastText.setFont(displayFontLeft);
        AndhaMovieCastText.setForeground(Color.red);
        movieAndhadoon.add(AndhaMovieCastText);
        AndhaMovieCast.setBounds(60,450,340,20);
        AndhaMovieCast.setFont(displayFontRight);
        movieAndhadoon.add(AndhaMovieCast);
    }

    public void addBookButton()
    {
        AndhaBookSeat.setBounds(300,490,200,40);
        AndhaBookSeat.setFont(displayFontLeft);
        AndhaBookSeat.setBackground(Color.decode("#43cea2"));
        AndhaBookSeat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DateTimeSelectionAndhadoon().dateTimeMovie.setVisible(true);
                movieAndhadoon.dispose();
            }
        });
        movieAndhadoon.add(AndhaBookSeat);
    }

    public void addBackImage()
    {
        backImage.setBounds(15,490,30,30);
        backImage.setBorder(BorderFactory.createLineBorder(Color.black));
        backImage.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new MainMoviePage().movieList.setVisible(true);
                movieAndhadoon.dispose();
            }
        });
        movieAndhadoon.add(backImage);
    }

    public static void main(String[] args) {

    }
    

}
