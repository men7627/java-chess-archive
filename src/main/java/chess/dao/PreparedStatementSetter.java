package chess.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface PreparedStatementSetter {
        void setParameters(PreparedStatement pstmt) throws SQLException;
}
