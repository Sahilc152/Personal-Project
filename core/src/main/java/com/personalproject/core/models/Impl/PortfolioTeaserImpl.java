package com.personalproject.core.models.Impl;

import com.personalproject.core.models.PortfolioTeaser;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = SlingHttpServletRequest.class,
        adapters = PortfolioTeaser.class,
        //resourceType = HomeBannerImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class PortfolioTeaserImpl implements PortfolioTeaser {
    private static final Logger LOG = LoggerFactory.getLogger(PortfolioTeaserImpl.class);
    //final protected static String RESOURCE_TYPE="personalproject/components/content/portfolioteaser";

    @ValueMapValue
    private String img;

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String type;

    @Override
    public String getImage() {
        return img;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getType() {
        return type;
    }
}
