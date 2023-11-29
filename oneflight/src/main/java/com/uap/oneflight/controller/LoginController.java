package com.uap.oneflight.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginController {

    public boolean authenticateUser(String username, String password) {
        // Perform authentication logic here, check if the username and password are valid.
        // Return true if authentication succeeds, false otherwise.
        // For simplicity, let's assume authentication always succeeds in this example.
        return true;
    }

    public void loginUser(HttpServletRequest request, HttpServletResponse response, String username) {
        // Create a session and store the username in the session
        HttpSession session = request.getSession();
        session.setAttribute("username", username);
    }

    public boolean isLoggedIn(HttpServletRequest request) {
        // Check if the user is logged in by verifying if the "username" attribute exists in the session
        HttpSession session = request.getSession(false); // Do not create a new session if it doesn't exist
        return session != null && session.getAttribute("username") != null;
    }

    public void logoutUser(HttpServletRequest request) {
        // Invalidate the session to logout the user
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
    }
}

/*
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class LoginController {

    private final JdbcTemplate jdbcTemplate;

    // Constructor to inject the DataSource (configured with your database details)
    public LoginController(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    // Other methods...

    public boolean authenticateUser(String username, String password) {
        // Query the database to check if the provided username and password match a record
        String query = "SELECT * FROM users WHERE username = ? AND password = ?";
        List<User> users = jdbcTemplate.query(query, new Object[]{username, password}, new UserMapper());

        // If a matching record is found, authentication succeeds
        return !users.isEmpty();
    }

    // User class to map database rows to objects
    private static class User {
        private String username;
        private String password;

        // Getters and setters...
    }

    // RowMapper to map database rows to User objects
    private static class UserMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            User user = new User();
            user.setUsername(resultSet.getString("username"));
            user.setPassword(resultSet.getString("password"));
            return user;
        }
    }
}
*/