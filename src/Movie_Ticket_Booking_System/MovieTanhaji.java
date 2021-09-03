package Movie_Ticket_Booking_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MovieTanhaji {
    JFrame movieTanhaji;
    JPanel centrePanel;
    JLabel userIcon = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\profile-user.png"));
    JLabel logo = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Theatrelogo1.png"));
    JLabel exitCross = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\letter-x.png"));
    JLabel someText = new JLabel("Movie Description");
    JLabel TanhajiMovieImage = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Tanaji1.jpg"));
    JLabel TanhajiMovieTitle = new JLabel("Tanhaji: The Unsung Warrior");
    JLabel TanhajiMovieLang = new JLabel("Hindi • Action, Drama, Historical • UA");
    JLabel TanhajiMovieAboutText = new JLabel("About the movie: ");
    JTextArea TanhajiMovieAbout = new JTextArea();
    JLabel TanhajiMovieDurationText = new JLabel("Duration: ");
    JLabel TanhajiMovieDuration = new JLabel("2h 14m");
    JLabel TanhajiMovieReleaseText = new JLabel("Release Date: ");
    JLabel TanhajiMovieRelease = new JLabel("4 July 2021");
    JLabel TanhajiMovieCastText = new JLabel("Cast: ");
    JLabel TanhajiMovieCast = new JLabel("Ajay Devgn, Kajol, Saif Ali Khan.");
    JButton TanhajiBookSeat = new JButton("Book");
    JLabel backImage = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\left-arrow.png"));

    Font displayFontLeft = new Font("Sans Serif",Font.BOLD,15);
    Font displayFontRight = new Font("Sans Serif",Font.PLAIN,15);

    public MovieTanhaji()
    {
        createGUI();
        createCenterPanel();
        addLogoImage();
        addUserIcon();
        addExitImage();
        addSomeText();
        addMovieTanhajiImageText();
        addAboutMovie();
        addDurationMovie();
        addReleaseDateMovie();
        addCastMovie();
        addBookButton();
        addBackImage();

    }

    public void createGUI()
    {
        movieTanhaji = new JFrame();
        movieTanhaji.getContentPane().setLayout(null);
        movieTanhaji.setUndecorated(true);
        movieTanhaji.setSize(800,550);
        movieTanhaji.setLocationRelativeTo(null);
        movieTanhaji.getContentPane().setBackground(Color.orange);
        movieTanhaji.setVisible(true);
    }

    public void createCenterPanel()
    {
        centrePanel = new JPanel();
        centrePanel.setLayout(null);
        centrePanel.setBounds(0,0,800,55);
        centrePanel.setBackground(Color.gray);
        movieTanhaji.getContentPane().add(centrePanel);

    }

    public void addUserIcon()
    {
        userIcon.setBounds(750,3,50,50);
        centrePanel.add(userIcon);
        movieTanhaji.getContentPane().add(centrePanel);

    }

    public void addExitImage()
    {
        exitCross.setBounds(10,12,30,30);
        exitCross.setBorder(BorderFactory.createLineBorder(Color.black));
        exitCross.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                movieTanhaji.dispose();
            }
        });
        centrePanel.add(exitCross);
        movieTanhaji.getContentPane().add(centrePanel);
    }

    public void addLogoImage()
    {
        logo.setBounds(60,1,55,55);
        centrePanel.add(logo);
        movieTanhaji.getContentPane().add(centrePanel);
    }

    public void addSomeText()
    {
        someText.setBounds(300,15,300,25);
        someText.setFont(new Font("Sans Serif",Font.BOLD,25));
        someText.setForeground(Color.black);
        centrePanel.add(someText);
        movieTanhaji.getContentPane().add(centrePanel);
    }

    public void addMovieTanhajiImageText()
    {
        TanhajiMovieImage.setBounds(300,68,200,200);
        TanhajiMovieImage.setBorder(BorderFactory.createLineBorder(Color.cyan,2));
        movieTanhaji.add(TanhajiMovieImage);
        TanhajiMovieTitle.setBounds(300,272,250,20);
        TanhajiMovieTitle.setFont(new Font("Sans Serif",Font.BOLD,15));
        movieTanhaji.add(TanhajiMovieTitle);
        TanhajiMovieLang.setBounds(300,290,200,20);
        TanhajiMovieLang.setFont(new Font("Sans Serif",Font.PLAIN,12));
        TanhajiMovieLang.setForeground(Color.white.brighter());
        movieTanhaji.add(TanhajiMovieLang);
    }

    public void addAboutMovie()
    {
        TanhajiMovieAboutText.setBounds(15,320,150,20);
        TanhajiMovieAboutText.setFont(displayFontLeft);
        TanhajiMovieAboutText.setForeground(Color.red);
        movieTanhaji.add(TanhajiMovieAboutText);
        TanhajiMovieAbout.setBounds(140,320,655,65);
        TanhajiMovieAbout.setText("Tanhaji Malusare, a fearless military commander of the Chhatrapati Shivaji`s army and one of the most trusted men of the king, is set on a mission to recapture the Kondhana fort conquered by the Mughal chieftain Udaybhan Singh Rathore.");
        TanhajiMovieAbout.setFont(displayFontRight);
        TanhajiMovieAbout.setEditable(false);
        TanhajiMovieAbout.setLineWrap(true);
        TanhajiMovieAbout.setWrapStyleWord(true);
        TanhajiMovieAbout.setBackground(Color.orange);
        movieTanhaji.add(TanhajiMovieAbout);
    }

    public void addDurationMovie()
    {
        TanhajiMovieDurationText.setBounds(15,390,100,20);
        TanhajiMovieDurationText.setFont(displayFontLeft);
        TanhajiMovieDurationText.setForeground(Color.red);
        movieTanhaji.add(TanhajiMovieDurationText);
        TanhajiMovieDuration.setBounds(90,390,70,20);
        TanhajiMovieDuration.setFont(displayFontRight);
        movieTanhaji.add(TanhajiMovieDuration);
    }

    public void addReleaseDateMovie()
    {
        TanhajiMovieReleaseText.setBounds(15,420,150,20);
        TanhajiMovieReleaseText.setFont(displayFontLeft);
        TanhajiMovieReleaseText.setForeground(Color.red);
        movieTanhaji.add(TanhajiMovieReleaseText);
        TanhajiMovieRelease.setBounds(120,420,100,20);
        TanhajiMovieRelease.setFont(displayFontRight);
        movieTanhaji.add(TanhajiMovieRelease);
    }

    public void addCastMovie()
    {
        TanhajiMovieCastText.setBounds(15,450,70,20);
        TanhajiMovieCastText.setFont(displayFontLeft);
        TanhajiMovieCastText.setForeground(Color.red);
        movieTanhaji.add(TanhajiMovieCastText);
        TanhajiMovieCast.setBounds(60,450,400,20);
        TanhajiMovieCast.setFont(displayFontRight);
        movieTanhaji.add(TanhajiMovieCast);
    }

    public void addBookButton()
    {
        TanhajiBookSeat.setBounds(300,490,200,40);
        TanhajiBookSeat.setFont(displayFontLeft);
        TanhajiBookSeat.setBackground(Color.decode("#43cea2"));
        TanhajiBookSeat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DateTimeSelectionTanhaji().dateTimeMovie.setVisible(true);
                movieTanhaji.dispose();
            }
        });
        movieTanhaji.add(TanhajiBookSeat);
    }

    public void addBackImage()
    {
        backImage.setBounds(15,490,30,30);
        backImage.setBorder(BorderFactory.createLineBorder(Color.black));
        backImage.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new MainMoviePage().movieList.setVisible(true);
                movieTanhaji.dispose();
            }
        });
        movieTanhaji.add(backImage);
    }

    public static void main(String[] args) {

    }
}
