package Movie_Ticket_Booking_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MovieMaster {
    JFrame movieMaster;
    JPanel centrePanel;
    JLabel userIcon = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\profile-user.png"));
    JLabel logo = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Theatrelogo1.png"));
    JLabel exitCross = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\letter-x.png"));
    JLabel someText = new JLabel("Movie Description");
    JLabel MasterMovieImage = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\master1.jpg"));
    JLabel MasterMovieTitle = new JLabel("Master");
    JLabel MasterMovieLang = new JLabel("Hindi • Action, Thriller • UA");
    JLabel MasterMovieAboutText = new JLabel("About the movie: ");
    JTextArea MasterMovieAbout = new JTextArea();
    JLabel MasterMovieDurationText = new JLabel("Duration: ");
    JLabel MasterMovieDuration = new JLabel("2h 58m");
    JLabel MasterMovieReleaseText = new JLabel("Release Date: ");
    JLabel MasterMovieRelease = new JLabel("10 July 2021");
    JLabel MasterMovieCastText = new JLabel("Cast: ");
    JLabel MasterMovieCast = new JLabel("Vijay, Vijay Sethupathi, Malavika Mohanan.");
    JButton MasterBookSeat = new JButton("Book");
    JLabel backImage = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\left-arrow.png"));

    Font displayFontLeft = new Font("Sans Serif",Font.BOLD,15);
    Font displayFontRight = new Font("Sans Serif",Font.PLAIN,15);

    public MovieMaster()
    {
        createGUI();
        createCenterPanel();
        addLogoImage();
        addUserIcon();
        addExitImage();
        addSomeText();
        addMovieMasterImageText();
        addAboutMovie();
        addDurationMovie();
        addReleaseDateMovie();
        addCastMovie();
        addBookButton();
        addBackImage();

    }

    public void createGUI()
    {
        movieMaster = new JFrame();
        movieMaster.getContentPane().setLayout(null);
        movieMaster.setUndecorated(true);
        movieMaster.setSize(800,550);
        movieMaster.setLocationRelativeTo(null);
        movieMaster.getContentPane().setBackground(Color.orange);
        movieMaster.setVisible(true);
    }

    public void createCenterPanel()
    {
        centrePanel = new JPanel();
        centrePanel.setLayout(null);
        centrePanel.setBounds(0,0,800,55);
        centrePanel.setBackground(Color.gray);
        movieMaster.getContentPane().add(centrePanel);

    }

    public void addUserIcon()
    {
        userIcon.setBounds(750,3,50,50);
        centrePanel.add(userIcon);
        movieMaster.getContentPane().add(centrePanel);

    }

    public void addExitImage()
    {
        exitCross.setBounds(10,12,30,30);
        exitCross.setBorder(BorderFactory.createLineBorder(Color.black));
        exitCross.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                movieMaster.dispose();
            }
        });
        centrePanel.add(exitCross);
        movieMaster.getContentPane().add(centrePanel);
    }

    public void addLogoImage()
    {
        logo.setBounds(60,1,55,55);
        centrePanel.add(logo);
        movieMaster.getContentPane().add(centrePanel);
    }

    public void addSomeText()
    {
        someText.setBounds(300,15,300,25);
        someText.setFont(new Font("Sans Serif",Font.BOLD,25));
        someText.setForeground(Color.black);
        centrePanel.add(someText);
        movieMaster.getContentPane().add(centrePanel);
    }

    public void addMovieMasterImageText()
    {
        MasterMovieImage.setBounds(300,68,200,200);
        MasterMovieImage.setBorder(BorderFactory.createLineBorder(Color.cyan,2));
        movieMaster.add(MasterMovieImage);
        MasterMovieTitle.setBounds(370,272,250,20);
        MasterMovieTitle.setFont(new Font("Sans Serif",Font.BOLD,15));
        movieMaster.add(MasterMovieTitle);
        MasterMovieLang.setBounds(330,290,200,20);
        MasterMovieLang.setFont(new Font("Sans Serif",Font.PLAIN,12));
        MasterMovieLang.setForeground(Color.white.brighter());
        movieMaster.add(MasterMovieLang);
    }

    public void addAboutMovie()
    {
        MasterMovieAboutText.setBounds(15,320,150,20);
        MasterMovieAboutText.setFont(displayFontLeft);
        MasterMovieAboutText.setForeground(Color.red);
        movieMaster.add(MasterMovieAboutText);
        MasterMovieAbout.setBounds(140,320,655,65);
        MasterMovieAbout.setText("An alcoholic professor is sent to a juvenile school, where he clashes with a gangster, who uses the children of the school for criminal activities.");
        MasterMovieAbout.setFont(displayFontRight);
        MasterMovieAbout.setEditable(false);
        MasterMovieAbout.setLineWrap(true);
        MasterMovieAbout.setWrapStyleWord(true);
        MasterMovieAbout.setBackground(Color.orange);
        movieMaster.add(MasterMovieAbout);
    }

    public void addDurationMovie()
    {
        MasterMovieDurationText.setBounds(15,390,100,20);
        MasterMovieDurationText.setFont(displayFontLeft);
        MasterMovieDurationText.setForeground(Color.red);
        movieMaster.add(MasterMovieDurationText);
        MasterMovieDuration.setBounds(90,390,70,20);
        MasterMovieDuration.setFont(displayFontRight);
        movieMaster.add(MasterMovieDuration);
    }

    public void addReleaseDateMovie()
    {
        MasterMovieReleaseText.setBounds(15,420,150,20);
        MasterMovieReleaseText.setFont(displayFontLeft);
        MasterMovieReleaseText.setForeground(Color.red);
        movieMaster.add(MasterMovieReleaseText);
        MasterMovieRelease.setBounds(120,420,100,20);
        MasterMovieRelease.setFont(displayFontRight);
        movieMaster.add(MasterMovieRelease);
    }

    public void addCastMovie()
    {
        MasterMovieCastText.setBounds(15,450,70,20);
        MasterMovieCastText.setFont(displayFontLeft);
        MasterMovieCastText.setForeground(Color.red);
        movieMaster.add(MasterMovieCastText);
        MasterMovieCast.setBounds(60,450,400,20);
        MasterMovieCast.setFont(displayFontRight);
        movieMaster.add(MasterMovieCast);
    }

    public void addBookButton()
    {
        MasterBookSeat.setBounds(300,490,200,40);
        MasterBookSeat.setFont(displayFontLeft);
        MasterBookSeat.setBackground(Color.decode("#43cea2"));
        MasterBookSeat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DateTimeSelectionMaster().dateTimeMovie.setVisible(true);
                movieMaster.dispose();
            }
        });
        movieMaster.add(MasterBookSeat);
    }

    public void addBackImage()
    {
        backImage.setBounds(15,490,30,30);
        backImage.setBorder(BorderFactory.createLineBorder(Color.black));
        backImage.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new MainMoviePage().movieList.setVisible(true);
                movieMaster.dispose();
            }
        });
        movieMaster.add(backImage);
    }

    public static void main(String[] args) {

    }
}
