package Movie_Ticket_Booking_System;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class PaymentForm implements FocusListener {
    JFrame paymentForm;
    JPanel centrePanel;
    JLabel userIcon = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\profile-user.png"));
    JLabel logo = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Theatrelogo1.png"));
    JLabel exitCross = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\letter-x.png"));
    JLabel someText = new JLabel("Payment Form");
    JLabel backImage = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\left-arrow.png"));
    JLabel razorpayLogo = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Payment Logo1.png"));
    JPanel paymentPanel = new JPanel();
    JLabel transactionId = new JLabel("Transaction ID");
    JTextField transactionText = new JTextField();
    JLabel totalAmount = new JLabel("Total Amount");
    JTextField totalAmountText = new JTextField();
    JLabel cardType = new JLabel("Select Card Type");
    JRadioButton debitCard = new JRadioButton("Debit Card");
    JRadioButton creditCard = new JRadioButton("Credit Card");
    ButtonGroup cardGroup = new ButtonGroup();
    JLabel cardNumber = new JLabel("Card Number");
    JTextField cardNumberText = new JTextField();
    JLabel expiryDate = new JLabel("Expiry Date");
    JTextField expiryDateText = new JTextField();
    JLabel cvv = new JLabel("CVV");
    JPasswordField cvvText = new JPasswordField();
    JLabel cardHolderName = new JLabel("Card Holder's Name");
    JTextField cardHolderNameText = new JTextField();
    JLabel cardSupported = new JLabel("Card's Supported");
    JLabel masterCard = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Mastercard1.jpg"));
    JLabel rupayCard = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\Rupay1.jpg"));
    JLabel visaCard = new JLabel(new ImageIcon("C:\\Users\\VAIBHAV SHANBHAG\\IdeaProjects\\Movie Ticket Booking System\\src\\Movie_Ticket_Booking_System\\visa1.png"));
    JButton payment = new JButton("Pay Now");


    static long tranId = 2021001;

    Font inputFieldsFont = new Font("Sans Serif",Font.PLAIN,14);
    Font displayFont = new Font("Sans Serif",Font.BOLD,15);
    Border border = BorderFactory.createLineBorder(Color.black,2);

    public PaymentForm()
    {
        createGUI();
        createCenterPanel();
        addLogoImage();
        addUserIcon();
        addExitImage();
        addSomeText();
        addBackImage();
        addRazorPayLogo();
        addPaymentPanel();
        addTransAmount();
        addCardTypeDetails();
        addCardNumberDetails();
        addExpiryDateCVVDetails();
        addCardHolderDetails();
        addCardSupportedDetails();
        addPaymentButton();
    }

    public void createGUI()
    {
        paymentForm = new JFrame();
        paymentForm.getContentPane().setLayout(null);
        paymentForm.setUndecorated(true);
        paymentForm.setSize(800,550);
        paymentForm.setLocationRelativeTo(null);
        paymentForm.getContentPane().setBackground(Color.orange);
        paymentForm.setVisible(true);
    }

    public void createCenterPanel()
    {
        centrePanel = new JPanel();
        centrePanel.setLayout(null);
        centrePanel.setBounds(0,0,800,55);
        centrePanel.setBackground(Color.gray);
        paymentForm.getContentPane().add(centrePanel);

    }

    public void addUserIcon()
    {
        userIcon.setBounds(750,3,50,50);
        centrePanel.add(userIcon);
        paymentForm.getContentPane().add(centrePanel);

    }

    public void addExitImage()
    {
        exitCross.setBounds(10,12,30,30);
        exitCross.setBorder(BorderFactory.createLineBorder(Color.black));
        exitCross.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                paymentForm.dispose();
            }
        });
        centrePanel.add(exitCross);
        paymentForm.getContentPane().add(centrePanel);
    }

    public void addLogoImage()
    {
        logo.setBounds(60,1,55,55);
        centrePanel.add(logo);
        paymentForm.getContentPane().add(centrePanel);
    }

    public void addSomeText()
    {
        someText.setBounds(320,15,300,25);
        someText.setFont(new Font("Sans Serif",Font.BOLD,25));
        someText.setForeground(Color.black);
        centrePanel.add(someText);
        paymentForm.getContentPane().add(centrePanel);
    }

    public void addBackImage()
    {
        backImage.setBounds(15,505,30,30);
        backImage.setBorder(BorderFactory.createLineBorder(Color.black));
        backImage.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new MainMoviePage().movieList.setVisible(true);
                paymentForm.dispose();
            }
        });
        paymentForm.add(backImage);
    }

    public void addRazorPayLogo()
    {
        razorpayLogo.setBounds(310,73,200,50);
        paymentForm.add(razorpayLogo);
    }

    public void addPaymentPanel()
    {
        paymentPanel.setLayout(null);
        paymentPanel.setBounds(190,135,450,300);
        paymentPanel.setBackground(Color.decode("#f7f0f0"));
        paymentForm.getContentPane().add(paymentPanel);
    }

    public void addTransAmount()
    {
        transactionId.setBounds(10,5,120,30);
        transactionId.setFont(displayFont);
        paymentPanel.add(transactionId);
        paymentForm.getContentPane().add(paymentPanel);

        transactionText.setBounds(123,5,64,30);
        transactionText.setText(String.valueOf(tranId));
        transactionText.setFont(inputFieldsFont);
        transactionText.setBorder(border);
        transactionText.setEditable(false);
        transactionText.setBackground(Color.decode("#f7f0f0"));
        paymentPanel.add(transactionText);
        paymentForm.getContentPane().add(paymentPanel);

        totalAmount.setBounds(285,5,100,30);
        totalAmount.setFont(displayFont);
        paymentPanel.add(totalAmount);
        paymentForm.getContentPane().add(paymentPanel);

        totalAmountText.setBounds(388,5,50,30);
        totalAmountText.setFont(inputFieldsFont);
        totalAmountText.setText("0");
        totalAmountText.setBackground(Color.decode("#f7f0f0"));
        totalAmountText.setBorder(border);
        totalAmountText.setEditable(false);
        paymentPanel.add(totalAmountText);
        paymentForm.getContentPane().add(paymentPanel);
    }

    public void addCardTypeDetails()
    {
        cardType.setBounds(10,45,150,30);
        cardType.setFont(displayFont);
        paymentPanel.add(cardType);
        paymentForm.getContentPane().add(paymentPanel);

        debitCard.setBounds(140,46,100,30);
        debitCard.setFont(inputFieldsFont);
        cardGroup.add(debitCard);
        debitCard.setBackground(null);
        paymentPanel.add(debitCard);
        paymentForm.getContentPane().add(paymentPanel);

        creditCard.setBounds(240,46,100,30);
        creditCard.setFont(inputFieldsFont);
        cardGroup.add(creditCard);
        creditCard.setBackground(null);
        paymentPanel.add(creditCard);
        paymentForm.getContentPane().add(paymentPanel);

    }

    public void addCardNumberDetails()
    {
        cardNumber.setBounds(10,88,100,30);
        cardNumber.setFont(displayFont);
        paymentPanel.add(cardNumber);
        paymentForm.getContentPane().add(paymentPanel);

        cardNumberText.setBounds(122,88,250,30);
        cardNumberText.setFont(inputFieldsFont);
        cardNumberText.setBackground(Color.decode("#f7f0f0"));
        cardNumberText.setBorder(border);
        cardNumberText.addFocusListener(this);
        paymentPanel.add(cardNumberText);
        paymentForm.getContentPane().add(paymentPanel);
    }

    public void addExpiryDateCVVDetails()
    {
        expiryDate.setBounds(10,140,100,30);
        expiryDate.setFont(displayFont);
        paymentPanel.add(expiryDate);
        paymentForm.getContentPane().add(paymentPanel);

        expiryDateText.setBounds(105,140,48,30);
        expiryDateText.setFont(inputFieldsFont);
        expiryDateText.setBackground(Color.decode("#f7f0f0"));
        expiryDateText.setBorder(border);
        expiryDateText.addFocusListener(this);
        paymentPanel.add(expiryDateText);
        paymentForm.getContentPane().add(paymentPanel);

        cvv.setBounds(320,140,40,30);
        cvv.setFont(displayFont);
        paymentPanel.add(cvv);
        paymentForm.getContentPane().add(paymentPanel);

        cvvText.setBounds(363,140,35,30);
        cvvText.setFont(inputFieldsFont);
        cvvText.setBackground(Color.decode("#f7f0f0"));
        cvvText.setBorder(border);
        cvvText.addFocusListener(this);
        paymentPanel.add(cvvText);
        paymentForm.getContentPane().add(paymentPanel);
    }

    public void addCardHolderDetails()
    {
        cardHolderName.setBounds(10,193,150,30);
        cardHolderName.setFont(displayFont);
        paymentPanel.add(cardHolderName);
        paymentForm.getContentPane().add(paymentPanel);

        cardHolderNameText.setBounds(165,193,250,30);
        cardHolderNameText.setFont(inputFieldsFont);
        cardHolderNameText.setBackground(Color.decode("#f7f0f0"));
        cardHolderNameText.setBorder(border);
        cardHolderNameText.addFocusListener(this);
        paymentPanel.add(cardHolderNameText);
        paymentForm.getContentPane().add(paymentPanel);

    }

    public void addCardSupportedDetails()
    {
        cardSupported.setBounds(10,255,150,30);
        cardSupported.setFont(displayFont);
        paymentPanel.add(cardSupported);
        paymentForm.getContentPane().add(paymentPanel);

        rupayCard.setBounds(165,245,80,45);
        paymentPanel.add(rupayCard);
        paymentForm.getContentPane().add(paymentPanel);

        masterCard.setBounds(250,245,80,45);
        paymentPanel.add(masterCard);
        paymentForm.getContentPane().add(paymentPanel);

        visaCard.setBounds(340,245,80,45);
        paymentPanel.add(visaCard);
        paymentForm.getContentPane().add(paymentPanel);
    }

    public void addPaymentButton()
    {
        payment.setBounds(300,455,210,40);
        payment.setFont(displayFont);
        payment.setBackground(Color.cyan);
        payment.setBorder(border);
        paymentForm.add(payment);
    }

    @Override
    public void focusGained(FocusEvent e) {

        if (e.getComponent().equals(cardNumberText))
        {
            cardNumberText.setBorder(BorderFactory.createLineBorder(Color.cyan,2));
        }

        if (e.getComponent().equals(expiryDateText))
        {
            expiryDateText.setBorder(BorderFactory.createLineBorder(Color.cyan,2));
        }

        if (e.getComponent().equals(cvvText))
        {
            cvvText.setBorder(BorderFactory.createLineBorder(Color.cyan,2));
        }

        if (e.getComponent().equals(cardHolderNameText))
        {
            cardHolderNameText.setBorder(BorderFactory.createLineBorder(Color.cyan,2));
        }

    }

    @Override
    public void focusLost(FocusEvent e) {

        if (e.getComponent().equals(cardNumberText))
        {
            cardNumberText.setBorder(border);
        }

        if (e.getComponent().equals(expiryDateText))
        {
            expiryDateText.setBorder(border);
        }

        if (e.getComponent().equals(cvvText))
        {
            cvvText.setBorder(border);
        }

        if (e.getComponent().equals(cardHolderNameText))
        {
            cardHolderNameText.setBorder(border);
        }
    }

    public static void main(String[] args) {

        new PaymentForm();

    }
}
