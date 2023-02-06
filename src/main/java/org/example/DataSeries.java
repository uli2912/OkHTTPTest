package org.example;

import com.fasterxml.jackson.annotation.JsonAlias;

public class DataSeries {
private int timePoint;

private int cloudcover;
private int seeing;
private int transparency;
private int lifted_index;
private int rh2m;
private int temp2m;
private String prec_type;

private int timepoint;
@JsonAlias("wind10m")
private WindInfo wind1om;
    public int getTimePoint() {
        return timePoint;
    }

    public void setTimePoint(int timePoint) {
        this.timePoint = timePoint;
    }

    public int getCloudCover() {
        return cloudcover;
    }

    public void setCloudCover(int cloudCover) {
        this.cloudcover = cloudcover;
    }

    public int getSeeing() {
        return seeing;
    }

    public void setSeeing(int seeing) {
        this.seeing = seeing;
    }

    public int getTransparency() {
        return transparency;
    }

    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }

    public int getLifted_index() {
        return lifted_index;
    }

    public void setLifted_index(int lifted_index) {
        this.lifted_index = lifted_index;
    }

    public int getRh2m() {
        return rh2m;
    }

    public void setRh2m(int rh2m) {
        this.rh2m = rh2m;
    }

    public int getTemp2m() {
        return temp2m;
    }

    public void setTemp2m(int temp2m) {
        this.temp2m = temp2m;
    }

    public String getPrec_type() {
        return prec_type;
    }

    public void setPrec_type(String prec_type) {
        this.prec_type = prec_type;
    }

    public WindInfo getWind1om() {
        return wind1om;
    }

    public void setWind1om(WindInfo wind1om) {
        this.wind1om = wind1om;
    }

    public int getTimepoint() {
        return timepoint;
    }

    public void setTimepoint(int timepoint) {
        this.timepoint = timepoint;
    }

    public int getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(int cloudcover) {
        this.cloudcover = cloudcover;
    }

    @Override
    public String toString() {
        return "DataSeries{" +
                "timePoint=" + timePoint +
                ", cloudcover=" + cloudcover +
                ", seeing=" + seeing +
                ", transparency=" + transparency +
                ", lifted_index=" + lifted_index +
                ", rh2m=" + rh2m +
                ", temp2m=" + temp2m +
                ", prec_type='" + prec_type + '\'' +
                ", timepoint=" + timepoint +
                ", wind1om=" + wind1om +
                '}';
    }
}
