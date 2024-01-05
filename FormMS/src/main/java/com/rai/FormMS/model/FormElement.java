package com.rai.FormMS.model;

import java.util.List;

public class FormElement {
    private String type;
    private String label;
    private String name;
    private List<FormElement> formtext;
    private List<FormElement> formpara;
    private List<FormElement> formrange;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FormElement> getFormtext() {
        return formtext;
    }

    public void setFormtext(List<FormElement> formtext) {
        this.formtext = formtext;
    }

    public List<FormElement> getFormpara() {
        return formpara;
    }

    public void setFormpara(List<FormElement> formpara) {
        this.formpara = formpara;
    }

    public List<FormElement> getFormrange() {
        return formrange;
    }

    public void setFormrange(List<FormElement> formrange) {
        this.formrange = formrange;
    }
}
