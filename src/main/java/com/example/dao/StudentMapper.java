package com.example.dao;

import com.example.entity.DO.Student;

public interface StudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Student
     *
     * @mbggenerated Sat Feb 19 20:20:43 CST 2022
     */
    int deleteByPrimaryKey(String sId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Student
     *
     * @mbggenerated Sat Feb 19 20:20:43 CST 2022
     */
    int insert(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Student
     *
     * @mbggenerated Sat Feb 19 20:20:43 CST 2022
     */
    int insertSelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Student
     *
     * @mbggenerated Sat Feb 19 20:20:43 CST 2022
     */
    Student selectByPrimaryKey(String sId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Student
     *
     * @mbggenerated Sat Feb 19 20:20:43 CST 2022
     */
    int updateByPrimaryKeySelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Student
     *
     * @mbggenerated Sat Feb 19 20:20:43 CST 2022
     */
    int updateByPrimaryKey(Student record);
}