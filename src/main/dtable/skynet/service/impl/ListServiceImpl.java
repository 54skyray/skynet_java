package main.dtable.skynet.service.impl;

import main.dtable.skynet.dao.ListDao;
import main.dtable.skynet.pojo.BlackListPo;
import main.dtable.skynet.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by skyRay on 2017/1/20.
 */
@Service("listService")
public class ListServiceImpl implements ListService {

    @Autowired
    private ListDao listDao;
    public List<BlackListPo> queryAllBlackList() {
        return listDao.queryBlackList();
    }
}
