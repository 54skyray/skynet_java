package main.dtable.skynet.service;

import main.dtable.skynet.pojo.BlackListPo;
import java.util.List;

/**
 * Created by skyRay on 2017/1/20.
 */
public interface ListService {
    List<BlackListPo> queryAllBlackList();
}
