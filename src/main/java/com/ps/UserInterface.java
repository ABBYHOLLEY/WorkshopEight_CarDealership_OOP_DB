package com.ps;

import com.ps.data.VehicleDAOImpl;
import com.ps.models.Vehicle;
import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private static Scanner scanner = new Scanner(System.in);
    private static Scanner inputScanner = new Scanner(System.in);
    private static BasicDataSource basicDataSource = new BasicDataSource();
    private static VehicleDAOImpl vehicleDAOImpl = new VehicleDAOImpl(basicDataSource);

    public static void init() {
    }

    public static void display(String username, String password) {
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/Workshop8_CarDealership_DB");
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);

        init();

        int mainMenuCommand;

    }
}
