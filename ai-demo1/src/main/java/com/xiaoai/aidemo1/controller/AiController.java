package com.xiaoai.aidemo1.controller;

import com.xiaoai.aidemo1.utils.AIUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class AiController {

    @RequestMapping(value = "/pic",method = RequestMethod.POST)
    public String PicToWord(@RequestParam("file") MultipartFile file) throws IOException {
        String res = AIUtils.picToWords(file);
        System.out.println(res);
        return res;
    }
}
