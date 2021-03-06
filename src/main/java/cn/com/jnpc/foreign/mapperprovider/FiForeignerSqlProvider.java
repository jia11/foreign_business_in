package cn.com.jnpc.foreign.mapperprovider;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import cn.com.jnpc.foreign.model.FiForeignerExample;
import cn.com.jnpc.foreign.model.FiForeignerExample.Criteria;
import cn.com.jnpc.foreign.model.FiForeignerExample.Criterion;
import cn.com.jnpc.foreign.po.FiForeigner;
import cn.com.jnpc.foreign.utils.Untils;
import cn.com.jnpc.foreign.vo.PageMybatis;
import java.util.List;
import java.util.Map;

public class FiForeignerSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_FOREIGNER
     *
     * @mbggenerated Tue Oct 22 15:45:16 CST 2013
     */
    public String countByExample(FiForeignerExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("FI_FOREIGNER");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_FOREIGNER
     *
     * @mbggenerated Tue Oct 22 15:45:16 CST 2013
     */
    public String deleteByExample(FiForeignerExample example) {
        BEGIN();
        DELETE_FROM("FI_FOREIGNER");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_FOREIGNER
     *
     * @mbggenerated Tue Oct 22 15:45:16 CST 2013
     */
    public String insertSelective(FiForeigner record) {
        BEGIN();
        INSERT_INTO("FI_FOREIGNER");
        
        if (record.getId() != null) {
            VALUES("ID", "#{id,jdbcType=DECIMAL}");
        }
        
        if (record.getName() != null) {
            VALUES("NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            VALUES("SEX", "#{sex,jdbcType=DECIMAL}");
        }
        
        if (record.getBirthday() != null) {
            VALUES("BIRTHDAY", "#{birthday,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCountry() != null) {
            VALUES("COUNTRY", "#{country,jdbcType=VARCHAR}");
        }
        
        if (record.getCompanyDepartment() != null) {
            VALUES("COMPANY_DEPARTMENT", "#{companyDepartment,jdbcType=VARCHAR}");
        }
        
        if (record.getPassportId() != null) {
            VALUES("PASSPORT_ID", "#{passportId,jdbcType=VARCHAR}");
        }
        
        if (record.getPassportExpDate() != null) {
            VALUES("PASSPORT_EXP_DATE", "#{passportExpDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPost() != null) {
            VALUES("POST", "#{post,jdbcType=VARCHAR}");
        }
        
        if (record.getRole() != null) {
            VALUES("ROLE", "#{role,jdbcType=VARCHAR}");
        }
        
        if (record.getFkPpAttachmentId() != null) {
            VALUES("FK_PP_ATTACHMENT_ID", "#{fkPpAttachmentId,jdbcType=VARCHAR}");
        }
        
        if (record.getExpertEvidence() != null) {
            VALUES("EXPERT_EVIDENCE", "#{expertEvidence,jdbcType=DECIMAL}");
        }
        
        if (record.getFkEeAttachmentId() != null) {
            VALUES("FK_EE_ATTACHMENT_ID", "#{fkEeAttachmentId,jdbcType=VARCHAR}");
        }
        
        if (record.getFkRpPermitId() != null) {
            VALUES("FK_RP_PERMIT_ID", "#{fkRpPermitId,jdbcType=VARCHAR}");
        }
        
        if (record.getFkInvitationId() != null) {
            VALUES("FK_INVITATION_ID", "#{fkInvitationId,jdbcType=VARCHAR}");
        }
        
        if (record.getFkBeuse() != null) {
            VALUES("FK_BEUSE", "#{fkBeuse,jdbcType=DECIMAL}");
        }
        
        if (record.getIsHere() != null) {
            VALUES("IS_HERE", "#{isHere,jdbcType=DECIMAL}");
        }
        
        if (record.getStatus() != null) {
            VALUES("STATUS", "#{status,jdbcType=DECIMAL}");
        }
        
        if (record.getCreateDate() != null) {
            VALUES("CREATE_DATE", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEditDate() != null) {
            VALUES("EDIT_DATE", "#{editDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateUser() != null) {
            VALUES("CREATE_USER", "#{createUser,jdbcType=VARCHAR}");
        }
        
        if (record.getEditUser() != null) {
            VALUES("EDIT_USER", "#{editUser,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_FOREIGNER
     *
     * @mbggenerated Tue Oct 22 15:45:16 CST 2013
     */
    public String selectByExample(FiForeignerExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("ID");
        } else {
            SELECT("ID");
        }
        SELECT("NAME");
        SELECT("SEX");
        SELECT("BIRTHDAY");
        SELECT("COUNTRY");
        SELECT("COMPANY_DEPARTMENT");
        SELECT("PASSPORT_ID");
        SELECT("PASSPORT_EXP_DATE");
        SELECT("POST");
        SELECT("ROLE");
        SELECT("FK_PP_ATTACHMENT_ID");
        SELECT("EXPERT_EVIDENCE");
        SELECT("FK_EE_ATTACHMENT_ID");
        SELECT("FK_RP_PERMIT_ID");
        SELECT("FK_INVITATION_ID");
        SELECT("FK_BEUSE");
        SELECT("IS_HERE");
        SELECT("STATUS");
        SELECT("CREATE_DATE");
        SELECT("EDIT_DATE");
        SELECT("CREATE_USER");
        SELECT("EDIT_USER");
        FROM("FI_FOREIGNER");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    
    public String selectByPage(PageMybatis page){
	BEGIN();
	//select t2.* from (select rownum r,t1.* from fi_foreign t1 where rownum < 2) t2 where t2.r > 0;
	SELECT("t2.ID");
	SELECT("t2.NAME");
        SELECT("t2.SEX");
        SELECT("t2.BIRTHDAY");
        SELECT("t2.COUNTRY");
        SELECT("t2.COMPANY_DEPARTMENT");
        SELECT("t2.PASSPORT_ID");
        SELECT("t2.PASSPORT_EXP_DATE");
        SELECT("t2.POST");
        SELECT("t2.ROLE");
        SELECT("t2.FK_PP_ATTACHMENT_ID");
        SELECT("t2.EXPERT_EVIDENCE");
        SELECT("t2.FK_EE_ATTACHMENT_ID");
        SELECT("t2.FK_RP_PERMIT_ID");
        SELECT("t2.FK_INVITATION_ID");
        SELECT("t2.IS_HERE");
        SELECT("t2.STATUS");
        SELECT("t2.CREATE_DATE");
        SELECT("t2.EDIT_DATE");
        SELECT("t2.CREATE_USER");
        SELECT("t2.EDIT_USER");
        //FROM("( select rownum r,t1.* from fi_foreigner t1 where rownum <"+page.getNextsize()+" ) t2");
        FROM("( select rownum r,t1.* from fi_foreigner t1 where 1=1 "+(Untils.NotNull(page.getQuerysql())?page.getQuerysql():"")+" and rownum <"+page.getNextsize()+" ) t2");
        WHERE("t2.r > "+ page.getNowsize());
        //System.out.println(SQL());
	return SQL();
    }
    public String selectAllcount(String where){
	BEGIN();
	//select t2.* from (select rownum r,t1.* from fi_foreign t1 where rownum < 2) t2 where t2.r > 0;
	SELECT("count(t1.id) as allcount");
	FROM(" fi_foreigner t1 where 1=1 "+where);
	//System.out.println(SQL());
	return SQL();
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_FOREIGNER
     *
     * @mbggenerated Tue Oct 22 15:45:16 CST 2013
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        FiForeigner record = (FiForeigner) parameter.get("record");
        FiForeignerExample example = (FiForeignerExample) parameter.get("example");
        
        BEGIN();
        UPDATE("FI_FOREIGNER");
        
        if (record.getId() != null) {
            SET("ID = #{record.id,jdbcType=DECIMAL}");
        }
        
        if (record.getName() != null) {
            SET("NAME = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            SET("SEX = #{record.sex,jdbcType=DECIMAL}");
        }
        
        if (record.getBirthday() != null) {
            SET("BIRTHDAY = #{record.birthday,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCountry() != null) {
            SET("COUNTRY = #{record.country,jdbcType=VARCHAR}");
        }
        
        if (record.getCompanyDepartment() != null) {
            SET("COMPANY_DEPARTMENT = #{record.companyDepartment,jdbcType=VARCHAR}");
        }
        
        if (record.getPassportId() != null) {
            SET("PASSPORT_ID = #{record.passportId,jdbcType=VARCHAR}");
        }
        
        if (record.getPassportExpDate() != null) {
            SET("PASSPORT_EXP_DATE = #{record.passportExpDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPost() != null) {
            SET("POST = #{record.post,jdbcType=VARCHAR}");
        }
        
        if (record.getRole() != null) {
            SET("ROLE = #{record.role,jdbcType=VARCHAR}");
        }
        
        if (record.getFkPpAttachmentId() != null) {
            SET("FK_PP_ATTACHMENT_ID = #{record.fkPpAttachmentId,jdbcType=VARCHAR}");
        }
        
        if (record.getExpertEvidence() != null) {
            SET("EXPERT_EVIDENCE = #{record.expertEvidence,jdbcType=DECIMAL}");
        }
        
        if (record.getFkEeAttachmentId() != null) {
            SET("FK_EE_ATTACHMENT_ID = #{record.fkEeAttachmentId,jdbcType=VARCHAR}");
        }
        
        if (record.getFkRpPermitId() != null) {
            SET("FK_RP_PERMIT_ID = #{record.fkRpPermitId,jdbcType=VARCHAR}");
        }
        
        if (record.getFkInvitationId() != null) {
            SET("FK_INVITATION_ID = #{record.fkInvitationId,jdbcType=VARCHAR}");
        }
        
        if (record.getFkBeuse() != null) {
            SET("FK_BEUSE = #{record.fkBeuse,jdbcType=DECIMAL}");
        }
        
        if (record.getIsHere() != null) {
            SET("IS_HERE = #{record.isHere,jdbcType=DECIMAL}");
        }
        
        if (record.getStatus() != null) {
            SET("STATUS = #{record.status,jdbcType=DECIMAL}");
        }
        
        if (record.getCreateDate() != null) {
            SET("CREATE_DATE = #{record.createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEditDate() != null) {
            SET("EDIT_DATE = #{record.editDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateUser() != null) {
            SET("CREATE_USER = #{record.createUser,jdbcType=VARCHAR}");
        }
        
        if (record.getEditUser() != null) {
            SET("EDIT_USER = #{record.editUser,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_FOREIGNER
     *
     * @mbggenerated Tue Oct 22 15:45:16 CST 2013
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("FI_FOREIGNER");
        
        SET("ID = #{record.id,jdbcType=DECIMAL}");
        SET("NAME = #{record.name,jdbcType=VARCHAR}");
        SET("SEX = #{record.sex,jdbcType=DECIMAL}");
        SET("BIRTHDAY = #{record.birthday,jdbcType=TIMESTAMP}");
        SET("COUNTRY = #{record.country,jdbcType=VARCHAR}");
        SET("COMPANY_DEPARTMENT = #{record.companyDepartment,jdbcType=VARCHAR}");
        SET("PASSPORT_ID = #{record.passportId,jdbcType=VARCHAR}");
        SET("PASSPORT_EXP_DATE = #{record.passportExpDate,jdbcType=TIMESTAMP}");
        SET("POST = #{record.post,jdbcType=VARCHAR}");
        SET("ROLE = #{record.role,jdbcType=VARCHAR}");
        SET("FK_PP_ATTACHMENT_ID = #{record.fkPpAttachmentId,jdbcType=VARCHAR}");
        SET("EXPERT_EVIDENCE = #{record.expertEvidence,jdbcType=DECIMAL}");
        SET("FK_EE_ATTACHMENT_ID = #{record.fkEeAttachmentId,jdbcType=VARCHAR}");
        SET("FK_RP_PERMIT_ID = #{record.fkRpPermitId,jdbcType=VARCHAR}");
        SET("FK_INVITATION_ID = #{record.fkInvitationId,jdbcType=VARCHAR}");
        SET("FK_BEUSE = #{record.fkBeuse,jdbcType=DECIMAL}");
        SET("IS_HERE = #{record.isHere,jdbcType=DECIMAL}");
        SET("STATUS = #{record.status,jdbcType=DECIMAL}");
        SET("CREATE_DATE = #{record.createDate,jdbcType=TIMESTAMP}");
        SET("EDIT_DATE = #{record.editDate,jdbcType=TIMESTAMP}");
        SET("CREATE_USER = #{record.createUser,jdbcType=VARCHAR}");
        SET("EDIT_USER = #{record.editUser,jdbcType=VARCHAR}");
        
        FiForeignerExample example = (FiForeignerExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_FOREIGNER
     *
     * @mbggenerated Tue Oct 22 15:45:16 CST 2013
     */
    public String updateByPrimaryKeySelective(FiForeigner record) {
        BEGIN();
        UPDATE("FI_FOREIGNER");
        
        if (record.getName() != null) {
            SET("NAME = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            SET("SEX = #{sex,jdbcType=DECIMAL}");
        }
        
        if (record.getBirthday() != null) {
            SET("BIRTHDAY = #{birthday,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCountry() != null) {
            SET("COUNTRY = #{country,jdbcType=VARCHAR}");
        }
        
        if (record.getCompanyDepartment() != null) {
            SET("COMPANY_DEPARTMENT = #{companyDepartment,jdbcType=VARCHAR}");
        }
        
        if (record.getPassportId() != null) {
            SET("PASSPORT_ID = #{passportId,jdbcType=VARCHAR}");
        }
        
        if (record.getPassportExpDate() != null) {
            SET("PASSPORT_EXP_DATE = #{passportExpDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPost() != null) {
            SET("POST = #{post,jdbcType=VARCHAR}");
        }
        
        if (record.getRole() != null) {
            SET("ROLE = #{role,jdbcType=VARCHAR}");
        }
        
        if (record.getFkPpAttachmentId() != null) {
            SET("FK_PP_ATTACHMENT_ID = #{fkPpAttachmentId,jdbcType=VARCHAR}");
        }
        
        if (record.getExpertEvidence() != null) {
            SET("EXPERT_EVIDENCE = #{expertEvidence,jdbcType=DECIMAL}");
        }
        
        if (record.getFkEeAttachmentId() != null) {
            SET("FK_EE_ATTACHMENT_ID = #{fkEeAttachmentId,jdbcType=VARCHAR}");
        }
        
        if (record.getFkRpPermitId() != null) {
            SET("FK_RP_PERMIT_ID = #{fkRpPermitId,jdbcType=VARCHAR}");
        }
        
        if (record.getFkInvitationId() != null) {
            SET("FK_INVITATION_ID = #{fkInvitationId,jdbcType=VARCHAR}");
        }
        
        if (record.getFkBeuse() != null) {
            SET("FK_BEUSE = #{fkBeuse,jdbcType=DECIMAL}");
        }
        
        if (record.getIsHere() != null) {
            SET("IS_HERE = #{isHere,jdbcType=DECIMAL}");
        }
        
        if (record.getStatus() != null) {
            SET("STATUS = #{status,jdbcType=DECIMAL}");
        }
        
        if (record.getCreateDate() != null) {
            SET("CREATE_DATE = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEditDate() != null) {
            SET("EDIT_DATE = #{editDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateUser() != null) {
            SET("CREATE_USER = #{createUser,jdbcType=VARCHAR}");
        }
        
        if (record.getEditUser() != null) {
            SET("EDIT_USER = #{editUser,jdbcType=VARCHAR}");
        }
        
        WHERE("ID = #{id,jdbcType=DECIMAL}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_FOREIGNER
     *
     * @mbggenerated Tue Oct 22 15:45:16 CST 2013
     */
    protected void applyWhere(FiForeignerExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}