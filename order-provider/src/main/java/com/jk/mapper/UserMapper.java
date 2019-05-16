package com.jk.mapper;

import com.jk.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * @author ：mmzs
 * @date ：Created in 2019/5/15 16:12
 * @description：
 * @modified By：
 * @version: $
 */
public interface UserMapper {
    @Select("select * from t_user where loginnumber=#{value}")
    User findIntoByloginnumber(String loginnumber);
    @Insert("insert into t_user(name,loginnumber,password) values(#{name},#{loginnumber},#{password})")
    void save(User user);
}
