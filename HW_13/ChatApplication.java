package edu.neu.mgen;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class ChatApplication {

    static String username1 = "", password1 = "";
    static String username2 = "", password2 = "";
    static ChatWindow chat1, chat2;
    
    //Login and Signup window
    static class LoginWindow extends JFrame {

        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        LoginWindow() {
            setTitle("Login / Sign Up");
            setSize(300, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new GridLayout(3, 2, 10, 10));

            JButton loginButton = new JButton("Login");
            JButton signupButton = new JButton("Sign Up");

            add(new JLabel("Username:"));
            add(usernameField);
            add(new JLabel("Password:"));
            add(passwordField);
            add(loginButton);
            add(signupButton);

            loginButton.addActionListener(e -> {
                String username = usernameField.getText().trim();
                String password = new String(passwordField.getPassword());

                boolean validUser = (username.equals(username1) && password.equals(password1)) || (username.equals(username2) && password.equals(password2));

                if (!validUser) {
                    JOptionPane.showMessageDialog(this, "Invalid username or password.");
                }

                if (chat1 != null && chat1.username.equals(username) || chat2 != null && chat2.username.equals(username)) {
                    JOptionPane.showMessageDialog(this, "User already logged in.");
                    return;
                }
                if (chat1 == null) {
                    chat1 = new ChatWindow(username);
                }
                else if (chat2 == null) {
                    chat2 = new ChatWindow(username);
                }
                else {
                    JOptionPane.showMessageDialog(this, "Maximum number of two users reached. Cannot log in more users.");
                }
                });

            signupButton.addActionListener(e -> {
                String username = usernameField.getText().trim();
                String password = new String(passwordField.getPassword());

                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please enter both username and password.");
                    return;
                }
                else if (username.equals(username1) || username.equals(username2)) {
                    JOptionPane.showMessageDialog(this, "Username already exists. Please choose a different username.");
                } else if (username1.isEmpty()) {
                    username1 = username;
                    password1 = password;
                    JOptionPane.showMessageDialog(this, "Sign Up of user 1 successful! You can now log in.");
                } else if (username2.isEmpty()) {
                    username2 = username;
                    password2 = password;
                    JOptionPane.showMessageDialog(this, "Sign Up of user 2 successful! You can now log in.");
                } else {
                    JOptionPane.showMessageDialog(this, "Maximum number of two users reached. Cannot sign up more users.");
                }
            });

            setLocationRelativeTo(null);
            setVisible(true);
        }
    }

    //Chat window
    static class ChatWindow extends JFrame {
        String username;
        JTextArea chatArea = new JTextArea();
        JTextField messageField = new JTextField();
        JButton sendButton = new JButton("Send");

        ChatWindow(String username) {
            this.username = username;
            setTitle("Chat - " + username);
            setSize(350, 400);
            setLayout(new BorderLayout());

            chatArea.setEditable(false);

            JPanel bottomPanel = new JPanel(new BorderLayout());
            bottomPanel.add(messageField, BorderLayout.CENTER);
            bottomPanel.add(sendButton, BorderLayout.EAST);

            add(new JScrollPane(chatArea), BorderLayout.CENTER);
            add(bottomPanel, BorderLayout.SOUTH);

            sendButton.addActionListener(e -> sendMessage());
            messageField.addActionListener(e -> sendMessage());

            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowClosed(WindowEvent e) {
                    if (chat1 == ChatWindow.this) 
                        chat1 = null;
                    if(chat2 == ChatWindow.this) 
                        chat2 = null;
                    
                    }
                });

                setLocationRelativeTo(null);
                setVisible(true);
        }

        void sendMessage() {
            String message = messageField.getText().trim();

            if (message.isEmpty())
                return;

            ChatWindow receiver = (this == chat1) ? chat2 : chat1;

            if (receiver == null) {
                JOptionPane.showMessageDialog(this, "No other user is logged in to receive the message.");
                return;
            }

            chatArea.append("You: " + message + "\n");
            receiver.chatArea.append(username + ": " + message + "\n");

            messageField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginWindow());
    }
}
