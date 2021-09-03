package Movie_Ticket_Booking_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainMoviePage implements ActionListener {
    JFrame movieList;
    JPanel centrePanel;
    JLabel userIcon = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\profile-user.png"));
    JLabel exitCross = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\letter-x.png"));
    JLabel welcome = new JLabel("Welcome Back");
    JLabel select = new JLabel("(Select a Movie)");
    JLabel selectState = new JLabel("Select State");
    String[] namesState = {"Goa"};
    JComboBox state = new JComboBox(namesState);
    JLabel selectCity = new JLabel("Select City");
    String[] namesCity = {"Margao","Mapusa","Bicholim","Panaji","Canacona"};
    JComboBox city = new JComboBox(namesCity);
    JLabel logo = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Theatrelogo1.png"));
    JLabel uriMovieImage = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Uri.jpg"));
    JLabel andhadoonMovieImage = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Andhadoon1.jpg"));
    JLabel aspirantsMovieImage = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\TvfImage1.jpg"));
    JLabel tanhajiMovieImage = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Tanaji1.jpg"));
    JLabel masterMovieImage = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\master1.jpg"));
    JButton bookNowUriButton = new JButton(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Book Now.png"));
    JButton bookNowAndhaButton = new JButton(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Book Now.png"));
    JButton bookNowTvfButton = new JButton(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Book Now.png"));
    JButton bookNowTanhajiButton = new JButton(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Book Now.png"));
    JButton bookNowMasterButton = new JButton(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Book Now.png"));
    JLabel backImage = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\left-arrow.png"));

    Font display = new Font("Sans Serif",Font.BOLD,14);


    public MainMoviePage()
    {
        createGUI();
        createCenterPanel();
        addLogoImage();
        addUserIcon();
        addExitImage();
        addWelcomeText();
        addSomeText();
        addStateField();
        addCityField();
        addUriMovieField();
        addAndhadoonMovieField();
        addAspirantsMovieField();
        addTanhajiMovieField();
        addMasterMovieField();
        addBackImage();
    }

    public void createGUI()
    {
        movieList = new JFrame();
        movieList.getContentPane().setLayout(null);
        movieList.setUndecorated(true);
        movieList.setSize(880,650);
        movieList.setLocationRelativeTo(null);
        movieList.getContentPane().setBackground(Color.orange);
        movieList.setVisible(true);
    }

    public void createCenterPanel()
    {
        centrePanel = new JPanel();
        centrePanel.setLayout(null);
        centrePanel.setBounds(0,0,880,55);
        centrePanel.setBackground(Color.gray);
        movieList.getContentPane().add(centrePanel);

    }

    public void addUserIcon()
    {
        userIcon.setBounds(830,3,50,50);
        centrePanel.add(userIcon);
        movieList.getContentPane().add(centrePanel);

    }

    public void addExitImage()
    {
        exitCross.setBounds(10,12,30,30);
        exitCross.setBorder(BorderFactory.createLineBorder(Color.black));
        exitCross.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                movieList.dispose();
            }
        });
       centrePanel.add(exitCross);
       movieList.getContentPane().add(centrePanel);
    }

    public void addWelcomeText()
    {
        welcome.setBounds(350,6,200,25);
        welcome.setFont(new Font("Sans Serif",Font.BOLD,25));
        welcome.setForeground(Color.black);
        centrePanel.add(welcome);
        movieList.getContentPane().add(centrePanel);
    }

    public void addSomeText()
    {
        select.setBounds(390,35,400,15);
        select.setFont(new Font("Sans Serif",Font.PLAIN,15));
        select.setForeground(Color.white);
        centrePanel.add(select);
        movieList.getContentPane().add(centrePanel);
    }

    public void addStateField()
    {
        selectState.setBounds(50,70,150,30);
        selectState.setFont(display);
        movieList.add(selectState);
        state.setBounds(150,70,70,30);
        state.setFont(display);
        state.setBackground(Color.orange);
        state.setBorder(BorderFactory.createLineBorder(Color.white,2));
        movieList.add(state);
    }

    public void addCityField()
    {
        selectCity.setBounds(660,70,150,30);
        selectCity.setFont(display);
        movieList.add(selectCity);
        city.setBounds(750,70,100,30);
        city.setFont(display);
        city.setBackground(Color.orange);
        city.setBorder(BorderFactory.createLineBorder(Color.white,2));
        movieList.add(city);
    }

    public void addLogoImage()
    {
        logo.setBounds(60,1,55,55);
        centrePanel.add(logo);
        movieList.getContentPane().add(centrePanel);
    }

    public void addUriMovieField()
    {
        uriMovieImage.setBounds(18,116,200,200);
        movieList.add(uriMovieImage);
        bookNowUriButton.setBounds(18,320,200,50);
        bookNowUriButton.addActionListener(this);
        movieList.add(bookNowUriButton);
    }

    public void addAndhadoonMovieField()
    {
        andhadoonMovieImage.setBounds(234,116,200,200);
        movieList.add(andhadoonMovieImage);
        bookNowAndhaButton.setBounds(234,320,200,50);
        bookNowAndhaButton.addActionListener(this);
        movieList.add(bookNowAndhaButton);
    }

    public void addAspirantsMovieField()
    {
        aspirantsMovieImage.setBounds(450,116,200,200);
        movieList.add(aspirantsMovieImage);
        bookNowTvfButton.setBounds(450,320,200,50);
        bookNowTvfButton.addActionListener(this);
        movieList.add(bookNowTvfButton);
    }

    public void addTanhajiMovieField()
    {
        tanhajiMovieImage.setBounds(664,116,200,200);
        movieList.add(tanhajiMovieImage);
        bookNowTanhajiButton.setBounds(664,320,200,50);
        bookNowTanhajiButton.addActionListener(this);
        movieList.add(bookNowTanhajiButton);
    }

    public void addMasterMovieField()
    {
        masterMovieImage.setBounds(340,386,200,200);
        movieList.add(masterMovieImage);
        bookNowMasterButton.setBounds(340,590,200,50);
        bookNowMasterButton.addActionListener(this);
        movieList.add(bookNowMasterButton);
    }

    public void addBackImage()
    {
        backImage.setBounds(10,610,30,30);
        backImage.setBorder(BorderFactory.createLineBorder(Color.black));
        backImage.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new LoginPage().loginPage.setVisible(true);
                movieList.dispose();
            }
        });
        movieList.add(backImage);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == bookNowUriButton)
        {
            new MovieUri().movieUri.setVisible(true);
            movieList.dispose();
        }

        if (e.getSource() == bookNowAndhaButton)
        {
            new MovieAndhadoon().movieAndhadoon.setVisible(true);
            movieList.dispose();
        }

        if (e.getSource() == bookNowTvfButton)
        {
            new MovieAspirants().movieAspirants.setVisible(true);
            movieList.dispose();
        }

        if (e.getSource() == bookNowTanhajiButton)
        {
            new MovieTanhaji().movieTanhaji.setVisible(true);
            movieList.dispose();
        }

        if (e.getSource() == bookNowMasterButton)
        {
            new MovieMaster().movieMaster.setVisible(true);
            movieList.dispose();
        }

    }



    public static void main(String[] args) {

        new MainMoviePage();
    }
}
