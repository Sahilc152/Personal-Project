package com.personalproject.core.models.impl;

import com.personalproject.core.models.TitleText;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = SlingHttpServletRequest.class,
        adapters = TitleText.class,
        //resourceType = TitleTextImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class TitleTextImpl implements TitleText {

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String info;

    @ValueMapValue
    private boolean sectiongap;

    @ValueMapValue
    private boolean paddingbottom;

    @ValueMapValue
    private boolean testimonialstyling;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public Boolean getSectionGap() {
        return sectiongap;
    }

    @Override
    public Boolean getPaddingBottom() {
        return paddingbottom;
    }

    @Override
    public Boolean getTestimonialStyling() {
        return testimonialstyling;
    }
}