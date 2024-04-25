package com.alura.models;

public class PairChange {
    private String base_code;
    private String target_code;
    private double conversion_result;

    // constructors
    public PairChange(PairApi pairApi) {
        this.base_code = pairApi.base_code();
        this.target_code = pairApi.target_code();
        this.conversion_result = pairApi.conversion_result();
    }

    @Override
    public String toString() {
        return "" + conversion_result;
    }
}
