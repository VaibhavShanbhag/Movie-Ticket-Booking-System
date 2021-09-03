package Movie_Ticket_Booking_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MovieUri {
    JFrame movieUri;
    JPanel centrePanel;
    JLabel userIcon = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\profile-user.png"));
    JLabel logo = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Theatrelogo1.png"));
    JLabel exitCross = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\letter-x.png"));
    JLabel someText = new JLabel("Movie Description");
    JLabel uriMovieImage = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Uri.jpg"));
    JLabel uriMovieTitle = new JLabel("URI - The Surgical Strike");
    JLabel uriMovieLang = new JLabel("Hindi • Action, Drama, War • UA");
    JLabel uriMovieAboutText = new JLabel("About the movie: ");
    JTextArea uriMovieAbout = new JTextArea();
    JLabel uriMovieDurationText = new JLabel("Duration: ");
    JLabel uriMovieDuration = new JLabel("2h 18m");
    JLabel uriMovieReleaseText = new JLabel("Release Date: ");
    JLabel uriMovieRelease = new JLabel("10 June 2021");
    JLabel uriMovieCastText = new JLabel("Cast: ");
    JLabel uriMovieCast = new JLabel("Vicky Kaushal, Yami Gautam, Paresh Rawal.");
    JButton uriBookSeat = new JButton("Book");
    JLabel backImage = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\left-arrow.png"));

    Font displayFontLeft = new Font("Sans Serif",Font.BOLD,15);
    Font displayFontRight = new Font("Sans Serif",Font.PLAIN,15);

    public MovieUri()
    {
        createGUI();
        createCenterPanel();
        addLogoImage();
        addUserIcon();
        addExitImage();
        addSomeText();
        addMovieUriImageText();
        addAboutMovie();
        addDurationMovie();
        addReleaseDateMovie();
        addCastMovie();
        addBookButton();
        addBackImage();

    }

    public void createGUI()
    {
        movieUri = new JFrame();
        movieUri.getContentPane().setLayout(null);
        movieUri.setUndecorated(true);
        movieUri.setSize(800,550);
        movieUri.setLocationRelativeTo(null);
        movieUri.getContentPane().setBackground(Color.orange);
        movieUri.setVisible(true);
    }

    public void createCenterPanel()
    {
        centrePanel = new JPanel();
        centrePanel.setLayout(null);
        centrePanel.setBounds(0,0,800,55);
        centrePanel.setBackground(Color.gray);
        movieUri.getContentPane().add(centrePanel);

    }

    public void addUserIcon()
    {
        userIcon.setBounds(750,3,50,50);
        centrePanel.add(userIcon);
        movieUri.getContentPane().add(centrePanel);

    }

    public void addExitImage()
    {
        exitCross.setBounds(10,12,30,30);
        exitCross.setBorder(BorderFactory.createLineBorder(Color.black));
        exitCross.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                movieUri.dispose();
            }
        });
        centrePanel.add(exitCross);
        movieUri.getContentPane().add(centrePanel);
    }

    public void addLogoImage()
    {
        logo.setBounds(60,1,55,55);
        centrePanel.add(logo);
        movieUri.getContentPane().add(centrePanel);
    }

    public void addSomeText()
    {
        someText.setBounds(300,15,300,25);
        someText.setFont(new Font("Sans Serif",Font.BOLD,25));
        someText.setForeground(Color.black);
        centrePanel.add(someText);
        movieUri.getContentPane().add(centrePanel);
    }

    public void addMovieUriImageText()
    {
        uriMovieImage.setBounds(300,68,200,200);
        uriMovieImage.setBorder(BorderFactory.createLineBorder(Color.cyan,2));
        movieUri.add(uriMovieImage);
        uriMovieTitle.setBounds(312,272,200,20);
        uriMovieTitle.setFont(new Font("Sans Serif",Font.BOLD,15));
        movieUri.add(uriMovieTitle);
        uriMovieLang.setBounds(312,290,200,20);
        uriMovieLang.setFont(new Font("Sans Serif",Font.PLAIN,12));
        uriMovieLang.setForeground(Color.white.brighter());
        movieUri.add(uriMovieLang);
    }

    public void addAboutMovie()
    {
        uriMovieAboutText.setBounds(15,320,150,20);
        uriMovieAboutText.setFont(displayFontLeft);
        uriMovieAboutText.setForeground(Color.red);
        movieUri.add(uriMovieAboutText);
        uriMovieAbout.setBounds(140,320,655,65);
        uriMovieAbout.setText("URI chronicles the events of the surgical strike conducted by the Indian military against the suspected militants in Pakistan occupied Kashmir (PoK). It tells the story of the 11 tumultuous events over which the operation was carried out.");
        uriMovieAbout.setFont(displayFontRight);
        uriMovieAbout.setEditable(false);
        uriMovieAbout.setLineWrap(true);
        uriMovieAbout.setWrapStyleWord(true);
        uriMovieAbout.setBackground(Color.orange);
        movieUri.add(uriMovieAbout);
    }

    public void addDurationMovie()
    {
        uriMovieDurationText.setBounds(15,390,100,20);
        uriMovieDurationText.setFont(displayFontLeft);
        uriMovieDurationText.setForeground(Color.red);
        movieUri.add(uriMovieDurationText);
        uriMovieDuration.setBounds(90,390,70,20);
        uriMovieDuration.setFont(displayFontRight);
        movieUri.add(uriMovieDuration);
    }

    public void addReleaseDateMovie()
    {
        uriMovieReleaseText.setBounds(15,420,150,20);
        uriMovieReleaseText.setFont(displayFontLeft);
        uriMovieReleaseText.setForeground(Color.red);
        movieUri.add(uriMovieReleaseText);
        uriMovieRelease.setBounds(120,420,100,20);
        uriMovieRelease.setFont(displayFontRight);
        movieUri.add(uriMovieRelease);
    }

    public void addCastMovie()
    {
        uriMovieCastText.setBounds(15,450,70,20);
        uriMovieCastText.setFont(displayFontLeft);
        uriMovieCastText.setForeground(Color.red);
        movieUri.add(uriMovieCastText);
        uriMovieCast.setBounds(60,450,340,20);
        uriMovieCast.setFont(displayFontRight);
        movieUri.add(uriMovieCast);
    }

    public void addBookButton()
    {
        uriBookSeat.setBounds(300,490,200,40);
        uriBookSeat.setFont(displayFontLeft);
        uriBookSeat.setBackground(Color.decode("#43cea2"));
        uriBookSeat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DateTimeSelectionUri().dateTimeMovie.setVisible(true);
                movieUri.dispose();
            }
        });
        movieUri.add(uriBookSeat);
    }

    public void addBackImage()
    {
        backImage.setBounds(15,490,30,30);
        backImage.setBorder(BorderFactory.createLineBorder(Color.black));
        backImage.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new MainMoviePage().movieList.setVisible(true);
                movieUri.dispose();
            }
        });
        movieUri.add(backImage);
    }


    public static void main(String[] args) {

    }
}
