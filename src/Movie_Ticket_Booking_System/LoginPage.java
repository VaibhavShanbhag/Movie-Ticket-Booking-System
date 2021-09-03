package Movie_Ticket_Booking_System;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.ResourceBundle;

public class LoginPage implements FocusListener, ActionListener{
    JFrame loginPage;
    JPanel leftPanel;
    JLabel theatreLogo = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Theatrelogo.png"));
    Timer time;
    JLabel movieImage;
    String[] movieList = {"C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Movie-1.jpg",
                          "C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Movie-2.jpg",
                          "C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Movie-3.jpg",
                          "C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Movie-4.jpg",
                          "C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Movie-5.jpg",
                          "C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Movie-6.jpg",
                          "C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Movie-7.jpg",
                          "C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Movie-8.jpg",
                          "C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Movie-9.jpg",
                          "C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Movie-10.jpg"
                        };
    int x = 0;
    JLabel welcomeText;
    JLabel loginText;
    JLabel emailLogo = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\mail-inbox-app.png"));;
    JLabel passwordLogo = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\padlock.png"));
    JTextField email = new JTextField();
    JPasswordField password = new JPasswordField();
    JButton login = new JButton("Login");
    JLabel account_info = new JLabel("Don't have an account?");
    JLabel signUp = new JLabel("Signup");
    JLabel exitCross = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\letter-x.png"));
    JLabel refreshIcon = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\ref.png"));
    Border border = BorderFactory.createLineBorder(Color.white,2);
    Font font = new Font("Sans Serif",Font.PLAIN,15);

    public LoginPage()
    {
        createGUI();
        addRefreshImage();
        addExitImage();
        createLeftPanel();
        addImageLogo();
        addWelcomeText();
        addLoginText();
        addUsernameField();
        addPasswordField();
        addLoginButton();
        addDownTextInfo();
        addDownMovieImage();
    }

    public void createGUI()
    {
        loginPage = new JFrame();
        loginPage.getContentPane().setLayout(null);
        loginPage.setUndecorated(true);
        loginPage.setSize(880,500);
        loginPage.setLocationRelativeTo(null);
        loginPage.getContentPane().setBackground(Color.orange);
        loginPage.setVisible(true);

    }

    public void createLeftPanel()
    {
        leftPanel = new JPanel();
        leftPanel.setLayout(null);
        leftPanel.setBounds(0,0,440,500);
        leftPanel.setBackground(Color.gray);
        loginPage.getContentPane().add(leftPanel);
    }

    public void addImageLogo()
    {
        theatreLogo.setBounds(115,2,200,180);
        leftPanel.add(theatreLogo);
        loginPage.getContentPane().add(leftPanel);
    }

    public void addDownMovieImage()
    {
        movieImage = new JLabel();
        movieImage.setBounds(0,208,450,300);

        addImage(4);

        time = new Timer(1500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addImage(x);
                x++;

                if(x >= movieList.length)
                {
                    x = 0;
                }

            }
        });

        leftPanel.add(movieImage);
        loginPage.getContentPane().add(leftPanel);
        time.start();
    }

    public void addImage(int i)
    {
        ImageIcon icon = new ImageIcon(movieList[x]);
        Image img = icon.getImage();
        Image img1 = img.getScaledInstance(movieImage.getWidth(),movieImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon MovieImage = new ImageIcon(img1);
        movieImage.setIcon(MovieImage);
    }

    public void addWelcomeText()
    {
        welcomeText = new JLabel("Welcome");
        welcomeText.setBounds(600,15,150,40);
        welcomeText.setFont(new Font("Sans Serif",Font.BOLD,25));
        welcomeText.setForeground(Color.black);
        welcomeText.setText("Welcome");
        loginPage.add(welcomeText);
    }

    public void addLoginText()
    {
        loginText = new JLabel("Login");
        loginText.setBounds(450,68,150,30);
        loginText.setFont(new Font("Sans Serif",Font.BOLD,20));
        loginText.setForeground(Color.black);
        loginPage.add(loginText);
    }

    public void addUsernameField()
    {
        emailLogo.setBounds(536,135,35,35);
        loginPage.add(emailLogo);
        email.setBounds(600,137,230,30);
        email.setBackground(Color.orange);
        email.setBorder(border);
        email.setFont(font);
        email.addFocusListener(this);
        loginPage.add(email);

    }

    public void addPasswordField()
    {
        passwordLogo.setBounds(536,222,35,35);
        loginPage.add(passwordLogo);
        password.setBounds(600,224,230,30);
        password.setBackground(Color.orange);
        password.setBorder(border);
        password.setFont(font);
        password.addFocusListener(this);
        loginPage.add(password);
    }


    public void addLoginButton()
    {
        login.setBounds(539,308,297,35);
        login.setBorder(BorderFactory.createLineBorder(Color.white,2));
        login.setFont(new Font("Sans Serif",Font.BOLD,16));
        login.setBackground(Color.decode("#43cea2"));
        login.addActionListener(this);
        loginPage.add(login);
    }

    public void addDownTextInfo()
    {
        account_info.setBounds(536,467,180,30);
        account_info.setFont(new Font("Sans Serif",Font.PLAIN,16));
        signUp.setBounds(704,467,70,30);
        signUp.setForeground(Color.blue);
        signUp.setFont(new Font("Sans Serif",Font.PLAIN,16));
        signUp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new SignupPage().signUpPage.setVisible(true);
                loginPage.dispose();
            }
        });
        loginPage.add(account_info);
        loginPage.add(signUp);
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (e.getComponent() == email)
        {
            email.setBorder(BorderFactory.createLineBorder(Color.cyan, 2));
        }

        if (e.getComponent() == password)
        {
            password.setBorder(BorderFactory.createLineBorder(Color.cyan, 2));
        }

    }


    @Override
    public void focusLost(FocusEvent e) {
        if(e.getComponent() == email)
        {
            email.setBorder(BorderFactory.createLineBorder(Color.white,2));
        }

        if (e.getComponent() == password) {
            password.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String emailfield = email.getText();
        String passwordfield = String.valueOf(password.getPassword());
        Connection connection = null;
        ResultSet Rs = null;
        Statement St = null;


        if (passwordfield.isEmpty() || emailfield.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Enter Password and email id","Mesage",JOptionPane.WARNING_MESSAGE);
        }

        else {

            String query = "select * from user_info where email_id ='" + emailfield + "' and password=" + passwordfield + "";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_tickets_booking_system", "root", "");
                St = connection.createStatement();
                Rs = St.executeQuery(query);
                PreparedStatement pstatement = connection.prepareStatement("insert into movie_ticket_booked_info values(?,?)");
                pstatement.setString(1,emailfield);
                pstatement.setString(2,passwordfield);

                if (Rs.next()) {
                    new MainMoviePage().movieList.setVisible(true);
                    loginPage.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Email-Id", "Message", JOptionPane.WARNING_MESSAGE);
                }

            } catch (ClassNotFoundException | SQLException classNotFoundException) {
                JOptionPane.showMessageDialog(null, "500 -- Internal Server Error", "Message", JOptionPane.WARNING_MESSAGE);
                classNotFoundException.printStackTrace();
            }
        }
    }

    public void addExitImage()
    {
        exitCross.setBounds(840,5,30,30);
        exitCross.setBorder(BorderFactory.createLineBorder(Color.black));
        exitCross.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                loginPage.dispose();

            }
        });
        loginPage.add(exitCross);
    }

    public void addRefreshImage()
    {
        refreshIcon.setBounds(445,5,30,30);
        refreshIcon.setBorder(BorderFactory.createLineBorder(Color.black));
        refreshIcon.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                loginPage.setVisible(false);
                loginPage.setVisible(true);
            }
        });
        loginPage.add(refreshIcon);
    }


    public static void main(String[] args) {

        new LoginPage();

    }
}
