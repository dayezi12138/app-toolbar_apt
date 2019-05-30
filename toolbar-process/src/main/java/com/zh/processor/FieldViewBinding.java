package com.zh.processor;

import javax.lang.model.type.TypeMirror;

final class FieldViewBinding {

    private String fieldName;
    private TypeMirror fieldType;


    public FieldViewBinding(String fieldName, TypeMirror fieldType) {
        this.fieldName = fieldName;
        this.fieldType = fieldType;
    }


    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public TypeMirror getFieldType() {
        return fieldType;
    }

    public void setFieldType(TypeMirror fieldType) {
        this.fieldType = fieldType;
    }


    @Override
    public String toString() {
        return "{" +
                "fieldType:" + fieldType + ", fieldName:" + fieldName
                + "}";
    }
}
