package edu.bit.ex.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import edu.bit.ex.vo.DeptVO;

@Mapper
public interface DeptMapper {
	public List<DeptVO> getList();
}
