package com.rai.FormMS.controller;

import com.rai.FormMS.model.FormDataDocument;
import com.rai.FormMS.model.FormElement;
import com.rai.FormMS.service.FormDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/formdata")
public class FormDataController {
        @Autowired
        private FormDataService formDataService;

        @PostMapping("/save")
        public FormDataDocument saveFormData(@RequestBody List<FormElement> formData) {
            return formDataService.saveFormData(formData);
        }

        @GetMapping("/get/{versionId}")
        public FormDataDocument getFormDataByVersionId(@PathVariable int versionId) {
            return formDataService.getFormDataByVersionId(versionId);
        }
    }


