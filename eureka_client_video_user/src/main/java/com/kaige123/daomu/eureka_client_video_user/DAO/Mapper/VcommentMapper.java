package com.kaige123.daomu.eureka_client_video_user.DAO.Mapper;

import com.kaige123.daomu.eureka_client_video_user.DAO.Bean.Vcomment;
import com.kaige123.daomu.eureka_client_video_user.DAO.Bean.VcommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VcommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcomment
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    long countByExample(VcommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcomment
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int deleteByExample(VcommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcomment
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int deleteByPrimaryKey(Long vmid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcomment
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int insert(Vcomment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcomment
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int insertSelective(Vcomment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcomment
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    List<Vcomment> selectByExample(VcommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcomment
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    Vcomment selectByPrimaryKey(Long vmid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcomment
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int updateByExampleSelective(@Param("record") Vcomment record, @Param("example") VcommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcomment
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int updateByExample(@Param("record") Vcomment record, @Param("example") VcommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcomment
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int updateByPrimaryKeySelective(Vcomment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vcomment
     *
     * @mbg.generated Fri Nov 02 11:09:38 CST 2018
     */
    int updateByPrimaryKey(Vcomment record);
}