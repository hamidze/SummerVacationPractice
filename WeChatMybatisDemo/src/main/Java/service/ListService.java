package service;

import bean.Message;
import dao.MessageDao;

import java.util.List;

/**
 * Created by Thpffcj on 2017/7/17.
 */
public class ListService {

    public List<Message> queryMessageList(String command, String description){
        MessageDao messageDao = new MessageDao();
        return messageDao.queryMessageList(command, description);
    }
}
