package com.rai.FormMS.repository;

import com.rai.FormMS.model.FormDataDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FormDataRepository extends MongoRepository<FormDataDocument, String> {
    FormDataDocument findTopByOrderByVersionIdDesc();
    FormDataDocument findByVersionId(int versionId);
}
