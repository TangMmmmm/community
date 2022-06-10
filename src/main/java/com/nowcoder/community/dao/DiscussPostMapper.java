package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

//    当使用了@Param注解来声明参数的时候，SQL语句取值使用#{}，${}取值都可以。
//    当不使用@Param注解声明参数的时候，必须使用的是#{}来取参数。使用${}方式取值会报错。
//    不使用@Param注解时，参数只能有一个，并且是Javabean（基本类型也可）。在SQL语句里可以引用JavaBean的属性，而且只能引用JavaBean的属性。

    List<DiscussPost> selectDiscussPosts(@Param("userId")int userId, @Param("offset")int offset, @Param("limit")int limit);

    int selectDiscussPostRows(int userId);

}
