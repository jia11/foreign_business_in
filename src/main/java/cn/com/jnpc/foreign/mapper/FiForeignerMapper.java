package cn.com.jnpc.foreign.mapper;

import cn.com.jnpc.foreign.mapperprovider.FiForeignerSqlProvider;
import cn.com.jnpc.foreign.model.FiForeignerExample;
import cn.com.jnpc.foreign.po.FiForeigner;
import cn.com.jnpc.foreign.vo.PageMybatis;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface FiForeignerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_FOREIGNER
     *
     * @mbggenerated Tue Oct 22 15:45:16 CST 2013
     */
    @SelectProvider(type=FiForeignerSqlProvider.class, method="countByExample")
    int countByExample(FiForeignerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_FOREIGNER
     *
     * @mbggenerated Tue Oct 22 15:45:16 CST 2013
     */
    @DeleteProvider(type=FiForeignerSqlProvider.class, method="deleteByExample")
    int deleteByExample(FiForeignerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_FOREIGNER
     *
     * @mbggenerated Tue Oct 22 15:45:16 CST 2013
     */
    @Delete({
        "delete from FI_FOREIGNER",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(int id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_FOREIGNER
     *
     * @mbggenerated Tue Oct 22 15:45:16 CST 2013
     */
    @Insert({
        "insert into FI_FOREIGNER (ID, NAME, ",
        "SEX, BIRTHDAY, ",
        "COUNTRY, COMPANY_DEPARTMENT, ",
        "PASSPORT_ID, PASSPORT_EXP_DATE, ",
        "POST, ROLE, FK_PP_ATTACHMENT_ID, ",
        "EXPERT_EVIDENCE, FK_EE_ATTACHMENT_ID, ",
        "FK_RP_PERMIT_ID, FK_INVITATION_ID, ",
        "FK_BEUSE, IS_HERE, ",
        "STATUS, CREATE_DATE, ",
        "EDIT_DATE, CREATE_USER, ",
        "EDIT_USER)",
        "values (#{id,jdbcType=DECIMAL}, #{name,jdbcType=VARCHAR}, ",
        "#{sex,jdbcType=DECIMAL}, #{birthday,jdbcType=TIMESTAMP}, ",
        "#{country,jdbcType=VARCHAR}, #{companyDepartment,jdbcType=VARCHAR}, ",
        "#{passportId,jdbcType=VARCHAR}, #{passportExpDate,jdbcType=TIMESTAMP}, ",
        "#{post,jdbcType=VARCHAR}, #{role,jdbcType=VARCHAR}, #{fkPpAttachmentId,jdbcType=VARCHAR}, ",
        "#{expertEvidence,jdbcType=DECIMAL}, #{fkEeAttachmentId,jdbcType=VARCHAR}, ",
        "#{fkRpPermitId,jdbcType=VARCHAR}, #{fkInvitationId,jdbcType=VARCHAR}, ",
        "#{fkBeuse,jdbcType=DECIMAL}, #{isHere,jdbcType=DECIMAL}, ",
        "#{status,jdbcType=DECIMAL}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{editDate,jdbcType=TIMESTAMP}, #{createUser,jdbcType=VARCHAR}, ",
        "#{editUser,jdbcType=VARCHAR})"
    })
    @SelectKey(before=true,keyProperty="id",resultType=Integer.class,statement="select fiforeign_sequence.nextval as id from dual")
    int insert(FiForeigner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_FOREIGNER
     *
     * @mbggenerated Tue Oct 22 15:45:16 CST 2013
     */
    @InsertProvider(type=FiForeignerSqlProvider.class, method="insertSelective")
    int insertSelective(FiForeigner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_FOREIGNER
     *
     * @mbggenerated Tue Oct 22 15:45:16 CST 2013
     */
    @SelectProvider(type=FiForeignerSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="SEX", property="sex", jdbcType=JdbcType.DECIMAL),
        @Result(column="BIRTHDAY", property="birthday", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="COUNTRY", property="country", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMPANY_DEPARTMENT", property="companyDepartment", jdbcType=JdbcType.VARCHAR),
        @Result(column="PASSPORT_ID", property="passportId", jdbcType=JdbcType.VARCHAR),
        @Result(column="PASSPORT_EXP_DATE", property="passportExpDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="POST", property="post", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROLE", property="role", jdbcType=JdbcType.VARCHAR),
        @Result(column="FK_PP_ATTACHMENT_ID", property="fkPpAttachmentId", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXPERT_EVIDENCE", property="expertEvidence", jdbcType=JdbcType.DECIMAL),
        @Result(column="FK_EE_ATTACHMENT_ID", property="fkEeAttachmentId", jdbcType=JdbcType.VARCHAR),
        @Result(column="FK_RP_PERMIT_ID", property="fkRpPermitId", jdbcType=JdbcType.VARCHAR),
        @Result(column="FK_INVITATION_ID", property="fkInvitationId", jdbcType=JdbcType.VARCHAR),
        @Result(column="FK_BEUSE", property="fkBeuse", jdbcType=JdbcType.DECIMAL),
        @Result(column="IS_HERE", property="isHere", jdbcType=JdbcType.DECIMAL),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.DECIMAL),
        @Result(column="CREATE_DATE", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="EDIT_DATE", property="editDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATE_USER", property="createUser", jdbcType=JdbcType.VARCHAR),
        @Result(column="EDIT_USER", property="editUser", jdbcType=JdbcType.VARCHAR)
    })
    List<FiForeigner> selectByExample(FiForeignerExample example);
    
    @SelectProvider(type=FiForeignerSqlProvider.class, method="selectByPage")
    @Results({
	@Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
	@Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
	@Result(column="SEX", property="sex", jdbcType=JdbcType.DECIMAL),
	@Result(column="BIRTHDAY", property="birthday", jdbcType=JdbcType.TIMESTAMP),
	@Result(column="COUNTRY", property="country", jdbcType=JdbcType.VARCHAR),
	@Result(column="COMPANY_DEPARTMENT", property="companyDepartment", jdbcType=JdbcType.VARCHAR),
	@Result(column="PASSPORT_ID", property="passportId", jdbcType=JdbcType.VARCHAR),
	@Result(column="PASSPORT_EXP_DATE", property="passportExpDate", jdbcType=JdbcType.TIMESTAMP),
	@Result(column="POST", property="post", jdbcType=JdbcType.VARCHAR),
	@Result(column="ROLE", property="role", jdbcType=JdbcType.VARCHAR),
	@Result(column="FK_PP_ATTACHMENT_ID", property="fkPpAttachmentId", jdbcType=JdbcType.VARCHAR),
	@Result(column="EXPERT_EVIDENCE", property="expertEvidence", jdbcType=JdbcType.DECIMAL),
	@Result(column="FK_EE_ATTACHMENT_ID", property="fkEeAttachmentId", jdbcType=JdbcType.VARCHAR),
	@Result(column="FK_RP_PERMIT_ID", property="fkRpPermitId", jdbcType=JdbcType.VARCHAR),
	@Result(column="FK_INVITATION_ID", property="fkInvitationId", jdbcType=JdbcType.VARCHAR),
	@Result(column="FK_BEUSE", property="fkBeuse", jdbcType=JdbcType.DECIMAL),
	@Result(column="IS_HERE", property="isHere", jdbcType=JdbcType.DECIMAL),
	@Result(column="STATUS", property="status", jdbcType=JdbcType.DECIMAL),
	@Result(column="CREATE_DATE", property="createDate", jdbcType=JdbcType.TIMESTAMP),
	@Result(column="EDIT_DATE", property="editDate", jdbcType=JdbcType.TIMESTAMP),
	@Result(column="CREATE_USER", property="createUser", jdbcType=JdbcType.VARCHAR),
	@Result(column="EDIT_USER", property="editUser", jdbcType=JdbcType.VARCHAR)
    })
    List<FiForeigner> selectByPage(PageMybatis page);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_FOREIGNER
     *
     * @mbggenerated Tue Oct 22 15:45:16 CST 2013
     */
    @Select({
        "select",
        "ID, NAME, SEX, BIRTHDAY, COUNTRY, COMPANY_DEPARTMENT, PASSPORT_ID, PASSPORT_EXP_DATE, ",
        "POST, ROLE, FK_PP_ATTACHMENT_ID, EXPERT_EVIDENCE, FK_EE_ATTACHMENT_ID, FK_RP_PERMIT_ID, ",
        "FK_INVITATION_ID, FK_BEUSE, IS_HERE, STATUS, CREATE_DATE, EDIT_DATE, CREATE_USER, ",
        "EDIT_USER",
        "from FI_FOREIGNER",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="SEX", property="sex", jdbcType=JdbcType.DECIMAL),
        @Result(column="BIRTHDAY", property="birthday", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="COUNTRY", property="country", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMPANY_DEPARTMENT", property="companyDepartment", jdbcType=JdbcType.VARCHAR),
        @Result(column="PASSPORT_ID", property="passportId", jdbcType=JdbcType.VARCHAR),
        @Result(column="PASSPORT_EXP_DATE", property="passportExpDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="POST", property="post", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROLE", property="role", jdbcType=JdbcType.VARCHAR),
        @Result(column="FK_PP_ATTACHMENT_ID", property="fkPpAttachmentId", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXPERT_EVIDENCE", property="expertEvidence", jdbcType=JdbcType.DECIMAL),
        @Result(column="FK_EE_ATTACHMENT_ID", property="fkEeAttachmentId", jdbcType=JdbcType.VARCHAR),
        @Result(column="FK_RP_PERMIT_ID", property="fkRpPermitId", jdbcType=JdbcType.VARCHAR),
        @Result(column="FK_INVITATION_ID", property="fkInvitationId", jdbcType=JdbcType.VARCHAR),
        @Result(column="FK_BEUSE", property="fkBeuse", jdbcType=JdbcType.DECIMAL),
        @Result(column="IS_HERE", property="isHere", jdbcType=JdbcType.DECIMAL),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.DECIMAL),
        @Result(column="CREATE_DATE", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="EDIT_DATE", property="editDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CREATE_USER", property="createUser", jdbcType=JdbcType.VARCHAR),
        @Result(column="EDIT_USER", property="editUser", jdbcType=JdbcType.VARCHAR)
    })
    FiForeigner selectByPrimaryKey(int id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_FOREIGNER
     *
     * @mbggenerated Tue Oct 22 15:45:16 CST 2013
     */
    @UpdateProvider(type=FiForeignerSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FiForeigner record, @Param("example") FiForeignerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_FOREIGNER
     *
     * @mbggenerated Tue Oct 22 15:45:16 CST 2013
     */
    @UpdateProvider(type=FiForeignerSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FiForeigner record, @Param("example") FiForeignerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_FOREIGNER
     *
     * @mbggenerated Tue Oct 22 15:45:16 CST 2013
     */
    @UpdateProvider(type=FiForeignerSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FiForeigner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_FOREIGNER
     *
     * @mbggenerated Tue Oct 22 15:45:16 CST 2013
     */
    @Update({
        "update FI_FOREIGNER",
        "set NAME = #{name,jdbcType=VARCHAR},",
          "SEX = #{sex,jdbcType=DECIMAL},",
          "BIRTHDAY = #{birthday,jdbcType=TIMESTAMP},",
          "COUNTRY = #{country,jdbcType=VARCHAR},",
          "COMPANY_DEPARTMENT = #{companyDepartment,jdbcType=VARCHAR},",
          "PASSPORT_ID = #{passportId,jdbcType=VARCHAR},",
          "PASSPORT_EXP_DATE = #{passportExpDate,jdbcType=TIMESTAMP},",
          "POST = #{post,jdbcType=VARCHAR},",
          "ROLE = #{role,jdbcType=VARCHAR},",
          "FK_PP_ATTACHMENT_ID = #{fkPpAttachmentId,jdbcType=VARCHAR},",
          "EXPERT_EVIDENCE = #{expertEvidence,jdbcType=DECIMAL},",
          "FK_EE_ATTACHMENT_ID = #{fkEeAttachmentId,jdbcType=VARCHAR},",
          "FK_RP_PERMIT_ID = #{fkRpPermitId,jdbcType=VARCHAR},",
          "FK_INVITATION_ID = #{fkInvitationId,jdbcType=VARCHAR},",
          "FK_BEUSE = #{fkBeuse,jdbcType=DECIMAL},",
          "IS_HERE = #{isHere,jdbcType=DECIMAL},",
          "STATUS = #{status,jdbcType=DECIMAL},",
          "CREATE_DATE = #{createDate,jdbcType=TIMESTAMP},",
          "EDIT_DATE = #{editDate,jdbcType=TIMESTAMP},",
          "CREATE_USER = #{createUser,jdbcType=VARCHAR},",
          "EDIT_USER = #{editUser,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(FiForeigner record);
}