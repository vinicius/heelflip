package com.skatepark.heelflip.table;

import java.math.BigDecimal;

public class ColumnStatistic {

    private String columnName;
    private int count;

    private int stringCount;
    private int booleanCount;
    private int numberCount;

    private BigDecimal min;
    private BigDecimal max;
    private BigDecimal sum;

    ColumnStatistic(String columnName) {
        this.columnName = columnName;
        this.count = 0;
        this.stringCount = 0;
        this.booleanCount = 0;
        this.numberCount = 0;
    }

    public String getColumnName() {
        return columnName;
    }

    public int getCount() {
        return count;
    }

    public int getStringCount() {
        return stringCount;
    }

    public int getBooleanCount() {
        return booleanCount;
    }

    public int getNumberCount() {
        return numberCount;
    }

    public BigDecimal getMax() {
        return max;
    }

    public BigDecimal getMin() {
        return min;
    }

    public BigDecimal getSum() {
        return sum;
    }

    void agg(HFValue value) {
        count++;

        if (value.isString()) {
            stringCount++;
        }
        if (value.isBoolean()) {
            booleanCount++;
        }

        if (value.isNumber()) {
            numberCount++;

            BigDecimal v = value.getAsBigDecimal();
            min = min == null || min.compareTo(v) > 0 ? v : min;
            max = max == null || max.compareTo(v) < 0 ? v : max;
            sum = sum == null ? v : sum.add(v);
        }
    }
}