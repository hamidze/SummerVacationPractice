import net.sf.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thpffcj on 2017/7/11.
 */
public class SearchServlet extends HttpServlet {

    static List<String> datas = new ArrayList<>();
    static {
        datas.add("ajax");
        datas.add("ajax post");
        datas.add("becky");
        datas.add("bill");
        datas.add("james");
        datas.add("jerry");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String keyword = request.getParameter("keyword");
        List<String> listData = getData(keyword);
        response.getWriter().write(JSONArray.fromObject(listData).toString());
    }

    public List<String> getData(String keyword){
        List<String> list = new ArrayList<>();
        for(String data:datas){
            if(data.contains(keyword)){
                list.add(data);
            }
        }
        return list;
    }
}
