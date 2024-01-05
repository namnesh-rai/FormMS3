package com.rai.FormMS.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "formData")
public class FormDataDocument {
    @Id
    private String id;
    private int versionId;
    private List<FormElement> formData;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVersionId() {
        return versionId;
    }

    public void setVersionId(int versionId) {
        this.versionId = versionId;
    }

    public List<FormElement> getFormData() {
        return formData;
    }

    public void setFormData(List<FormElement> formData) {
        this.formData = formData;
    }
// getters and setters
}
