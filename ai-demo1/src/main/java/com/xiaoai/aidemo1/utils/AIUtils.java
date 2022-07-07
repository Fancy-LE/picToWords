package com.xiaoai.aidemo1.utils;

import com.baidu.aip.imagesearch.AipImageSearch;
import com.baidu.aip.ocr.AipOcr;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;

public class AIUtils {
    //设置APPID/AK/SK
    public static final String APP_ID = "25660449";
    public static final String API_KEY = "VRItTKpR277owD3X5ZjNxmAr";
    public static final String SECRET_KEY = "cemm4YR9pWR4itPqxVDgTRGUwkQoXvzX";

    public static String picToWords(MultipartFile file) throws IOException {
        // 初始化一个AipOcr
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        // 也可以直接通过jvm启动参数设置此环境变量
        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");

        // 调用接口
//        String path = "E:/Sample/test.png";
        JSONObject res = client.basicGeneral(file.getBytes(), new HashMap<String, String>());
        JSONArray words_result = res.getJSONArray("words_result");  //a.var快速给a一个定义
        String result = "";
        for (int i = 0; i <words_result.length() ; i++) {
            JSONObject jsonObject = words_result.getJSONObject(i);
            Object words = jsonObject.get("words");
            String s = (String) words;
            result += s + "";

        }
//        System.out.println(result);
        return result;
    }

}
