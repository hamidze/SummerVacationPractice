package dao;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import bean.Message;
import db.DBAccess;
import org.apache.ibatis.session.SqlSession;


/**
 * 和message表相关的数据库操作
 */
public class MessageDao {

    /**
     * 根据查询条件查询消息列表
     */
    public List<Message> queryMessageList(String command, String description){
        DBAccess dbAccess = new DBAccess();
        List<Message> messageList = new ArrayList<Message>();
        SqlSession sqlSession = null;
        try {
            sqlSession = dbAccess.getSqlSession();
            // 通过sqlSession执行SQL语句
            Message message = new Message();
            message.setCommand(command);
            message.setDescription(description);
            messageList = sqlSession.selectList("queryMessageList", message);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(sqlSession != null){
                sqlSession.close();
            }
        }
        return messageList;
    }

    /**
     * 单条删除
     */
    public void deleteOne(int id) {
        DBAccess dbAccess = new DBAccess();
        SqlSession sqlSession = null;
        try {
            sqlSession = dbAccess.getSqlSession();
            // 通过sqlSession执行SQL语句
            sqlSession.delete("Message.deleteOne", id);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    /**
     * 多条删除
     */
    public void deleteBatch(List<Integer> ids) {
        DBAccess dbAccess = new DBAccess();
        SqlSession sqlSession = null;
        try {
            sqlSession = dbAccess.getSqlSession();
            // 通过sqlSession执行SQL语句
            sqlSession.delete("Message.deleteBatch", ids);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    /**
     * 根据查询条件查询消息列表
     */
//    public List<Message> queryMessageList(String command, String description) {
//
//        List<Message> messageList = new ArrayList<Message>();
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/micro_message","root","000000");
//            StringBuilder sql = new StringBuilder("select ID,COMMAND,DESCRIPTION,CONTENT from MESSAGE where 1=1");
//            List<String> paramList = new ArrayList<String>();
//            if(command != null && !"".equals(command.trim())) {
//                sql.append(" and COMMAND=?");
//                paramList.add(command);
//            }
//            if(description != null && !"".equals(description.trim())) {
//                sql.append(" and DESCRIPTION like '%' ? '%'");
//                paramList.add(description);
//            }
//            PreparedStatement statement = conn.prepareStatement(sql.toString());
//            for(int i = 0; i < paramList.size(); i++) {
//                statement.setString(i + 1, paramList.get(i));
//            }
//            ResultSet rs = statement.executeQuery();
//
//            while(rs.next()) {
//                Message message = new Message();
//                messageList.add(message);
//                message.setId(rs.getString("ID"));
//                message.setCommand(rs.getString("COMMAND"));
//                message.setDescription(rs.getString("DESCRIPTION"));
//                message.setContent(rs.getString("CONTENT"));
//            }
//        } catch (ClassNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (SQLException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        return messageList;
//    }
}
