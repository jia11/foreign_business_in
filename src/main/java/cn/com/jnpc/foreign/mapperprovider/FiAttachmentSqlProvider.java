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

import java.util.List;
import java.util.Map;

import cn.com.jnpc.foreign.model.FiAttachmentExample;
import cn.com.jnpc.foreign.model.FiAttachmentExample.Criteria;
import cn.com.jnpc.foreign.model.FiAttachmentExample.Criterion;
import cn.com.jnpc.foreign.po.FiAttachment;

public class FiAttachmentSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_ATTACHMENT
     *
     * @mbggenerated Mon Sep 23 01:08:51 CST 2013
     */
    public String countByExample(FiAttachmentExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("FI_ATTACHMENT");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_ATTACHMENT
     *
     * @mbggenerated Mon Sep 23 01:08:51 CST 2013
     */
    public String deleteByExample(FiAttachmentExample example) {
        BEGIN();
        DELETE_FROM("FI_ATTACHMENT");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_ATTACHMENT
     *
     * @mbggenerated Mon Sep 23 01:08:51 CST 2013
     */
    public String insertSelective(FiAttachment record) {
        BEGIN();
        INSERT_INTO("FI_ATTACHMENT");
        
        if (record.getId() != null) {
            VALUES("ID", "#{id,jdbcType=DECIMAL}");
        }
        
        if (record.getOldName() != null) {
            VALUES("OLD_NAME", "#{oldName,jdbcType=VARCHAR}");
        }
        
        if (record.getStoreName() != null) {
            VALUES("STORE_NAME", "#{storeName,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            VALUES("URL", "#{url,jdbcType=VARCHAR}");
        }
        
        if (record.getFileId() != null) {
            VALUES("FILE_ID", "#{fileId,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            VALUES("TYPE", "#{type,jdbcType=DECIMAL}");
        }
        
        if (record.getKfParentId() != null) {
            VALUES("KF_PARENT_ID", "#{kfParentId,jdbcType=VARCHAR}");
        }
        
        if (record.getParentType() != null) {
            VALUES("PARENT_TYPE", "#{parentType,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            VALUES("STATUS", "#{status,jdbcType=DECIMAL}");
        }
        
        if (record.getStartTime() != null) {
            VALUES("START_TIME", "#{startTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            VALUES("END_TIME", "#{endTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCardId() != null) {
            VALUES("CARD_ID", "#{cardId,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("CREATE_TIME", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEditTime() != null) {
            VALUES("EDIT_TIME", "#{editTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateUser() != null) {
            VALUES("CREATE_USER", "#{createUser,jdbcType=VARCHAR}");
        }
        
        if (record.getEditUser() != null) {
            VALUES("EDIT_USER", "#{editUser,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDefer() != null) {
            VALUES("IS_DEFER", "#{isDefer,jdbcType=DECIMAL}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_ATTACHMENT
     *
     * @mbggenerated Mon Sep 23 01:08:51 CST 2013
     */
    public String selectByExample(FiAttachmentExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("ID");
        } else {
            SELECT("ID");
        }
        SELECT("OLD_NAME");
        SELECT("STORE_NAME");
        SELECT("URL");
        SELECT("FILE_ID");
        SELECT("TYPE");
        SELECT("KF_PARENT_ID");
        SELECT("PARENT_TYPE");
        SELECT("STATUS");
        SELECT("START_TIME");
        SELECT("END_TIME");
        SELECT("CARD_ID");
        SELECT("CREATE_TIME");
        SELECT("EDIT_TIME");
        SELECT("CREATE_USER");
        SELECT("EDIT_USER");
        SELECT("IS_DEFER");
        FROM("FI_ATTACHMENT");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_ATTACHMENT
     *
     * @mbggenerated Mon Sep 23 01:08:51 CST 2013
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        FiAttachment record = (FiAttachment) parameter.get("record");
        FiAttachmentExample example = (FiAttachmentExample) parameter.get("example");
        
        BEGIN();
        UPDATE("FI_ATTACHMENT");
        
        if (record.getId() != null) {
            SET("ID = #{record.id,jdbcType=DECIMAL}");
        }
        
        if (record.getOldName() != null) {
            SET("OLD_NAME = #{record.oldName,jdbcType=VARCHAR}");
        }
        
        if (record.getStoreName() != null) {
            SET("STORE_NAME = #{record.storeName,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            SET("URL = #{record.url,jdbcType=VARCHAR}");
        }
        
        if (record.getFileId() != null) {
            SET("FILE_ID = #{record.fileId,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            SET("TYPE = #{record.type,jdbcType=DECIMAL}");
        }
        
        if (record.getKfParentId() != null) {
            SET("KF_PARENT_ID = #{record.kfParentId,jdbcType=VARCHAR}");
        }
        
        if (record.getParentType() != null) {
            SET("PARENT_TYPE = #{record.parentType,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("STATUS = #{record.status,jdbcType=DECIMAL}");
        }
        
        if (record.getStartTime() != null) {
            SET("START_TIME = #{record.startTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            SET("END_TIME = #{record.endTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCardId() != null) {
            SET("CARD_ID = #{record.cardId,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            SET("CREATE_TIME = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEditTime() != null) {
            SET("EDIT_TIME = #{record.editTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateUser() != null) {
            SET("CREATE_USER = #{record.createUser,jdbcType=VARCHAR}");
        }
        
        if (record.getEditUser() != null) {
            SET("EDIT_USER = #{record.editUser,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDefer() != null) {
            SET("IS_DEFER = #{record.isDefer,jdbcType=DECIMAL}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_ATTACHMENT
     *
     * @mbggenerated Mon Sep 23 01:08:51 CST 2013
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("FI_ATTACHMENT");
        
        SET("ID = #{record.id,jdbcType=DECIMAL}");
        SET("OLD_NAME = #{record.oldName,jdbcType=VARCHAR}");
        SET("STORE_NAME = #{record.storeName,jdbcType=VARCHAR}");
        SET("URL = #{record.url,jdbcType=VARCHAR}");
        SET("FILE_ID = #{record.fileId,jdbcType=VARCHAR}");
        SET("TYPE = #{record.type,jdbcType=DECIMAL}");
        SET("KF_PARENT_ID = #{record.kfParentId,jdbcType=VARCHAR}");
        SET("PARENT_TYPE = #{record.parentType,jdbcType=VARCHAR}");
        SET("STATUS = #{record.status,jdbcType=DECIMAL}");
        SET("START_TIME = #{record.startTime,jdbcType=TIMESTAMP}");
        SET("END_TIME = #{record.endTime,jdbcType=TIMESTAMP}");
        SET("CARD_ID = #{record.cardId,jdbcType=VARCHAR}");
        SET("CREATE_TIME = #{record.createTime,jdbcType=TIMESTAMP}");
        SET("EDIT_TIME = #{record.editTime,jdbcType=TIMESTAMP}");
        SET("CREATE_USER = #{record.createUser,jdbcType=VARCHAR}");
        SET("EDIT_USER = #{record.editUser,jdbcType=VARCHAR}");
        SET("IS_DEFER = #{record.isDefer,jdbcType=DECIMAL}");
        
        FiAttachmentExample example = (FiAttachmentExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_ATTACHMENT
     *
     * @mbggenerated Mon Sep 23 01:08:51 CST 2013
     */
    public String updateByPrimaryKeySelective(FiAttachment record) {
        BEGIN();
        UPDATE("FI_ATTACHMENT");
        
        if (record.getOldName() != null) {
            SET("OLD_NAME = #{oldName,jdbcType=VARCHAR}");
        }
        
        if (record.getStoreName() != null) {
            SET("STORE_NAME = #{storeName,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            SET("URL = #{url,jdbcType=VARCHAR}");
        }
        
        if (record.getFileId() != null) {
            SET("FILE_ID = #{fileId,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            SET("TYPE = #{type,jdbcType=DECIMAL}");
        }
        
        if (record.getKfParentId() != null) {
            SET("KF_PARENT_ID = #{kfParentId,jdbcType=VARCHAR}");
        }
        
        if (record.getParentType() != null) {
            SET("PARENT_TYPE = #{parentType,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("STATUS = #{status,jdbcType=DECIMAL}");
        }
        
        if (record.getStartTime() != null) {
            SET("START_TIME = #{startTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            SET("END_TIME = #{endTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCardId() != null) {
            SET("CARD_ID = #{cardId,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            SET("CREATE_TIME = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEditTime() != null) {
            SET("EDIT_TIME = #{editTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateUser() != null) {
            SET("CREATE_USER = #{createUser,jdbcType=VARCHAR}");
        }
        
        if (record.getEditUser() != null) {
            SET("EDIT_USER = #{editUser,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDefer() != null) {
            SET("IS_DEFER = #{isDefer,jdbcType=DECIMAL}");
        }
        
        WHERE("ID = #{id,jdbcType=DECIMAL}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FI_ATTACHMENT
     *
     * @mbggenerated Mon Sep 23 01:08:51 CST 2013
     */
    protected void applyWhere(FiAttachmentExample example, boolean includeExamplePhrase) {
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