package com.shan.dao;

import com.shan.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    Teacher getTeacher(int tid);

    Teacher getTeacher2(@Param("id") int id);
}
