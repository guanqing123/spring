package com.javacode2021.lesson8;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @description: TODO 满足条件的bean注入到集合中(重点)
 * @Author guanqing
 * @Date 2021/12/15 0:12
 **/
@Data
public class DiAutowireByTypeExtend {

    /** 定义了一个接口 */
    public interface IService1 {
    }

    @Data
    public static class BaseService {
        private String desc;
    }

    /** Service1实现了IService1接口  */
    public static class Service1 extends BaseService implements IService1 {}

    /** Service2实现了IService1接口 */
    public static class Service2 extends BaseService implements IService1 {}

    private List<IService1> serviceList;
    private List<BaseService> baseServiceList;
    private Map<String, IService1> service1Map;
    private Map<String, BaseService> baseServiceMap;
}
