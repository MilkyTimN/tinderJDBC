package repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface DbHelper {

    PreparedStatement getPreparedStatement(String sql) throws SQLException;
}
