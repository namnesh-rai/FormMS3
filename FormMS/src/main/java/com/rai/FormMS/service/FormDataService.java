package com.rai.FormMS.service;

import com.rai.FormMS.model.FormDataDocument;
import com.rai.FormMS.model.FormElement;
import com.rai.FormMS.repository.FormDataRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FormDataService {
    @Autowired
    private FormDataRepository formDataRepository;

    public FormDataDocument saveFormData(List<FormElement> formData) {
        FormDataDocument latestFormData = formDataRepository.findTopByOrderByVersionIdDesc();

        if (latestFormData != null && formData.equals(latestFormData.getFormData())) {
            return latestFormData;
        }

        FormDataDocument newFormData = new FormDataDocument();
        newFormData.setVersionId(latestFormData != null ? latestFormData.getVersionId() + 1 : 1);
        newFormData.setFormData(formData);

        return formDataRepository.save(newFormData);
    }

    public FormDataDocument getFormDataByVersionId(int versionId) {
        return formDataRepository.findByVersionId(versionId);
    }
}
