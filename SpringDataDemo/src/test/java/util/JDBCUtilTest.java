package util;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.*;

/**
 * Created by Thpffcj on 2017/8/22.
 */
public class JDBCUtilTest {

    @Test
    public void testGetConnection() throws SQLException, ClassNotFoundException, IOException {
        Connection connection = JDBCUtil.getConnection();
        Assert.assertNotNull(connection);
    }
}