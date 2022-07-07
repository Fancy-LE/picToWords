package com.xiaoai.aidemo1.test;

import com.baidu.aip.imageclassify.AipImageClassify;
import com.baidu.aip.imagesearch.AipImageSearch;
import org.json.JSONObject;

import java.util.HashMap;

public class Sample {
    //设置APPID/AK/SK
    public static final String APP_ID = "26650013";
    public static final String API_KEY = "BiFQ3xDTdj8LamT4oBOUPA7Ug5onhOYG";
    public static final String SECRET_KEY = "BiFQ3xDTdj8LamT4oBOUPA7Ug5onhOYG";

    public static void main(String[] args) {
        // 初始化一个AipImageClassify
        AipImageClassify client = new AipImageClassify(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);


        // 调用接口
        String path = "E:/JAVA/IDEAprojects/test1.jpg";
        JSONObject res = client.advancedGeneral(path, new HashMap<String, String>());
        System.out.println(res.toString(2));

    }
}