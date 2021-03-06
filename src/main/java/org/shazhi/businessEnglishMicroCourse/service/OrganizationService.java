package org.shazhi.businessEnglishMicroCourse.service;

import org.shazhi.businessEnglishMicroCourse.entity.OrganizationEntity;
import org.shazhi.businessEnglishMicroCourse.util.Result;

import java.util.List;

public interface OrganizationService {
    Result updateOrganization(OrganizationEntity update);

    Result insertOrganization(OrganizationEntity insert);

    List<OrganizationEntity> load(OrganizationEntity example);
}
