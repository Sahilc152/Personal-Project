package com.personalproject.core.models.Impl;

import com.personalproject.core.models.Footer;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = SlingHttpServletRequest.class,
        adapters = Footer.class,
        //resourceType = HomeBannerImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class FooterImpl implements Footer {
    private static final Logger LOG = LoggerFactory.getLogger(FooterImpl.class);
    //final protected static String RESOURCE_TYPE="personalproject/components/content/footer";

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String title1;

    @ValueMapValue
    private String description1;

    @ValueMapValue
    private String title2;

    @ValueMapValue
    private String description2;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getTitle1() {
        return title1;
    }

    @Override
    public String getDescription1() {
        return description1;
    }

    @Override
    public String getTitle2() {
        return title2;
    }

    @Override
    public String getDescription2() {
        return description2;
    }
}
