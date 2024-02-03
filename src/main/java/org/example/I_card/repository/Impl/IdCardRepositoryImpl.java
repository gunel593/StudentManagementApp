package org.example.I_card.repository.Impl;

import org.example.I_card.model.entity.IdCard;
import org.example.I_card.repository.IdCardRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class IdCardRepositoryImpl implements IdCardRepository {
    private static final IdCardRepositoryImpl INSTANCE = new IdCardRepositoryImpl();

    private IdCardRepositoryImpl() {

    }

    public static IdCardRepositoryImpl getInstance() {
        return INSTANCE;
    }

    @Override
    public List<IdCard> getAll() {
        try {
            Connection cn = getConnections();
            String query = "SELECT i.id,i.name,i.surname,i.fin_code,i.serial_number,i.series FROM java_baza.id_card i Where i.id=1";
            Statement st = cn.createStatement();
            ResultSet resultSet = st.executeQuery(query);
            List<IdCard> idCards = new ArrayList<>();
            while (resultSet.next()) {
                IdCard idCard = IdCard.builder().id(resultSet.getLong("id")).
                        name(resultSet.getString("name")).
                        surname(resultSet.getString("surname")).
                        age(resultSet.getInt("age")).
                        finCode(resultSet.getString("finCode")).
                        series(resultSet.getString("series")).
                        serialNumber(resultSet.getString("serialNumber"))
                        .build();
                idCards.add(idCard);
            }
            cn.close();
            return null;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException();

        }
    }

    private Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/teacher_table?useSSL=false";
            String username = "root";
            String password = "cehenemmeleyi01!";
            return DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("error");
        }
    }

    @Override
    public IdCard getById(Long id) {
        try {
            Connection cn = getConnections();///? men connection yazanda eror verdi
            String query = "SELECT i.id,i.name,i.surname,i.fin_code,i.serial_number,i.series FROM java_baza.id_card i where i.id=1";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setLong(1, id);
            ResultSet resultSet = pst.executeQuery(query);
            if (resultSet.next() == false) {
                return null;
            }
            ;
            IdCard idCard = IdCard.builder().id(resultSet.getLong("id")).
                    name(resultSet.getString("name")).
                    surname(resultSet.getString("surname")).
                    age(resultSet.getInt("age")).
                    finCode(resultSet.getString("finCode")).
                    series(resultSet.getString("series")).
                    serialNumber(resultSet.getString("serialNumber"))
                    .build();

            cn.close();
            return idCard;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException();

        }
    }

    private Connection getConnections() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/teacher_table?useSSL=false";
            String username = "root";
            String password = "cehenemmeleyi01!";
            return DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("error");
        }
    }

    @Override
    public boolean insert(IdCard idCard) {
        try {
            Connection cn = getConnection();///? men connection yazanda eror verdi
            String query = "insert into id_card(name,surname,fin_code,series,serial_number) values(?,?,?,?,?,?);";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setString(1, idCard.getName());
            pst.setString(2, idCard.getSurname());
            pst.setInt(3, idCard.getAge());
            pst.setString(4, idCard.getFinCode());
            pst.setString(5, idCard.getSeries());
            pst.setString(6, idCard.getSerialNumber());
            pst.executeUpdate();
            cn.close();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;

        }
    }
//    private  Connection getConnection() {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            String url = "jdbc:mysql://localhost:3306/teacher_table?useSSL=false";
//            String username = "root";
//            String password = "cehenemmeleyi01!";
//            return  DriverManager.getConnection(url,username,password);
//        }catch (Exception ex){
//            ex.printStackTrace();
//            throw new RuntimeException("error");
//        }
//    }

    @Override
    public boolean update(IdCard idCard) {
        try {
            Connection cn = getConnection();///? men connection yazanda eror verdi
            String query = "update java_baza.id_card i set i.fin_code=? where i.id =?;";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setString(4, idCard.getFinCode());

            pst.executeUpdate();


            cn.close();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;

        }
    }


    @Override
    public boolean delete(Long id) {
        try {
            Connection cn = getConnection();///TODO
            String query = "delete from id_card i where i.id =?;";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setLong(1, id);

            pst.executeUpdate();


            cn.close();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;

        }
    }

}

