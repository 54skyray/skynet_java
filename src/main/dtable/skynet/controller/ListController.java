package main.dtable.skynet.controller;

import main.dtable.skynet.pojo.BlackListPo;
import main.dtable.skynet.service.ListService;
import main.dtable.skynet.util.ZreoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by skyRay on 2017/1/18.
 */
@Controller
public class ListController {

    @Autowired
    private ListService listService;

    @RequestMapping("/blacklist")
    public String blackList(Model model){
        try{
            List<BlackListPo> blackListPos = listService.queryAllBlackList();
            model.addAttribute("blackList",blackListPos);
            ZreoUtil.sendMessage("fuck you");
        }catch (Exception e){
            e.printStackTrace();
        }
        return "list";
    }
}
