package com.ihospital.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PrescriptionExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrescriptionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPrescriptIdIsNull() {
            addCriterion("prescript_id is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptIdIsNotNull() {
            addCriterion("prescript_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptIdEqualTo(Long value) {
            addCriterion("prescript_id =", value, "prescriptId");
            return (Criteria) this;
        }

        public Criteria andPrescriptIdNotEqualTo(Long value) {
            addCriterion("prescript_id <>", value, "prescriptId");
            return (Criteria) this;
        }

        public Criteria andPrescriptIdGreaterThan(Long value) {
            addCriterion("prescript_id >", value, "prescriptId");
            return (Criteria) this;
        }

        public Criteria andPrescriptIdGreaterThanOrEqualTo(Long value) {
            addCriterion("prescript_id >=", value, "prescriptId");
            return (Criteria) this;
        }

        public Criteria andPrescriptIdLessThan(Long value) {
            addCriterion("prescript_id <", value, "prescriptId");
            return (Criteria) this;
        }

        public Criteria andPrescriptIdLessThanOrEqualTo(Long value) {
            addCriterion("prescript_id <=", value, "prescriptId");
            return (Criteria) this;
        }

        public Criteria andPrescriptIdIn(List<Long> values) {
            addCriterion("prescript_id in", values, "prescriptId");
            return (Criteria) this;
        }

        public Criteria andPrescriptIdNotIn(List<Long> values) {
            addCriterion("prescript_id not in", values, "prescriptId");
            return (Criteria) this;
        }

        public Criteria andPrescriptIdBetween(Long value1, Long value2) {
            addCriterion("prescript_id between", value1, value2, "prescriptId");
            return (Criteria) this;
        }

        public Criteria andPrescriptIdNotBetween(Long value1, Long value2) {
            addCriterion("prescript_id not between", value1, value2, "prescriptId");
            return (Criteria) this;
        }

        public Criteria andPathoIdIsNull() {
            addCriterion("patho_id is null");
            return (Criteria) this;
        }

        public Criteria andPathoIdIsNotNull() {
            addCriterion("patho_id is not null");
            return (Criteria) this;
        }

        public Criteria andPathoIdEqualTo(Long value) {
            addCriterion("patho_id =", value, "pathoId");
            return (Criteria) this;
        }

        public Criteria andPathoIdNotEqualTo(Long value) {
            addCriterion("patho_id <>", value, "pathoId");
            return (Criteria) this;
        }

        public Criteria andPathoIdGreaterThan(Long value) {
            addCriterion("patho_id >", value, "pathoId");
            return (Criteria) this;
        }

        public Criteria andPathoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("patho_id >=", value, "pathoId");
            return (Criteria) this;
        }

        public Criteria andPathoIdLessThan(Long value) {
            addCriterion("patho_id <", value, "pathoId");
            return (Criteria) this;
        }

        public Criteria andPathoIdLessThanOrEqualTo(Long value) {
            addCriterion("patho_id <=", value, "pathoId");
            return (Criteria) this;
        }

        public Criteria andPathoIdIn(List<Long> values) {
            addCriterion("patho_id in", values, "pathoId");
            return (Criteria) this;
        }

        public Criteria andPathoIdNotIn(List<Long> values) {
            addCriterion("patho_id not in", values, "pathoId");
            return (Criteria) this;
        }

        public Criteria andPathoIdBetween(Long value1, Long value2) {
            addCriterion("patho_id between", value1, value2, "pathoId");
            return (Criteria) this;
        }

        public Criteria andPathoIdNotBetween(Long value1, Long value2) {
            addCriterion("patho_id not between", value1, value2, "pathoId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdIsNull() {
            addCriterion("medicine_id is null");
            return (Criteria) this;
        }

        public Criteria andMedicineIdIsNotNull() {
            addCriterion("medicine_id is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineIdEqualTo(Long value) {
            addCriterion("medicine_id =", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdNotEqualTo(Long value) {
            addCriterion("medicine_id <>", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdGreaterThan(Long value) {
            addCriterion("medicine_id >", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdGreaterThanOrEqualTo(Long value) {
            addCriterion("medicine_id >=", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdLessThan(Long value) {
            addCriterion("medicine_id <", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdLessThanOrEqualTo(Long value) {
            addCriterion("medicine_id <=", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdIn(List<Long> values) {
            addCriterion("medicine_id in", values, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdNotIn(List<Long> values) {
            addCriterion("medicine_id not in", values, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdBetween(Long value1, Long value2) {
            addCriterion("medicine_id between", value1, value2, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdNotBetween(Long value1, Long value2) {
            addCriterion("medicine_id not between", value1, value2, "medicineId");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}