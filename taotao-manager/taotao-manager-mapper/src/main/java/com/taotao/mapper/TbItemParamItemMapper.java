package com.taotao.mapper;

import com.taotao.pojo.TbItemParamItem;
import com.taotao.pojo.TbItemParamItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface TbItemParamItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbg.generated Tue Nov 06 10:34:30 CST 2018
     */
    long countByExample(TbItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbg.generated Tue Nov 06 10:34:30 CST 2018
     */
    int deleteByExample(TbItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbg.generated Tue Nov 06 10:34:30 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbg.generated Tue Nov 06 10:34:30 CST 2018
     */
    int insert(TbItemParamItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbg.generated Tue Nov 06 10:34:30 CST 2018
     */
    int insertSelective(TbItemParamItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbg.generated Tue Nov 06 10:34:30 CST 2018
     */
    List<TbItemParamItem> selectByExampleWithBLOBs(TbItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbg.generated Tue Nov 06 10:34:30 CST 2018
     */
    List<TbItemParamItem> selectByExample(TbItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbg.generated Tue Nov 06 10:34:30 CST 2018
     */
    TbItemParamItem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbg.generated Tue Nov 06 10:34:30 CST 2018
     */
    int updateByExampleSelective(@Param("record") TbItemParamItem record, @Param("example") TbItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbg.generated Tue Nov 06 10:34:30 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") TbItemParamItem record, @Param("example") TbItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbg.generated Tue Nov 06 10:34:30 CST 2018
     */
    int updateByExample(@Param("record") TbItemParamItem record, @Param("example") TbItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbg.generated Tue Nov 06 10:34:30 CST 2018
     */
    int updateByPrimaryKeySelective(TbItemParamItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbg.generated Tue Nov 06 10:34:30 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(TbItemParamItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbg.generated Tue Nov 06 10:34:30 CST 2018
     */
    int updateByPrimaryKey(TbItemParamItem record);
}