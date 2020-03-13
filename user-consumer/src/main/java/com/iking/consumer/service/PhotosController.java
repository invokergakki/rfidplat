package com.iking.consumer.service;

import com.iking.consumer.Vo.PhotoReqVo;
import com.iking.consumer.Vo.PhotoRespVo;
import com.iking.consumer.util.MapUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
@RestController
@RequestMapping("/photos")
public class PhotosController {

    private static final Logger logger = LoggerFactory.getLogger(PhotosController.class);

    @RequestMapping(method = RequestMethod.POST)
    public PhotoRespVo queryPhotoSearch(@RequestBody PhotoReqVo vo) {
        System.out.println("12321");
        PhotoRespVo respVO = new PhotoRespVo();
        String image = vo.getBase64().substring(22);
        System.out.println(image);
        String result = FaceSearch.faceSearch(image);
        Map<String,Object> resultmap = new HashMap<>();
        resultmap = MapUtil.toMap(result);
        Object resultson = resultmap.get("result");
        Map<String,Object> resultmapson = new HashMap<>();
        resultmapson = MapUtil.toMap(resultson.toString());
        Object resultsonson = resultmapson.get("user_list");
        ArrayList<Map> array = new ArrayList<>();
        array = (ArrayList<Map>) resultmapson.get("user_list");
        Object object =  array.get(0).get("score");
        String score = object.toString();
        if(Double.parseDouble(score)>=80.0){
            respVO.setFlag("1");
        }else{
            respVO.setFlag("0");
        }
        Object object2 =  array.get(0).get("user_id");
        String name = object2.toString();
        //name.replace(""","");
        respVO.setName(name.substring(1,name.length()-1));
        return respVO;
    }
}