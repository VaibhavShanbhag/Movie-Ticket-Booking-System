package Movie_Ticket_Booking_System;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.toedter.calendar.JDateChooser;

public class SignupPage implements FocusListener, ActionListener{
    JFrame signUpPage;
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
    JLabel exitCross = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\letter-x.png"));
    JLabel backImage = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\left-arrow.png"));
    JLabel signUpText = new JLabel("Signup");
    JLabel firstName = new JLabel("First Name");
    JTextField firstNameText = new JTextField();
    JLabel lastName = new JLabel("Last Name");
    JTextField lastNameText = new JTextField();
    JLabel gender = new JLabel("Gender");
    JRadioButton male = new JRadioButton("Male");
    JRadioButton female = new JRadioButton("Female");
    ButtonGroup buttonGroup = new ButtonGroup();
    JLabel dob = new JLabel("Date of Birth");
    JDateChooser dob1 = new JDateChooser();
    JLabel email = new JLabel("Email-ID");
    JTextField emailText = new JTextField();
    JLabel password = new JLabel("Password");
    JPasswordField passwordText = new JPasswordField();
    JLabel confirmPassword = new JLabel("Confirm Password");
    JPasswordField confirmPasswordText = new JPasswordField();
    JButton signUp = new JButton("Signup");

    Font inputFieldsFont = new Font("Sans Serif",Font.PLAIN,15);
    Font displayFont = new Font("Sans Serif",Font.BOLD,16);
    Border border = BorderFactory.createLineBorder(Color.white,2);


    public SignupPage()
    {
        createGUI();
        addBackImage();
        addExitImage();
        createLeftPanel();
        addImageLogo();
        addSignUpText();
        addFirstNameField();
        addLastNameField();
        addGenderField();
        addDOBField();
        addEmailIDField();
        addPasswordField();
        addConfirmPasswordField();
        addSignUpButton();
        addDownMovieImage();
    }

    public void createGUI()
    {
        signUpPage = new JFrame();
        signUpPage.getContentPane().setLayout(null);
        signUpPage.setUndecorated(true);
        signUpPage.setSize(880,500);
        signUpPage.setLocationRelativeTo(null);
        signUpPage.getContentPane().setBackground(Color.orange);
        signUpPage.setVisible(true);

    }

    public void addExitImage()
    {
        exitCross.setBounds(840,5,30,30);
        exitCross.setBorder(BorderFactory.createLineBorder(Color.black));
        exitCross.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                signUpPage.dispose();
            }
        });
        signUpPage.add(exitCross);
    }

    public void createLeftPanel()
    {
        leftPanel = new JPanel();
        leftPanel.setLayout(null);
        leftPanel.setBounds(0,0,440,500);
        leftPanel.setBackground(Color.gray);
        signUpPage.getContentPane().add(leftPanel);
    }

    public void addImageLogo()
    {
        theatreLogo.setBounds(115,2,200,180);
        leftPanel.add(theatreLogo);
        signUpPage.getContentPane().add(leftPanel);
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
        signUpPage.getContentPane().add(leftPanel);
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

    public void addSignUpText()
    {
        signUpText.setBounds(630,28,150,30);
        signUpText.setFont(new Font("Sans Serif",Font.BOLD,20));
        signUpText.setForeground(Color.black);
        signUpPage.add(signUpText);
    }

    public void addFirstNameField()
    {
        firstName.setBounds(495,90,220,30);
        firstName.setFont(displayFont);
        signUpPage.add(firstName);
        firstNameText.setBounds(605,90,237,30);
        firstNameText.setFont(inputFieldsFont);
        firstNameText.setBackground(null);
        firstNameText.addFocusListener(this);
        firstNameText.setBorder(border);
        signUpPage.add(firstNameText);
    }

    public void addLastNameField()
    {
        lastName.setBounds(495,140,220,30);
        lastName.setFont(displayFont);
        signUpPage.add(lastName);
        lastNameText.setBounds(605,140,237,30);
        lastNameText.setFont(inputFieldsFont);
        lastNameText.setBackground(null);
        lastNameText.addFocusListener(this);
        lastNameText.setBorder(border);
        signUpPage.add(lastNameText);
    }

    public void addGenderField()
    {
        gender.setBounds(495,185,220,30);
        gender.setFont(displayFont);
        signUpPage.add(gender);
        male.setBounds(605,185,70,30);
        male.setFont(inputFieldsFont);
        male.setBackground(null);
        female.setBounds(690,185,90,30);
        female.setFont(inputFieldsFont);
        female.setBackground(null);
        buttonGroup.add(male);
        buttonGroup.add(female);
        signUpPage.add(male);
        signUpPage.add(female);
    }

    public void addDOBField()
    {
        String date = "yyyy-MM-dd";
        dob.setBounds(470,225,100,30);
        dob.setFont(displayFont);
        signUpPage.add(dob);
        dob1.setBounds(605,225,130,30);
        dob1.setBorder(border);
        dob1.setFont(inputFieldsFont);
        dob1.setDateFormatString(date);
        signUpPage.add(dob1);
    }

    public void addEmailIDField()
    {
        email.setBounds(495,275,90,30);
        email.setFont(displayFont);
        signUpPage.add(email);
        emailText.setBounds(605,275,237,30);
        emailText.setFont(inputFieldsFont);
        emailText.setBackground(null);
        emailText.setBorder(border);
        emailText.addFocusListener(this);
        signUpPage.add(emailText);
    }

    public void addPasswordField()
    {
        password.setBounds(495,325,150,30);
        password.setFont(displayFont);
        signUpPage.add(password);
        passwordText.setBounds(605,325,237,30);
        passwordText.setFont(inputFieldsFont);
        passwordText.setBackground(null);
        passwordText.setBorder(border);
        passwordText.addFocusListener(this);
        signUpPage.add(passwordText);
    }

    public void addConfirmPasswordField()
    {
        confirmPassword.setBounds(450,375,150,30);
        confirmPassword.setFont(displayFont);
        signUpPage.add(confirmPassword);
        confirmPasswordText.setBounds(605,375,237,30);
        confirmPasswordText.setFont(inputFieldsFont);
        confirmPasswordText.setBackground(null);
        confirmPasswordText.setBorder(border);
        confirmPasswordText.addFocusListener(this);
        signUpPage.add(confirmPasswordText);
    }

    public void addSignUpButton()
    {
        signUp.setBounds(538,440,230,35);
        signUp.setBackground(Color.decode("#43cea2"));
        signUp.setFont(displayFont);
        signUp.setBorder(border);
        signUp.addActionListener(this);
        signUpPage.add(signUp);
    }

    public void addBackImage()
    {
        backImage.setBounds(450,5,30,30);
        backImage.setBorder(BorderFactory.createLineBorder(Color.black));
        backImage.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new LoginPage().loginPage.setVisible(true);
                signUpPage.dispose();
            }
        });
        signUpPage.add(backImage);
    }


    @Override
    public void focusGained(FocusEvent e) {
        if (e.getComponent() == firstNameText)
        {
            firstNameText.setBorder(BorderFactory.createLineBorder(Color.cyan, 2));
        }

        if (e.getComponent() == lastNameText)
        {
            lastNameText.setBorder(BorderFactory.createLineBorder(Color.cyan, 2));
        }

        if (e.getComponent() == emailText)
        {
            emailText.setBorder(BorderFactory.createLineBorder(Color.cyan, 2));
        }

        if (e.getComponent() == emailText)
        {
            emailText.setBorder(BorderFactory.createLineBorder(Color.cyan, 2));
        }

        if (e.getComponent() == passwordText)
        {
            passwordText.setBorder(BorderFactory.createLineBorder(Color.cyan, 2));
        }

        if (e.getComponent() == confirmPasswordText)
        {
            confirmPasswordText.setBorder(BorderFactory.createLineBorder(Color.cyan, 2));
        }

    }


    @Override
    public void focusLost(FocusEvent e) {
        if(e.getComponent() == firstNameText)
        {
            firstNameText.setBorder(BorderFactory.createLineBorder(Color.white,2));
        }

        if (e.getComponent() == lastNameText) {
            lastNameText.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        }

        if (e.getComponent() == emailText) {
            emailText.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        }

        if (e.getComponent() == passwordText) {
            passwordText.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        }

        if (e.getComponent() == confirmPasswordText) {
            confirmPasswordText.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String firstName = firstNameText.getText();
        String lastName = lastNameText.getText();
        String maleGender = male.getText();
        String femaleGender = female.getText();
        String dob = ((JTextField)dob1.getDateEditor().getUiComponent()).getText();
        String email = emailText.getText();
        String password = String.valueOf(confirmPasswordText.getPassword());

        if((passwordText.getPassword().length < 8))
        {
            JOptionPane.showMessageDialog(null,"Password too short","Message",JOptionPane.WARNING_MESSAGE);
        }

        else if ((String.valueOf(passwordText.getPassword())).equals(String.valueOf(confirmPasswordText.getPassword())))
        {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_tickets_booking_system","root","");
                PreparedStatement Pstatement = connection.prepareStatement("insert into user_info values(?,?,?,?,?,?)");
                Pstatement.setString(1,firstName);
                Pstatement.setString(2,lastName);

                if(male.isSelected())
                {
                    Pstatement.setString(3,maleGender);
                }
                else if(female.isSelected())
                {
                    Pstatement.setString(3,femaleGender);
                }
                Pstatement.setString(4,dob);
                Pstatement.setString(5,email);
                Pstatement.setString(6,password);
                Pstatement.executeUpdate();
            }

            catch (ClassNotFoundException | SQLException classNotFoundException) {
                classNotFoundException.printStackTrace();
            }
            new LoginPage().loginPage.setVisible(true);
            signUpPage.dispose();
        }

        else
        {
            JOptionPane.showMessageDialog(null,"Password doesn't match","Message",JOptionPane.WARNING_MESSAGE);
        }

    }



    public static void main(String[] args) {

    }

}
