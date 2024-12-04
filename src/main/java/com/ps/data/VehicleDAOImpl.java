package com.ps.data;

import com.ps.models.Vehicle;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VehicleDAOImpl implements VehicleDAOInt{
    private DataSource dataSource;

    public VehicleDAOImpl(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Override
    public Vehicle getByVin(String vin) {
        return null;
    }

    @Override
    public List<Vehicle> getAll() {
        return List.of();
    }

    @Override
    public void create(Vehicle vehicle) {

    }

    @Override
    public void update(String vin) {

    }

    @Override
    public void delete(String vin) {

    }
    private Vehicle mapVehicle(ResultSet resultSet) throws SQLException{
        return new Vehicle();
    }
}
