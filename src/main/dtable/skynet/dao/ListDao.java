package main.dtable.skynet.dao;

import main.dtable.skynet.pojo.BlackListPo;
import java.util.List;

/**
 * Created by skyRay on 2017/1/20.
 */
public interface ListDao {
    List<BlackListPo> queryBlackList();
}
