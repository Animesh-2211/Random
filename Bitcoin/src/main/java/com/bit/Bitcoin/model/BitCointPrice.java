package com.bit.Bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BitCointPrice {
    private Time time;
    private String disclaimer;
    private String chartName;
    private Bpi bpi;

    // Getters and Setters

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getChartName() {
        return chartName;
    }

    public void setChartName(String chartName) {
        this.chartName = chartName;
    }

    public Bpi getBpi() {
        return bpi;
    }

    public void setBpi(Bpi bpi) {
        this.bpi = bpi;
    }

    // Inner classes

    public static class Time {
        private String updated;
        private String updatedISO;
        private String updateduk;

        // Getters and Setters

        @JsonProperty("updated")
        public String getUpdated() {
            return updated;
        }

        @JsonProperty("updated")
        public void setUpdated(String updated) {
            this.updated = updated;
        }

        @JsonProperty("updatedISO")
        public String getUpdatedISO() {
            return updatedISO;
        }

        @JsonProperty("updatedISO")
        public void setUpdatedISO(String updatedISO) {
            this.updatedISO = updatedISO;
        }

        @JsonProperty("updateduk")
        public String getUpdateduk() {
            return updateduk;
        }

        @JsonProperty("updateduk")
        public void setUpdateduk(String updateduk) {
            this.updateduk = updateduk;
        }
    }

    public static class Bpi {
        private USD USD;

        // Getters and Setters

        public USD getUSD() {
            return USD;
        }

        public void setUSD(USD USD) {
            this.USD = USD;
        }
    }

    public static class USD {
        private String code;
        private String symbol;
        private String rate;
        private String description;
        private double rate_float;

        // Getters and Setters

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public String getRate() {
            return rate;
        }

        public void setRate(String rate) {
            this.rate = rate;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public double getRate_float() {
            return rate_float;
        }

        public void setRate_float(double rate_float) {
            this.rate_float = rate_float;
        }
    }
}
