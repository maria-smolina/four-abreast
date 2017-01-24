package com.smolina.fourabreast.model;

import java.util.Objects;

public class TwoDimensionalFieldPosition {
    private Integer row;
    private Integer column;

    public TwoDimensionalFieldPosition() {};

    public TwoDimensionalFieldPosition(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TwoDimensionalFieldPosition that = (TwoDimensionalFieldPosition) o;
        return Objects.equals(row, that.row) &&
                Objects.equals(column, that.column);
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, column);
    }

    @Override
    public String toString() {
        return "TwoDimensionalFieldPosition { " +
                "row = " + row +
                ", column = " + column +
                " }";
    }
}
