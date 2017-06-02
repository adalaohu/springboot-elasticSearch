package util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by 老虎
 */
public interface MyMapper <T> extends Mapper<T>, MySqlMapper<T> {
}
