package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.task4;

import a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.dao.AbstractDao;
import a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.dao.Group;
import a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.dao.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO extends AbstractDao {

    private static final String LOAD_ALL_QUERY = "SELECT * FROM users;";
    private static final String LOAD_BY_ID_QUERY = "SELECT * FROM users WHERE id=?;";
    private static final String CREATE_QUERY = "INSERT INTO users(name) VALUES(?);";
    private static final String UPDATE_QUERY = "UPDATE users SET name=? WHERE id=?;";
    private static final String DELETE_QUERY = "DELETE FROM users WHERE id=?;";

    @Override
    protected PreparedStatement saveNewStatement(Connection con, Model user) throws SQLException {
        String[] generatedColumns = { "id" };
        PreparedStatement ps = con.prepareStatement(CREATE_QUERY, generatedColumns);
        ps.setString(1, ((User) user).getName());
        return ps;

    }

    @Override
    protected PreparedStatement updateExistingStatement(Connection con, Model user) throws SQLException {
        PreparedStatement ps = con.prepareStatement(UPDATE_QUERY);
        ps.setString(1, ((User) user).getName());
        ps.setLong(2, user.getId());
        return ps;
    }

    @Override
    protected PreparedStatement deleteStatement(Connection con, Model user) throws SQLException {
        PreparedStatement ps = con.prepareStatement(DELETE_QUERY);
        ps.setLong(1, user.getId());
        return ps;

    }

    @Override
    protected Model newFromResultSet(ResultSet rs) throws SQLException {
        return new Group(rs.getLong("id"), rs.getString("name"));
    }

    @Override
    protected String getLoadAllQuery() {
        return LOAD_ALL_QUERY;
    }

    @Override
    protected String getLoadByIdQuery() {
        return LOAD_BY_ID_QUERY;
    }
}
