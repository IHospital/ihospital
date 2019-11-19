package com.ihospital.mapper;

import com.ihospital.pojo.Appointment;
import com.ihospital.pojo.AppointmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppointmentMapper {
    int countByExample(AppointmentExample example);

    int deleteByExample(AppointmentExample example);

    int deleteByPrimaryKey(Long appointmentId);

    int insert(Appointment record);

    int insertSelective(Appointment record);

    List<Appointment> selectByExample(AppointmentExample example);

    Appointment selectByPrimaryKey(Long appointmentId);

    int updateByExampleSelective(@Param("record") Appointment record, @Param("example") AppointmentExample example);

    int updateByExample(@Param("record") Appointment record, @Param("example") AppointmentExample example);

    int updateByPrimaryKeySelective(Appointment record);

    int updateByPrimaryKey(Appointment record);
}