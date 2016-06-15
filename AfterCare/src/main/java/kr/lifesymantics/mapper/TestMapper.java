package kr.lifesymantics.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
	List<Map<String,String>> select(String str);
	List<Map<String,String>> selectLoginUser(String id,String pw);
}
