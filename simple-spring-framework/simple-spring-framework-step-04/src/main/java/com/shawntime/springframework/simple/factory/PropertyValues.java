package com.shawntime.springframework.simple.factory;

import java.util.ArrayList;
import java.util.List;

public class PropertyValues {

    private List<PropertyValue> propertyValueList = new ArrayList<>();

    public PropertyValues() {
        super();
    }

    public PropertyValues(List<PropertyValue> propertyValueList) {
        this.propertyValueList = propertyValueList;
    }

    public void addPropertyValue(PropertyValue propertyValue) {
        propertyValueList.add(propertyValue);
    }

    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue propertyValue : propertyValueList) {
            if (propertyValue.getKey().equals(propertyName)) {
                return propertyValue;
            }
        }
        return null;
    }

    public List<PropertyValue> getPropertyValueList() {
        return propertyValueList;
    }

    public void setPropertyValueList(List<PropertyValue> propertyValueList) {
        this.propertyValueList = propertyValueList;
    }
}
