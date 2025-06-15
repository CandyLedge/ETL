package core.intf;

import core.Channel;
import core.flowdata.Row;
import core.flowdata.RowSetTable;

import java.util.Map;

public interface IInput {
    void init(Map<String,Object> cfg);
    void start(Channel output) throws Exception;
}
