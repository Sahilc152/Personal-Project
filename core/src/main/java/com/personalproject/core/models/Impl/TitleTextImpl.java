package com.personalproject.core.models.Impl;

import com.personalproject.core.models.TitleText;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = SlingHttpServletRequest.class,
        adapters = TitleText.class,
        //resourceType = TitleTextImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class TitleTextImpl implements TitleText {
    private static final Logger LOG = LoggerFactory.getLogger(TitleTextImpl.class);
    //final protected static String RESOURCE_TYPE="personalproject/components/content/titletext";

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