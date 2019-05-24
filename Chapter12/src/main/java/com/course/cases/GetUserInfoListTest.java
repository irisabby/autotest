package com.course.cases;

import com.course.config.TestConfig;
import com.course.model.GetUserListCase;
import com.course.model.User;
import com.course.utils.DatabaseUtil;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import org.apache.ibatis.session.SqlSession;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2019/5/20 17:38
 */
public class GetUserInfoListTest {
    @Test(dependsOnGroups = "loginTrue",description = "获取性别为男的用户信息")
    public void getUserListInfo() throws IOException {
        SqlSession sqlSession=DatabaseUtil.getSqlSession();
        GetUserListCase getUserListCase=sqlSession.selectOne("getUserListCase",1);
        System.out.println(getUserListCase.toString());
        System.out.println(TestConfig.getUserListUrl);

        //发送请求获取结果
        JSONArray resultJson=getJsonResult(getUserListCase);

        //验证
        List<User> userList=sqlSession.selectList(getUserListCase.getExpected(),getUserListCase);
        for(User u:userList){
            System.out.println("获取的user"+u.toString());
        }
        JSONArray userListJson=new JSONArray(userList);
        Assert.assertEquals(userListJson.length(),resultJson.length());

        for(int i=0;i<resultJson.length();i++){
            JSONObject expect= (JSONObject) resultJson.get(i);
            JSONObject actual= (JSONObject) userListJson.get(i);
            Assert.assertEquals(expect.toString(),actual.toString());
        }
    }

    private JSONArray getJsonResult(GetUserListCase getUserListCase) throws IOException {
        HttpPost post=new HttpPost(TestConfig.getUserInfoUrl);
        JSONObject param=new JSONObject();
        param.put("userName",getUserListCase.getUserName());
        param.put("sex",getUserListCase.getSex());
        param.put("age",getUserListCase.getAge());
        post.setHeader("content-type","application/json");
        StringEntity entity=new StringEntity(param.toString(),"utf-8");
        post.setEntity(entity);
        TestConfig.defaultHttpClient.setCookieStore(TestConfig.store);
        String result;
        HttpResponse response=TestConfig.defaultHttpClient.execute(post);
        result=EntityUtils.toString(response.getEntity(),"utf-8");
        JSONArray jsonArray=new JSONArray(result);
        return jsonArray;
    }
}
