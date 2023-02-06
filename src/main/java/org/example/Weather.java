package org.example;

import java.util.List;

public class Weather {
    private String product;
    private String init;
    private List<DataSeries> dataseries;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getInit() {
        return init;
    }

    public void setInit(String init) {
        this.init = init;
    }

    public List<DataSeries> getDataseries() {
        return dataseries;
    }


    public List<DataSeries> getDataSeries() {
        return dataseries;
    }

    public void setDataseries(List<DataSeries> dataseries) {
        this.dataseries = dataseries;
    }

}
