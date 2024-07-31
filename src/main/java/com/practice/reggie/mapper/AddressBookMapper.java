package com.practice.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.practice.reggie.entity.AddressBook;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {
}
